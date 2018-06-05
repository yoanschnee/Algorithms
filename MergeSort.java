
package mergesort;

public class MergeSort {
	static int[] arr = {1, 6, 2, 7, 3, 4, 10, 9, 8};
	static int[] aux = new int[arr.length];
	
	// main
	public static void main(String[] args) {
		sort(arr, aux, 0, arr.length-1);
		for (int k=0; k<arr.length; k++) {
			System.out.println(arr[k]);
		};
	}
	
	// merge the two sorted parts a[lo:mid] and a[mid+1:hi] of a in growing order
	public static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
		for (int l=lo; l<=hi; l++) {
			aux[l] = a[l];
		}

		int i=lo;
		int j=mid+1;
		
		for (int k=lo; k<=hi; k++) {
			if (j > hi) a[k]=aux[i++];
			else if (i > mid) a[k]=aux[j++];
			else if (aux[i]<aux[j]) a[k]=aux[i++];
			else a[k]=aux[j++];
		}
	}
	// divide and conquer recursion to sort elements of array a
	public static void sort(int[] a, int[] aux, int lo, int hi) {
		if (hi<=lo) return;
		int mid = (lo + (hi-lo)/2);
		sort(a, aux, lo, mid);
		sort(a, aux, mid+1, hi);
		merge(a, aux, lo, mid, hi);
	}

}
