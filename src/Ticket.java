public class Ticket extends Access implements TicketAccess {
    //DEPENDENCY INVERSION
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

    @Override
    public boolean entryAccess() {
       // String currentStationId=getCurrentStationId();
        return (boardingStationId == currentStationId);
    }

    @Override
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
