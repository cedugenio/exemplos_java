package br.com.cedugenio.estruturadados;

public class BreakAninhado {
    public static void main(String[] args) {
        for(int x = 0; x < 5 ; x++) {
            for (int y = 0 ; y < 5 ; y++) {
                if (y == 2) {
                    break;
                }
                System.out.println("O valor de X é : " + x + "O valor de Y é : "  + y + ".");
            }
            System.out.println("Fim !");
        }

    }

}
