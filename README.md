# JPA (Insert-Update-Delete)

## Proyecto Java / Java Application

- **Genera el nombre de la unidad de persistencia "Persistencia" y la conexión a la BD: "jpa_hibernate_mysql"**

- **Persistiendo la entidad "Empleado" en la tabla "EMPLEADO" de la base de datos "jpa_hibernate_mysql"**

- **Creamos el EntityManager y realizamos las operaciones ("persist", "merge", "remove")**

Este proyecto Java utiliza JPA para realizar operaciones de inserción, actualización y eliminación en una base de datos utilizando la biblioteca Hibernate ORM.

## Configuración del Proyecto

El proyecto utiliza Maven para la gestión de dependencias y está configurado para utilizar las siguientes dependencias:

- `jakarta.persistence-api` para Java Persistence API (JPA)
- `hibernate-core` para Hibernate ORM
- `mysql-connector-java` para MySQL Connector/J

Asegúrate de tener configurada correctamente la unidad de persistencia en el archivo `persistence.xml` y de tener todas las dependencias necesarias en tu archivo `pom.xml`.

## Ejecución del Proyecto

Para ejecutar el proyecto, simplemente ejecuta la clase `TestEmpleados.java`. Esto iniciará el programa y realizará las operaciones de inserción, actualización y eliminación en la base de datos según lo definido en el código.

## Licencia

Este proyecto está bajo la Licencia [MIT](LICENSE).
