package com.salesianos.actividad1;

import com.salesianos.actividad1.utils.FileUtils;

import java.util.Scanner;

public class GuardarTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = "";

        while (text.length() < 30) {
            System.out.println("Introduce un texto de al menos 30 caracteres:");
            text = scanner.nextLine();
            if (text.length() < 30) {
                System.out.println("Faltan " + (30 - text.length()) + " caracteres.");
            }
        }

        String formattedText = text.toUpperCase().replace(" ", "_");
        FileUtils.saveTextToFile("actividad1.txt", formattedText);
        System.out.println("Texto guardado en el fichero actividad1.txt");
    }
}
