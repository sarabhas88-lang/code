import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		List<String> arr = new ArrayList();
		arr.add("abc");
		arr.add("xyz");
		arr.add("rtw");
		
	//	System.out.println(arr.get(0));
	//	System.out.println(arr.get(2));
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		
	}

}
