package br.com.cedugenio.exemplos.classe;

public class EnderecoTeste {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Dolores Garcia Merino",154,"Jardim Paineiras");
        Endereco endereco1 = new Endereco("Rua Dolores Garcia Merino",154,"Jardim Paineiras");

        System.out.println(endereco.equals(endereco1));
        System.out.println(endereco.equals(endereco1));

    }
}
