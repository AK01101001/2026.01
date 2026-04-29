package dev.end.kosci;

import java.util.Random;

public class Kosc {
    public static int liczbaKosci;
    public static String[] obrazy = {"kosc0","kosc1","kosc2","kosc3","kosc4","kosc5","kosc6"};
    public int wartosc;
    public int IDObraz;
    public boolean dostepna;

    public Kosc() {
        Random random = new Random();
        int wartosc = new Random().nextInt(6)+1;
        this.wartosc = wartosc;
        IDObraz = wartosc;
        dostepna=true;
        liczbaKosci++;
    }

    public Kosc(int wartosc) {
        if(wartosc>6&&wartosc<1)
        {
            wartosc =0;
        }
        this.wartosc = wartosc;
        IDObraz = wartosc;
        dostepna=true;
        liczbaKosci++;
    }
    void rzutKością()
    {
        if (dostepna)
        {
            Random random = new Random();
            wartosc = new Random().nextInt(6)+1;

        }
    }
    boolean zmienDostepnosc()
    {
        dostepna=!dostepna; return dostepna;
    }

    @Override
    public String toString() {
        return switch (wartosc) {
            case 0 -> "zero";
            case 1 -> "jeden";
            case 2 -> "dwa";
            case 3 -> "trzy";
            case 4 -> "czter";
            case 5 -> "pieć";
            case 6 -> "szeszcz";
            default -> "";
        };
    }
}
