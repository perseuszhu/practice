package fibonacci;

public class Fibo {
	public static int item(int n) {
		if ( n == 1 || n ==2 ) {
			return 1;
		}
		else {
			return item(n-1)+item(n-2);
		}
	}
	
	public static void main(String[] args) {
	System.out.println(item(6));

	}

}
