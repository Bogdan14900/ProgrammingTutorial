package tema;
import org.testng.annotations.Test;

public class Masina {
    public String Marca;
    public String Model;
    public int AnFabricatie;
    public double Kilometraj;
    public double Motor;
    public String TaradeOrigine;
    public String Combustibil;
    public boolean EsteInamtriculata;


    @Test
    public void PrezentareMasina() {
        this.Marca = "VW";
        this.Model = "Golf";
        this.AnFabricatie = 2002;
        this.Kilometraj = 120000;
        this.Motor = 1.4;
        this.TaradeOrigine = "Germania";
        this.Combustibil = "Benzina";
        this.EsteInamtriculata = true;
        System.out.println("Marca masinii este " + this.Marca);
        System.out.println("Modelul masinii este " + this.Model);
        System.out.println("Anul de fabricatie al masinii este " + this.AnFabricatie);
        System.out.println("Masina are un rulaj de " + this.Kilometraj+" de kilometrii");
        System.out.println("Motorul masiinii este de " + this.Motor);
        System.out.println("Masina a fost adusa din " + this.TaradeOrigine);
        System.out.println("Masina merge pe " + this.Combustibil);
        System.out.println("Masina este inmatriculata in Romania? " + this.EsteInamtriculata);
    }
}