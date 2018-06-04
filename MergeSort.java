
public class MergeSort {
	public static void main(String[] args){
		
	}
	public static void merge(int[] a, int[] aux, int lo, int mid, int hi){
		// copy array a in aux
		for (int k=0; k<hi; k++) {
			aux[k] = a[k];
		};
		
		// merge elements from two sorted array in growing order
		int i=lo;
		int j=mid+1;
		for (int k=lo; k<hi; k++) {
			if (i > mid) 		a[k]=aux[j++];
			else if (j > hi) 	a[k]=aux[i++];
			else if (aux[i] < aux[j]) a[k]=aux[i++];
			else 				a[k]=aux[j++];
		}
		
	}
	
	public static void sort(int[] a, int[] aux, int lo, int hi) {
		
		if (hi<=lo) return; 
		// divide and conquer
		int mid = lo + (lo - hi)/2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid+1, hi);
		merge(a, aux, lo, mid, hi);
	
	}
	
	
	
}
