package br.edu.util.figurasplanas;
import java.util.Scanner;

public class Circulo {
	public double r;
	public void calcArea() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Raio: ");
		r = sc.nextDouble();
		System.out.println("Área: " + 3.1415*r*r + "\nPerímetro: " + 2*3.1415*r);
	}
}