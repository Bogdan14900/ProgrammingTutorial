package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //Acesta este un comentariu
    //Clasa= sabloncare defineste comportamentul unei entitati din viata reala
    //Intr-un fisier Java recunoastem o clasa dupa cuvantul cheie "Class"
    //Este obligatoriu ca o clasa sa aiba un nume
    //Intr-un fisier Java putem avea mai multe clase diferentiate prin numele acestora(Nu se face asa niciodata, ca bestpractice)
    //O clasa contine VARIABILE si METODE

    //Variabila= proprietatea unei clase
    //Variabila poate fi de 2 feluri: GLOBALA si LOCALA
    //Variabila Globala= variabila pe care o definesti la inceputul clasei si are vizibilitate asupra intregului fisier
    //Variabila Locala= variabila pe care o definesti intr-o metoda si are vizibilitate doar in metoda respectiva
    //Variabila globala trebuie sa contina un access control (public), tip de data si un nume
    //O variabila nu trebuie sa contina tot timpul o valoare

    public String nume;
    public String prenume;
    public int varsta;
    public double inatltime;
    public float greutate;
    public String adresa;
    public char sex;
    public boolean AreRestante;

    //Metoda= actiunea unei clase
    //O clasa poate avea mai multe metode care se diferentiaza prin numele lor
    //Metodele pot fi de 2 feluri: void si return
    //O Metoda cu void are ca rol sa execute actiunea si sa o afiseze
    //O metoda cu void trebuie sa contina : access control(public) void NumeMetoda () {}

    @Test
    public void PrezentareStudent() {
        nume = "Petrache";
        prenume = "Andrei";
        varsta = 25;
        inatltime = 1.75;
        greutate = 65.5f;
        adresa = "Strada Ghica nr 30, Sector 2";
        sex = 'M';
        AreRestante = true;

        //Concatenare= lipirea a unuia sau mai multor stringuri prin folosirea lui +
        //print= afiseaza valoare si ramane pe randul curent
        //println+afiseaza valoarea si sare la randul urmator

        //System.out.print(nume+" "+prenume+" "+varsta);
        System.out.println("Numele studentului este "+nume);
        System.out.println("Prenumele studentului este "+prenume);
        System.out.println("Varsta studentului este "+varsta);
        System.out.println("Inaltimea studentului este "+inatltime);
        System.out.println("Greutatea studentului este "+greutate);
        System.out.println("Adresa studentului este "+adresa);
        System.out.println("Sexul studentului este "+sex);
        System.out.println("Studentul are restante? "+AreRestante);
    }

}