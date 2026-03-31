package Overloading;

public class Child extends Parent{

	public static void main(String[] args) {
		Child c1 = new Child();
		c1.foodPlaza("paneer butter masala");
		c1.foodPlaza("daal makhani", "shell petrol pump");
		c1.foodPlaza(500, "clean washroom");
		
	}
	
	public void foodPlaza(int toll, String washroom)
	{
		System.out.println("this foodplaza has toll booth & it has washroom too");
	}
}
