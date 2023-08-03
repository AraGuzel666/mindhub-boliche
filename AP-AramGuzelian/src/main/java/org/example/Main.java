/*
Java - Ejercitación inicial.

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> coleccion = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9, 24534, 55, 23, 7, 1, 4, 8));
        // usuario();
        // numeroMayor();
        // numeroPar();
        // textosIguales();
        // coleccionNumerica();
        // bienvenida();
        // System.out.println(esPrimo(50));  - FALSE
        // System.out.println(esPrimo(7));   - TRUE
        // System.out.println(sumarNumerosImpares(coleccion));
        // sumaParesPrimos(coleccion);
        calculadoraConsola();
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
        //Ejercicio 3. y Ejercicio 7.
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
        // Ejercicio 5.
        ArrayList<Integer> coleccion = new ArrayList<>();

        System.out.println("Cada numero que ingreses, se agregara a la coleccion");
        System.out.println("Ingrese 0 para salir del bucle y terminar el programa");
        int numero;

        do {
            System.out.println("Ingrese un numero: ");
            numero = scanner.nextInt();

            if (numero != 0){
                coleccion.add(numero);
            }
        } while (numero != 0);

        System.out.println("Los numeros ingresados son: " + coleccion);
    }
    public static void bienvenida(){
        // Ejercicio 6.
        System.out.println("Bienvenido! - By Aram Guzelian");
    }
    public static boolean esPrimo(int numero) {
        // Ejercicio 8.
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }
    public static Integer sumarNumerosImpares(Collection<Integer> coleccionNumerica){
        // Ejercicio 9.

        int sumatoriaImpares = 0;

        for (Integer numeros : coleccionNumerica){
            if (!esPar(numeros)){
                sumatoriaImpares += numeros;
            }
        }
        return sumatoriaImpares;
    }
    public static void sumaParesPrimos(Collection<Integer> coleccionNumerica){
        // Ejercicio 10.
        ArrayList<Integer> numerosPares = new ArrayList<>();
        int sumatoriaNumerosPrimos = 0;

        for (Integer numeros : coleccionNumerica){
            if (esPar(numeros)){
                numerosPares.add(numeros);
            }
            if (esPrimo(numeros)){
                sumatoriaNumerosPrimos += numeros;
            }
        }
        System.out.println("Los numeros Pares son: " + numerosPares);
        System.out.println("La sumatoria de numeros primos es " + sumatoriaNumerosPrimos);
    }
    public static void calculadoraConsola(){
        // Ejercicio 11.
        // Ejercicio 12.

        int opcion = 5;
        int num1 = 0;
        int num2 = 0;

        System.out.println("Calculadora con las 4 operaciones basicas:");
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");

        while (opcion != 0){

            System.out.println("1 - Suma");
            System.out.println("2 - Resta");
            System.out.println("3 - Multiplicacion");
            System.out.println("4 - Division");
            System.out.println("0 - Salir / Exit");
            System.out.println("Elige una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("VAS A SUMAR");
                    System.out.println("Primer Numero");
                    num1 = scanner.nextInt();
                    System.out.println("Segundo Numero");
                    num2 = scanner.nextInt();
                    System.out.println("RESULTADO DE LA SUMA " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("VAS A RESTAR");
                    System.out.println("Primer Numero");
                    num1 = scanner.nextInt();
                    System.out.println("Segundo Numero");
                    num2 = scanner.nextInt();
                    System.out.println("RESULTADO DE LA RESTA " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("VAS A MULTIPLICAR");
                    System.out.println("Primer Numero");
                    num1 = scanner.nextInt();
                    System.out.println("Segundo Numero");
                    num2 = scanner.nextInt();
                    System.out.println("RESULTADO DE LA MULTIPLICACION " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("VAS A DIVIDIR");
                    System.out.println("Primer Numero");
                    num1 = scanner.nextInt();
                    System.out.println("Segundo Numero");
                    num2 = scanner.nextInt();
                    System.out.println("RESULTADO DE LA DIVISION " + (num1 / num2));
                    break;
                case 0:
                    System.out.println("Adios... Vuelva Prontosss");
                    break;
                default:
                    System.out.println("OPCION INCORRECTA");
            }
        }
    }
}