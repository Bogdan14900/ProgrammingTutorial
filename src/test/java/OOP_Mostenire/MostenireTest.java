package OOP_Mostenire;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test
    public void metodaTest(){
        Angajat angajat=new Angajat( "Soare","Bogdan","34","Masculin","Bucuresti", "Svea",
                "Tester",2000, "11 ani");
        angajat.infoAngajat();

        System.out.println(angajat.getVarsta());

        angajat.setVarsta("21");
        System.out.println(angajat.getVarsta());
        angajat.mananca();

        angajat.marire();
        angajat.marire(10);
        angajat.marire("Tester");
        angajat.marire(10 ,"Senior");

        System.out.println();

        Sportiv sportiv = new Sportiv("Marcel","Ivan","58","Masculin","Bucuresti","Box",
                false,10,true,6);
        sportiv.infoSportiv();

        System.out.println();

        Student student = new Student("Dragos","Ion","24","Masculin","Constanta","Drept",
                "Civil",4,false,true);
        student.infoStudent();


    }
}
