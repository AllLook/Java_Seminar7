package repository;

import data.Student;
import db.StudentTable;

public class StudentRepository implements UserRepository<Student, Integer> {
    private StudentTable studentTable;

    @Override
    public Student save(Student entiry) {
        return studentTable.save(entiry);
    }
    @Override
    public  void delete(Student entry){
        studentTable.deleteByFio(entry.getFio());
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByFio(String fio) {
        return null;
    }
}
