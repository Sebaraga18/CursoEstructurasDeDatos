package LinearDataStructures;

import java.util.Scanner;
public class jingleComposing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String N=sc.nextLine();
		while(N!="*") {
		System.out.println(measurements(N));
		}
	}
	public static int measurements(String N) {
		int cont=0;
		String split[]=N.split("/");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		for (int i = 0; i < split.length; i++) {
			if(duration(split[i])==true)
				cont+=1;;
		}
		return cont;
	}
    private static boolean duration(String a) {
    	double w=1;
		double h=0.5;
		double q=0.25;
		double e=0.125;
		double s=0.0625;
		double t=0.03125;
		double x=0.015625;

    	 double aux=0;
    	for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i)=='W')
				aux+=w;
			if(a.charAt(i)=='H')
				aux+=h;
			if(a.charAt(i)=='Q')
				aux+=q;
			if(a.charAt(i)=='E')
				aux+=e;
			if(a.charAt(i)=='S')
				aux+=s;
			if(a.charAt(i)=='T')
				aux+=t;
			if(a.charAt(i)=='X')
				aux+=x;
	
		}if(aux!=1) {
			return false;
		}
		else return true;
    }
}
