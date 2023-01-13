package service;
import data.Student;
import data.Teacher;
import data.User;
import util.ReaderFromTxt;
import util.WriterToTxt;

import java.io.IOException;
import java.util.List;

public class StudentServiceImpl implements DataService{

    @Override
    public void create(User user) throws IOException {
        WriterToTxt.write(String.valueOf(user));
    }

    @Override
    public void read(User user) throws IOException {
        ReaderFromTxt.read(user);
    }


    public void saveStudent(Student student) {
    }

    public void deleteStudent(Student student) {
    }
}



