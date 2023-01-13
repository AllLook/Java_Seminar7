package service;

import data.Teacher;
import data.User;
import util.ReaderFromTxt;

import java.io.IOException;
import java.util.List;

public interface DataService {
    void create(User user) throws IOException;
    void read(User user) throws IOException;


    static void readGroup(List<Teacher> teacher, List<Teacher> studGroup) throws IOException { // метод чтения преподавателя и листа студентов(поля из data.StudentGroup
        ReaderFromTxt.read(teacher);
        ReaderFromTxt.read(studGroup);
    }
}
