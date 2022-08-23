package trainsearch;
public class Train{
	private String trainName;
	private String trainID;
	private String departureFromFirstStation;
	private String arrivalAtFinalStation;
	
	public Train(String n,String i,String d, String a){
        trainName=n;
        trainID=i;
        departureFromFirstStation= d;
        arrivalAtFinalStation= a;
	}
	public void setTrainName(String n){
		trainName=n;
	}
	public void setTrainId(String i){
		trainID=i;
	}
	public void setDepartureFromFirstStation(String d){
		departureFromFirstStation=d;
	}
    public void setArrivalAtFinalStation(String a){
		arrivalAtFinalStation= a;
	}

    public String getTrainName(){
		return trainName;
	}
	public String getTrainId(){
		return trainID;
	}
	public String getDepartureFromFirstStation(){
		return departureFromFirstStation;
	}
    public String getArrivalAtFinalStation(){
		return arrivalAtFinalStation;
	}
}
