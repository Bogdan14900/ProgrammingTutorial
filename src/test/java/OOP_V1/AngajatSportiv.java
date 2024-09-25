package OOP_Mostenire;

public class AngajatSportiv extends Persoana implements AngajatInterface, SportivInterface {
    private String firma;
    private String pozitie;
    private int salariu;
    private String experienta;

    private String sportPrcticat;
    private boolean sportEchipa;
    private int experiente;
    private boolean performanta;
    private int medalii;

    public AngajatSportiv(String nume, String prenume, String varsta, String sex, String adresa, String firma, String pozitie, int salariu, String experienta, String sportPrcticat, boolean sportEchipa, int experiente, boolean performanta, int medalii) {
        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitie = pozitie;
        this.salariu = salariu;
        this.experienta = experienta;
        this.sportPrcticat = sportPrcticat;
        this.sportEchipa = sportEchipa;
        this.experiente = experiente;
        this.performanta = performanta;
        this.medalii = medalii;
    }

    public AngajatSportiv(String firma, String pozitie, int salariu, String experienta, String sportPrcticat, boolean sportEchipa, int experiente, boolean performanta, int medalii) {
        this.firma = firma;
        this.pozitie = pozitie;
        this.salariu = salariu;
        this.experienta = experienta;
        this.sportPrcticat = sportPrcticat;
        this.sportEchipa = sportEchipa;
        this.experiente = experiente;
        this.performanta = performanta;
        this.medalii = medalii;
    }

    @Override
    public void ajungeLaTimpLaBirou() {

    }

    @Override
    public void munceste() {

    }

    @Override
    public void nuAreAbsente() {

    }

    @Override
    public void respectaConduita() {

    }

    @Override
    public void antrenament() {
        
    }

    @Override
    public void saTinaDieta() {

    }

    @Override
    public void saFieTestatPeriodic() {

    }

    @Override
    public void saSeOdihneasca() {

    }

    @Override
    public void saNuSeDrogheze() {

    }
}
