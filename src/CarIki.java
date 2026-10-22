
import java.util.ArrayList;
import java.util.Scanner;

    // 1. Car Sınıfı (OOP, Kapsülleme ve Constructor yapısı)
    class CarIki {
        private String marka;
        private String model;
        private double fiyat;

        // Constructor (Kurucu Metot)
        public CarIki(String marka, String model, double fiyat) {
            this.marka = marka;
            this.model = model;
            setFiyat(fiyat); // Güvenlik kontrolünden geçirmek için setter çağırıyoruz
        }

        // Getter ve Setter Metotları (Encapsulation)
        public String getMarka() {
            return marka;
        }

        public void setMarka(String marka) {
            this.marka = marka;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public double getFiyat() {
            return fiyat;
        }

        public void setFiyat(double fiyat) {
            if (fiyat >= 0) {
                this.fiyat = fiyat;
            } else {
                System.out.println("Uyarı: Fiyat eksi olamaz! 0 olarak ayarlandı.");
                this.fiyat = 0;
            }
        }

        // Bilgileri ekrana yazdıran metot
        public void printInfo() {
            System.out.println("Marka: " + marka + " | Model: " + model + " | Fiyat: " + fiyat + " TL");
        }
    }

    // 2. Main Sınıfı (Scanner ve ArrayList entegrasyonu)
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // ArrayList: Birden fazla araba nesnesini dinamik olarak saklamak için
            ArrayList<Car> arabaListesi = new ArrayList<>();

            System.out.println("--- Araba Kayıt ve Yönetim Sistemine Hoş Geldiniz ---");

            while (true) {
                System.out.print("\nEklemek istediğiniz arabanın markası (Çıkış için 'q' tuşlayın): ");
                String marka = scanner.nextLine();

                if (marka.equalsIgnoreCase("q")) {
                    break;
                }

                System.out.print("Modelini girin: ");
                String model = scanner.nextLine();

                System.out.print("Fiyatını girin: ");
                double fiyat = scanner.nextDouble();
                scanner.nextLine(); // Dummy read (Enter karakterini yakalamak için)

                // Kullanıcıdan alınan verilerle Car nesnesi üretme
                Car yeniAraba = new Cariki(marka, model, fiyat);

                // ArrayList içine ekleme (.add)
                arabaListesi.add(yeniAraba);
                System.out.println("-> Araba başarıyla listeye eklendi!");
            }

            // Listelenen tüm arabaları döngü ile ekrana bastırma
            System.out.println("\n==========================================");
            System.out.println("Sisteme Kaydedilen Tüm Arabalar:");
            System.out.println("==========================================");

            for (Car araba : arabaListesi) {
                araba.printInfo();
            }

            System.out.println("\nProgram sonlandırıldı. İyi çalışmalar!");
            scanner.close();
        }
    }
}
