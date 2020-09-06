package obiektowosc.ogrod;

public class Lawka {

    private String rodzajMaterialu;

    public Lawka(String rodzajMaterialu) {
        this.rodzajMaterialu = rodzajMaterialu;
    }

    @Override
    public String toString() {
        return "Lawka{" +
                "rodzajMaterialu='" + rodzajMaterialu + '\'' +
                '}';
    }
}
