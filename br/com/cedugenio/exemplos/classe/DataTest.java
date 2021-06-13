package br.com.cedugenio.exemplos.classe;

public class DataTest {
    public static void main(String[] args) {
        Data nascimento = new Data();
        nascimento.dia = 17;
        nascimento.mes = 6;
        nascimento.ano = 1979;

        System.out.println(nascimento.formatar());


    }
}
