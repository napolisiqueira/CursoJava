package napoli.sqr.modulo2;

public class SmartTv {
    boolean onOrOff = false;
    int canal = 24;
    int loudness = 25;

    public void tvOn() {
        if (onOrOff) {
            System.out.println("TV já está ligada.");
        } else {
            onOrOff = true;
        }
    }

    public void tvOff() {
        if (!onOrOff) {
            System.out.println("TV já está desligada.");
        } else {
            onOrOff = false;
        }
    }

    public void changeLoudnessPos() {
        if (loudness == 100) {
            System.out.println("A TV já está no volume maximo: " + loudness);
        } else {
            loudness++;
        }
    }

    public void changeLoudnessNeg() {
        if (loudness == 0) {
            System.out.println("A TV já está no volume minimo: " + loudness);
        } else {
            loudness--;
        }
    }

    public void muteLoudness() {
        if (loudness == 0) {
            System.out.println("A TV já está mutada: " + loudness);
        } else {
            loudness = 0;
        }
    }

    public void changeCanalPos() {
        if (canal == 25) {
            canal = 1;
        } else {
            canal++;
        }
    }

    public void changeCanalNeg() {
        if (canal == 1) {
            canal = 25;
        } else {
            canal--;
        }
    }
}