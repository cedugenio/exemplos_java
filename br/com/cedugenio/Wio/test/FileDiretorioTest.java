package br.com.cedugenio.Wio.test;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
    public static void main(String[] args) throws IOException {
//        File diretorio = new File("folder");
//        boolean mkdir = diretorio.mkdir();
//        System.out.println("Diretorio Criado : " + mkdir + " com sucesso! ");
//        File file = new File(diretorio, "arquivinho.txt");
//        boolean newFile = file.createNewFile();
//        System.out.println( "Arquivo criado: " + newFile);
//
//        File novoArquivoFile = new File(diretorio, "arquivo_renomeado.txt");
//        boolean renamed = file.renameTo(novoArquivoFile);
//        System.out.println("Renomeado .. " + renamed);

     buscarArquivos();

    }

    public static void buscarArquivos() {
        File file = new File("folder");
        String[] list = file.list();
        assert list != null;
        for(String arquivo : list) {
            System.out.println(arquivo);
        }
    }
}
