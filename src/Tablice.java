import java.util.Arrays;
import java.util.Random;

public class Tablice {
    public static void main(String[] args) {

       /* int liczba = 10;
        String tekst = new String("abcdgfhfdghfghfghfghfghfghfghfghfghfghfghhfghfghd");*/

        int[] liczby = new int[5];
        liczby[0] = 10;
        String[]  teksty = {"Ala","ma","kota"};

        //domyslne wartosci:
        //liczby - 0
        //boolean - false
        //referencje(np. String) - null

//        System.out.println(liczby[0]);
//        System.out.println(liczby[1]);

        Random random = new Random();

        for (int liczba : liczby) {
            System.out.println(liczba);
        }

        for(int i = 0; i< liczby.length;i++){
            liczby[i] = random.nextInt(5);
        }

        System.out.println(Arrays.toString(liczby));

       /* for (int liczba : liczby) {
            System.out.println(liczba);
        }*/
    }
}
