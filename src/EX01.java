import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        int sayi;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Bir sayı girin :");
        sayi = girdi.nextInt();
        switch (sayi) {
            case 1:
                System.out.println("sayinin 1 katı: " +sayi);
                break;
            case 2:
                System.out.println("sayinin 2 katı: " +sayi*2);
                break;
            case 3:
                System.out.println("sayinin 3 katı: " +sayi*3);
                break;
            default:
                System.out.println("sayinin 10 katı: " +sayi*10);
        }


    }
}
