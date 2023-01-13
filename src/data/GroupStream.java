package data;

import java.util.Iterator;
import java.util.List;

public  class GroupStream implements Iterable<Teacher> {

    private StudentGroup studentGroup = new StudentGroup();// экземпляр класса
    private List<Teacher> groupStudent = studentGroup.getStudGroup(); // список из StudentGroup
    private List<Teacher> groupStudent1 = studentGroup.getStudGroup1(); // список из StudentGroup

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public List<Teacher> getGroupStudent1() {
        return groupStudent1;
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Teacher> getGroupStudent() {
        return groupStudent;
    }

    public void setGroupStudent1(List<Teacher> groupStudent) {
        this.groupStudent1 = groupStudent;
    }

    @Override
    public Iterator<Teacher> iterator() {
        return groupStudent.iterator();
    }// итератор для листа группы\
}
