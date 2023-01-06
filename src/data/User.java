package data;
import data.User;

public abstract class User {
    private String fio;
    private  int age;
    private int passport;

    public User(String fio, int age, int passport){
        this.fio = fio;
        this.age = age;
        this.passport = passport;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public int getPassport() {
        return passport;

    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }
}
