public class MetroManagement {
    public static void main(String[] args) {
        System.out.println("Enter the Route Details");
        RouteDetails rd=new RouteDetails("BLUE LINE","RAIDURGAM","NAGOLE",50);
    rd.getRouteLine();
    TemperatureManagement driver_coach = new TemperatureManagement(36,45);
  driver_coach.manageTemperature();

       // System.out.println(rd.getDestination());
    }
}
