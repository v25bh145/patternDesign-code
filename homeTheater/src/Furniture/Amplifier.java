package Furniture;

public class Amplifier {
    DvdPlayer dvdPlayer;
    public void on() {
        System.out.println("amplifier on");
    }
    public void setDvd(DvdPlayer dvd) {
        dvdPlayer = dvd;
    }
    public void setSurroundSound() {
        System.out.println("amplifier setSurroundSound");
    }
    public void setVolume(int num) {
        System.out.println("amplifier volume " + num);
    }
    public void off() {
        System.out.println("amplifier off");
    }
}
