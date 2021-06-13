package br.com.cedugenio.exemplos.classe;

import java.util.LinkedList;
import java.util.Queue;

//Implementa FIFO First In First Out

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.offer("Maria"); // nunca retorna erro
        fila.offer("Luciana");
        fila.offer("Aninha");
        fila.add("Carlos");

        System.out.println("Peek/Element...");  //peek vazio retorna nulo //element retorna erro
        System.out.println(fila.peek()); //apenas observa a fila
        System.out.println(fila.element()); //apenas observa a fila

        //remove da lista
        System.out.println("Poll/Remove");
        System.out.println(fila.poll());
        System.out.println(fila.remove());

        for(String nome : fila) {
            System.out.println(nome);
        }


    }
}
