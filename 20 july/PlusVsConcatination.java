
public class PlusVsConcatination {

	public static void main(String[] args) {
		System.out.println(10+20);//30
		System.out.println("10+20");//10+20
		System.out.println(10+20+"abc");//30abc
		System.out.println("abc"+10+20);//abc1020
		
		int i=11;
		int j=44;
		String str="xyz";
		System.out.println(i+j);//55
		System.out.println(i+j+str);//55xyz
		System.out.println(i+str+j+99);//11xyz4499

	}

}
