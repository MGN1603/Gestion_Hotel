package Modelo;

public class IDsGenerator {

    private static int contadorRes = 1;

    // Método estático que genera el ID único
    public static String generateReservaId() {
        String id = "RES-" + contadorRes;
        contadorRes++; // Incrementamos para el siguiente ID
        return id;
    }

}
