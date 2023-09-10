# SEB & SDB 

##--SEB (Sistema de Encriptado Basico)
Siguiendo el ejemplo de algunos juegos que usan generación procedular es decir, que se crean de manera aleatoria en base a una serie de algoritmos definidos por los desarrolladores.
Del mismo modo, sabiendo que las computadoras no son capaces de generar un numero completamente aleatorio, si no que usan numeros seudoaleatorios, seguimos seguir el mismo proceso.
Una ve con esta base obtenemos 3 numeros pseudoaleatorios, el primero, se trata de el primer digito de los milisegundos de la hora del sistema.
El segundo numero, sigue el mismo proceso, pero usando el segundo numero.
En caso que los milisegundos transcurridos, no sean mayores a diez, el primer digito, sera el primer digito de los segundo.
Y en el caso del segundo numero, sera el primer digito de los minutos.
El tercero, se trata de la diferencia de 1001, menos los primeros dos numeros, de donde en caso que sean dos digitos el resultado, solo se usan el número de las decenas.
En base a esto cada numero controla el algoritmo que cifra un conjunto de letras.
El cifrado de la letra "A", siempre es el mismo.
El cifrado de las letras "B" a la "M", es controlado por el primer digito, escogiendo uno entre los nueve posibles.
El cifrado de las letras "N" a la "Z", es controlado por el primer digito, escogiendo uno entre los nueve posibles.
El cifrado de llos números "o" a el "9", es controlado por el primer digito, escogiendo uno entre los nueve posibles.
Posteriormente se crean dos archivos, uno contiene el mensaje cifrado y otro el codigo de encriptado.


##--SDB (Sistema de Desencriptado Basico)
Para el descifrado, tomamos cada uno de los números del codigo del decifrado y solamente lo deciframos de la misma manera.
Recordando que:
El cifrado de la letra "A", siempre es el mismo.
El cifrado de las letras "B" a la "M", es controlado por el primer digito, escogiendo uno entre los nueve posibles.
El cifrado de las letras "N" a la "Z", es controlado por el primer digito, escogiendo uno entre los nueve posibles.
El cifrado de llos números "o" a el "9", es controlado por el primer digito, escogiendo uno entre los nueve posibles.
Para hacer esto, se leen ambos archivos, el que contiene el codigo y el que contiene el mensaje cifrado.
