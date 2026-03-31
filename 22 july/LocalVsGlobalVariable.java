
public class LocalVsGlobalVariable {

	//if a variable is created outside method :- Global variable
	
	int j=11;//global
	int i=33; //global
	
	public static void main(String[] args) {
		//if a variable is created inside method :- local variable
		String str="java";//local
		}

	public static void anyMethod()
	{
		double d=87.90;//local
	}
	
	public void foo()
	{
		System.out.println(j);//11
		System.out.println(i);//33
		int i=99;//local
		System.out.println(i);//99 (Priority will be given to local)
		
	//purposefully print the global variable
		System.out.println(this.i);//33
	}
	
}
