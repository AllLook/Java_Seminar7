package data;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup extends Teacher{
    private String fio = getFio();
    private int age = getAge();
    private int passport = getPassport();

    private List<String> student_list = new ArrayList<>(); // поле список студентов
    public StudentGroup(String fio, int age, int passport, String kafedra, List<String>student_list) {// содержит поля из Teacher через наследование
        super(fio, age, passport, kafedra);
        this.student_list = student_list;
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
}
