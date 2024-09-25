package OOP_Mostenire;

public class Student extends Persoana implements StudentInterface{

    private String facultate;
    private String disciplina;
    private int an;
    private boolean bursa;
    private boolean restante;

    public Student(String nume, String prenume, String varsta, String sex, String adresa, String facultate, String disciplina, int an, boolean bursa, boolean restante) {
        super(nume, prenume, varsta, sex, adresa);
        this.facultate = facultate;
        this.disciplina = disciplina;
        this.an = an;
        this.bursa = bursa;
        this.restante = restante;
    }

    public void infoStudent(){
        infoPersoana();
        System.out.println("Facultatea la care este studentul este"+ facultate);
        System.out.println("Disciplina facultati este "+ disciplina);
        System.out.println("Studentul este anul"+ an);
        System.out.println("Studentul este la bursa?"+ bursa);
        System.out.println("Studentul are restante?"+ restante);

    }

    public void mananca(){
        System.out.println("Studentul mananca cand are pauza.");
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public boolean isBursa() {
        return bursa;
    }

    public void setBursa(boolean bursa) {
        this.bursa = bursa;
    }

    public boolean isRestante() {
        return restante;
    }

    public void setRestante(boolean restante) {
        this.restante = restante;
    }

    @Override
    public void mergeLaCursuri() {
        System.out.println("Studentul merge la cursuri");
    }

    @Override
    public void trebuieSaStudieze() {
        System.out.println("Studentul trebuie sa studieze");

    }

    @Override
    public void saNuAibaRestante() {
        System.out.println("Studentul nu trebuie sa aiba restante");

    }

    @Override
    public void saStieSaCopieze() {
        System.out.println("Studentul sa fie dibaci");

    }
}
