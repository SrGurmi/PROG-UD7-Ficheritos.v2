package com.salesianos.actividad1.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
    public static void saveTextToFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}