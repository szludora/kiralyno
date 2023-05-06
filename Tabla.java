package kiralynogyak;

import java.util.Random;

public class Tabla {

    private char[][] T;
    private char uresCella;
    private static final Random rnd = new Random();
    private int uresOszlopokSzama;
    private int uresSorokSzama;

    public Tabla(char ertek) {
        this.T = new char[8][8];
        this.uresCella = ertek;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                T[i][j] = uresCella;
            }
        }
    }

    void elhelyez(int n) {
        int hely1, hely2;
        for (int i = 0; i < n; i++) {
            hely1 = rnd.nextInt(8);
            hely2 = rnd.nextInt(8);
            if (this.T[hely1][hely2] == 'x') {
                this.T[hely1][hely2] = 'K';

            }
        }
    }

    void fajlbair() {

    }

    void megjelenit() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(T[i][j]);
            }
            System.out.println("");
        }
    }

    void tabla() {

    }

    boolean uresOszlop(int o) {
        boolean vanBenne = false;
        for (int i = 0; i < 8; i++) {
            if (T[i][o] == 'K') {
                vanBenne = true;
            }
        }
        return vanBenne;
    }

    boolean uresSor(int s) {
        boolean vanBenne2 = false;
        for (int i = 0; i < 8; i++) {
            if (T[s][i] == 'K') {
                vanBenne2 = true;
            }
        }
        return vanBenne2;
    }
    
    void uresek(){
        boolean oszlop, sor;
        for (int i = 0; i < 8; i++) {
            oszlop = uresOszlop(i);
            sor = uresSor(i);
            if(oszlop == false){
                this.uresOszlopokSzama += 1;
            }
            if(sor == false){
                this.uresSorokSzama += 1;
            }
        }
    }

    public int getUresOszlopokSzama() {
        return uresOszlopokSzama;
    }

    public int getUresSorokSzama() {
        return uresSorokSzama;
    }
    
}
