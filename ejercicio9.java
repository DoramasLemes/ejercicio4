package com.cip.prog.mod3act4;
	
import java.util.Scanner;
import java.lang.Math;
	
public class ejercicio9 {
	
	public static void main(String[] arg) {
		float numero;
		float decimal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese un numero: ");
			numero = sc.nextFloat();
		
		decimal = numero % 1;
		
		System.out.print(Math.abs(decimal));
		
		sc.close();
	}
}
