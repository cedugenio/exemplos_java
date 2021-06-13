package br.com.cedugenio.estrutura_decisao;
//Receber 2 valores e imprimir em uma linha

import java.util.Arrays;

public class stein {
    public static void main(String[] args) {
        int[] dados = {1,4,5};
        Arrays.stream(dados).forEach(System.out::println);
    }
}
