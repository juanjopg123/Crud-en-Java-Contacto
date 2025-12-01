📘 Sistema de Gestión de Contactos

Aplicación desarrollada en Java Swing (NetBeans IDE 24) para gestionar una lista de contactos.
Permite guardar, modificar, buscar, eliminar y limpiar registros almacenados en una base de datos MySQL.

-----------------------------------------------------------

📌 Características principales

✔ Interfaz gráfica construida con Java Swing
✔ Diseño visual mediante AbsoluteLayout
✔ Conexión estable a base de datos MySQL
✔ Operaciones CRUD completas:
Guardar contacto
Modificar contacto
Eliminar contacto
Buscar contacto
Limpiar campos

✔ Campos manejados:
Documento
Apellido
Nombre
Edad
Género
Teléfono
Celular

-----------------------------------------------------------

🗄 Configuración de la Base de Datos (MySQL)

CREATE DATABASE contacto;
USE contacto;

create table persona (
    Cedula varchar(10) not null primary key,
    Apellido varchar(35),
    Nombre varchar(35),
    Sexo varchar(15),
    Edad int(3),
    Telefono varchar(10),
    Celular varchar(10))
    Engine=INNODB;

-----------------------------------------------------------

▶ Cómo ejecutar el proyecto

Abre NetBeans
Importa el proyecto Conectar
Asegúrate de que esté agregado:
mysql-connector-java-5.1.23-bin.jar

Verifica que MySQL esté corriendo
Ejecuta: Run → Run Project (F6)
