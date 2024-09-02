package Multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi {
    //multimi: array, list, set, map

    @Test
    public void metodaTest() {
        //cursantiAray();
        //cursantiList();
        //listaMasini();
        //mapExample();
        //tariOrase();
        carteRetete();
    }

    //afisam cursantii de la cursul de automation
    public void cursantiAray() {
        String[] cursanti = new String[10];
        cursanti[0] = "Rares";
        cursanti[1] = "Bogdan";
        cursanti[2] = "Cristina";
        cursanti[3] = "Andrei";
        cursanti[4] = "Radu";
        cursanti[5] = "Cosmin";
        for (int index = 0; index < cursanti.length; index++) {
            System.out.println("numele cursantului este " + cursanti[index]);
        }
    }

    //V2-list
    public void cursantiList() {
        List<String> cursanti = new ArrayList<>();
        cursanti.add("Rares");
        cursanti.add("Bogdan");
        cursanti.add("Cristina");
        cursanti.add("Andrei");
        cursanti.add("Radu");
        cursanti.add("Cosmin");
        for (int index = 0; index < cursanti.size(); index++) {
            System.out.println("numele cursantului este " + cursanti.get(index));
        }
    }

    //definim o multime de masini din care afisam doar masinile de pe pozitiile impare
    public void listaMasini() {
        List<String> masini = new ArrayList<>();
        masini.add("Toyota");
        masini.add("Dacia");
        masini.add("Peugeot");
        masini.add("Mazda");
        masini.add("BMW");
        for (int index = 0; index < masini.size(); index++) {

            if (index % 2!=1 ){
                System.out.println("numele masinii este " + masini.get(index));
            }
        }
    }

    //Map: key=value
    //parcurgerea se face pe baza cheilor(folosind un set)
    public void mapExample(){
        Map<String, String> elemente=new HashMap<>();
        elemente.put("Masina", "Dacia");
        elemente.put("Telefon", "Nokia");
        elemente.put("Persoana", "Bogdan");
        for (String key:elemente.keySet()){
            System.out.println("Cheia este "+key);
            System.out.println("Valoarea este "+elemente.get(key));
        }
    }

    //Afisam o tara cu anumite orase
    public void tariOrase(){
        Map<String, List<String>>obiecte=new HashMap<>();

        List<String> oraseRomania= Arrays.asList("Bacau","Bucuresti","Constanta");
        List<String> oraseItalia= Arrays.asList("Milano","Roma","Sicilia");
        List<String> oraseSpania= Arrays.asList("Barcelona","Valencia","Madrid");

        obiecte.put("Romania", oraseRomania);
        obiecte.put("Italia", oraseItalia);
        obiecte.put("Spania", oraseSpania);

        for (String key:obiecte.keySet()){
            System.out.println("Tara este "+key);
            System.out.println("Orasele sunt "+obiecte.get(key));
        }

    }

    //Afisam ingrediente pt retete culinare
    public void carteRetete() {
        Map<String, List<String>> ingrediente = new HashMap<>();

        List<String> ingredienteSupaPui = Arrays.asList("Carne de pui", "Legume", "Apa", "Verdeata");
        List<String> ingredienteSarmale = Arrays.asList("Carne de porc", "Varza murata", "Apa", "Bulion");
        List<String> ingredienteDesert = Arrays.asList("Faina", "Branza dulce", "Apa", "Zahar");

        ingrediente.put("supaPui", ingredienteSupaPui);
        ingrediente.put("Sarmale", ingredienteSarmale);
        ingrediente.put("Desert", ingredienteDesert);

        for (String key:ingrediente.keySet()){
            System.out.println("Reteta este "+key);
            System.out.println("Ingredientele sunt "+ingrediente.get(key));
        }

    }
}
