
public class TwoDarray {

	public static void main(String[] args) {
		int arr[][]= new int[3][2];
		arr[0][0]=10;
		arr[0][1]=20;
		
		arr[1][0]=30;
		arr[1][1]=40;
		
		arr[2][0]=50;
		arr[2][1]=60;
		
		System.out.println(arr[1][0]);
		System.out.println(arr[2][1]);
		
		//print entire 2D array
		/*for(int i=0;i<3;i++)//rows
		{
			for(int j=0;j<2;j++)//columns
			{
				System.out.println(arr[i][j]);
			}
		}*/
		
		//for 2 d array : arr.length => total no of rows
		//                arr[0].length => total no of columns
		for(int i=0;i<arr.length;i++)//rows
		{
			for(int j=0;j<arr[0].length;j++)//columns
			{
				System.out.println(arr[i][j]);
			}
		}
	}

}
