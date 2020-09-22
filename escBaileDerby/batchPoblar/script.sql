CONNECT 'jdbc:derby://localhost:1527/EscDeBaile;user=rafa;password=rafa';
DROP TABLE tblAlumnos;
CREATE TABLE tblAlumnos(
 apMaterno VARCHAR(50),
apPaterno VARCHAR(50),
clvAlumno VARCHAR(50),
nombre VARCHAR(50));

INSERT INTO tblAlumnos VALUES
('Hirales','Gamboa','000000','Rafael'),
('arg3_apMaterno','arg2_apPaterno','999999','arg1_nombre'),
('Vargas','Medina','Alum00001','Mario Roberto'),
('Garduno','Abraham','Alum00002','Alfonso'),
('Salinas','Martinez','Alum00003','Cinthia'),
('Franco','Rodea','Alum00004','Antonio'),
('Barrera','Capdeville','Alum00005','Arturo'),
('Hesle','Medrano','Alum00006','Raul'),
('Colorado','Diakite','Alum00007','Nicolas'),
('Castro','Gonzalez','Alum00008','Marcela'),
('Guzman','Ortega','Alum00009','Jaime'),
('Gutierrez','Fonseca','Alum00010','Miguel'),
('Fernandez','Alanis','Alum00011','Gerardo'),
('Madrigal','Medina','Alum00012','Isadora'),
('Fuentes','Thorne','Alum00013','Octavio'),
('Lavin','Toxtle','Alum00014','Guillermo'),
('Nieto','Ponce','Alum00015','Juan Pablo'),
('Pineda','Gomez','Alum00016','Santiago'),
('Bautista','Fonseca','Alum00017','Mario'),
('Manzanilla','Orendain','Alum00018','Marianna'),
('Chavez','Gomez','Alum00019','Oscar'),
('de Luca','Mendoza','Alum00020','Hector'),
('Legorreta','Ponce','Alum00021','Julian'),
('Haller','Alvarez','Alum00022','Eduardo'),
('Soltero','Ramirez','Alum00023','Ismael'),
('Alvarado','Rodriguez','Alum00024','Santiago');

DROP TABLE tblAlumnosXGrupo;
CREATE TABLE tblAlumnosXGrupo(
 clvAlumno VARCHAR(50),
numGpo SMALLINT,
pago DECIMAL);

INSERT INTO tblAlumnosXGrupo VALUES
('Alum00001',1,0.0000),
('Alum00003',1,0.0000),
('Alum00003',2,0.0000),
('Alum00004',1,0.0000),
('Alum00006',1,0.0000);

DROP TABLE tblBailes;
CREATE TABLE tblBailes(
 clvBaile VARCHAR(50),
nombreBaile VARCHAR(50));

INSERT INTO tblBailes VALUES
('Flamenco','Baile Flamenco'),
('Lambada','Lambada'),
('NortCentro','NorteñoCentro'),
('Norteste','Norteño Este'),
('Tango','Tango');

DROP TABLE tblGrupos;
CREATE TABLE tblGrupos(
 Hora_fin DOUBLE,
Hora_inic DOUBLE,
clvBaile VARCHAR(50),
clvNivel VARCHAR(50),
dia1 VARCHAR(50),
dia2 VARCHAR(50),
numGpo SMALLINT);

INSERT INTO tblGrupos VALUES
(22.0,19.0,'NortCentro','NivPrin','Lu','Mi',1),
(21.0,18.0,'Tango','NivInter1','Ma','Ju',2);

DROP TABLE tblNiveles;
CREATE TABLE tblNiveles(
 clvNivel VARCHAR(50),
nombreNivel VARCHAR(50));

INSERT INTO tblNiveles VALUES
('NivAvan1','Avanzados 1'),
('NivAvan2','Avanzados 2'),
('NivInter1','Intermedios 1'),
('NivInter2','Intermedios 2'),
('NivMaest','Maestros'),
('NivPrin','Principiantes');

DROP TABLE tblPagosaProfesores;
CREATE TABLE tblPagosaProfesores(
 clvGrupo SMALLINT,
clvProfesor VARCHAR(50),
montoPago DECIMAL);;

DROP TABLE tblProfesores;
CREATE TABLE tblProfesores(
 apMaterno VARCHAR(50),
apPaterno VARCHAR(50),
clvProfesor VARCHAR(50),
nombre VARCHAR(50));

INSERT INTO tblProfesores VALUES
('Hirales','Gamboa','Prof00001','Rafael'),
('Sanchez','Rios','Prof00002','Ramon'),
('Trejo','Sola','Prof00003','Teresa'),
('Morales','Kuri','Prof00009','Angel');

DROP TABLE tblUsuarios;
CREATE TABLE tblUsuarios(
 clvUsuario VARCHAR(50),
contrasenha VARCHAR(50),
nombreUsuario VARCHAR(50));

INSERT INTO tblUsuarios VALUES
('elsa','elsa','Elsita'),
('rafa','rafa','Rafael Gamboa Hirales'),
('tere','tere','Tere');


 show tables; 
 exit;
