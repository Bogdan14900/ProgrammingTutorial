package variabilaMetoda;

import org.testng.annotations.Test;

public class Animal {
    public String rasa;
    public Boolean esteMamifer;
    public String culoare;
    public int varsta;
    public double greutate;


    @Test
    public void metodaTest() {

    prezentareAnimal("caine", true, "maro", 3, 20.5);
    prezentareAnimal("pisica", true, "alba", 6,5.5);
    prezentareAnimal("cartita", true, "neagra", 1, 2.5);

    }

    public void prezentareAnimal(String param1, Boolean param2, String param3, int param4, double param5){
        int pret= 100;
        System.out.println("Pretul animalului este "+pret);
        System.out.println("Rasa animaluilui este "+ param1);
        System.out.println("Animalul este mamifer? "+ param2);
        System.out.println("Culoarea blanii animalului este "+ param3);
        System.out.println("Varsta animalului este "+ param4);
        System.out.println("Animalul are o greutate de  "+ param5+"kg");
        System.out.println();
    }
}