import java.util.ArrayList;
public class SinemaProjesi {
    public static void main(String[] args) {
        ArrayList<String> filmler = new ArrayList<>();
        filmler.add("Inception - Bilim Kurgu");
        filmler.add("Interstellar - Bilim Kurgu");
        filmler.add("The Social Network - Biyografik Dram");
        filmler.add("Who Am I - Tekno-Gerilim");
        filmler.add("The Prestige - Bilim Kurgu");
        filmler.add("Deadpool - Aksiyon");
        for (int i = 0; i < filmler.size(); i++) {
            System.out.println((i + 1) + ". Guzel bir secim " + filmler.get(i));

        }
        filmler.remove("Deadpool");
        System.out.println("Bu film vizyondan kaldirlidi " + filmler.getLast());

        String ArananTur = "Bilim Kurgu";
        System.out.println("Aranan Film Turu: " + ArananTur);

        boolean bilimKurguVarmi = false;

        for (int i = 0; i < filmler.size(); i++) {
            if (filmler.get(i).contains(ArananTur)) {
                bilimKurguVarmi = true;
                break;

            }
        }
        if (bilimKurguVarmi) {
            System.out.println("Belirlediginiz kriterlere gore en uygun tur budur " + ArananTur + " Keyifli seyirler dileriz !");
        } else {
            System.out.println("Malasef belirlediginiz" + ArananTur + "kriterlere  bulunamadi");
            }


        }


    }

