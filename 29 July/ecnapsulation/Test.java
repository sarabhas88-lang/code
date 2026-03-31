package Encapsulation;

public class Test {

	public static void main(String[] args) {
		Account a1= new Account();
		
		System.out.println(a1.getAccountBalance());
		a1.setAccountBalance(5000);
		System.out.println(a1.getAccountBalance());//check whether balance is added or not
		

	}

}
