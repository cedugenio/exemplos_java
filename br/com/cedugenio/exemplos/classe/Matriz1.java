package br.com.cedugenio.exemplos.classe;

public class Matriz1 {
    public static void main(String[] args) {
        int[][] numbers = {{123,456,789},{98,765,543}};
        int total_numbers = 0;
        for (int[] number : numbers) {
            for (int i : number) {
                total_numbers = +i;
            }
            System.out.println(total_numbers);
        }
    }
}
