
public class RunTimeEx {

	public static void main(String[] args) {
		int[] arr= {10,20,30};
		
		try
		{
			System.out.println(arr[0]/0);
			System.out.println(arr[4]);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("close your brower or close your db connection");
		}
	}

}
