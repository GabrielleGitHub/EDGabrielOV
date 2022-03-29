/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class ClasesJava {

            /**
     * @param args the command line arguments
     * @param jugadores
     * @param contadorPartida
     * @param ronda
     * @param partida
     * @param solucion
     * @param puntuacion1
     * @param ganador
     * @param matriz
     * @param cadenaString
     * @param nickname
     * @param operadore
     * @param cadenaNombres
     */
    //Declarar variables.
    static int jugadores;
    static int contadorPartida = 0;
    static int ronda = 0;
    static int partida, solucion;
    static int puntuacion1, ganador;
    static int matriz[][];
    static int cadenaString, nickname;
    static String operadore;
    static String cadenaNombres[];

    /**
     * Función que incluye las preguntas sobre el número de jugadores y rondas.
     * Además se crea la cadena String de nombres que posteriormente es desordenada.
     */
    public static void inicioPartida() {

        //Entrada.
        Scanner entrada = new Scanner(System.in);

        //Pregunta el número de rondas, es decir, el modo de partida a seleccionar. Hasta que la respuesta no se ajuste a lo mostrado no se avanzará.
        partida = 0;
        while (partida != 3 && partida != 5 && partida != 10 && partida != 20) {
            System.out.println("¿Cuántas rondas deseas jugar? Partida rápida: 3 // Partida corta: 5 //Partida normal: 10 //Partida larga: 20");
            partida = entrada.nextInt();
        }

        //Pregunta sobre el número de jugadores. Hasta que no se ajuste a lo programado no se podrá continuar.
        jugadores = 0;
        while (jugadores < 1 || jugadores > 6) {
            System.out.println("¿Cuántos jugadores participarán? El número de los mismos es de 1 a 6:");
            jugadores = entrada.nextInt();
        }

        //Creación del array nombres.
        String cadenaNombres[] = new String[jugadores];

        for (int nickname = 0; nickname < jugadores; nickname++) {
            //Introducción del nombre del jugador en la matriz.
            System.out.println("¿Cuál es el nombre del jugador " + (nickname + 1) + "?: ");
            cadenaNombres[nickname] = entrada.next();

        }

        //Mostrar el número correspondiente a cada nombre.
        //desordenar();
        List<String> lista_jug = Arrays.asList(cadenaNombres);
        Collections.shuffle(lista_jug);
        lista_jug.toArray(cadenaNombres);
        System.out.println(Arrays.toString(cadenaNombres));

        System.out.println("Se jugará en el orden indicado en la lista de nombres anterior"
                + "de izquierda a derecha. Asignando a cada jugador un número: 0, 1, 2, ...");

        //Creación de la matriz.
        matriz = new int[jugadores][2];

        //Llamar a la función ronda para iniciar las preguntas.
        ronda();
        //Llamar a la función ganador.
        ganador();

    }

    /**
     * Función en la que se crea una matriz correspondiente a los jugadores y a sus puntuaciones.
     * Se muestra una pregunta por turno dirigida a cada jugador. Se llama a las funciones
     * correspondientes.
     */
    public static void ronda() {

        for (int k = 0; k < partida; k++) {
            for (int g = 0; g < jugadores; g++) {
                System.out.println("Jugador " + g + " : ");

                //Pasar la cadena String a String para hacerla visible.
                String[] preguntas = preguntaAleatoria();
                String cadenaOperacion = Arrays.toString(preguntas);
                System.out.println("Resuelva la siguiente pregunta: " + cadenaOperacion);
                int respuestaCorrecta = evaluarExpresionArray(preguntas);
                System.out.println("Evaluada y es " + respuestaCorrecta);
                //Entrada.
                Scanner entrada = new Scanner(System.in);

                //Leer variable.
                solucion = entrada.nextInt();

                //Comparar la solución dada por teclado con el resultado calculado.
                if (respuestaCorrecta == solucion) {
                    matriz[g][1] = matriz[g][1] + 1;
                } else {
                    //Se muestra la respuesta en el caso de fallar.
                    System.out.println("La respuesta correcta sería " + respuestaCorrecta);
                }

            }
        }

        //Llamar a la función resultados. Se mostrarán los resultados acumulados.
        resultados();
    }

    /**
     * Función empleada para decidir de forma aleatoria los operadores a utilizar en
     * la preguntaAleatoria que se mostrará en su función correspondiente.
     * @return el operador a utilizar bajo el nombre de la variable operador.
     */
    public static String operadorAleatorio() {

        //Generación de número aleatorio.
        int operador = (int) (1 + Math.random() * (3 - 1 + 1));

        //Switch para escoger uno de los operadores al azar.
        switch (operador) {
            case 1:
                operadore = "+";
                break;
            case 2:
                operadore = "-";
                break;
            case 3:
                operadore = "*";
                break;

        }
        return operadore;
    }

    /**
     * Función encargada de devolver la pregunta aleatoria a cada jugador.
     * @return cadenaString que corresponde a la pregunta aletoria.
     */
    public static String[] preguntaAleatoria() {

        //Declarar array cadenaString
        int longitudOpera = (int) (4 + Math.random() * (8 - 4 + 1));
        String cadenaString[] = new String[longitudOpera + longitudOpera - 1];
        int numAleatorio;
        String numAleatorioS;

        //Convierte los números int en String.
        //Bucle encargado de rellenar el array con operandos y operadores.
        for (int p = 0; p < (longitudOpera - 1) * 2; p = p + 2) {

            //Añadir número aleatorio en una posición del array.
            numAleatorio = (int) (2 + Math.random() * (12 - 2 + 1));
            numAleatorioS = Integer.toString(numAleatorio);

            //Añadirlo con tipo String.
            cadenaString[p] = numAleatorioS;

            //Añadir operador en una posición del array.
            cadenaString[p + 1] = operadorAleatorio();

        }

        //Añadir número aleatorio en una posición del array.
        numAleatorio = (int) (2 + Math.random() * (12 - 2 + 1));
        numAleatorioS = Integer.toString(numAleatorio);

        cadenaString[cadenaString.length - 1] = numAleatorioS;

        return cadenaString;

    }

    /**
     * 
     * @param exp
     * @return la solución a la cadenaString o pregunta aleatoria.
     */
    public static int evaluarExpresionArray(String[] exp) {

        int valor = 0;
        String[] expRed = new String[exp.length];
        expRed = Arrays.copyOf(exp, exp.length);

        for (int i = 0; i < expRed.length; i++) {
            if (expRed[i] == "*") {
                expRed[i + 1] = multiplicar(expRed[i - 1], expRed[i + 1]);
                expRed[i - 1] = "0";
                if (i - 2 > 0 && expRed[i - 2] == "-") {
                    expRed[i] = "-";
                } else {
                    expRed[i] = "+";
                }
            }
        }

        System.out.print("La expresión matemática reducida es: ");
        for (int i = 0; i < expRed.length; i++) {
            System.out.print(expRed[i]);
        }
        System.out.println();

        String op = "";
        for (int i = 0; i < expRed.length; i++) {
            if (i == 0) {
                valor = Integer.parseInt(expRed[i]);
            } else if (expRed[i] == "+") {
                op = "suma";
            } else if (expRed[i] == "-") {
                op = "resta";
            } else {
                if (op == "suma") {
                    valor = valor + Integer.parseInt(expRed[i]);
                    op = "";
                } else if (op == "resta") {
                    valor = valor - Integer.parseInt(expRed[i]);
                    op = "";
                }
            }
        }
        return valor;
    }

    /**
     * 
     * @param num1
     * @param num2
     * @return un resultado intermedio en el caso de que existan multiplicaciones
     * que puedan dificultar la solución de la expresión matemática a resolver.
     */
    private static String multiplicar(String num1, String num2) {
        int num1Int, num2Int, resInt;
        String resString;

        num1Int = Integer.parseInt(num1);
        num2Int = Integer.parseInt(num2);
        resInt = num1Int * num2Int;
        resString = Integer.toString(resInt);
        return resString;

        // También se podría poner en una sola línea:
        // Integer.toString (Integer.parseInt (num1) * Integer.parseInt (num2));
    }

    /**
     * Se muestran los resultados de la matriz, es decir, id de jugador junto a su resultado.
     */
    public static void resultados() {

        for (int i = 0; i < jugadores; i++) {

            //Se muestran los resultados junto al nombre.
            System.out.print("Jugador" + i + ":" + matriz[i][1] + "\n");
        }

    }

    /**
     * Se comparan los resultados hasta que se obtiene un ganador o ganadores.
     */
    public static void ganador() {

        puntuacion1 = matriz[0][1];
        ganador = matriz[0][0];

        for (int i = 0; i < jugadores - 1; i++) {

            /*Comparación de todas las puntuaciones referentes a los resultados finales tanto en ronda 
            como en el fin de la partida.*/
            if (puntuacion1 < matriz[i + 1][1]) {

                puntuacion1 = matriz[i + 1][1];
                ganador = matriz[i + 1][0];

            }
        }

        //Tenemos en puntuacion1 los puntos ganadores y en ganador el nombre (id).
        String result_f = ""; //Se utilizará para mostrar al ganador y en caso de empate.
        int ganadores = 0;

        for (int i = 0; i < jugadores; i++) {

            /*Comparación de todas las puntuaciones referentes a los resultados finales.*/
            if (puntuacion1 == matriz[i][1]) {
                ganadores++;
                result_f = result_f + "\n Ha ganado el jugador " + i + " y su puntuación es: " + puntuacion1;

            }
        }
        //Comprobamos empate.
        if (ganadores > 1) {

            result_f = "Ha habido empate:\n" + result_f;
        }
        System.out.println(result_f);

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
