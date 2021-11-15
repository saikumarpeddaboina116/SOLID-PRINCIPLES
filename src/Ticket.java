public class Ticket extends Access  {
    //DEPENDENCY INVERSION
    //SUB CLASS
    private int boardingStationId;
    private int destinationStationId;
    private int currentStationId;
    Ticket()
    {

    }
    Ticket(int boardingStation , int destinationStation , int currentStationId)
    {
        this.boardingStationId=boardingStation;
        this.destinationStationId=destinationStation;
        this.currentStationId=currentStationId;
    }

    public boolean entryAccess() {
       // String currentStationId=getCurrentStationId();
        return (boardingStationId == currentStationId);
    }

    public boolean exitAccess() {
        return ( destinationStationId == currentStationId);
    }
    public void setCurrentStationId(int currentStationId)
    {
       this.currentStationId=currentStationId;
    }
    public int getCurrentStationId()
    {
        return currentStationId;
    }
}
