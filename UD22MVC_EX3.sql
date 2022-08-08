DROP DATABASE IF EXISTS UD22_3MVC;
    CREATE DATABASE UD22_3MVC;
    use UD22_3MVC;

CREATE TABLE Proyectos
(
idProyecto char(4) primary key,
Nombre nvarchar(255),
Horas int);

CREATE TABLE Cientificos
(
DNI varchar(8) primary key,
NomApels nvarchar(255)
);

CREATE TABLE Asignado_a
(
Cientifico varchar(8),
Proyecto char(4),
primary key (Cientifico, Proyecto),
constraint FK1 foreign key (Cientifico) references Cientificos (DNI),
constraint FK2 foreign key (Proyecto) references Proyectos (idProyecto)
);
