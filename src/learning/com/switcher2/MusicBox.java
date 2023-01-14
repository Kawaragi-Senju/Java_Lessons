package learning.com.switcher2;

public class MusicBox implements TechMusicBox{
    @Override
    public void turnMusicOn() {
        System.out.println("Music is Playing");
    }

    @Override
    public void turnMusicOff() {
        System.out.println("Music is not playing");
    }
}
