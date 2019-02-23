
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class ordenamientos {
	public static void insertionSort(int [] a ) {
		int index, temp;
		for (int i = 1; i < a.length; i++) {
			index = i ; temp = a[i];
			while(index > 0 && temp < a[index - 1]) {
				a[index] = a[index-1];
				index -= 1;
			}
			a[index] = temp;
		}
	}
	public static void bubbleSort(int [] a) {
		int temp;
		boolean swapped = false;
		do {
			swapped = false;
			for (int i = 0; i < a.length-1; i++) {
				if(a[i] > a[i+1]) {
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					swapped = true;
				}
			}
		}
		while(swapped);
	}
	public static int[] mergeSort(int [] a) {
		int size = a.length;
		if(size > 1) {
			int size_par= size/2;
			int [] a_1 = new int[size_par];
			int [] a_2 = new int[size-size_par];
			for (int i = 0; i < size_par; i++) 
				a_1[i] = a[i];
			for (int i = size_par; i < size; i++) 
				a_2[i-size_par]=a[i];
			a_1 = mergeSort(a_1);
			a_2 = mergeSort(a_2);
			a = merge(a_1,a_2);
		}
		return a;
	}
	public static int[] merge(int[] a_1, int[] a_2) {
		int [] resp = new int [a_1.length + a_2.length ];
		int index_a1 = 0, index_a2 = 0, index = 0;
		while(index_a1 < a_1.length && index_a2 < a_2.length) {
			if(a_1[index_a1] < a_2[index_a2]) {
				resp[index]=a_1[index_a1];
				index +=1 ; index_a1 +=1;
			}
			else
			{
				resp[index] = a_2[index_a2];
				index +=1; index_a2 +=1;
			}
			if(index_a1 < a_1.length) {
				for (int i = index_a1; i < a_1.length; i++) {
					resp[index] = a_1[i];
					index +=1;
				}
			}else {
				for (int i = index_a2; i < a_2.length; i++) {
					resp[index] = a_2[i];
					index +=1;
				}
			}	
		}
		return resp;
	}	
	//	https://www.youtube.com/watch?v=0tG8G-aRmSU
	public static void quickSort(int a[], int left, int right) {
		int pivot = a[left];
		int i = left;
		int j = right;
		int aux;
		while (i < j) {
			while(a[i] <= pivot && i < j  ) {
				i++;
			}
			while(a[j]>pivot) {
				j--;
			}
			if(i < j) {
				aux = a[i];
				a[i] = a[j];
				a[j] = aux;
			}
		}
		a[left] = a[j];
		a[j] = pivot;
		if(left < j-1) 
			quickSort(a, left, j-1);
		if(j+1 < right)
			quickSort(a, j+1, right);
	}
	public static int binarySearch(int [] array, int value, int lowerBound , int upperBound) {
		int index = -1;
		int middle = (lowerBound + upperBound) /2;
		if(lowerBound > upperBound )
			index = -1;
		else
			
		if(array[middle] == value)
			index = middle;
		else
			if(value < array[middle])
				index = binarySearch(array, value, lowerBound, middle-1);
			else
				index = binarySearch(array, value, middle+1, upperBound);
			
		
		return index;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		Random al = new Random();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		System.out.println("Defina la cantidad de valores en el arreglo");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Ingrese la cantidad de veces a probar el metodo");
		int j = Integer.parseInt(br.readLine());

		int[] a = new int[n];
		FileWriter fw = new FileWriter("SAVE.TXT");
		while (j != 0) {
			// Fill array, random numbers between 1-100
			for (int i = 0; i < a.length; i++) {
				a[i] = 1 + al.nextInt(100);
			}

			long startTime = System.nanoTime();
			binarySearch(a, 20, 0, a.length-1);
			long endTime = System.nanoTime();
			System.out.println("Se demoro en organizar  " + (endTime - startTime)  + " NanoSegundos");
			String str = "Se demoro en organizar  " + (endTime - startTime)  + " NanoSegundos";
			fw.write("\n"+str);
			j--;
		}
		fw.close();
	}
}


