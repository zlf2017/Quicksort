package apackage;


public class QuickSort {

	public static void main(String[] args) {
		int[] arr= {9,6,7,8,1,0,6,7,3,54,2,32,10};
		sort(arr, 0, arr.length-1);
		for(int i:arr)
			System.out.print(" "+ i);
	}
	private static void sort(int[] arr,int low,int high) {
		if(low >= high)
			return;
		int l=low;
		int h=high;
		int key=arr[low];
		while(l<h) {
			while(l<h&&arr[h]>key)
				h--;
			if(l<h) {
				swap(arr,l,h);
				l++;
			}
			while(l<h&&arr[l]<key)
				l++;
			if(l<h) {
				swap(arr,l,h);
				h--;
			}
		}
		if(l>low)
			sort(arr, low, l-1);
		if(h<high)
			sort(arr, l+1, high);
	}
	private static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
