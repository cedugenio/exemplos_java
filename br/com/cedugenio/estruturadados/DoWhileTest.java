package br.com.cedugenio.estruturadados;

public class DoWhileTest {
    public static void main(String[] args) {
        int counter = 0;
        do {
            System.out.printf("%d ", counter);
            ++counter;
        }while (counter <= 10);
        System.out.println();
    }
}
