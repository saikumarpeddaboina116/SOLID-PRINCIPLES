public class RouteDetails {
    // SATISFIES SINGLE CLASS RESPONSIBILITY
    private String routeLine;
    private String source;
    private String destination;
    private int journeyDurationInMints;
    protected int currentStationId=1;
    RouteDetails(String routeLine,String source,String destination,int journeyDurationInMints)
    {
        this.routeLine=routeLine;
        this.source=source;
        this.destination=destination;
        this.journeyDurationInMints=journeyDurationInMints;
    }
    public String getRouteLine()
    {

        return routeLine;
    }
    public String getSource()
    {
        return source;
    }
    public String getDestination()
    {
        return destination;
    }
    public int getJourneyDurationInMints()
    {
        return journeyDurationInMints;
    }
    public int getCurrentStationId()
    {
        return currentStationId;
    }

}
