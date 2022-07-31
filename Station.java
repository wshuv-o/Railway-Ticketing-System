public class Station{
	private String name;
	private String ID;
	
  Train(String n,String id){
     name=n;
     ID=id;		
	}
	public void setName(String n){
		name=n;
	}
	public void setId(String id){
		ID=id;
	}
	
	public String getName(){
		return name;
	}
	public String getId(){
		return ID;
	}
}
