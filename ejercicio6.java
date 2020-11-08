package com.cip.prog.mod3act4;
	
import java.util.Scanner;
import java.lang.Math;
	
public class ejercicio6 {
	
	public static void main(String[] arg) {
		double euros;
		double dolares;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese cantidad de euros : ");
			euros = sc.nextDouble();

		dolares = euros * 1.19;
		
		System.out.print(euros + " euros son " + dolares + " dolares");
		
		sc.close();
	}
}
