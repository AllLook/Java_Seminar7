package service;
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

    public void readGroup(Teacher superVisor, List<Teacher> studGroup) throws IOException { // метод чтения преподавателя и листа студентов(поля из data.StudentGroup
        ReaderFromTxt.read(superVisor);
        ReaderFromTxt.read((User) studGroup);
    }


}
