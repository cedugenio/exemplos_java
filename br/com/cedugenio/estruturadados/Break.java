package br.com.cedugenio.estruturadados;

public class Break {
    public static void main(String[] args) {
        for (int x = 0 ; x < 10; x++) {
            if(x == 2) {
                System.out.println("Cheguei no 2 brother ! " + x);
                break;
            }
        }
    }
}
