package br.edu.util.figurasplanas;
import java.util.Scanner;

public class Quadrado {
	public double lado;
	public void calcArea() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Lado: ");
		lado = sc.nextDouble();
		System.out.println("Área: " + lado*lado + "\nPerímetro: " + lado*4);
	}
}