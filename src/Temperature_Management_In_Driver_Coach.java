public class Temperature_Management_In_Driver_Coach extends TemperatureManagement {
    //LISKOV SUBSTITUTION PRINCIPLE
    private double constantTemperature;
    private double finalTemperature;

    Temperature_Management_In_Driver_Coach(double currentTemperature, double externalTemperature) {
        super(currentTemperature, externalTemperature);
    }

    @Override
    public double manageTemperature() {
        if (super.getExternalTemperature() > 35) {
            constantTemperature = 28;
        } else if (super.getExternalTemperature() < 20) {
            constantTemperature = 25;
        }
        return constantTemperature;
    }

    public double getTemperature() {
        finalTemperature = this.manageTemperature();
        return finalTemperature;
    }
}