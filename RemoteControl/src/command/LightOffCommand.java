package command;

import equipment.Light;

//实现了命令接口的具体命令类
public class LightOffCommand implements ICommand {
    Light light;
    //创建该命令时需绑定一个具体的执行行为，即接收者
    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
