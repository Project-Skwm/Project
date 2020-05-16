#!/bin/bash
#Es necesario poner la 1a linea.

#User y pass CORRECTOS que definimos nosotros.
UserP="User"
PassP="123"

#Archivo que guarda la variable/texto de la información correcta
File="clave1.txt"

#Pediremos al usuario los datos. En este caso, "User" sera el nombre de la variable de tiempo.
echo "Introduce un usuario"
read -t 6 User

#Si no se introduce un usuario o contrasenya a tiempo, el programa se cerrara.
#La -z comprueba si la variable es NULL (que lo sera si acaba el tiempo), y al ser así pasa al siguiente, si no, se acaba el IF.
if [ -z $User ];
	then
		echo -e "\nSe ha excedido el tiempo de comprobacion; disculpe las molestias"
		exit
fi
echo "Introduce una contraseña"
read -t 6 Pass
if [ -z $Pass ];
	then
		echo -e "\nSe ha excedido el tiempo de comprobacion; disculpe las molestias"
		exit
fi
echo "Usuario: $User"
echo "Contraseña: $Pass"
#Si los datos son incorrectos, saldra en forma de mensaje
if [ $User = $UserP ] | [ $Pass = $PassP ];
	then
		echo -e "\nEl usuario y contraseña son correctos"
		chmod 777 $File
		echo -e "\nBienvenido $User, en que podemos ayudarle?"
	else
		echo -e "\nEl usuario y/o contraseña son incorrectos"
fi
