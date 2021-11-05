import java.util.Scanner;
public class Access implements EntryAndExitAccess
{
    // VOILATES SINGLE RESPONSIBILITY
    private String boardingStationId;
        private String destinationStationId;
        private String currentStationId;
        public int availabeBalance=200;

        Access(String boardingStation , String destinationStation , String currentStationId)
        {
            this.boardingStationId=boardingStation;
            this.destinationStationId=destinationStation;
            this.currentStationId=currentStationId;
        }


        public boolean ticket() {
            // String currentStationId=getCurrentStationId();
            boolean entryResult = boardingStationId.equals(getCurrentStationId());
            boolean exitResult = destinationStationId.equals(getCurrentStationId());
            return (entryResult && exitResult);
        }
        public String getCurrentStationId()
        {
            return currentStationId;
        }

public void makeChoice()
{
    System.out.println("Enter your choice index");
    System.out.println("1.Ticket   2.Metro Card");
    Scanner sc=new Scanner(System.in);
    int choice=sc.nextInt();
    if(choice == 1)
    {
        ticket();
    }
    else
        metroCard();

}


    public boolean metroCard()
    {

        if(availabeBalance >= 60) // 60 is the maximum fare
            return true;
        else
            return false;
    }
}
