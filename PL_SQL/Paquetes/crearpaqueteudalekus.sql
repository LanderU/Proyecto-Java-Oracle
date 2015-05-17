--CABECERA
CREATE OR REPLACE PACKAGE PAQUETE_UDALEKUS AS
	TYPE CCURSORES IS REF CURSOR;
	PROCEDURE MOSTRARPROVINCIA (PROVINCIAS OUT CCURSORES);
	PROCEDURE MOSTRARMUNICIPIO (MUNICIPIOS OUT CCURSORES, PROV IN PROVINCIA.ID_PROVINCIA%TYPE);
	PROCEDURE MOSTRARCALLE (CALLES OUT CCURSORES, MUNI IN MUNICIPIO.ID_MUNICIPIO%TYPE);
	PROCEDURE FECHAVALIDA (CODIGO_ERROR OUT NUMBER);
	PROCEDURE INSERTARMENOR (NOM MENOR.NOMBRE%TYPE, AP1 MENOR.APELLIDO1%TYPE, AP2 MENOR.APELLIDO2%TYPE, 
				 NAN MENOR.DNI%TYPE,SEX MENOR.SEXO%TYPE, CAL MENOR.CALLE%TYPE, PIS MENOR.PISO%TYPE,
				 LETR MENOR.LETRA%TYPE, MUN MENOR.MUNICIPIO%TYPE, PROV MENOR.PROVINCIA%TYPE,
				 CODIGO MENOR.CP%TYPE, FECHA MENOR.FECH_NAC%TYPE, CENTRO MENOR.CENTRO_ESTUDIO%TYPE,
				 MODELO MENOR.MODELO%TYPE, DIS MENOR.DISCAPACIDAD%TYPE);
	PROCEDURE INSERTARTUTOR (NOM TUTOR.NOMBRE%TYPE, AP1 TUTOR.APELLIDO1%TYPE, AP2 TUTOR.APELLIDO2%TYPE,NAN TUTOR.DNI%TYPE,
				 TL1 TUTOR.TLF1%TYPE, TL2 TUTOR.TLF2%TYPE, TL3 TUTOR.TLF3%TYPE,TL4 TUTOR.TLF4%TYPE);
	PROCEDURE INSERTARFECHASORTEO (FECH SORTEO.FECHA_SORTEO%TYPE,NUM_INI SORTEO.NUM_INICIO%TYPE,CAD SORTEO.CADENCIA%TYPE
				      ,FECHA_IN SORTEO.FECHA_INICIO%TYPE,FECHA_FI SORTEO.FECHA_FIN%TYPE);
END PAQUETE_UDALEKUS;
/
CREATE OR REPLACE PACKAGE BODY PAQUETE_UDALEKUS AS
--##########################PROCEDIMIENTO MOSTRARPROVINCIAS#########################
	PROCEDURE MOSTRARPROVINCIA (PROVINCIAS OUT CCURSORES) AS
		BEGIN
			OPEN PROVINCIAS FOR SELECT *
					   FROM PROVINCIA;
		EXCEPTION
			WHEN OTHERS THEN
				DBMS_OUTPUT.PUT_LINE('EXCEPCI�N LANZADA DESDE P_MOSTRARPROVINCIA');
		END MOSTRARPROVINCIA;
--##########################PROCEDIMIENTO MOSTRARPROVINCIAS#########################
--##########################PROCEDIMIENTO MOSTRARMUNICIPIOS#########################
	PROCEDURE MOSTRARMUNICIPIO (MUNICIPIOS OUT CCURSORES,PROV IN PROVINCIA.ID_PROVINCIA%TYPE) AS
		BEGIN
			OPEN MUNICIPIOS FOR SELECT *
					    FROM MUNICIPIO MUN
					    WHERE EXISTS
							(SELECT *
							 FROM PROVINCIA
							 WHERE ID_PROVINCIA = MUN.ID_PROVINCIA);
		EXCEPTION
			WHEN OTHERS THEN
				DBMS_OUTPUT.PUT_LINE('EXCEPCI�N LANZADA DESDE P_MOSTRARMUNICIPIO');
		END MOSTRARMUNICIPIO;
--##########################PROCEDIMIENTO MOSTRARMUNICIPIOS#########################
--##########################PROCEDIMIENTO MOSTRARCALLES#############################
	PROCEDURE MOSTRARCALLE (CALLES OUT CCURSORES, MUNI IN MUNICIPIO.ID_MUNICIPIO%TYPE) AS
		BEGIN
			OPEN CALLES FOR SELECT *
						    FROM CALLE
						    WHERE EXISTS
						    		(SELECT *
						    		 FROM MUNICIPIO
						    		 WHERE ID_MUNICIPIO = MUNI);
		EXCEPTION
			WHEN OTHERS THEN
				DBMS_OUTPUT.PUT_LINE('EXCEPCI�N LANZADA DESDE P_MOSTRARCALLE');
		END MOSTRARCALLE;
--##########################PROCEDIMIENTO MOSTRARCALLES#############################
--##########################PROCEDIMIENTO VALIDARFECHA##############################
	PROCEDURE FECHAVALIDA (CODIGO_ERROR OUT NUMBER) AS
		FECHA_INICIO	VARCHAR2(10):='01/04/';
		FECHA_FIN	VARCHAR2(10):='17/04/';
		ANYO		VARCHAR2(4);
	BEGIN
		SELECT TO_CHAR(SYSDATE,'YYYY') INTO ANYO
		FROM DUAL;
		FECHA_INICIO:=FECHA_INICIO||ANYO;
		FECHA_FIN:=FECHA_FIN||ANYO;
		IF TO_DATE(SYSDATE , 'DD/MM/YYYY') NOT BETWEEN TO_DATE(FECHA_INICIO, 'DD/MM/YYYY') AND TO_DATE(FECHA_FIN,'DD/MM/YYYY') THEN
			CODIGO_ERROR:=1;
		ELSE
			CODIGO_ERROR:=0;
		END IF;
	EXCEPTION
		WHEN OTHERS THEN
			DBMS_OUTPUT.PUT_LINE('EXCEPCI�N LANZADA DESDE F_FECHAVALIDA');
	END FECHAVALIDA;
--##########################PROCEDIMIENTO VALIDARFECHA##############################
--##########################PROCEDIMIENTO INSERTARMENOR#######################
	PROCEDURE INSERTARMENOR (NOM MENOR.NOMBRE%TYPE, AP1 MENOR.APELLIDO1%TYPE, AP2 MENOR.APELLIDO2%TYPE, 
				 NAN MENOR.DNI%TYPE,SEX MENOR.SEXO%TYPE, CAL MENOR.CALLE%TYPE, PIS MENOR.PISO%TYPE,
				 LETR MENOR.LETRA%TYPE, MUN MENOR.MUNICIPIO%TYPE, PROV MENOR.PROVINCIA%TYPE,
				 CODIGO MENOR.CP%TYPE, FECHA MENOR.FECH_NAC%TYPE, CENTRO MENOR.CENTRO_ESTUDIO%TYPE,
				 MODELO MENOR.MODELO%TYPE, DIS MENOR.DISCAPACIDAD%TYPE) AS
		BEGIN
			INSERT INTO MENOR VALUES (SMENOR.NEXTVAL, NOM,AP1,AP2,NAN,SEX,CAL,PIS,LETR,MUN,PROV,CODIGO,FECHA,CENTRO,MODELO,DIS);
			COMMIT;
		EXCEPTION
			WHEN OTHERS THEN
				DBMS_OUTPUT.PUT_LINE('EXCEPCI�N LANZADA DESDE P_INSERTARMENOR');
		END INSERTARMENOR;
--##########################PROCEDIMIENTO INSERTARMENOR#######################
--##########################PROCEDIMIENTO INSERTARTUTOR#######################
	PROCEDURE INSERTARTUTOR (NOM TUTOR.NOMBRE%TYPE, AP1 TUTOR.APELLIDO1%TYPE, AP2 TUTOR.APELLIDO2%TYPE,NAN TUTOR.DNI%TYPE,
				 TL1 TUTOR.TLF1%TYPE, TL2 TUTOR.TLF2%TYPE, TL3 TUTOR.TLF3%TYPE,TL4 TUTOR.TLF4%TYPE) AS
	BEGIN
		INSERT INTO TUTOR VALUES (STUTOR.NEXTVAL, NOM,AP1,AP2,NAN,TL1,TL2,TL3,TL4);
	EXCEPTION
		WHEN OTHERS THEN
			DBMS_OUTPUT.PUT_LINE('EXCEPCI�N LANZADA DESDE P_INSERTARTUTOR');
	END INSERTARTUTOR;
--##########################PROCEDIMIENTO INSERTARTUTOR#######################
--##########################PROCEDIMIENTO INSERFECHASORTEO####################
	PROCEDURE INSERTARFECHASORTEO (FECH SORTEO.FECHA_SORTEO%TYPE,NUM_INI SORTEO.NUM_INICIO%TYPE,CAD SORTEO.CADENCIA%TYPE
				      ,FECHA_IN SORTEO.FECHA_INICIO%TYPE,FECHA_FI SORTEO.FECHA_FIN%TYPE) AS
	BEGIN
		INSERT INTO SORTEO VALUES (FECH,NUM_INI,CAD,FECHA_IN,FECHA_FI);
	EXCEPTION
		WHEN OTHERS THEN
			DBMS_OUTPUT.PUT_LINE('EXCEPCI�N LANZADA DESDE P_INSERTARFECHASORTEO');
	END INSERTARFECHASORTEO;
--##########################PROCEDIMIENTO INSERFECHASORTEO####################
END PAQUETE_UDALEKUS;
/


	