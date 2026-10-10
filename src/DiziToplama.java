public class DiziToplama {
    public static void main(String[] args) {
        int[] sayilar = {5,10,15,20,25};
        int toplam = 0;
        for (int i = 0; i <sayilar.length;  i++) {
            toplam +=sayilar[i];
            System.out.println(i +"indeksteki sayilar :" +sayilar[i] );
        }
        System.out.println("Toplam sonuc: " + toplam);
    }
}
