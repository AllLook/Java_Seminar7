package terminal;

import terminal.executable.Command;

public interface CommandParser {
    // default String[] parseCommand(String inputCommand){

    Command parseCommand(String inputCommand);
}
