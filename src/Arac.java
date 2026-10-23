import java.util.ArrayList;
import java.util.Scanner;

class Arac {
    private String marka;
    private String model;
    private double fiyat;

    public Arac(String marka, String model, double fiyat) {
        this.marka = marka;
        this.model = model;
        setFiyat(fiyat);
    }

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

    public void printInfo() {
        System.out.println("Marka: " + marka + " | Model: " + model + " | Fiyat: " + fiyat + " TL");
    }
}

