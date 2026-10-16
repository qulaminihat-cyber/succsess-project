/**
 * CineHub Referans Dosyasi: Metotlar, Void ve Return Mantigi
 * Bu sinif, metotlarin nasil yazildigini, disaridan nasil veri aldigini
 * ve sonuclari nasil dondurdugunu gormek icin mukemmel bir ozettir.
 */
public class MetotOrnegi{

    // ==========================================
    // 1. VOID METOT (Isi yapar, ekrana yazar, biter - Eli bos doner)
    // ==========================================
    public static void hosgeldinMesajiYazdir(String kullaniciAdi) {
        System.out.println("==========================================");
        System.out.println("🎬 CineHub Sistemine Hos Geldin, " + kullaniciAdi + "!");
        System.out.println("==========================================");
    }

    // ==========================================
    // 2. RETURN EDEN METOT (Veriyi isler ve paketleyip geri getirir)
    // ==========================================
    // Barmen mantigi: Disaridan bilet adedini ve fiyatini alir,
    // toplam tutari hesaplayip "return" ile disariya teslim eder.
    public static double biletFiyatiHesapla(int biletAdedi, double birimFiyat) {
        double toplamTutar = biletAdedi * birimFiyat;
        return toplamTutar; // Hesaplanan degeri ana programa geri veriyoruz!
    }

    // ==========================================
    // ANA PROGRAM (Main)
    // ==========================================
    public static void main(String[] args) {

        // Adim 1: Void metodu cagiriyoruz (Sadece ekrana yazi yaziyor)
        hosgeldinMesajiYazdir("Ali");

        // Adim 2: Return eden metodu cagiriyoruz ve gelen sonucu bir kutuda (degiskende) sakliyoruz
        int secilenBiletAdedi = 3;
        double biletBirimFiyati = 120.50;

        // biletFiyatiHesapla metodundan gelen sonucu 'odenecekTutar' kutusuna kaydediyoruz
        double odenecekTutar = biletFiyatiHesapla(secilenBiletAdedi, biletBirimFiyati);

        // Adim 3: Return sayesinde elimizde olan bu veriyi istedigimiz gibi kullaniyoruz
        System.out.println("Siparis Ozeti:");
        System.out.println("- Alinan Bilet Sayisi: " + secilenBiletAdedi);
        System.out.println("- Odemeniz Gereken Toplam Tutar: " + odenecekTutar + " TL");

        // Istersek bu degeri baska bir matematiksel islemde de kullanabilirdik:
        // double indirimliTutar = odenecekTutar * 0.90; // %10 indirim ornegi
    }
}