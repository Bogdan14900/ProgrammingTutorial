package OOP_Mostenire;

public class Sportiv extends Persoana{

    private String sportPrcticat;
    private boolean sportEchipa;
    private int experienta;
    private boolean performanta;
    private int medalii;


    public Sportiv(String nume, String prenume, String varsta, String sex, String adresa, String sportPrcticat, boolean sportEchipa, int experienta, boolean performanta, int medalii) {
        super(nume, prenume, varsta, sex, adresa);
        this.sportPrcticat = sportPrcticat;
        this.sportEchipa = sportEchipa;
        this.experienta = experienta;
        this.performanta = performanta;
        this.medalii = medalii;
    }

    public void infoSportiv(){
        infoPersoana();
        System.out.println("Sportul pe care il practica este: "+ sportPrcticat);
        System.out.println("Este un sport de echipa?: "+ sportEchipa);
        System.out.println("Sportivul practica acest sport de: "+ experienta);
        System.out.println("Sportul pe care il practica este de performanta?: "+ performanta);
        System.out.println("Cate medalii a castigat sportivul?: "+ medalii);

    }

    public void mananca(){
        System.out.println("Sportivul mananca cand are antrenament");
    }

    public String getSportPrcticat() {
        return sportPrcticat;
    }

    public void setSportPrcticat(String sportPrcticat) {
        this.sportPrcticat = sportPrcticat;
    }

    public boolean isSportEchipa() {
        return sportEchipa;
    }

    public void setSportEchipa(boolean sportEchipa) {
        this.sportEchipa = sportEchipa;
    }

    public int getExperienta() {
        return experienta;
    }

    public void setExperienta(int experienta) {
        this.experienta = experienta;
    }

    public boolean isPerformanta() {
        return performanta;
    }

    public void setPerformanta(boolean performanta) {
        this.performanta = performanta;
    }

    public int getMedalii() {
        return medalii;
    }

    public void setMedalii(int medalii) {
        this.medalii = medalii;
    }
}
