package ludzie;
import java.util.Arrays;

public class BufforCykliczny {
    public static Osoba[] expand(Osoba[] array) {
        int new_size = array.length * 2;
        return Arrays.copyOf(array, new_size);
    }

    public static Osoba[] minimize(Osoba[] array) {
        int new_size = array.length / 2;
        if (new_size < 1) new_size = 1;
        return Arrays.copyOf(array, new_size);
    }

    static public void wypisz(Osoba[] array) {
        for (Osoba osoba : array) {
            if (osoba != null) { System.out.print(osoba); }
        }
    }
}
