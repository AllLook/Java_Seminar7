package terminal.executable;

import terminal.CommandExecutable;

public class LogingCommandExecutableFactor extends CommandExecutableFactoryImpl {
    public LogingCommandExecutableFactor(){
        super();
    }
    @Override
    public CommandExecutable create (Command input){
        System.out.println(input);
        //CommandExecutable result = super.create(input);
        System.out.print("Geek");
        return super.create(input);// или result
    }
}
