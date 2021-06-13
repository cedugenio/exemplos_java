package br.com.cedugenio.exemplos.classe;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> aprovados =  new ArrayList<>();
        aprovados.add("Ana");
        aprovados.add("Beatriz");
        aprovados.add("Eugenio");

        System.out.println("Get..");
        System.out.println(aprovados.get(2));

        System.out.println("Add..");
        System.out.println(aprovados.add("Luciana"));
        System.out.println("Size..." + aprovados.size());

        System.out.println("Add..");
        System.out.println(aprovados.add("luciana"));
        System.out.println("Size..." + aprovados.size());

        System.out.println("Remove..");
        System.out.println(aprovados.remove("luciana"));

        for(String nome : aprovados) {
            System.out.println(nome);
        }




    }
}
