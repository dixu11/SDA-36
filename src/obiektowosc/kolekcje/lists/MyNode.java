package obiektowosc.kolekcje.lists;

public class MyNode {

    private String data;
    private MyNode nextDone;

    public MyNode(String data, MyNode nextDone) {
        this.data = data;
        this.nextDone = nextDone;
    }

    public String getData() {
        return data;
    }

    public MyNode getNextDone() {
        return nextDone;
    }

}
