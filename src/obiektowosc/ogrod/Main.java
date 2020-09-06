package obiektowosc.ogrod;

public class Main {
    public static void main(String[] args) {
        Drzewo drzewo = new Drzewo();
        Kwiat kwiat1 = new Kwiat("czerwony", "róża");
        Kwiat kwiat2 = new Kwiat("biały", "stokrotka");
        Lawka lawka = new Lawka("drewno");
        Drzewo[] drzewa = {drzewo};
        Kwiat[] kwiaty = {kwiat1, kwiat2};
        Ogrod ogrod = new Ogrod(lawka,drzewa,kwiaty );
        System.out.println(ogrod);
    }
}
