package tema;

import org.testng.annotations.Test;

public class Tema1 {

    @Test

    public void metodaTest(){
        //helloWorld();
        prezentareNume();

    }
    //Hello World
    public void helloWorld(){
        System.out.println("Hello World!");
    }

    //Numele si prenumele pe 2 randuri
    public String nume;
    public String prenume;

    public void prezentareNume(){
        nume= "Bogdan";
        prenume="Soare";

        System.out.println(nume);
        System.out.println(prenume);
    }



}
