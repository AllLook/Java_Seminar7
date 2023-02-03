package data;

public class Teacher extends User {
    private String kafedra;
    private String fio = getFio();
    private int age = getAge();
    private int pasport = getPassport();

    public Teacher(String fio, int age, int passport, String kafedra) {
        super(fio, age, passport);
        this.kafedra = kafedra;
    }

    public String getKafedra() {
        return kafedra;
    }

    @Override
    public String getFio() {
        return fio;
    }

    @Override
    public int getAge() {
        return age;
    }

    public int getPasport() {
        return pasport;
    }

    public void setKafedra(String kafedra) {
        this.kafedra = kafedra;
    }

    @Override
    public void setFio(String fio) {
        this.fio = fio;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public void setPasport(int pasport) {
        this.pasport = pasport;
    }
}
