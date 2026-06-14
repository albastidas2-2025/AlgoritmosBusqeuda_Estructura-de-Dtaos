package org.biblioteca;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TablaHash tabla = new TablaHash(7);
        tabla.insertar(50, "Estudiante 50");
        tabla.insertar(700, "Estudiante 700");
        tabla.insertar(76, "Estudiante 76");
        tabla.insertar(85, "Estudiante 85");
        tabla.insertar(92, "Estudiante 92");
        tabla.insertar(73, "Estudiante 73");
        tabla.insertar(101, "Estudiante 101");
        System.out.println("=== TABLA HASH ===");
        tabla.mostrarTabla(); System.out.println("\n=== BUSQUEDAS ===");
        System.out.println("Clave 50: " + tabla.buscar(50));
        System.out.println("Clave 85: " + tabla.buscar(85));
        System.out.println("Clave 92: " + tabla.buscar(92));
        System.out.println("Clave 101: " + tabla.buscar(101));
        System.out.println("Clave 999: " + tabla.buscar(999));
    }
}