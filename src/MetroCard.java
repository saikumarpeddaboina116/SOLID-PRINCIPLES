public class MetroCard  extends Access implements MetroCardAccess
{
    //OPEN FOR EXTENSION CLOSED FOR MODIFICATION
    int cardId;
    int availabeBalance;
    MetroCard(int cardId,int availabeBalance)
    {
        this.cardId=cardId;
        this.availabeBalance=availabeBalance;
    }
@Override
    public boolean checkBalance()
    {
        if(availabeBalance >= 60) // 60 is the maximum fare
            return true;
        else
            return false;
    }
    //DEPENDENCY INVERSION
    Access tktAccess=new Ticket();

    public boolean entryAccess() {

        return (checkBalance() &&  tktAcc.entryAccess());
    }
    public boolean exitAccess() {
        return (checkBalance() && tktAcc.exitAccess());
    }

}
