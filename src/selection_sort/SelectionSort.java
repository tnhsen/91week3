package selection_sort;

public class SelectionSort {
	
	public static void selectionsort(int array[], int amount) {
		
		int max ,temp;
		
		for(int i=0; i<amount; i++) {
			max = i;
			
			for(int j=i+1; j<amount; j++) {
				if(array[j] > array[max]) {
					max = j;
				}
			temp = array[i];
			array[i] = array[max];
			array[max] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {120, 60, 20, 80, 79, 30, 35};
		int amount = 7;
		
		System.out.print("Unsorted Array:[");
		for(int i=0; i<amount; i++) {
			System.out.print(a[i]);
			if(i<=5) {
				System.out.print(", ");
			}else if(i==6) {
				System.out.println("]");
			}
		}
		
		selectionsort(a,amount);
		
		System.out.print("Sorted Arrau in Ascending Order:[");
		for(int i=0; i<amount; i++) {
			System.out.print(a[i]);
			if(i<=5) {
				System.out.print(", ");
			}else if(i==6) {
				System.out.println("]");
			}
		}
		
		
		
	}

}
