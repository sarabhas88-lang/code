package Overriding;

public class Test {

	public static void main(String[] args) {
		

	}

	public void quality()
	{
		System.out.println("you should alway buy the flat from reputed builder. So that quality will be good");
	}
	
	public void floorPlan()
	{
		System.out.println("big hall, big bedrooms, small kitchen, small bathroom");
	}
	
	//method overriding is not supported in same class
	//it will give an error, duplicate methods
	/*public void floorPlan()
	{
		System.out.println("no walls in between");
	}*/
	
	
}
