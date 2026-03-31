
public class OneDarray {

	public static void main(String[] args) {
		//create the array with 3 boxes and put the data, also print the value
		//creating an array
		int arr[] = new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		
		System.out.println(arr[1]);
		System.out.println(arr[0]);
		
		//printing entire array
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i]);//arr[2]
		}
		
		//printing entire array dynamically
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
