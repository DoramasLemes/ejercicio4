package com.cip.prog.mod3act4;
	
import java.util.Scanner;
	
public class ejercicio2 {
	
	public static void main(String[] arg) {
		int num;
		int resta;
		int Cel;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese los grados Fahrenheit que quiere convertir a Celsius : ");
			num = sc.nextInt();
		
		resta = num - 32;
		Cel = resta * 5/9;
		
		System.out.print(num + "º grados Fahrenheit son " + Cel + "º grados Celsius.");
		
		sc.close();
	}
}
