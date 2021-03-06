DROP SEQUENCE SMENOR;
CREATE SEQUENCE SMENOR
	MINVALUE 0
	START WITH 0
	INCREMENT BY 1
/
CREATE TABLE MENOR(
	ID_MENOR	NUMBER(4) NOT NULL,
	NOMBRE		VARCHAR2(40) NOT NULL,
	APELLIDO1	VARCHAR2(40) NOT NULL,
	APELLIDO2	VARCHAR2(40) NOT NULL,
	DNI		CHAR(10),
	SEXO		CHAR(1) DEFAULT 'M',
	CALLE		VARCHAR2(100) NOT NULL,
	PISO		VARCHAR2(10) NOT NULL,
	LETRA		CHAR(1) NOT NULL,
	MUNICIPIO	VARCHAR2(40) NOT NULL,
	PROVINCIA	VARCHAR2(40) NOT NULL,
	CP		CHAR(5) NOT NULL,
	FECH_NAC	DATE NOT NULL,
	CENTRO_ESTUDIO	VARCHAR2(100) NOT NULL,
	MODELO		CHAR(1) DEFAULT 'D',
	DISCAPACIDAD	CHAR(2) DEFAULT 'NO',
	CONSTRAINT PK_ID_MENOR_MENOR PRIMARY KEY (ID_MENOR),
	CONSTRAINT CHECK_SEXO_V_F CHECK (SEXO IN ('M','F')),
	CONSTRAINT CHECK_MODELO_A_B_D CHECK (MODELO IN ('A', 'B','D')),	
	CONSTRAINT CHECK_DISCAPACIDAD_SI_NO CHECK (DISCAPACIDAD IN ('SI', 'NO'))
)
/
--pause