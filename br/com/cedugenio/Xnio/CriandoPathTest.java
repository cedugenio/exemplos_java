package br.com.cedugenio.Xnio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CriandoPathTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:","Users","cedugenio","IdeaProjects","exemplos_java","folder","arquivo_renomeado.txt");
        System.out.println(p1.toAbsolutePath());

        File file = p1.toFile();
        Path path = file.toPath();

        Path path1 = Paths.get("pasta");
        Path path2 = Paths.get("pasta\\subpasta\\subsubpasta\\file.txt");
        Path arquivo = Paths.get("pasta\\subpasta\\subsubpasta\\meufile.txt");
        try {
            if(Files.notExists(path2.getParent()))
                Files.createDirectories(path2.getParent());
            Files.createFile(arquivo);
        } catch (IOException e ) {
            e.printStackTrace();
        }
        Path source = Paths.get("subsubpasta\\meufile.txt");
        Path target = Paths.get("subsubpasta\\meufileCopiado.txt");
        try {
            Files.copy(source,target);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
