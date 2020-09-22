echo off
echo ejecucion de scripts para poblar la base de datos 
echo uso: Segun el número es la tabla que se restaura 'indice.txt.' Si se omite se restauran todas 
echo on

set cb=%cd%\PoblarBD_DB.jar

echo off

if [%1] NEQ [] goto alguna
java -Djava.rmi.server.codebase=file:%cb% -jar %cb% PoblarBD_DB tblAlumnos tblAlumnosXGrupo tblBailes tblGrupos tblNiveles tblPagosaProfesores tblProfesores tblUsuarios> C:\Users\aalex\Documents\NetBeansProjects\SCE\escBaileDerby\batchPoblar\script.sql
goto fin

:alguna
if  %1  EQU 1  goto tablaAlumnos
if  %1  EQU 2  goto tablaAlumnosXGrupo
if  %1  EQU 3  goto tablaBailes
if  %1  EQU 4  goto tablaGrupos
if  %1  EQU 5  goto tablaNiveles
if  %1  EQU 6  goto tablaPagosaProfesores
if  %1  EQU 7  goto tablaProfesores
if  %1  EQU 8  goto tablaUsuarios
goto error


:tablaAlumnos
java -Djava.rmi.server.codebase=file:%cb% -jar %cb% PoblarBD_DB tblAlumnos > C:\Users\aalex\Documents\NetBeansProjects\SCE\escBaileDerby\batchPoblar\script.sql
goto fin
:tablaAlumnosXGrupo
java -Djava.rmi.server.codebase=file:%cb% -jar %cb% PoblarBD_DB tblAlumnosXGrupo > C:\Users\aalex\Documents\NetBeansProjects\SCE\escBaileDerby\batchPoblar\script.sql
goto fin
:tablaBailes
echo tblBailes
java -Djava.rmi.server.codebase=file:%cb% -jar %cb% PoblarBD_DB tblBailes > C:\Users\aalex\Documents\NetBeansProjects\SCE\escBaileDerby\batchPoblar\script.sql
goto fin
:tablaGrupos
echo tblGrupos
java -Djava.rmi.server.codebase=file:%cb% -jar %cb% PoblarBD_DB tblGrupos > C:\Users\aalex\Documents\NetBeansProjects\SCE\escBaileDerby\batchPoblar\script.sql
goto fin
:tablaNiveles 
java -Djava.rmi.server.codebase=file:%cb% -jar %cb% PoblarBD_DB tblNiveles > C:\Users\aalex\Documents\NetBeansProjects\SCE\escBaileDerby\batchPoblar\script.sql
echo tblNiveles
goto fin
:tablaPagosaProfesores
java -Djava.rmi.server.codebase=file:%cb% -jar %cb% PoblarBD_DB tblPagosaProfesores > C:\Users\aalex\Documents\NetBeansProjects\SCE\escBaileDerby\batchPoblar\script.sql
echo tblPagosaProfesores
goto fin
:tablaProfesores
java -Djava.rmi.server.codebase=file:%cb% -jar %cb% PoblarBD_DB tblProfesores > C:\Users\aalex\Documents\NetBeansProjects\SCE\escBaileDerby\batchPoblar\script.sql
echo tblProfesores
goto fin
:tablaUsuarios
java -Djava.rmi.server.codebase=file:%cb% -jar %cb% PoblarBD_DB tblUsuarios > C:\Users\aalex\Documents\NetBeansProjects\SCE\escBaileDerby\batchPoblar\script.sql
echo tblUsuarios
goto fin
:error
echo no existe la opcion
goto fin




:fin
call "C:\Program Files\glassfish-4.1.1\javadb\bin\ij.bat"  < C:\Users\aalex\Documents\NetBeansProjects\SCE\escBaileDerby\batchPoblar\script.sql
