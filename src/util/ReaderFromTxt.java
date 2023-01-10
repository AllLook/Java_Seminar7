package util;
import data.User;

import java.io.BufferedReader;
import  java.io.FileReader;
import java.io.IOException;

public class ReaderFromTxt {
    private static String path = "..."; // путь к файлу

    public static void read(User user) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));// создание обьекта для чтения файла
        String str;
        while ((str = br.readLine()) != null) {// пока строка не пуста
            System.out.printf("%s", str);// выводим строку считаную из файла
        }

    }
}