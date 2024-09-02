package obiectConstructor;

import java.util.List;

public class Masina {

    //Constructor=are ca rol sa initalizeze variabilele unei clase
    //Recunoastem un constructor intr-o clasa dupa numele acestuia
    //De cele mai multe ori constructorul este public
    //Intr o clasa putem avea mai multi constructori case se diferentiaza prin nr/tipul de parametrii
    //O clasa contine intotdeauna un constructor DEFAULT(nu are parametri)
    //Exista 2 tipuri de constructori: cu parametrii si fara parametrii


    //Obiect = instanta unei clase
    //Dintr o clasa putem sa definim mai multe obiecte care sa aibe valori diferite pt proprietati
    //In momentul cand avem un obiect de tipul unei clase, putem accesa variable/metode din clasa respectiva
    //Obiectele se diferentiaza prin numele acestora
    //Recunoastem un obiect dupa cuvantul cheie "NEW"
    //Structura: tipObiect numeObiect= new tipObiect(); (--Masina Dacia= new Masina():--)

    public String marca;
    public String model;
    public int an;
    public String culoare;
    public List<String> dotariInterioare;
    public String motorizare;
    public int pret;
    public int pretFinal;

    public Masina(String model, String marca, int an, String culoare, List<String> dotariInterioare, String motorizare) {
        this.model = model;
        this.marca = marca;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
    }

    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, String motorizare, int pret) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentareMasina() {
        System.out.println("Marca masinii este: "+marca);
        System.out.println("Modelul masinii este: "+model);
        System.out.println("Anul masinii este: "+an);
        System.out.println("Culoarea masinii este: "+culoare);
        System.out.println("Dotarile interioare sunt: ");
        for (int i=0; i<dotariInterioare.size(); i++){
            System.out.println(dotariInterioare.get(i));
        }
        System.out.println("Motorizarea masinii este: "+motorizare);


    }

    //Determinam impozitul in functie de anul de fabricatie
    //Daca e mai jos de 2000 - 500 lei
    //Intre 2005 si 2015 - 300 lei
    //Dupa 2020 - 100 lei

    public void calculImpozit(){
        if(an<=2000){
            System.out.println( "Impozitul pentru masina este: 500 lei");
        }
        else if (an >=2005&&an<=2015){
            System.out.println( "Impozitul pentru masina este: 300 lei");
        }
        else if (an>=2020) {
            System.out.println( "Impozitul pentru masina este: 100 lei");

        }
    }

    //Determinam pretul standard si pretul final in functie de dotarile alese

    public void calculPret(){

        if(pret!=0){
            System.out.println("Pretul de pornire este: "+pret);

        }
        if (dotariInterioare.isEmpty()){
            System.out.println("Pretul final este:" +pret);
        }
        else {
            int dotari=0;
            for (int i=0;i<dotariInterioare.size();i++){
                switch (dotariInterioare.get(i)){
                    case "Trapa":
                        dotari=dotari+1000;
                        break;
                    case"Climatronic":
                        dotari=dotari+800;
                        break;
                    case "Senzori Parcare":
                        dotari=dotari+300;
                        break;
                    case"NOS":
                        dotari=dotari+12000;
                        break;


                }
            }

            System.out.println("Pretul final este" +pret);

        }

    }
}
 //Tema: definim niste sportivi din diverse domenii.






