package command;

import equipment.GarageDoor;

//实现了命令接口的具体命令类
public class GarageDoorOpenCommand implements ICommand {
    GarageDoor garageDoor;
    //创建该命令时需绑定一个具体的执行行为，即接收者
    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }

    @Override
    public void undo() {
        garageDoor.close();
    }
}
