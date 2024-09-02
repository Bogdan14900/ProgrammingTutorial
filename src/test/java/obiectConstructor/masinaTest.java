package obiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;

public class masinaTest {


    @Test
    public  void metodaTest(){
        Masina Dacia= new Masina("Dacia", "Logan", 2014, "Verde",
                Arrays.asList("- Trapa","- Climatronic","- Senzori Parcare"), "benzina");
        Dacia.prezentareMasina();
        Dacia.calculImpozit();

        System.out.println();

        Masina Kia = new Masina("Kia", "Ceed", 2022, "Negru",
                Arrays.asList("- NOS","- Climatronic","- Senzori Parcare"), "electrica");
        Kia.prezentareMasina();
        Kia.calculImpozit();

        System.out.println();

        Masina BMW = new Masina("BMW", "X1", 1998, "Negru",
                Arrays.asList("- NOS","- Climatronic","- Senzori Parcare"), "Disal",25000);
        BMW.prezentareMasina();
        BMW.calculImpozit();


    }
}
