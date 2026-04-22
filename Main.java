import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Kosc kosc1 = new Kosc();
        System.out.println(Kosc.liczbaKosci);
        System.out.println(kosc1.wartosc);
        System.out.println(kosc1.toString());
        System.out.println(Kosc.obrazy[kosc1.IDObraz]);
        Kosc kosc2 = new Kosc(new Scanner(System.in).nextInt());
        System.out.println(Kosc.liczbaKosci);
        System.out.println(kosc2.wartosc);
        System.out.println(kosc2.toString());
        System.out.println(Kosc.obrazy[kosc2.IDObraz]);
    }
}