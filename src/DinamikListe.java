import java.util.ArrayList; // ArrayList kullanabilmek için bunu ekliyoruz

public class DinamikListe {
    public static void main(String[] args) {
        // String türünde esnek bir ArrayList oluşturuyoruz
        ArrayList<String> sehirler = new ArrayList<>();

        // Listeye eleman ekliyoruz (.add komutu ile)
        sehirler.add("Bakü");
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("Barcelona");
        sehirler.add("Munich");

        // Listede kaç eleman olduğunu yazdıralım (.size() komutu)
        System.out.println("İlk liste boyutu: " + sehirler.size());

        // Listeye sonradan yeni bir şehir daha ekleyelim
        sehirler.add("Roma");
        sehirler.remove("Ankara");

        System.out.println("Yeni liste boyutu: " + sehirler.size());

        // For döngüsüyle tüm şehirleri ekrana bastıralım
        for (int i = 0; i < sehirler.size(); i++) {
            // ArrayList'ten eleman okumak için .get(i) kullanırız
            System.out.println((i + 1) + ". Şehir: " + sehirler.get(i));
        }
    }
}