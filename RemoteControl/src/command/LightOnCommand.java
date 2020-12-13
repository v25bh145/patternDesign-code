package command;

import equipment.Light;

//实现了命令接口的具体命令类
public class LightOnCommand implements ICommand {
    Light light;
    //创建该命令时需绑定一个具体的执行行为，即接收者
    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
