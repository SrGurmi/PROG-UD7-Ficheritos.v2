package com.salesianos.actividad4;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Nueva mesa");
            System.out.println("2. Mostrar todas las mesas almacenadas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el color de la mesa: ");
                    String color = scanner.nextLine();
                    System.out.print("Introduce el número de patas: ");
                    int numeroDePatas = scanner.nextInt();
                    Mesa mesa = new Mesa(color, numeroDePatas);
                    MesaManager.guardarMesa(mesa);
                    System.out.println("Mesa guardada.");
                    break;
                case 2:
                    List<Mesa> mesas = MesaManager.obtenerMesas();
                    System.out.println("Mesas almacenadas:");
                    for (Mesa m : mesas) {
                        System.out.println(m);
                    }
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}