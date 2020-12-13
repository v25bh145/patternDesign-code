package remoteControl;

import command.ICommand;
import command.NoCommand;

//调用者
public class SimpleRemoteControl {

    //与命令对象的接口
    ICommand[] onCommands;
    ICommand[] offCommands;
    //可以使用堆栈来实现反复撤销命令，甚至还可以实现redo
    ICommand undoCommand;

    public SimpleRemoteControl() {
        onCommands = new ICommand[7];
        offCommands = new ICommand[7];

        //预先设置空命令
        ICommand noCommand = new NoCommand();
        for(int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    //客户端调用setCommand，传入想要执行的命令
    public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    //调用者将命令传输给接收者，让接收者执行绑定在命令对象上的方法
    public void onButtonWasPressed(int slot) {
        onCommands[slot].execute();
        //记录历史记录
        undoCommand = onCommands[slot];
    }
    public void offButtonWasPressed(int slot) {
        offCommands[slot].execute();
        //记录历史记录
        undoCommand = offCommands[slot];
    }
    public void undoButtonWasPressed() {
        undoCommand.undo();
    }
}
