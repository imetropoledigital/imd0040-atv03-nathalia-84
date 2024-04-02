package br.ufrn.imd;

public class GuitarPlayer extends Musician {
    public int howManyYears;
    public boolean playEletronicGuitar;
    public boolean playAcousticGuitar;

    public GuitarPlayer(){
        super();
    }
    public GuitarPlayer(String name, String hometown, boolean playClassicalMusic, boolean canImprove, boolean canCompose, int howManyYears, boolean playEletronicGuitar, boolean playAcousticGuitar) {
        super(name, hometown, playClassicalMusic, canImprove, canCompose);
        this.howManyYears = howManyYears;
        this.playEletronicGuitar = playEletronicGuitar;
        this.playAcousticGuitar = playAcousticGuitar;
    }
    public void playGuitar(){
        System.out.println("Playing guitar...");
    }
}
