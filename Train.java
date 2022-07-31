public class Train{
	private String name;
	private String ID;
	private Station stationName;
	
	Train(String n,String i,String s){
    this.name=n;
    this.ID=i;
    this.stationName=s;		
	}
	public void setName(String n){
		name=n;
	}
	public void setId(String i){
		ID=i;
	}
	public void setStationname(Station s){
		stationname=s;
	}
	
	public String getName(){
		return name;
	}
	public String getId(){
		return ID;
	}
	public Station getStationname(){
		return stationName;
	}
}
