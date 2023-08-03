/*
Java - Ejercitación inicial.
1. Crear las variables correspondientes para leer tu nombre,
apellido y edad e imprimirlos por consola en una oración.
2. Realizar un pequeño programa que permita ingresar 3 números
e imprimir por consola cuál es el mayor.
3. Realizar un pequeño programa que permita el ingreso de un
número e imprimir por consola su paridad.
4. Crear el código correspondiente que permita ingresar 2 cadenas
de caracteres e imprima por consola si son iguales o no.
5. Realizar un pequeño programa que permita el ingreso de
números, almacenarlos en una colección hasta ingresar un 0.
6. Crear una función que imprima un mensaje de bienvenida en la
consola.
7. Crear una función que reciba un número entero y devuelva si es
par o impar en forma de texto.
8. Crear una función que reciba un número y devuelva si el mismo
es primo o no.
9. Crear una función que reciba una colección de números y
devuelva la suma de los números impares.
10. Crear una función que reciba una colección de números e
imprima los números pares y la suma de los números primos.
11. Crear una función que imprima por consola un pequeño
menú con las opciones básicas de una calculadora agregando
la opción 0 para salir del mismo.
12. Crear otra función que ocupe la del punto anterior para poder
crear una pequeña calculadora usando switch. Tener en cuenta
el caso de la división por 0.
13. Crear el algoritmo necesario para poder gestionar el ingreso
a un boliche. El mismo deberá contar con un pequeño menú con
las siguientes opciones:
 Ingreso de datos.
 Capacidad disponible.
 Dinero recaudado.
 Salir del sistema.
Crear las variables correspondientes para controlar la capacidad
y el dinero recaudado. Siendo la capacidad máxima de 500
personas y la entrada costar 1500 por persona y 2000 la
entrada vip. La primera opción del menú deberá tomar los datos
personales del ingresante (nombre, edad, DNI y pase). El
algoritmo deberá detectar si la persona está apta para el
ingreso, ya que solo se dejará pasar a los mayores de 21 años.
Verificar antes de cobrar la entrada si posee pase vip con el cual
ingresará gratis o si posee pase con descuento el cual le
permitirá solo abonar la mitad del valor de la entrada. Al
momento de hacer el cobro se deberá preguntar si quiere
comprar la entrada normal o vip y finalmente darle la bienvenida
en caso de que todo haya salido bien, volviendo al menú
principal. Las variables correspondientes tendrán que reflejar el
ingreso tanto de personas como de dinero.

Aram Guzelian - AP + Mindhub - Backend JAVA
*/



package org.example;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // usuario();
        // numeroMayor();
        // numeroPar();
        // textosIguales();
    }
    public static void usuario(){
        // Ejercicio 1.
        System.out.println("Ingresa tu nombre:");
        String nombre = scanner.next();

        System.out.println("Ingresa tu apellido:");
        String apellido = scanner.next();

        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();

        System.out.println("Tu nombre y apellido es " + nombre + " " + apellido + " y tu edad es " + edad);
    }
    public static void numeroMayor(){
        // Ejercicio 2.
        System.out.println("Ingresa 3 numeros para descubrir el mayor:");
        System.out.println("Primer numero");
        int primerNumero = scanner.nextInt();
        System.out.println("Segundo numero");
        int segundoNumero = scanner.nextInt();
        System.out.println("Tercer numero");
        int tercerNumero = scanner.nextInt();

        if ((primerNumero > segundoNumero) && (primerNumero > tercerNumero)){
            System.out.println("Numero mayor es el PRIMER numero ingresado: " + primerNumero);
        }else if ((segundoNumero > primerNumero) && (segundoNumero > tercerNumero)){
            System.out.println("Numero mayor es el SEGUNDO numero ingresado: " + segundoNumero);
        }else if ((tercerNumero > primerNumero) && (tercerNumero > segundoNumero)){
            System.out.println("Numero mayor es el TERCER numero ingresado: " + tercerNumero);
        }else{
            System.out.println("Error");
        }


    }
    public static boolean esPar(int numero){
        return numero % 2 == 0;
    }
    public static void numeroPar(){
        //Ejercicio 3.
        System.out.println("Ingresa un numero para comprobar si es Par: ");
        int numero = scanner.nextInt();

        if (esPar(numero)){
            System.out.println("Este numero SI es par: " + numero);
        }else {
            System.out.println("Este numero NO es par: " + numero);
        }
    }
    public static void textosIguales(){
        // Ejercicio 4.
        System.out.println("Comparando si dos cadenas de texto son iguales: ");
        System.out.println("Ingrese primer cadena de texto: ");
        String cadena1 = scanner.next();
        System.out.println("Ingrese segunda cadena de texto: ");
        String cadena2 = scanner.next();

        if (cadena1.equals(cadena2)){
            System.out.println("Estas cadenas SON IGUALES!");
        }else{
            System.out.println("Estas cadenas NO SON IGUALES!");
        }
    }
    public static void coleccionNumerica(){
        
    }
}