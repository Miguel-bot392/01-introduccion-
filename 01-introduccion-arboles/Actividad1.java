package com.mycompany.actividad1;

public class Actividad1 {

    public static void main(String[] args) {
        // Nivel 0
        NodoGeneral<String> raiz = new NodoGeneral<>("Empresa");

        // Nivel 1
        NodoGeneral<String> tecnologia = new NodoGeneral<>("Tecnología");
        NodoGeneral<String> finanzas = new NodoGeneral<>("Finanzas");
        NodoGeneral<String> talento = new NodoGeneral<>("Talento Humano");
        raiz.agregarHijo(tecnologia);
        raiz.agregarHijo(finanzas);
        raiz.agregarHijo(talento);

        // Nivel 2
        tecnologia.agregarHijo(new NodoGeneral<>("Desarrollo"));
        tecnologia.agregarHijo(new NodoGeneral<>("Soporte"));
        finanzas.agregarHijo(new NodoGeneral<>("Contabilidad"));
        finanzas.agregarHijo(new NodoGeneral<>("Tesorería"));
        talento.agregarHijo(new NodoGeneral<>("Selección"));

        System.out.println("Raíz: " + raiz.getDato());
        System.out.println("Jerarquía completa:");
        raiz.imprimir(0);
    }
}