package com.cip.prog.mod3act4;
	
import java.util.Scanner;
import java.lang.Math;
	
public class ejercicio10 {
	
	public static void main(String[] arg) {
		float numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
			numero = sc.nextFloat();
		
		System.out.print(Math.round(numero));
		
		sc.close();
	}
}
