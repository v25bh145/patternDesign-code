package command;

//宏命令，按下一个见就会有一堆命令的组合
public class MacroCommand implements ICommand {
    ICommand[] commands;

    public MacroCommand(ICommand[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (ICommand iCommand : commands) {
            iCommand.execute();
        }
    }

    @Override
    public void undo() {
        for (ICommand iCommand : commands) {
            iCommand.undo();
        }
    }
}
