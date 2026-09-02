import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sayial = new Scanner(System.in);

        System.out.println("Lutfen sayi giriniz : ");
        int sayi = sayial.nextInt();
        for (int i = 1 ; i <=10; i++){
            System.out.println(sayi + "x" + "i" + "=" + (sayi * i));
        }
    }
}