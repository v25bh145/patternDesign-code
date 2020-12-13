package command;

public class NoCommand implements ICommand {
    @Override
    public void execute() {
        System.out.println("NO COMMAND");
    }

    @Override
    public void undo() {
        System.out.println("DNAMMOC ON");
    }
}
