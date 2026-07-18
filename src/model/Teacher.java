package model;

 public class Teacher extends Users{
	
	public Teacher(int id, String name){
		super(id, name);		
	}
	
	@Override
	public int getLoanLimit(){
	return 8;
	}
	@Override
	public int getDueDays() {
	return 15;
	}
	
 }