package controller;
import data.Teacher;
import data.Student;
import data.User;
import service.DataService;
import service.StudentServiceImpl;

import java.io.IOException;
import java.util.List;

public class Controller {
    private DataService studentService;

    public Controller(StudentServiceImpl studentService){
        this.studentService = studentService;
    }
    public void  createStudent(Student student) throws IOException {
        studentService.create(student);
        studentService.read(student);
    }
    public void  groupRead(Teacher superVisor, List<Teacher> studGroup ) throws IOException {
        studentService.read(superVisor);
        studentService.read((User) studGroup);
        //studentService.StudentServiceImpl.readGroup(Teacher superVisor, List<Teacher> studGroup); эта функция не вызывается, хотя есть импорт
    }
}
