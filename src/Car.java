public class Car {
    String marka;
    String model;
    String renk;
    int yil;
    double fiyat;


    public Car() {
    }

    // 2. Ana Constructor
    public Car(String marka, String model, String renk, int yil, double fiyat) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;
    }


    public Car(String name, double fiyat) {
        this("AlfaRomeo", name, "Kirmizi", 2019, fiyat);
    }


    public void printInfo() {
        System.out.println("Fiyat : " + fiyat);
        System.out.println("Renk : " + renk);
        System.out.println("Model : " + model);
        System.out.println("Uretim yili : " + yil);
        System.out.println("Marka : " + marka); // model yerine marka yazmak daha doğru olur :)
        System.out.println("-------------------------");
    }
}