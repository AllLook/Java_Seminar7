package service;

import data.*;
import repository.Repository;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

public class StudentGroupServiceImpl implements DataService {

    private final Repository<StudentGroup, Integer> studentGroupIntegerRepository;

    StudentGroup studentGroup = new StudentGroup();// создаем экземпляр StudentGroup
    GroupStream groupStream = new GroupStream();// экземпляр класса GroupStream

    public StudentGroupServiceImpl(Repository<StudentGroup, Integer> studentGroupIntegerRepository) {
        this.studentGroupIntegerRepository = studentGroupIntegerRepository;
    }

    public StudentGroup saveGroup(StudentGroup studentGroup) {
        return studentGroupIntegerRepository.save(studentGroup);
    }

    public StudentGroup findGroup(int groupNumber) {
        return studentGroupIntegerRepository.findById(groupNumber);
    }

    @Override
    public void create(User user) throws IOException {

    }

    @Override
    public void read(User user) throws IOException {

    }


    public void remove(Student fio) {
        Iterator<Student> studentIterator = studentGroup.getStudGroup().iterator(); // достаем лист studGroup из StudentGroup и применяем метод iterator();
        while (studentIterator.hasNext()) {
            Student student = studentIterator.next();
            if (fio.equals(student.getFio())) { // сравниваем на дубликат
                studentIterator.remove(); // применили метод из итератора remove?

            }

        }

    }


    public void sortStudent(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudGroup(), new UserComporator()); // сортировка группы по методу UserComparator
    }


}




