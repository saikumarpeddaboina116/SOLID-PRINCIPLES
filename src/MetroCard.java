public class MetroCard  extends Access
{    //SUBCLASS
    //OPEN FOR EXTENSION CLOSED FOR MODIFICATION
    int cardId;
    int availabeBalance;
    MetroCard(int cardId,int availabeBalance)
    {
        this.cardId=cardId;
        this.availabeBalance=availabeBalance;
    }

    public boolean checkBalance()
    {
        if(availabeBalance >= 60) // 60 is the maximum fare
            return true;
        else
            return false;
    }         //DEPENDENCY INVERSION
      public boolean entryAccess() {
        return (checkBalance() &&  true);
    }
    public boolean exitAccess() {
        return (checkBalance() && true);
    }

}
