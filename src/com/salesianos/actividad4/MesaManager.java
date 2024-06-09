package com.salesianos.actividad4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MesaManager {
    private static final String FILE_NAME = "src/com/salesianos/files/actividad4.txt";

    public static void guardarMesa(Mesa mesa) {
        List<Mesa> mesas = obtenerMesas();
        mesas.add(mesa);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(mesas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Mesa> obtenerMesas() {
        List<Mesa> mesas = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            mesas = (List<Mesa>) ois.readObject();
        } catch (FileNotFoundException e) {
            // Archivo no encontrado, devolver lista vacía
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return mesas;
    }
}