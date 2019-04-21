package LinearDataStructures;

import java.util.Scanner;

public class Parenthesis_Balance_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String N=sc.nextLine();

	}
	public static String isCorrect (String N) {
		int cont1=0;
		int cont2=0;
		for (int i = 0; i < N.length(); i++) {
			if (N.charAt(i)=='(') {
				cont1++;
			}
			if (N.charAt(i)==')') {
				cont2++;
			}
		
		}
		if(cont1==cont2) {
			return "correct";}
		else {
			return "incorrect";
		}
		
	}

}