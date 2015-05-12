TABLAS
======

Se añaden los archivos para la creación de las tablas.

Para poder ejecutarlas desde la línea de comandos, primero hemos de añadir los archivos de creación en la carpeta *"BIN"* de Oracle.

Añado además dos script's que incluyen la creación y el borrado de la BD.
En los archivos que necesitamos insertar numeros para los id, he creado secuencias que lo hacen automáticamente.
Añado también las provincias y sus respectivos municipios.

- **"crearudalekus"**
- **"borrarudalekus"**

Para su ejecución desde la línea de comandos: 

- **SQL> @crearudalekus**
- **SQL> @borrarudalekus**

Lo mismo sucede con el resto de los archivos, se ejecutan de la misma manera.
Por otro lado estos archivos han de estar presentes también en el *"BIN"* de Oracle.

Añado también en **crearudalekus** la llamada al script **crearpaqueteudalekus**, para que al mismo tiempo que se crea la *BD* también se crea el paquete correspondiente.


