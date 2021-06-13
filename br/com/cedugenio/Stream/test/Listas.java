package br.com.cedugenio.Stream.test;

import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("Ana","Beatriz","dos Santos","Eugenio", "Ana Regina");
        lista.stream().filter(nome -> nome.contains("Ana"))
                .forEach(System.out::println);

    }
}
