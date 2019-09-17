<?php
$conectar=mysql_connect("localhost","root","");

if(!$conectar)
{
echo"no se ha podido conectar con el servidor";
}
else
{
$base=mysql_select_db("papwdb");
if(!$base)
{
    echo"no se encontro la base de datos";
}
}

$Nombre=$_POST["Nombre"];
$Apellidos=$_POST["Apellidos"];
$Usuario=$_POST["Usuario"];
$Email=$_POST["Email"];
$Contraseña=$_POST["Contraseña"];
$Foto=$_POST["Foto"];
$Telefono=$_POST["Telefono"];


$sql="INSERT INTO datos VALUES("Nombre","Apellidos","Usuario","Email","Contraseña","Foto","Telefono")";

$ejecutar=mysql_query($sql);

if(!$ejecutar)
{
    echo"hubo algo mal";
}
else
{
    echo"datos guardados con exito";
    <a href="form.html">volver>
}
?>

