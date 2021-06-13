package br.com.cedugenio.estruturadados;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        this.tamanho = 0;

    }

    //    public void adiciona(String elemento) {
//        for(int i = 0; i < elementos.length; i++) {
//            if(this.elementos[i] == null) {
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }
    public boolean adiciona(String elemento) {
        if (this.tamanho < this.elementos.length) {
            elementos[tamanho] = elemento;
            tamanho++;
            return true;
        }
        return false;
    }
    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.tamanho-1;i++) {
            sb.append(this.elementos[i]);
            sb.append(", ");
        }
        if(this.tamanho > 0 ) {
            sb.append(this.elementos[this.tamanho-1]);
        }
        sb.append("]");

        return sb.toString();
    }
}