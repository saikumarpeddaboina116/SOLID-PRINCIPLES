public class Access {
    //DEPENDENCY INVERSION
    Access(){

    }
TicketAccess tktAcc;
Access(TicketAccess obj)
{
    this.tktAcc= (TicketAccess) obj;
}
boolean hasAccess()
{
    return (this.tktAcc.entryAccess() && this.tktAcc.exitAccess());
}
}

