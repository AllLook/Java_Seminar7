package controller;
import data.GroupStream;
import data.Teacher;
import data.Student;
import data.User;
import service.DataService;
import service.GroupStreamServiceImpl;
import service.StudentServiceImpl;

import java.io.IOException;
import java.util.List;

public class Controller {
    private DataService studentService;
    private GroupStreamServiceImpl groupStreamService;

    public Controller(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public void createStudent(Student student) throws IOException {
        studentService.create(student);
        studentService.read(student);
    }
    public void readStudent(List<Teacher> teacher, List<Teacher> studGroup)throws IOException{
        DataService.readGroup(teacher, studGroup);

    }
    public void GroupStreamSort(GroupStream groupStream){
        GroupStreamServiceImpl.sortStream(groupStream.getGroupStudent());
    }

    }

