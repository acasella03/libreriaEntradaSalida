import com.angi.io.EntradaSalida;

public class Main {
    public static void main(String[] args) {

        boolean isOK_ventana = false;
        boolean isOK_consola = false;

        isOK_consola= EntradaSalida.salida("Hola mundo", EntradaSalida.SALIDA_CONSOLA);
        if(!isOK_consola) System.out.println("ERROR CONSOLA");
        isOK_ventana= EntradaSalida.salida("Hola mundo",EntradaSalida.SALIDA_WINDOW);
        if(!isOK_ventana) System.out.println("ERROR VENTANA");

        String nombre= EntradaSalida.entradaString("¿Cuál es tu nombre?");
        EntradaSalida.salida(nombre, EntradaSalida.SALIDA_CONSOLA);

        Integer edad= EntradaSalida.entradaEntero("¿Cuál es tu edad?");
        if (edad!=null)EntradaSalida.salida(edad.toString(), EntradaSalida.SALIDA_CONSOLA);
        else EntradaSalida.salida("Error en entero", EntradaSalida.SALIDA_CONSOLA);
    }
}