package daniel;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        String[] strings = new String[t];
        if (t >= 1 && t <= 50) {
            for (int i = 0; i < t; i++) {
                String temp = scanner.nextLine();
                strings[i] = temp;
            }
        }
        for (String string : strings) {
            countSameChars(string);
        }
    }

    private static void countSameChars(String test) {
        char temp = test.charAt(0);
        int numberOfChanges = 0;
        int counter = 0;
        char[] chars = test.toCharArray();
        int[] ints = new int[numberOfChanges + 1];
        char[] charsWithChange = new char[numberOfChanges + 1];
        charsWithChange[0] = test.charAt(0);
        for (int i = 0; i < test.length(); i++) {
            if (chars[i] == temp) {
                temp = chars[i];
                counter++;
                if (i == test.length() - 1) { //case do ostatniej
                    ints[numberOfChanges] = counter;
                }
            } else {
                charsWithChange = Arrays.copyOf(charsWithChange, ints.length + 1);
                charsWithChange[numberOfChanges + 1] = chars[i];
                ints[numberOfChanges] = counter;
                numberOfChanges++;
                temp = chars[i];
                counter = 1;
                ints = Arrays.copyOf(ints, ints.length + 1);
            }
        }
        for (int i = 0; i <= numberOfChanges; i++) {
            if (ints[i] > 2) {
                System.out.print(charsWithChange[i] + "" + ints[i]);
            } else if (ints[i] == 2) {
                System.out.print(charsWithChange[i]  + String.valueOf(charsWithChange[i]));
            } else {
                System.out.print(charsWithChange[i]);
            }
        }
    }


/*9:57
    Dla danych
    wejściowych:

            4
    OPSS
            ABCDEF
    ABBCCCDDDDEEEEEFGGHIIJKKKL
            AAAAAAAAAABBBBBBBBBBBBBBBB

    prawidłowym rozwiązaniem
    jest:

    OPSS
            ABCDEF
    ABBC3D4E5FGGHIIJK3L
            A10B16*/
}
