import java.util.Scanner;

public class Algoritmos {
private int i;
	Scanner tec = new Scanner(System.in);
	public void ventas(int dinero, int [] precios) {
		dinero = tec.nextInt();
		precios = new int [20];
		for (int i = 0; i < precios.length; i++) {
			precios [i] = i * 1000 + 300;
			while(dinero > precios[i] ) {
				if(precios[i] < dinero)
					dinero = dinero - precios[i];
			}
			System.out.println("No tienes mas dinero");
		}
	}

	public static void main(String[] args) {
	
		
	}
}
