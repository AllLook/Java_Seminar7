package util;

import data.User;

import java.io.FileWriter;
import java.io.IOException;

public class WriterToTxt {
    private String path = "...";// путь к файлу txt

    public static void write(String path) throws IOException {
        FileWriter fw = new FileWriter(path, false);
        fw.write("...");// запись в файл
        fw.append("...");// добавление в файл

    }

}
