package task17;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

//    Создать метод, создающий копию файла по пути к нему

    public static void main(String[] args) throws IOException {

        Path path = Path.of("C:\\var\\test.txt");
        Path dest = Path.of("C:\\var\\test1.txt");

        copyFile(path, dest);

    }

    static void copyFile (Path path, Path dest) throws IOException {

        Files.copy(path, dest);
    }

}
