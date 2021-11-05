import java.util.ArrayList;

public class EmployeeAccess extends Access
{
    //VOILATES DEPENDENCY INVERSION AND LISKOV SUBSTITUTION PRINCIPLES
    String employeeName;
    int employeeId;
    ArrayList<Integer> idList = new ArrayList<Integer>();

    public void setIdList() {
        idList.add(101);
        idList.add(201);
        this.idList = idList;
    }

    public boolean isEmployee()
    {
        if(idList.contains(employeeId))
            return true;
        else return false;
    }
    EmployeeAccess(String boardingStation, String destinationStation, String currentStationId) {
        super(boardingStation, destinationStation, currentStationId);
    }

    @Override
    public boolean metroCard() {
        return super.metroCard();
    }
    public boolean accessCard()
    {
        if(isEmployee())
            return true;
        else
            return false;

    }
}
