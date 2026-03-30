package Ludzie;

public class Agent {
    private String imie;
    private String nazwisko;
    private String drugie_nazwisko;

    public Agent(String imie, String nazwisko, String drugie_nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.drugie_nazwisko = drugie_nazwisko;
    }
    public String imie(){ return imie; }
    public String nazwisko(){ return nazwisko; }
    public String drugie_nazwisko(){ return drugie_nazwisko; }
}