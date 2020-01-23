package sortingCodes;

public class iterativeSorting {

	public static void bubbleSort(int[] a) {
	    boolean sorted = false;
	    int temp;
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] > a[i+1]) {
	            	sorted = false;
	                temp = a[i];
	                a[i] = a[i+1];
	                a[i+1] = temp;
	                
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {2,4,5,1,4,1,7,23,6,8};
bubbleSort(a);
for(int i =0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
	}

}


