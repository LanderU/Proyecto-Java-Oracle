CREATE TABLE SORTEO (
	FECHA_SORTEO	DATE NOT NULL,
	NUM_INICIO	NUMBER(4) NOT NULL,
	CADENCIA	NUMBER (1) NOT NULL,
	FECHA_INICIO	DATE NOT NULL,
	FECHA_FIN	DATE NOT NULL,
	CONSTRAINT PK_FECH_SOR_SORTEO PRIMARY KEY (FECHA_SORTEO)	
)
/
--pause