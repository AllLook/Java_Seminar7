package data;
import java.util.Iterator;


public class StudentGroupIterator implements Iterator<Student> {
    private StudentGroup studentGroup; // поле типа содержащая преподователя и лист студентов
    private Iterator<Student> students;// итератор для поля содержащей все данные о персоне

    public StudentGroupIterator(StudentGroup studentGroup){
        this.studentGroup = studentGroup;
        this.students = studentGroup.getStudGroup().iterator();// из класса StudentGroup применить итератор к листу studGroup




        }



    @Override
    public boolean hasNext() {
        return this.students.hasNext(); // пока есть следующий элемент из класса Teacher
    }

    @Override
    public Student next() { //  следующий элемент из класса Teacher
        return this.students.next();
    }

    @Override
    public void remove() {
        this.students.remove();
    }

}
