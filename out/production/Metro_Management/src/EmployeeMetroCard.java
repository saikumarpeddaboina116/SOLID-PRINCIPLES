class EmployeeMetroCard extends MetroCard
{
    //OPEN FOR EXTENSION CLOSED FOR MODIFICATION
    String employeeName;
    int employeeId;
     EmployeeMetroCard(String employeeName, int employeeId)
    {
        this.employeeName=employeeName;
        this.employeeId=employeeId;
    }



    @Override
    public boolean entryAccess() {
        return true;
    }

    @Override
    public boolean exitAccess() {
        return true;
    }
}
