package obiectConstructor.Hotel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static java.awt.SystemColor.text;

public class Hotel {

    public String nume;
    public String locatie;
    public String tara;
    public String oras;
    public String stele;
    public int numarCamere;
    public boolean micDejun;
    public int numarEtaje;
    public List<String> facilitati;
    public int pretPornire;


    public Hotel() {
        nume = "Hilton";
        locatie = "Paris";
        tara = "Franta";
        oras = "Paris";
        stele = "*****";
        numarCamere = 80;
        micDejun = true;
        numarEtaje = 12;
        facilitati = Arrays.asList("WiFi", "Clima", "TV", "Loc parcare");
        pretPornire = 1000;
    }

    public void prezentareHotel() {

        System.out.println("Numele hotelului este: " + nume);
        System.out.println("Locatia hotelului este: " + locatie);
        System.out.println("Tara unde se afla hotelului este: " + tara);
        System.out.println("Orasul hotelului este: " + oras);
        System.out.println("Hotelul are un numar de stele de: " + stele);
        System.out.println("Numar camere: " + numarCamere);
        System.out.println("Mic dejun inclus: " + micDejun);

    }

    public void pretOferta(HashMap<String, String> oferta) {
        for (String optiune : oferta.keySet()) {
            if (optiune.equals("Durata oferta")) {
                //Clientul are dorinta de a avea oferta cu valabilitate mai mare
                //Se calculeaza pretul pe baza la diferite intervale
                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt((parts[0]));
                if (number < 5) {
                    pretPornire = pretPornire + 200;
                }
                if (number > 5 && number < 10) {
                    pretPornire = pretPornire + 800;
                } else {
                    pretPornire = pretPornire + 850;
                }
            }
            if (optiune.equals("Perioada sedere")) {
                //Clientul are dorinta de a avea oferta cu valabilitate mai mare
                //Se calculeaza pretul pe baza la diferite intervale
                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt((parts[0]));
                if (number < 5) {
                    pretPornire = pretPornire + 200;
                }
                if (number > 5 && number < 10) {
                    pretPornire = pretPornire + 1800;
                } else {
                    pretPornire = pretPornire + 1850;
                }

            } if (optiune.equals("Numar persoane")) {
                //Clientul are dorinta de a avea oferta cu valabilitate mai mare
                //Se calculeaza pretul pe baza la diferite intervale
                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt((parts[0]));
                if (number < 3) {
                    pretPornire = pretPornire + 200;
                }
                if (number > 5 && number < 10) {
                    pretPornire = pretPornire + 1800;
                } else {
                    pretPornire = pretPornire + 1850;
                }

            }
        }
    }
}

