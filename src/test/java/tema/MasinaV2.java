package tema;

import org.testng.annotations.Test;

public class MasinaV2 {



    @Test
    public void metodaTest(){
        prezentareMasina("VW","Passat", 180, 2.5, true);
        prezentareMasina("Ford","Focus", 100, 1.6, false);
        prezentareMasina("Skoda","Octavia", 150, 2.0, true);
    }

    public void prezentareMasina( String param1, String param2, int param3, double param4, boolean param5){
        System.out.println("Marca masinii este "+param1);
        System.out.println("Modelul masinii este "+ param2);
        System.out.println("Masina are o putere de "+ param3+" cp");
        System.out.println("Capacitatea cilindrica a masinii este de  "+ param4+" cm3");
        System.out.println("A fost condusa de o bunicuta? "+ param5);
        System.out.println();

    }
}
