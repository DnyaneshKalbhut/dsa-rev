package sorting;

import java.util.Arrays;

public class bubblesort {


	
	public static void bubbleSorrt(int [] arr) {
		
		for(int i = 0 ; i< arr.length ; i ++) {
			for(int j = 0; j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	public static void SelectionSort(int [] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			int smallestIdx= i;
			for (int j = i + 1; j < arr.length ; j++) {
				if(arr[j]<arr[smallestIdx]) {
					smallestIdx=j;
				}
			}
			
			int temp = arr[smallestIdx];
			arr[smallestIdx]=arr[i];
			arr[i]=temp;
		}
	}
	
	public static void InsertionSort(int [] arr ) {
		for (int i = 1; i < arr.length; i++) {
			int curr = arr[i];
			int prev = i-1; 
			
			while(prev>=0 && arr[prev]>curr) {
				arr[prev+1]=arr[prev];
				prev--;
				
			}
			
			arr[prev+1]=curr;
			
		}
	}
	
	
	public static void main(String[] args) {
	
		int [] arr = {5,4,3,2,1};
		
		InsertionSort(arr);

         System.out.println(Arrays.toString(arr));
         

}
	
}
