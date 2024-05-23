package binary_search;

import java.util.*;

public class BianrySearch {
	
	public static void binarysearch(int array[], int id) {
		int found=0,index=-1;
		int first =0;
		int last = array.length - 1;
		int mid;
		
		while(first <= last && found == 0) {
			mid = (first + last)/2;
			System.out.println("first : " + first + "\t" + "last : " + last);
			if(first == last) {
				found = -1;
			}
			if(id == array[mid]) {
				found = 1;
				index = mid;
				break;
			}else {
				if(id < array[mid]) {
					last = mid-1;
				}else {
					first = mid+1;
				}
			}
			
			
		}
		if(found == -1) {
			System.out.print("Not Found!");
		}else if(found == 1) {
			System.out.print("Found at Number[" + index + "] : " + id);
		}
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int number[] = {00000, 11111, 22222, 33333, 44444, 55555, 66666,77777, 88888, 99999};
		
		System.out.print("Search ID : ");
		int id = input.nextInt();
		
		binarysearch(number,id);

	}

}
