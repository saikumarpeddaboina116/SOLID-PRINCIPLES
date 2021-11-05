public class MetroCard implements TicketAccess
{
    //OPEN FOR EXTENSION CLOSED FOR MODIFICATION
    int cardId;
    int availabeBalance;
    MetroCard(int cardId,int availabeBalance)
    {
        this.cardId=cardId;
        this.availabeBalance=availabeBalance;
    }

    public MetroCard() {
    }


    public boolean checkBalance()
    {
        if(availabeBalance >= 60) // 60 is the maximum fare
            return true;
        else
            return false;
    }

    //DEPENDENCY INVERSION
    @Override
    public boolean entryAccess() {
        return (checkBalance() && true);
    }

    @Override
    public boolean exitAccess() {
        return (checkBalance() && true);
    }

}
