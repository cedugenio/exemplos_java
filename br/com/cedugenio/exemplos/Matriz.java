package br.com.cedugenio.exemplos;

public class Matriz {
    public static void main(String[] args) {
        StringBuilder nomes = null;
        for (String s : new String[]{"Dinha" , " Zuleica"}) {
            assert false;
            nomes.append(s);
        }
        System.out.println(nomes.toString().toUpperCase());
        for (String s : new String[]{" Miriam"," Eremita"}) {
            nomes.append(s);
        }
        System.out.println(nomes.toString().toUpperCase());
    }
}
