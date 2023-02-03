package data;

public abstract class User {
    private String fio;
    private int age;
    private int passport;

    private int year0fBirth;

    public User(String fio, int age, int passport) {
        this.fio = fio;
        this.age = age;
        this.passport = passport;
        this.year0fBirth = year0fBirth;
    }

    public void setYear0fBirth(int year0fBirth) {
        this.year0fBirth = year0fBirth;
    }

    public int getYear0fBirth() {
        return year0fBirth;
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
