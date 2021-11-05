public class Ticket implements TicketAccess {
    //DEPENDENCY INVERSION
    private String boardingStationId;
    private String destinationStationId;
    private String currentStationId;
    Ticket(String boardingStation , String destinationStation , String currentStationId)
    {
        this.boardingStationId=boardingStation;
        this.destinationStationId=destinationStation;
        this.currentStationId=currentStationId;
    }

    @Override
    public boolean entryAccess() {
       // String currentStationId=getCurrentStationId();
        return boardingStationId.equals(getCurrentStationId());
    }

    @Override
    public boolean exitAccess() {
        return destinationStationId.equals(getCurrentStationId());
    }
    public String getCurrentStationId()
    {
        return currentStationId;
    }
}
