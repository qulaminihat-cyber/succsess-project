public class DiziBaslangic {
    public static void main(String[] args) {
        int[] sayilar = {10, 20, 30, 40, 50};

        // 0. indeks ilk elemandır (yani 10)
        System.out.println("İlk eleman: " + sayilar[0]);

        System.out.println("--- Tüm Elemanlar ---");

        // Öğrendiğimiz for döngüsüyle dizinin üzerinde geziyoruz
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(i + ". indeksteki eleman: " + sayilar[i]);
        }
    }
}
