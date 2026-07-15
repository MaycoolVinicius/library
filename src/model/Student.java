package model;

public class Student extends Users{
	
	public Student(int id, String name) { 
		super(id, name);
	}
	@Override
	public int getLoanLimit(){
	return 3;
	}
	@Override
	public int getDueDays() {
	return 7;
	}
}