package data;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import  java.io.FileReader;
import java.io.IOException;

public class StudentGroupServicelmpl {
    private String path = "..."; // путь к файлу

    public void writeFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));// создание обьекта для чтения файла
        String str;
        while ((str = br.readLine()) != null) {// пока строка не пуста
            System.out.printf("%s", str);// выводим строку считаную из файла
        }

    }
}
