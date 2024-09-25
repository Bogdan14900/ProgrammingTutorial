package OOP_Mostenire;

public interface AngajatInterface {
    //Abstractizarea = conceptul prin care putem defini comportamentul unei clase
    //Abstractizarea se poate face prin 2 feluri: interfete si clase abstracte
    //Interfata contine doar metode abstracte(metode care nu au body)
    //Toate aceste metode abstracte sunt publice
    //Intr-o interfata putem defini metode cu void sau return
    //Intr-o interfata nu putem avea un constructor>nu putem face un obiect
    //Interfata se implementeaza
    //Clasa care implementeaza interfata trebuie sa implementeze toate metodele din ea
    //O clasa poate implementa mai multe interfete
    //O interfata poate mosteni o alta interfata

    void ajungeLaTimpLaBirou();
    void munceste();
    void nuAreAbsente();
    void respectaConduita();


}
