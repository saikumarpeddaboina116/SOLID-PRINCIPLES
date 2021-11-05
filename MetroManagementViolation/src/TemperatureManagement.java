import java.util.Scanner;

public class TemperatureManagement {
    // VOILATES OPEN FOR EXTENSION CLOSED FOR MODIFICATION
    private double currentTemperature;
    private double externalTemperature;
    private double minimumTemperature=17;
    private double maximumTemperature = 28;
    double finalTemperature;
    double actualTemperature,constantTemperature;
    TemperatureManagement()
    {
        System.out.println("Enter your choice index");
        System.out.println("1.Manage Coach Temperature   2.Manage Driver Coach Temperature");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice == 1)
        {
            setCoachTemperature();
        }
        else
            setDriverCoachTemperature();
    }
    TemperatureManagement(double currentTemperature,double externalTemperature)
    {
        this.currentTemperature=currentTemperature;
        this.externalTemperature=externalTemperature;
    }
    public double manageCoachTemperature()
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
public double manageDriverCoachTemperature()
{
    if (getExternalTemperature() > 35) {
        constantTemperature = 28;
    } else if (getExternalTemperature() < 20) {
        constantTemperature = 25;
    }
    return constantTemperature;
}
    public double setDriverCoachTemperature()
    {
        finalTemperature=manageDriverCoachTemperature();

        return finalTemperature;
    }
    public double setCoachTemperature()
    {

        finalTemperature=manageCoachTemperature();

        return finalTemperature;
    }
}
