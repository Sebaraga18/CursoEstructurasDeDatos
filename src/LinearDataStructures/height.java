package LinearDataStructures;

import java.util.Scanner;

import java.util.Scanner;
public class height {

	public static void main(String[] args) {
			
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for (int i = 0; i < a; i++) {
			int b=sc.nextInt();
			int c[]=new int[b];
			fillArray(c);
			int [] d=mergeSort(c);
			for (int k = 0; k < d.length; k++) {
				System.out.print(d[k]+" ");
			}
				
		}
		
		
	}public static void fillArray(int a[]) {
		Scanner sc=new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
	}
		public static int[] mergeSort(int[] unsortedArray)
		{
			if(unsortedArray.length > 1) //Condition to end recursive: If array is of size equal to 1, no more calls are necessary
			{
				int n = unsortedArray.length / 2; 
				int[] array_left = new int[n]; //Create array of the left side
				int[] array_right = new int[unsortedArray.length - n]; //Create array of the right side 
				
				for(int i = 0; i < n; i++) //Copy first half of the array inside left array
					array_left[i] = unsortedArray[i]; //Copy data
				
				for(int i = 0; i < array_right.length; i++) //Copy second half of the array inside right array
					array_right[i] = unsortedArray[n + i]; //Copy data
				
				array_left = mergeSort(array_left); //Call recursive to order array of left size
				array_right = mergeSort(array_right); //Call recursive to order array of left size
				
				return merge(array_left, array_right); //Merge order arrays of both left and right size
			}
			else
			{
				return unsortedArray; //Return array if his size is 1 
			}
		}
		
		
		/**
		 * 
		 * @param array_left
		 * @param array_right
		 * @return
		 */
		public static int[] merge(int[] array_left, int[] array_right)
		{
			int[]temp = new int[array_left.length + array_right.length]; //Create array of complete size, i.e. size of left array plus size of right array
			int left = 0, right = 0, index = 0; //Index for: left array, right array, and temp array. All must start in zero.
			
			while(left < array_left.length && right < array_right.length) //While are still elements inside left array or right array, we can made comparisons
			{
				if(array_left[left] <= array_right[right]) //If element in left array is minor or equal to element in right array
				{
					temp[index] = array_left[left]; //Add element of left array
					left += 1; //Because we add an element of left array, index that control left array must increase
				}
				else
				{
					temp[index] = array_right[right]; //Add element of right array
					right += 1; //Because we add an element of right array, index that control right array must increase
				}
				
				index += 1; //Increase index of complete array
			}
			
			if(left < array_left.length) //If there are still element in left array
				for(int i = left; i < array_left.length; i++) //Add all elements of left array
				{
					temp[index] = array_left[left]; //Add element
					left += 1; //Increase index over left array
					index += 1; //Increase index over complete array
				}	
			else //If there are still element in left array
				for(int i = right; i < array_right.length; i++) //Add all elements of right array
				{
					temp[index] = array_right[right]; //Add element
					right += 1; //Increase index over right array
					index += 1;  //Increase index over complete array
				}	
			
			return temp; //Return complete array 
		}
		
			
		}


