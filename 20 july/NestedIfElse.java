
public class NestedIfElse {

	public static void main(String[] args) {
		int i=99, j=77, k=44;
		if(i>j && i>k)
		{
			System.out.println("i is greater "+ i);
		}
		else if(j>i && j>k)
		{
			System.out.println("j is greater "+ j);
		}
		else
		{
			System.out.println("k is greater "+ k);
		}
	}

}
