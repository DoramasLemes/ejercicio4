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
		
		System.out.print(num + "� grados Fahrenheit son " + Cel + "� grados Celsius.");
		
		sc.close();
	}
}
