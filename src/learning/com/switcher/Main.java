package learning.com.switcher;

public class Main {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Tv tv = new Tv();
        MusicBox musicBox = new MusicBox();
        switcher.setTech(tv);
        switcher.turnOnTechnic();
    }
}
