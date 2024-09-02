package structuriRepetitive;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //Structuri repetitive; for/while/foreach/do...while

    @Test
    public void metodaTest(){
        //afisareNumereFor(30);
        //afisareNumereWhile(30);
        afisareNumerePare(50);

    }

    //Afisam primele n numere

    public void afisareNumereFor(int capat){
        for (int index=0;index<capat;index++){
            System.out.println("Vreau sa afisez numarul "+index);
        }
    }

    //Afisam primele n numere - while
    public void afisareNumereWhile(int capat){
        int index=0;
        while (index<capat){
            System.out.println("Vreau sa afisez numarul "+index);
            index++;
        }
    }

    //Afisam numerele pare de la zero la 50
    public void afisareNumerePare(int capat){
        for(int index=0;index<=capat;index++){
            if (index %2==0){
                System.out.println("Afisez numarul "+index+" care e par");
            }
        }

    }
}
