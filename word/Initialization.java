package word;

public class Initialization {
    public static CommandInterface buildCommandInterface(StringBuilder text ){
        CommandInterface commandInterface = new CommandLogic(text);
        commandInterface.init();
        return commandInterface;
    }
}

