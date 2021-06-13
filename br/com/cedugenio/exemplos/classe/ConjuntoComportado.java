package br.com.cedugenio.exemplos.classe;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
    public static void main(String[] args) {
        Set<String> aprovados = new HashSet<>();
        aprovados.add("João");
        aprovados.add("Maria");
        aprovados.add("Aninha");
        for(String nome : aprovados) {
            System.out.println(nome);
        }

    }
}
