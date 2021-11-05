import java.util.*;
public class TemperatureManagement {
//OPEN FOR EXTENSION CLOSED FOR MODIFICATION
    private double currentTemperature;
    private double externalTemperature;
    private double minimumTemperature=17;
    private double maximumTemperature = 28;
    double finalTemperature;
    double actualTemperature;
TemperatureManagement(double currentTemperature,double externalTemperature)
{
    this.currentTemperature=currentTemperature;
    this.externalTemperature=externalTemperature;
}
    public double manageTemperature()
    {

        if(currentTemperature >= maximumTemperature)
        {
            actualTemperature=maximumTemperature - 7;
        }
        else if( currentTemperature <= minimumTemperature)
        {
            actualTemperature=minimumTemperature + 7;
        }
        else
        {
           actualTemperature=currentTemperature;
        }
        System.out.println(actualTemperature);
        return actualTemperature;
    }
    public double getCurrentTemperature()
    {
        return currentTemperature;
    }
    public double getExternalTemperature()
    {
        return externalTemperature;
    }
    public double setTemperature()
    {

        finalTemperature=manageTemperature();

        return finalTemperature;
    }



}
