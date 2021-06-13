package br.com.cedugenio.exemplos.classe;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer,String> aprovados = new HashMap<>();
        aprovados.put(1,"Ana");
        aprovados.put(2,"Luciana");

        System.out.println(aprovados.keySet());
        System.out.println(aprovados.values());
        System.out.println(aprovados.entrySet());

        System.out.println("Chaves ...");
        for(Integer id : aprovados.keySet()) {
            System.out.println(id);
        }
        for(String valores : aprovados.values()) {
            System.out.println(valores);
        }
        System.out.println("Chaves/Valores ...");
        for(Map.Entry<Integer,String> registro : aprovados.entrySet()) {
            System.out.println(registro.getKey() + " " + registro.getValue());
        }
    }
}
