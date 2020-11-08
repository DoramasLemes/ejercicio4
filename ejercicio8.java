package com.cip.prog.mod3act4;
	
import java.util.Scanner;
	
public class ejercicio8 {
	
	public static void main(String[] arg) {
		int hora;
		int cantidad;
		int suma;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hora actual : ");
			hora = sc.nextInt();
		System.out.print("Cantidad de horas : ");
			cantidad = sc.nextInt();
		
		suma = (hora + cantidad) % 12;
		
		System.out.print("En " + cantidad + " horas, el reloj marcara las " + suma);
		
		sc.close();
	}
}
