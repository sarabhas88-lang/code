package Overriding;

public class Customer extends Builder {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.quality();
		c1.floorPlan();

	}

	public void floorPlan()
	{
		System.out.println("big hall, big kitchen, big bathroom, small bedroom");
	}
}
