package org.biblioteca;

public class TablaHash {
    private NodoHash[] tabla;
    private int tamaño;

    public TablaHash(int tamaño) {
        this.tamaño = tamaño;
        tabla = new NodoHash[tamaño];
    }

    public int hash(int clave) {
        return clave % tamaño;
    }

    public void insertar(int clave, String valor) {
        int indice = hash(clave);
        NodoHash nuevo = new NodoHash(clave, valor);

        if (tabla[indice] == null) {
            tabla[indice] = nuevo;
        } else {
            NodoHash actual = tabla[indice];
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public String buscar(int clave) {
        int indice = hash(clave);
        NodoHash actual = tabla[indice];

        while (actual != null) {
            if (actual.clave == clave) {
                return actual.valor;
            }
            actual = actual.siguiente;
        }

        return null;
    }

    public void mostrarTabla() {
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Índice " + i + ": ");

            NodoHash actual = tabla[i];

            while (actual != null) {
                System.out.print("[" + actual.clave + ", " + actual.valor + "] -> ");
                actual = actual.siguiente;
            }

            System.out.println("null");
        }
    }
}
