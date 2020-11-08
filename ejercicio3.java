package com.cip.prog.mod3act4;
	
import java.util.Scanner;
	
public class ejercicio3 {
	
	public static void main(String[] arg) {
		int radio;
		int diametro;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el diámetro de la esfera : ");
			diametro = sc.nextInt();
		
		radio = diametro / 2;
		
		System.out.print("El radio de la esfera es : " + radio);
		
		sc.close();
	}
}
