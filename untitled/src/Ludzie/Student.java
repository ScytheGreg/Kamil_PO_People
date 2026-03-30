package Ludzie;

public class Student {
    private String imie;
    private String nazwisko;
    private String nr_indeksu;

    public Student(String imie, String nazwisko, String nr_indeksu){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nr_indeksu = nr_indeksu;
    }
    public String imie(){ return imie; }
    public String nazwisko(){ return nazwisko; }
    public String nr_indeksu(){ return nr_indeksu; }
}