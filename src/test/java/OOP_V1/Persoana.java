package OOP_Mostenire;

public class Persoana {

    //OOP Programare orientata obiect
    //4 principii: Mostenire, Abstractizare, Incapsulare si Polimorfism
    //Mostenire: conceptul prin care o clasa copil mosteneste o clasa parinte. In momentul cand copilul mosteneste partintele trebuie sa apeleze constructorul din parinte.Acest lucru se realizeaza  cu Super
    //Mostenirea se face la nivel de clasa cu cuvantul "Extends"
    //In Java o clasa poate mosteni doar o singura clasa

    //Incapsulare: conceptul prin care excludem anumite proprietati/metode
    //Conceptul se poate aplica la orice nivel de clase(clasa parinte sau clasa copil)

    //Polimorfism: conceputul prin care o metoda poate avea implementari diferite
    //Poate fi de 2 feluri: static(overload) si dinamic(override)
    //Dinamic= intr o ierarhie de clase obtinute prin mostenire, o metoda poate avea implementari diferite
    //Polimorfismul dinamic se regaseste doar cand este aplicat prin mostenire

    //Polimorfismul static= actiunea prin care putem avea metode cu acelasi nume insa diferentierea fiind facuta prin numar/tip parametrii



    private String nume;
    private String prenume;
    private String varsta;
    private String sex;
    private String adresa;

    public Persoana(String nume, String prenume, String varsta, String sex, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.adresa = adresa;
    }

    public Persoana() {

    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este: "+ nume);
        System.out.println("Prenumele persoanei este: "+ prenume);
        System.out.println("Varsta persoanei este: "+ varsta);
        System.out.println("Sexul persoanei este: "+ sex);
        System.out.println("Adresa persoanei este: "+ adresa);

    }

    //polimorfism dinamic

    public void mananca(){
        System.out.println("Persoana mananca cand ii este foame.");

    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getVarsta() {
        return varsta;
    }

    public String getSex() {
        return sex;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }
}
