
package mergesort;

public class MergeSort {
	static int[] arr = {1, 6, 2, 7, 3, 4, 10, 9, 8};
	static int[] aux = new int[arr.length];
	
	public static void main(String[] args) {
		sort(arr, aux, 0, arr.length-1);
		for (int k=0; k<arr.length; k++) {
			System.out.println(arr[k]);
		};
	}

	public static void merge(int[] a, int[] aux, int lo, int mid, int hi) {
		for (int l=lo; l<=hi; l++) {
			aux[l] = a[l];
			System.out.println("l=" + l + " aux[l]:" + aux[l]);
		}

		int i=lo;
		int j=mid+1;
		
		for (int k=lo; k<=hi; k++) {
			if (j > hi) a[k]=aux[i++];
			else if (i > mid) a[k]=aux[j++];
			else if (aux[i]<aux[j]) a[k]=aux[i++];
			else a[k]=aux[j++];
			System.out.println("k=" + k + " a[k]:" + a[k]);
		}
	}

	public static void sort(int[] a, int[] aux, int lo, int hi) {
		if (hi<=lo) return;
		int mid = (lo + (hi-lo)/2);
		System.out.println("lo:" + lo + "  hi:" + hi + "  mid:" + mid);
		sort(a, aux, lo, mid);
		sort(a, aux, mid+1, hi);
		merge(a, aux, lo, mid, hi);
	}

}
