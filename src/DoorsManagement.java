import java.util.ArrayList;

//OPEN FOR EXTENSION CLOSED FOR MODIFICATION
public class DoorsManagement extends RouteDetails {
    int duration_Of_Doors;
    int currentStation=super.getCurrentStationId();
    ArrayList<Integer> endingStationsId=new ArrayList<Integer>();

    DoorsManagement(String routeLine, String source, String destination, int journeyDurationInMints) {
        super(routeLine, source, destination, journeyDurationInMints);
    }

    public ArrayList<Integer> setEndingStationsId() {
        this.endingStationsId.add(1);
        this.endingStationsId.add(14);
        this.endingStationsId.add(15);
        this.endingStationsId.add(23);

        return endingStationsId;
    }



    public void setDuration()
       {
                if(endingStationsId.contains(currentStation))
                    this.duration_Of_Doors = 100;
                else
                    this.duration_Of_Doors=30;
       }



    }

