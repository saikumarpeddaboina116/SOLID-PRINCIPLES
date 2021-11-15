public class Access {
    //DEPENDENCY INVERSION
TicketAccess tktAcc;
Access()
{

}
Access(TicketAccess obj)
{
    this.tktAcc= (TicketAccess) obj;
}
boolean hasAccess()
{
    return (this.tktAcc.entryAccess() && this.tktAcc.exitAccess());
}
}
