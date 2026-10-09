import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sayilar = new Scanner(System.in);
        System.out.println("lutfen 1 ile 4 arasinda bir sayi girniz:");
        int sayi = sayilar.nextInt();
            switch (sayi) {
                case 1:
                    System.out.println("ilkbahar");
                    break;
                case 2:
                    System.out.println("yaz");
                    break;
                case 3:
                    System.out.println("Sonbahar");
                    break;
                case 4:
                    System.out.println("kis");
                    break;
                default:
                    System.out.println("gecersiz mevsim numarasi ! ");
                    break;
        }
    }
}