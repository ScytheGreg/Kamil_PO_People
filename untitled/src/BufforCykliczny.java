import Ludzie.Osoba;

public class BufforCykliczny {
    public void expand(Osoba[] array) {
        int size = array.length;
        int new_size = size * 2;

        Osoba[] new_array = new Osoba[new_size];

        System.arraycopy(array, 0, new_array, 0, size);
    }

    public void minimize(Osoba[] array){
        int size = array.length;
        int new_size = size * 2;

        Osoba[] new_array = new Osoba[new_size];

        System.arraycopy(array, 0, new_array, 0, size);
    }

    public void wypisz(Osoba[] array) {
        int size = array.length;

        for (Osoba osoba : array) {
            System.out.print(osoba);
        }
    }
}
