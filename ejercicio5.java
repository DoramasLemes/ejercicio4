package com.cip.prog.mod3act4;
	
import java.util.Scanner;
import java.lang.Math;
	
public class ejercicio5 {
	
	public static void main(String[] arg) {
		double area;
		double radio;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el radio del c�rculo : ");
			radio = sc.nextFloat();

		area = Math.PI * Math.pow(radio, 2);
		
		System.out.print("El �rea del circulo es : " + area);
		
		sc.close();
	}
}
