package org.example.Listas;

public class Nodo {
    public String dato;
    public Nodo enlace;

    public Nodo(String dato) {
        this.dato = dato;
        this.enlace = null;
    }

    public Nodo(String dato, Nodo enlace) {
        this.dato = dato;
        this.enlace = enlace;
    }

//   int dato;
//
//    Nodo enlace;
//    public  Nodo(int x){
//        dato = x;
//        enlace = null;
//    }
//    public Nodo(String x, Nodo n ){
//        dato = x;
//        enlace = n;
//
//    }
//    public Nodo getEnlace(){
//        return enlace;
//    }
//    public void setEnlace(Nodo n){
//        enlace = n;
//    }
//
//    @Override
//    public String toString() {
//        return "Nodo{" +
//                "dato=" + dato +
//                ", enlace=" + enlace +
//                '}';
//    }
}
