package com.mycompany.actividad1;

import java.util.ArrayList;
import java.util.List;

public class NodoGeneral<T> {
    private T dato;
    private List<NodoGeneral<T>> hijos = new ArrayList<>();

    public NodoGeneral(T dato) { this.dato = dato; }
    public void agregarHijo(NodoGeneral<T> hijo) { hijos.add(hijo); }
    public T getDato() { return dato; }
    public List<NodoGeneral<T>> getHijos() { return hijos; }

    // Imprime el árbol con sangría según el nivel
    public void imprimir(int nivel) {
        System.out.println("   ".repeat(nivel) + "- " + dato);
        for (NodoGeneral<T> hijo : hijos) {
            hijo.imprimir(nivel + 1);
        }
    }
}