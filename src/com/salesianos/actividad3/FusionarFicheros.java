package com.salesianos.actividad3;

import com.salesianos.actividad3.utils.FileUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FusionarFicheros {
    public static void main(String[] args) {
        String contenido1 = leerFichero("src/com/salesianos/files/actividad1.txt");
        String contenido2 = leerFichero("src/com/salesianos/files/actividad2.txt");

        String contenidoFusionado = "- Contenido del Fichero Uno: " + contenido1 + "\n"
                + "- Contenido del Fichero Dos: " + contenido2 + "\n"
                + "\n-- Firma: Supervisado por Ale";

        FileUtils.saveTextToFile("actividad3.txt", contenidoFusionado);
        System.out.println("Ficheros fusionados en actividad3.txt");
    }

    private static String leerFichero(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}