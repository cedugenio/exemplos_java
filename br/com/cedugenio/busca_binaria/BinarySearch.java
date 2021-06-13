package br.com.cedugenio.busca_binaria;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bin = new BinarySearch();
        int[] numbers = {1, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 24, 33, 50, 60};

        bin.searchingNumber(20, numbers);
        //bin.searchingNumber(3, numbers);
    }
        public void searchingNumber(int x, int[] numbers) {
            int inicio = 0;
            int meio;
            int fim  = numbers.length -1;

            while(inicio <= fim ) {
                meio = (fim -inicio) / 2;

                System.out.println("Inicio " + numbers[inicio] + " - Meio " + numbers[meio] + " - Fim " + numbers[fim]);
                System.out.println("Inicio " + inicio + " - Meio " + meio + " - Fim " + fim);

                if(numbers[meio] == x ) {
                    System.out.println("Encontrou o número " + x);
                    break;
                }

                if (numbers[meio] < x ) {
                    inicio = meio + 1;

                } else {
                    fim = meio -1;
                }
            }
            if (inicio > fim ) {
                System.out.println("Numero nao encontrado " + x );
            }
        }
 }

