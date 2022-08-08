DROP DATABASE IF EXISTS UD22_2MVC;
    CREATE DATABASE UD22_2MVC;
    use UD22_2MVC;
    
     CREATE TABLE Cliente (
    id int(11) not null auto_increment,
    nombre varchar(250) default null,
    apellido varchar(250) default null,
    direccion varchar (250) default null,
    fecha date default null,
    primary key (id)
    );
    
    CREATE TABLE Videos (
    id int(11) not null auto_increment,
    title varchar(250) default null,
    director varchar (250) default null,
    cli_id int(11) default null,
    primary key (id),
    constraint FK_1 foreign key (cli_id) references Cliente(id)
    
    
    
    );