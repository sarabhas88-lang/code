
public class Car {

	String brand;
	String model;
	static int wheels=4;
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.brand="Maruti";
		c1.model="wagonR";
		
		
				
	Car c2 = new Car();
	c2.brand="Hyundai";
	c2.model="verna";
	
	
	System.out.println(c1.wheels);//4
	c1.wheels=6;
	System.out.println(c1.wheels);//6
	System.out.println(c2.wheels);//6
	
	c2.wheels=3;
	System.out.println(c1.wheels);//3
	System.out.println(c2.wheels);//3
	
	
	
	
	}

	public void foo()
	{
		System.out.println("this is foo method");
	}
}
