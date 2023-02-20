package com.angi.io;

import javax.swing.*;
import java.util.Scanner;

/**
 * Librería de entrada y salida de datos
 *
 * @author Angi Casella
 * @version 1.0
 */
public class EntradaSalida {
    /**
     * opción de uso de la consola para imprimir un mensaje
     */
    public static final int SALIDA_CONSOLA = 1;
    /**
     * opción de uso de utilizar una ventana en el escritorio para sacar un mensaje
     */
    public static final int SALIDA_WINDOW = 2;

    /**
     * Salida por ventana o consola de un mensaje
     *
     * @param mensaje cadena que queremos imprimir
     * @param device  dispositivo de salida, consola (SALIDA_CONSOLA) o ventana (SALIDA_WINDOW)
     * @return si es true: correcto sino es false
     */
    public static boolean salida(String mensaje, int device) {
        switch (device) {
            case SALIDA_CONSOLA:
                try {
                    System.out.println("Consola: " + mensaje);
                    return true;
                } catch (Exception e) {
                    return false;
                }

            case SALIDA_WINDOW:
                try {
                    JOptionPane.showMessageDialog(null, mensaje);
                    JOptionPane.showMessageDialog(null, "Sale por ventana: " + mensaje.toCharArray()[20]);
                    return true;
                } catch (Exception e) {
                    return false;
                }

            default:
                return false;
        }

    }

    /**
     * Entrada con scanner de un mansaje
     *
     * @param mensaje que el usuario ve para saber que introducir
     * @return mensaje
     */
    public static String entradaString(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);

        try {
            return sc.nextLine();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Entrada con scanner de un entero
     *
     * @param mensaje que el usuario ve para saber que introducir
     * @return número entero
     */
    public static Integer entradaEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        try {
            return sc.nextInt();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Entrada con scanner de un decimal
     *
     * @param mensaje que el usuario ve para saber que introducir
     * @return número decimal
     */
    public static Float entradaFloat(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        try {
            return sc.nextFloat();
        } catch (Exception e) {
            return null;
        }
    }
}
