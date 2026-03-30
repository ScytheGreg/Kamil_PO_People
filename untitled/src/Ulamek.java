public class Ulamek {
    private int licznik;
    private int mianownik;

    public Ulamek(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;

        int nwd = nwd();
        this.licznik = licznik / nwd;
        this.mianownik = mianownik / nwd;
    }

    public int nwd() {
        int a = this.licznik;
        int b = this.mianownik;
        int c;
        while(b != 0) {
            c = a % b;
            a = b;
            b = c;
        }
        return a;
    }

    public Ulamek add(Ulamek a, Ulamek b) {
        this.licznik = a.licznik * b.mianownik + a.mianownik * b.licznik;
        this.mianownik = a.mianownik * b.mianownik;

        int nwd = nwd();
        this.licznik = licznik / nwd;
        this.mianownik = mianownik / nwd;

        return this;
    }

    public Ulamek subtract(Ulamek a, Ulamek b) {
        this.licznik = a.licznik * b.mianownik - a.mianownik * b.licznik;
        this.mianownik = a.mianownik * b.mianownik;

        int nwd = nwd();
        this.licznik = licznik / nwd;
        this.mianownik = mianownik / nwd;

        return this;
    }

    public Ulamek multiply(Ulamek a, Ulamek b) {
        this.licznik = a.licznik * b.licznik;
        this.mianownik = a.mianownik * b.mianownik;

        int nwd = nwd();
        this.licznik = licznik / nwd;
        this.mianownik = mianownik / nwd;

        return this;
    }

    public Ulamek divide(Ulamek a, Ulamek b) {
        this.licznik = a.licznik * b.mianownik;
        this.mianownik = a.mianownik * b.licznik;

        int nwd = nwd();
        this.licznik = licznik / nwd;
        this.mianownik = mianownik / nwd;

        return this;
    }

    public void wypisz() {

    }
}