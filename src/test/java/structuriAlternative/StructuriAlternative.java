package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //In programare exista 2 tipuri de structuri: Alternative si Repetitive

    //Structuri alternative: if... than..... else/switch...case

    @Test
    public void metodaTest(){
        //verificaPersoanaMajora(19);
        //verificaPersoanaMajora(17);
        //verificaPersoanaMajora(18);
        //verificNrPar(1);
        //verificNrPar(2);
        //verificNrPar(0);
        //verificNrPar(-1);
        //verificNrPar(-2);
        //verificNrDivizibil(5);
        //verificNrDivizibil(6);
        zileSaptamana(10);

    }

    //facem o metoda care verifica daca o persoana este majora
    public  void  verificaPersoanaMajora(int varsta){

        if (varsta>=18 ) {
            System.out.println("Persoana cu varsta de "+ varsta+" ani, este majora");
        }
        else {
            System.out.println("Persoana cu varsta de "+varsta+" ani, este minora");
        }
    }

    //Verificam daca un numar este par si pozitiv
    //Daca vrem catul unei impartiri> / (divide)
    //daca vrem restul unei impartiri> %(modulo)
    public void verificNrPar(int nr){
        if (nr >0){
            if(nr % 2==0) {
                System.out.println("Numarul " + nr + " este pozitiv si par");
            }
            else {
                System.out.println("Numarul " + nr + " este pozitiv si impar");
            }
        }
        else if (nr<0){

            if(nr % 2==0) {
                System.out.println("Numarul " + nr + " este negativ si par");
            }
            else {
                System.out.println("Numarul " + nr + " este negativ si impar");
            }
        }
        else {
            System.out.println("Numarul "+nr+" este egal cu 0.");
        }
    }

    //Verificam daca un nr este pozitiv si divizibil cu 5
    public void verificNrDivizibil(int numar){
        if(numar % 5==0 && numar>0){
            System.out.println("Numarul e divizibil si pozitiv");
        }
        else {
            System.out.println("Numarul nu e divizibil");
        }
    }

    //Afisam zilele saptamanii
    public void zileSaptamana(int zi){
        switch (zi){
            case 1:
                System.out.println("Astazi e luni");
                break;
            case 2:
                System.out.println("Astazi e mart");
                break;
            case 3:
                System.out.println("Astazi e miercuri");
                break;
            case 4:
                System.out.println("Astazi e joi");
                break;
            case 5:
                System.out.println("Astazi e vineri");
                break;
            case 6:
                System.out.println("Astazi e sambata");
                break;
            case 7:
                System.out.println("Astazi e duminica");
                break;
            default:
                System.out.println("Nu mai exista zile");

        }

    }

}
