package terminal;

import terminal.executable.Command;
import terminal.executable.CommandExecutableFactoryImpl;

import java.util.Scanner;

public class TerminalReader {
   private CommandParser commandParser;
   private static TerminalReader terminalReader;
   private  TerminalReader(CommandParser commandParser){
       this.commandParser =commandParser;
   }
   public static TerminalReader getInstance(CommandParser commandParser){
       if (terminalReader == null){
           terminalReader = new TerminalReader(commandParser);
       }
       return terminalReader;

   }
   // private final static Scanner iScanner = new Scanner(System.in);
    public  void  scannerOn(){
        Scanner iScanner = new Scanner(System.in);
        while (true){
           String cound = iScanner.nextLine();
            Command cool = commandParser.parseCommand(cound);
            CommandExecutableFactoryImpl commandExecutableFactory = new CommandExecutableFactoryImpl();
            CommandExecutable commandExecutable = commandExecutableFactory.create(cool);
            CommandExecutable.execute();


        }
    }
}
