package org.example;

import org.example.Listas.Lista;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lista l = new Lista();
        var respuesta = l.crearLista();
        respuesta.visualizar();
    }
}