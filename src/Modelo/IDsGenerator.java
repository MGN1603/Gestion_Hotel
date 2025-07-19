package Modelo;

public class IDsGenerator {

    private static int contador = 1;

    // Método estático que genera el ID único
    public static String generateReservaId() {
        String id = "RES-" + contador;
        contador++; // Incrementamos para el siguiente ID
        return id;
    }
}
