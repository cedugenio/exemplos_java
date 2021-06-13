package br.com.cedugenio.busca_binaria;

public class BuscaBinaria {
    public static void main(String[] args) {

        int[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 28, 31, 40, 50};

        int valor_inicial = 0;
        int valor_final = valores.length - 1;
        int valor_desejado = 3;
        int resultado = 0;


        while (valor_inicial <= valor_final) {
            int valor_meio = (valor_inicial + valor_final) / 2;
            if (valores[valor_meio] == valor_desejado) {
                resultado = valor_meio;
                break;
            } else if (valores[valor_meio] < valor_desejado) {
                valor_inicial = valor_meio + 1;
            } else {
                valor_final = valor_meio - 1;
            }
        }

        System.out.println("O numero buscado foi : " + valor_desejado + " foi encontrado em " + resultado);
    }
}