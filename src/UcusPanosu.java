import java.util.ArrayList;

public class UcusPanosu {
    public static void main(String[] args) {
        // Havalimanı uçuş listesini dinamik olarak oluşturuyoruz
        ArrayList<String> ucuslar = new ArrayList<>();
        ucuslar.add("İstanbul - 13:55 (Kalkışa Hazır)");
        ucuslar.add("Ankara - 14:30 (Gecikmeli)");
        ucuslar.add("Roma - 16:15 (Zamanında)");
        ucuslar.add("Bakü - 18:00 (Biniş Başladı)");

        // Panodaki tüm uçuşları ekrana basalım
        System.out.println("--- GÜNCEL UÇUŞ PANOSU ---");
        for (int i = 0; i < ucuslar.size(); i++) {
            System.out.println((i + 1) + ". Sefer: " + ucuslar.get(i));
        }

        // Yolcunun aradığı şehir
        String arananSehir = "İstanbul";
        System.out.println("\nAranan Şehir: " + arananSehir);

        // Uçuşu listede arayalım (Filtreleme mantığı)
        boolean ucusVarMi = false;

        for (int i = 0; i < ucuslar.size(); i++) {
            // Eğer listedeki metin "İstanbul" kelimesini içeriyorsa
            if (ucuslar.get(i).contains(arananSehir)) {
                ucusVarMi = true;
                break; // Bulduk, daha fazla aramaya gerek yok
            }
        }

        // Sonucu ekrana yazdıralım (If-Else mantığı)
        if (ucusVarMi) {
            System.out.println("Durum: Müjde! " + arananSehir + " için bugün aktif uçuş bulunmaktadır.");
        } else {
            System.out.println("Durum: Maalesef " + arananSehir + " yönüne bugün uçuş bulunamadı.");
        }
    }
}