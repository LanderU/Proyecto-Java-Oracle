CREATE TABLE CALLE (
	ID_CALLE	NUMBER(4) NOT NULL,
	NOMBRE_CALLE	VARCHAR2(100) NOT NULL,
	ID_PROVINCIA	NUMBER(2) NOT NULL,
	CONSTRAINT PK_ID_CALLE_CALLE PRIMARY KEY (ID_CALLE),
	CONSTRAINT FK_ID_PROV_PROVINCIA FOREIGN KEY (ID_PROVINCIA) REFERENCES PROVINCIA (ID_PROVINCIA)
)
/
--pause