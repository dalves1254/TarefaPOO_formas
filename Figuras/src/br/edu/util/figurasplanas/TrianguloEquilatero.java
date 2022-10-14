package br.edu.util.figurasplanas;
import java.util.Scanner;

public class TrianguloEquilatero {
	public double lado;
	public void calcArea() {
		Scanner sc = new Scanner(System.in);
		lado = sc.nextDouble();
		System.out.println("Área: " + (lado*lado*Math.sqrt(3)/4) + "\nPerímetro: " + lado*3);
	}
}