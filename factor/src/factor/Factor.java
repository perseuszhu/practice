package factor;

public class Factor {
	public static int factor(int n) {
		if (n==0||n==1)
		{
			return 1;
		}
		else
		{
			return factor(n-1)*n;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = factor(6);
		System.out.println(result);
	}

}
