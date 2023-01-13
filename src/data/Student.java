package data;

public class Student extends User implements Comparable<Student>{
    private int groupNumber;
    public Student(String fio, int age, int passport, int groupNumber, int year0fBirth) {
        super(fio, age, passport);
        this.groupNumber = groupNumber;
    }

    @Override
    public int compareTo(Student student) {
        if(student.getYear0fBirth() < this.getYear0fBirth()) return 1;// если полученный меньше переданного
        if(student.getYear0fBirth() > this.getYear0fBirth()) return -1;// если полученный больше переданного
        return 0; // зачем еще ретерн?

    }
}
