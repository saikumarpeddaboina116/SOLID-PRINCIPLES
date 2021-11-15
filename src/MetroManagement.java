public class MetroManagement {
    public static void main(String[] args) {
       // System.out.println("Enter the Route Details");
        RouteDetails rd=new RouteDetails("BLUE LINE","RAIDURGAM","NAGOLE",50);
    rd.getRouteLine();
    TemperatureManagement driverCoach = new TemperatureManagementInDriverCoach();
  driverCoach.manageTemperature();
        TemperatureManagement passengerCoach = new TemperatureManagementInPassengerCoach(25,35);
        passengerCoach.manageTemperature();


        Access acc;
  acc=new Ticket(10,15,10);

  System.out.println(acc.hasAccess());
        acc= new MetroCard(100,200);

        System.out.println(acc.hasAccess());







    }
}
