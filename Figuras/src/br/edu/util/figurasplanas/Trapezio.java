package br.edu.util.figurasplanas;
import java.util.Scanner;

public class Trapezio {
	public double B, b, h;
	public void calcArea() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Base maior: ");
		B = sc.nextDouble();
		System.out.print("Base menor: ");
		b = sc.nextDouble();
		System.out.print("Altura: ");
		h = sc.nextDouble();
		System.out.println("Área: " + ((B+b)*h/2));
	}
}