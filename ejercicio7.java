package com.cip.prog.mod3act4;
	
import java.util.Scanner;
	
public class ejercicio7 {
	
	public static void main(String[] arg) {
		int num1, num2, num3;
		float media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el primer n�mero : ");
			num1 = sc.nextInt();
		System.out.print("Ingrese el primer n�mero : ");
			num2 = sc.nextInt();
		System.out.print("Ingrese el primer n�mero : ");
			num3 = sc.nextInt();

		media = (num1 + num2 + num3) / 3;
		
		System.out.print("La media de los 3 n�meros introducidos es : " + media);
		
		sc.close();
	}
}
