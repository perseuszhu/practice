package bubblesort;

public class Bubblesort2 {
	public static void sort(int [] a,int n) {
		int j, k = n;
		boolean flag;
		flag = true;
		
		while(flag) {
		flag = false;
		for (j = 1; j<k; j++) {
				if(a[j-1] > a[j]) {
					int temp;
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
					
					flag = true;
				}
			}
		k--;
		}
	}
			
	public static void main(String[] args) {
		
		int[] a = {0,-32,-78,-45,5,34,45,13,27,42,78,56,32,56,56};
		Bubblesort2.sort(a, a.length);
		for(int i : a) {
			System.out.print(i+",");
		}
	

	}

}


