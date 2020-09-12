package obiektowosc.citizen;

import java.util.ArrayList;
import java.util.List;

public class Town {

    private List<Citizen> citizens = new ArrayList<>();

    public void addCitizen(Citizen citizen) {
        citizens.add(citizen);
    }

    //howManyCanVote -  które zwracają ilość osób które mogą głosować
    public int howManyCanVote(){
        int votingPersonCounter=0;
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                votingPersonCounter++;
            }
        }
        return votingPersonCounter;
    }

    //whoCanVote -  która wypisuje imiona osób które mogą głosować
    public void whoCanVote(){
        System.out.println("Może głosować: ");
        for (Citizen citizen : citizens) {
            if (citizen.canVote()) {
                System.out.println(citizen.getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Town{" +
                "citizens=" + citizens +
                '}';
    }
}
