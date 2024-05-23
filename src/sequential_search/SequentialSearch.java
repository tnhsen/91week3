package sequential_search;

import java.util.*;

public class SequentialSearch {
	
	public static int sequentialsearch(int array[],int id){
		int found = 0, index = -1;
		int i=0,size = array.length;
		
		while(i<size && found!=1) {
			if(id == array[i]) {
				found = 1;
				index = i;
			}else {
				i++;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10001, 10022, 10060, 11255, 15022, 20001, 21002, 23003, 25566, 30078, 40000, 50012, 66006};
		
		Scanner input = new Scanner(System.in);
		System.out.print("ID : ");
		int id = input.nextInt();
		
		if(sequentialsearch(a,id)==-1) {
			System.out.print("Not Found!");
		}else {
			System.out.print("Found at A[" + sequentialsearch(a,id) + "]");
		}
		

	}

}
