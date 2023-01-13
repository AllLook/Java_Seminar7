package terminal.executable;

import data.Student;
import service.StudentServiceImpl;
import terminal.CommandExecutable;
import terminal.CreateStudentExecutable;
import terminal.DeleteStudentExecutable;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{
    StudentServiceImpl studentService;
   public CommandExecutable create (Command input){
       if (input[0].equals("/add")){
           return  new CreateStudentExecutable( studentService, new Student(input[1]));
       }
       else{
           return  new DeleteStudentExecutable( studentService, new Student(input[1]));
        }


   }

}
