package command;

//命令接口
public interface ICommand {
    public void execute();
    public void undo();
}
