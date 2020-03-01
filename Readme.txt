
 Práctica 00
Ibarra Alarcón Hugo Rafael      316321558
Madera Baldovinos Erika Yusset  316125985

Manera de correr el programa:


Preguntas: 
I. Escribe la representacion en binario del número decimal 172.
     10101100

II. ¿Cuál es el numero mínimo de bits requeridos para representar todos los caracteres en un teclado que tiene nueve letras?
      4, pues 2^3= 8. Se pueden codificar máximo 8 elementos. 

III. ¿Cuál es el mínimo número de bits requerido para representar todos los caracteres de un teclado de 22 teclas?
      5, pues 2^4 = 16 y no es suficiente.
      En general, para codificar N elementos se precisan como mínimo ⌈log2N⌉ bits.

IV. En general, ¿Es posible hacer la conversion entre una base n y una base m? para cualquier n, m > 1 y n distinta de m.
   Sí, existen varios algoritmos para hacerlo:
 -Teniendo que n = akn^k + ak-1n^k-1 + … + an^0, convertimos el valor de n y todas las ai (0 ≤ i ≤ k) a su equivalente en m y realizamos las operaciones de suma y multiplicación en esta base.
El inconveniente obvio que presenta este método es que necesitamos tener la conversión de todos los dígitos de la base n a la base m para poder convertir el número completo. Por esto, este método es útil principalmente cuando n < m.

 -Otra forma para convertir entre bases es ir dividir el número en base n entre m, tomar el cociente y repetir hasta que el cociente sea cero. Al final, el número en base m se conforma por los residuos, leyéndolos del último al primero. 

-Si queremos convertir entre bases, y una de estas es potencias de la otra, existe una forma para hacer más rápida la conversión. Teniendo que bm = ni, entonces podemos separar al número en base n en bloques de tamaño i, convertir esos bloques y después unirlos
