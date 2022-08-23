package trainsearch;
public class Station{
	private String name;
	private int ID;
	
    Station(String n,int id){
     name=n;
     ID=id;		
	}
	public void setName(String n){
		name=n;
	}
	public void setId(int id){
		ID=id;
	}
	
	
	public String getName(){
		return name;
	}
	public int getId(){
		return ID;
	}
}
