	DROP DATABASE IF EXISTS ud22MVC;
    CREATE DATABASE UD22MVC;
    use UD22MVC;
    
    CREATE TABLE Cliente (
    id int(11) not null auto_increment,
    nombre varchar(250) default null,
    apellido varchar(250) default null,
    direccion varchar (250) default null,
    fecha date default null,
    primary key (id));