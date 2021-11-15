public class MetroManagement {
    public static void main(String[] args) {
       // System.out.println("Enter the Route Details");
        RouteDetails rd=new RouteDetails("BLUE LINE","RAIDURGAM","NAGOLE",50);
    rd.getRouteLine();
    TemperatureManagement driverCoach = new TemperatureManagementInDriverCoach();
  driverCoach.manageTemperature();

        TicketAccess obj;
        Access acc;
  obj=new Ticket(10,15,10);
  acc=new Access(obj);
  System.out.println(acc.hasAccess());
  obj= (TicketAccess) new MetroCard(100,200);
  acc=new Access(obj);
        System.out.println(acc.hasAccess());







    }
}
