package br.ufrn.imd;

public class Musician extends Person{
    public boolean playClassicalMusic;
    public boolean canImprovise;
    public boolean canCompose;

    public Musician() {
        super();
    }

    public Musician(String name, String hometown, boolean playClassicalMusic, boolean canImprovise, boolean canCompose) {
        super(name, hometown);
        this.playClassicalMusic = playClassicalMusic;
        this.canImprovise = canImprovise;
        this.canCompose = canCompose;
    }

    public void play() {
        System.out.println("Playing...");
    }
}
