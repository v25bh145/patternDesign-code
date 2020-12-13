import command.*;
import equipment.GarageDoor;
import equipment.Light;
import remoteControl.SimpleRemoteControl;

//测试程序
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        Light bedroomLight = new Light();
        LightOnCommand bedroomLightOnCommand = new LightOnCommand(bedroomLight);
        LightOffCommand bedroomLightOffCommand = new LightOffCommand(bedroomLight);
        simpleRemoteControl.setCommand(1, bedroomLightOnCommand, bedroomLightOffCommand);

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);
        simpleRemoteControl.setCommand(2, garageDoorOpenCommand, garageDoorCloseCommand);

        Light LivingRoomLight = new Light();
        LightOnCommand livingRoomLightOnCommand = new LightOnCommand(LivingRoomLight);
        LightOffCommand livingRoomLightOffCommand = new LightOffCommand(LivingRoomLight);
        simpleRemoteControl.setCommand(3, livingRoomLightOnCommand, livingRoomLightOffCommand);

        ICommand[] onCommands = {bedroomLightOnCommand, garageDoorOpenCommand, livingRoomLightOnCommand};
        ICommand[] offCommands = {bedroomLightOffCommand, garageDoorCloseCommand, livingRoomLightOffCommand};
        MacroCommand macroOnCommand = new MacroCommand(onCommands);
        MacroCommand macroOffCommand = new MacroCommand(offCommands);
        simpleRemoteControl.setCommand(4, macroOnCommand, macroOffCommand);

        simpleRemoteControl.onButtonWasPressed(1);
        simpleRemoteControl.onButtonWasPressed(2);
        simpleRemoteControl.onButtonWasPressed(3);
        simpleRemoteControl.undoButtonWasPressed();
        simpleRemoteControl.offButtonWasPressed(1);
        simpleRemoteControl.offButtonWasPressed(2);
        simpleRemoteControl.offButtonWasPressed(3);
        System.out.println("test macroCommand");
        simpleRemoteControl.onButtonWasPressed(4);
        simpleRemoteControl.offButtonWasPressed(4);

    }
}
