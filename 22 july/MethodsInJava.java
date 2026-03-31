
public class MethodsInJava {

	public static void main(String[] args) {
		
		int sum1 =add(87,90);//method call	
		System.out.println(sum1);
		
		int sum2 =add(876,453);//method call
		System.out.println(sum2);
	}
	
	public static int add(int i, int j)
	{
		int result;
		result=i+j;
		return result;
	}
	
}
