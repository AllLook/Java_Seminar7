package terminal.executable;

import java.util.List;

public class Command {

    private static final String ADD = "/add";// константа
    private static final String DEL = "/delete";
    private  List<String> arguments;
    private String mainFirstCommand;

    public Command(){

    }



    public  boolean isCreateCommand(){
        return  mainFirstCommand.equals(ADD);

    }


    public  boolean isDeleteCommand(){
        return  mainFirstCommand.equals(DEL);
    }
}
