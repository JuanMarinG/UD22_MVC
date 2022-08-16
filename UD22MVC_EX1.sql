	DROP DATABASE IF EXISTS ud22MVC;
    CREATE DATABASE UD22MVC;
    use UD22MVC;
    
    CREATE TABLE Cliente (
    nombre varchar(250) default null,
    apellido varchar(250) default null,
    direccion varchar (250) default null,
    dni int (11) default null,
    fecha date default null,
    primary key (dni));
