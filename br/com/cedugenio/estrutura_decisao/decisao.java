package br.com.cedugenio.estrutura_decisao;

import java.util.Scanner;

public class decisao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do torcedor : ");
        String nome = scan.nextLine();
        System.out.println("Digite o time : ");
        String time = scan.nextLine();
        if(time.equals("Corinthians")) {
            System.out.println("O " + nome + " é torcedor do " + time + " é Campeão mundial");
        }else {
            System.out.println("O time do torcedor " + nome + " é o " + time);

        }
    }
}
