import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz :");
        int yas = scanner.nextInt();
        if (yas >= 18 ) {
            System.out.println("ehliyet ala bilirisniz");
        } else {
            System.out.println("ehliyet alamsiniz");
        }

    }
}