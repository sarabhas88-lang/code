package Overloading;

public class Parent {
	public void foodPlaza(String indianFood)
	{
		System.out.println("this is food plaza which servers Indian food : " + indianFood);
	}
	
	public void foodPlaza(String indiaFood, String petrolPump)
	{
		System.out.println("This food plaza servers indian food as well as it has petrol pump" + indiaFood + petrolPump);
	}

}
