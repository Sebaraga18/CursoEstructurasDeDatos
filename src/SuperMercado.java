import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperMercado {
	public static  final String [] superMercado =  {"Huevos","Leche","Arroz","Carne","Pasta","Frijoles","Lentejas"};
	public static final double [] precios = {250,2500,1700,3000,7000,3500,2000};
	public static void main(String[] args) throws IOException {
		BufferedReader tec = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese la cantidad del dinero para el mercado");
		String comprar = tec.readLine();
		double presupuesto = Double.parseDouble(comprar);
		for (int i = 0; i < superMercado.length; i++) {
			System.out.println(superMercado[i]+ " = $" + precios[i]);
			
		}
	}



}
