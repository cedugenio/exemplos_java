package br.com.cedugenio.exemplos;

public class ContinueAninhado {
    public static void main(String[] args) {
        for(int x = 0; x < 5; x++) {
            for(int y =0 ; y < 5; y++) {
                if(y == 2) {
                    continue;
                }
                System.out.println("X" + x + "Y" + y);
            }
        }
        System.out.println("Fim");
    }
}
