package com.salesianos.actividad2;

import java.io.*;

public class RecuperarTexto {
    public static void main(String[] args) {
        String fileName = "actividad2.txt";

        // Crear el fichero y escribir texto en él
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Chachoooo... carlosssss!!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer el fichero y mostrar los caracteres con su representación decimal
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character + "_" + character + ", ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}