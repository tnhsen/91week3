package buble_sort;

import java.util.*;

public class BubleSort {
	
	public static void bublesort(int array[], int amount) {
		int hold;
		int i;
		for(int pass=1; pass<=amount; pass++) {
			for(i=0; i<=amount-2; i++) {
				if(array[i]<array[i+1]) {
					hold = array[i];
					array[i] = array[i+1];
					array[i+1] = hold;
				}
			}
		}
		System.out.println("\nSorted list of numbers:");
		for(i=0; i<amount; i++) {
			int index = i+1;
			System.out.println("Data " + index +": " + array[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input number of integers to sort: ");
		int number = input.nextInt();
		int a[] = new int[number];
		System.out.println("Enter " + number + " integers");
		for(int i=0; i<number; i++) {
			int index = i+1;
			System.out.print("Enter " + index +": ");
			int in = input.nextInt();
			a[i] = in;
		}
		
		bublesort(a, number);
		

	}

}
