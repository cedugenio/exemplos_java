package br.com.cedugenio.exemplos.classe;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();

        pilha.push("Robbit in Diadema");
        pilha.push("Java efetivo");
        pilha.push("Java Abrindo a cabeça");

        System.out.println("buscando ...");
        System.out.println(pilha.search("Java"));

        System.out.println("peek ..");
        System.out.println(pilha.peek());

        System.out.println("pop ..");
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());

        for(String livros : pilha) {
            System.out.println(livros);
        }




    }
}
