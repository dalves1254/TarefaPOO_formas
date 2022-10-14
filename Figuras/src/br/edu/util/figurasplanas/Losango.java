package br.edu.util.figurasplanas;
import java.util.Scanner;

public class Losango {
	public double D, d;
	public void calcArea() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Diagonal 1: ");
		D = sc.nextDouble();
		System.out.print("Diagonal 2: ");
		d = sc.nextDouble();
		System.out.println("Área: " + D*d/2 + "\nPerímetro: " + (D+d)*2);
	}
}