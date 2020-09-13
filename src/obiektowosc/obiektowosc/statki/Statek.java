package obiektowosc.obiektowosc.statki;

public class Statek {

   private double wagaWTonach;
   private String portStart;
   private String portCel;

    public Statek(String portStartu, String portCelu){
        portStart = portStartu;
        portCel = portCelu;
        wagaWTonach = 500;
    }

    public Statek(String portStartu, String portCelu, double innaWaga){
        portStart = portStartu;
        portCel = portCelu;
        wagaWTonach = innaWaga;
    }


    public void wyswietl() {
        System.out.println(wagaWTonach);
        System.out.println(portStart);
        System.out.println(portCel);
        System.out.println();
    }


    public void setPortCel(String nowyPort){
        portCel = nowyPort;
    }

    public String getPortCel(){
        return portCel;
    }



    public String toString(){
        return "Statek: Waga: " + wagaWTonach + " port startowy: " + portStart + " port docelowy: " + portCel;
    }

   //generowany
   /* public String toString() {
        return "Statek{" +
                "wagaWTonach=" + wagaWTonach +
                ", portStart='" + portStart + '\'' +
                ", portCel='" + portCel + '\'' +
                '}';
    }*/
}
