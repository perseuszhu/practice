package bubblesort;

public class Bubblesort1 {

	public static void sort(int [] a,int n) {
		int i, j;
		
		for (i = 0; i<n; i++) {
			for (j = 1; j<n-i; j++) {
				if(a[j-1] > a[j]) {
					int temp;
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;		
				}
			}
		}
	}
			
	public static void main(String[] args) {
		
		int[] a = {0,-20,-40,-30,6,60,45,13,27,24,78,56,32,406,65};
		Bubblesort1.sort(a, a.length);
		for(int i : a) {
			System.out.print(i+",");
		}
	

	}

}
