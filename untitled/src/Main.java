import ludzie.*;

public class Main {
    public static void main(String[] args) {
        Osoba[] array = new Osoba[4];
        int counter = 0;

        Osoba[] dane = {
            new Osoba("Jan", "Kowalski"),
            new Student("Anna", "Polak", "345801"),
            new Agent("James", "Bond", "Bond"),
            new Osoba("Marek", "Aureliusz"),
            new Student("Kasia", "Kasia", "329462")
        };

        for (Osoba nowa_osoba : dane) {
            if (counter >= array.length) {
                array = BufforCykliczny.expand(array);
            }

            array[counter] = nowa_osoba;
            counter++;
        }

        System.out.println("\n Lista osob:");
        BufforCykliczny.wypisz(array);

        // Ulamki
        Ulamek u1 = new Ulamek(1, 2);
        Ulamek u2 = new Ulamek(2, 3);
        Ulamek u3 = new Ulamek(4, 8);

        System.out.print("4/8: "); u3.wypisz();

        Ulamek iloczyn = u1.multiply(u2);
        System.out.print("u1 * u2 = "); iloczyn.wypisz();

        Ulamek iloraz = u1.divide(u2);
        System.out.print("u1 / u2 = "); iloraz.wypisz();
    }
}