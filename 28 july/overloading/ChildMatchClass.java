package Overloading;

public class ChildMatchClass extends Mathclass{

	public static void main(String[] args) {
		ChildMatchClass c1 = new ChildMatchClass();
		c1.add(77, 99);
		c1.add(87, 67, 54);

	}

	public void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
}
