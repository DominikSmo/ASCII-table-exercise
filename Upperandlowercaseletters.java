import java.util.Arrays;

public class Upperandlowercaseletters {

    public static void main(String[] args) {

        uppercaselowercaseLetters();


    }


    public static void uppercaselowercaseLetters() {
        int[] tab = new int[52];              // This array we will fill with integers for whom are assigned uppercase and lowercase letters from ASCII table.
        System.out.println("Array with uppercase and lowecase letters from an alphabet : " + Arrays.toString(alphabet(tab)));
    }

    public static char[] alphabet(int[] tab) {
//Fill an array with uppercase and lowercase letters from an alphabet

        // We create two arrays with the same length:
        int[] tab1 = new int[26];
        int[] tab2 = new int[tab1.length];
        char[] letters1 = new char[tab1.length + tab2.length];               // This array we will fill with letters from an alphabet

        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = 65 + i;                               // In a loop we are filling an array with integers for whom are assigned uppercase letters in ASCII table
            tab2[i] = 97 + i;                              // In a loop we are filling an array with integers for whom are assigned lower letters in ASCII table
            tab[i] = tab1[i] - 1;                         // Filling a tab array with the numbers representing uppercase letters in ASCII table
            tab[i + tab2.length] = tab2[i] - 1;            // Filling a tab array with the numbers representing lowercase letters in ASCII table
            letters1[i] = (char) (tab[i] + 1);             // Changing a type of integers placed in an array tab as the numbers representing uppercase letters from an alphabet
            tab[i]++;
            letters1[i + tab2.length] = (char) (tab[i + tab2.length] + 1); // Addition to a char array lowercase letters by projecting the numbers from an array tab2 on a char type from ASCII table
            tab[i + tab2.length]++;

        }

        return letters1;
    }
}
