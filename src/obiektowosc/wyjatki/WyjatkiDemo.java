package obiektowosc.wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WyjatkiDemo {
    public static void main(String[] args) {
        /*String imie = null;

        if (imie != null) {
            System.out.println(imie.toUpperCase());
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ile masz lat?");
        try{
            int wiek = scanner.nextInt();
            System.out.println("Masz " +wiek + " lat");
        }catch (InputMismatchException exception){
            System.out.println("Miałeś podać cyfrę! Dziadu ty...");
        }finally { //wykona się bez względu na wyjatek
            System.out.println("Koniec pobierania wieku");
        }

        System.out.println("Coś dalej");
    }
}
