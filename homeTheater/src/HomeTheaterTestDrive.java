import Facade.HomeTheaterFacade;
import Furniture.*;

//测试程序
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popcornPopper = new PopcornPopper();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier,
                tuner,
                dvdPlayer,
                cdPlayer,
                projector,
                lights,
                screen,
                popcornPopper);

        homeTheater.watchMovie("CLANNAD");
        homeTheater.endMovie();
    }
}
