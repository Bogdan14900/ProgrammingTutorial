package OOP_Mostenire;

public class AngajatStudent extends Persoana implements AngajatInterface, StudentInterface{
    private String firma;
    private String pozitie;
    private int salariu;
    private String experienta;

    private String facultate;
    private String disciplina;
    private int an;
    private boolean bursa;
    private boolean restante;


    public AngajatStudent(String nume, String prenume, String varsta, String sex,
                          String adresa, String firma, String pozitie, int salariu, String experienta, String facultate, String disciplina,
                          int an, boolean bursa, boolean restante) {
        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitie = pozitie;
        this.salariu = salariu;
        this.experienta = experienta;
        this.facultate = facultate;
        this.disciplina = disciplina;
        this.an = an;
        this.bursa = bursa;
        this.restante = restante;
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
    public void mergeLaCursuri() {

    }

    @Override
    public void trebuieSaStudieze() {

    }

    @Override
    public void saNuAibaRestante() {

    }

    @Override
    public void saStieSaCopieze() {

    }
}

//combinatii de angajat/sportiv; student/sportiv; angajat/sportiv/student tema de fcaut

//luat propritatile fiecarei clase, extends persoana, generare constructor cu toate, implement interfate
