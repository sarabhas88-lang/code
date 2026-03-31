import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeEx {

	public static void main(String[] args) throws InterruptedException {
		try {
			FileInputStream ip = new FileInputStream("D:\\Demo.xlsx");
			} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread.sleep(1000);
		Thread.sleep(4000);
		
		
		System.out.println("end of program");
	}

}
