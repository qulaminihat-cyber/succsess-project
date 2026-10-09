public class WhileToplama {
    public static void main(String[] args) {
        int sayac = 1;
        int toplam = 0;
        while ( sayac <= 10 ){
        toplam = toplam + sayac;
        sayac++;
        }
        System.out.println("Sayi:" + toplam );
    }
}
