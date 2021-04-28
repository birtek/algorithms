package othrerAlghoritms.polymorphism;

public class Music {
    public static void tune(Instrument i) {
        i.play("music");
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Brass frenchHorn = new Brass();
        Stringed violin = new Stringed();
        tune(flute);
        tune(frenchHorn);
        tune(violin);
    }

}
