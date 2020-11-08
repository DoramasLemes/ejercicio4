package com.cip.prog.mod3act4;
	
import java.util.Scanner;
	
public class ejercicio1 {
	
	public static void main(String[] arg) {
		int num;
		int Fah;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese los grados Celsius que quiere convertir a Fahrenheit : ");
			num = sc.nextInt();
		
		Fah = num * (9/5) + 32;
		
		System.out.print(num + "º grados Celsius son " + Fah + "º grados Fahrenheit.");
		
		sc.close();
	}
}
