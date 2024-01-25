import java.util.Arrays;

public class ASCIIRegular {

    public static void main(String[] args) {

        exercise();
    }

    public static void exercise() {
        int[] tab = new int[32];                  // a final array with integers
        char[] characters = new char[tab.length]; // a final array with characters from the ASCII table.
        charactersASCII(tab, characters);

        System.out.println("characters: " + Arrays.toString(characters));

    }

    public static char[] charactersASCII(int[] tab, char[] characters) {
        //Return an array of type char with characters from the ASCII table from the exclamation mark to the tilde character.
        //Omit numeric values from 0 to 9 and the alphabet.

        //Initializing the four arrays with different lengths each.
        //Note that each next array has a less length than the previous array
        int[] tab1 = new int[tab.length - 17];
        int[] tab2 = new int[tab1.length - 8];
        int[] tab3 = new int[tab2.length - 1];
        int[] tab4 = new int[tab3.length - 2];


        for (int i = 0; i < tab1.length; i++) {                         //starting a loop from filling up the longest array from the four above(not a final array which is a 'tab' array).
            tab1[i] = 33 + i;                                           // filling an array with integers from 33 to 47 from the ASCII table.
            try {
                tab2[i] = 58 + i;                                       // filling an array with values of symbols from the ASCII table from a divide symbol to AT symbol.
                tab3[i] = 91 + i;                                       // filling an array with values of symbols from the ASCII table from an opening square bracket symbol to a grave accent symbol.
                tab4[i] = 123 + i;                                      // filling an array with values of symbols from the ASCII table from an opening curly bracket symbol to a tilde symbol.
                if (i > tab2.length || i > tab3.length || i > tab4.length) {
                    break;
                }

            } catch (ArrayIndexOutOfBoundsException exception) {

            }

            tab[i] = tab1[i];                                           // starting of filling a final array with all integers for whom are matched symbols in the ASCII table from an exclamation mark to a tilde symbol.
            tab[i + tab2.length] = 50 + i;
            tab[i + tab2.length + tab3.length] = 82 + i;
            tab[i + tab2.length + tab3.length + tab4.length] = 112 + i;


            characters[i] = (char) tab[i];                              // starting of filling a char array with symbols from ASCII table represented by integers from 33 to 126 omitting numbers from 0 to 9 represented by integers from 48 to 57 and an alphabet with upper and lower cases.
            characters[i + tab2.length] = (char) tab[i + tab2.length];
            characters[i + tab2.length + tab3.length] = (char) tab[i + tab2.length + tab3.length];
            characters[i + tab2.length + tab3.length + tab4.length] = (char) tab[i + tab2.length + tab3.length + tab4.length];

        }
        System.out.println("tab1: " + Arrays.toString(tab1));
        System.out.println("tab2: " + Arrays.toString(tab2));
        System.out.println("tab3: " + Arrays.toString(tab3));
        System.out.println("tab4: " + Arrays.toString(tab4));
        System.out.println("tab: " + Arrays.toString(tab));

        return characters;
    }
}
