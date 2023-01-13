package data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class StudentGroup implements Iterable<Teacher> {
    List<Teacher> teacher;
    List<Teacher> studGroup = new ArrayList<>(10);
    List<Teacher> studGroup1 = new ArrayList<>(10);
    List<Teacher> studGroup2 = new ArrayList<>(10);


    public StudentGroup(List<Teacher> teacher,List<Teacher> studGroup ){
        this.teacher = teacher;
        this.studGroup = studGroup;

    }

    public StudentGroup() {

    }

    public List<Teacher> getStudGroup1() {
        return studGroup1;
    }

    public List<Teacher> getStudGroup2() {
        return studGroup2;
    }

    public Teacher getTeacher() {
        return (Teacher) teacher;
    }

    public List<Teacher> getStudGroup() {
        return studGroup;
    }

    public void setTeacher(List <Teacher>teacher) {
        this.teacher = teacher;
    }

    public void setStudGroup(List<Teacher> studGroup) {
        this.studGroup = studGroup;
    }

    @Override
    public Iterator<Teacher> iterator() { // для класса Teacher через интерфейс Iterator вызывается метод iterator
        return new StudentGroupIterator(this);// экземпляр итератора возвращается
    }

    @Override
    public void forEach(Consumer<? super Teacher> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Teacher> spliterator() {
        return Iterable.super.spliterator();
    }
}



   /* private String fio = getFio();
    private int age = getAge();
    private int passport = getPassport();

    private List<String> studentList = new ArrayList<>(); // поле список студентов
    public StudentGroup(String fio, int age, int passport, String kafedra, List<String>student_list) {// содержит поля из Teacher через наследование
        super(fio, age, passport, kafedra);
        this.studentList = student_list;
    }

    @Override
    public String getFio() {
        return fio;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getPassport() {
        return passport;
    }

    @Override
    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setPassport(int passport) {
        this.passport = passport;
    }
}*/
