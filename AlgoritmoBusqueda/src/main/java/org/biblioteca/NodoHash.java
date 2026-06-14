package org.biblioteca;

public class NodoHash {
    int clave;
    String valor;
    NodoHash siguiente;

    public NodoHash(int clave, String valor) {
        this.clave = clave;
        this.valor = valor;
        this.siguiente = null;
    }
}
