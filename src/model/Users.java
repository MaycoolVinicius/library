package model; //package model sempre no topo


//classe abstrata
public abstract class Users{
	private int id;
	private String name;
	
	public Users(int id, String name){
	this.id = id;
	this.name = name;
	}
	
	abstract int getLoanLimit();
	abstract int getDueDays();
	
	public int getId(){
	return id;
	}
	
	public String getName(){
	return name;
	}
	
	public void setName(String name){
	this.name = name;
	}
	
	
	
}