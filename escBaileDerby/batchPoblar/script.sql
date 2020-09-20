CONNECT 'jdbc:derby://localhost:1527/EscDeBaile;user=rafa;password=rafa';
DROP TABLE tblAlumnos;
CREATE TABLE tblAlumnos(
 apMaterno VARCHAR(20),
apPaterno VARCHAR(20),
clvAlumno VARCHAR(20),
nombre VARCHAR(20));

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


 show tables; 
 exit;
