package br.edu.util.figurasplanas;
import java.util.Scanner;

public class Paralelogramo {
	public double b, h;
	public void calcArea() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Base: ");
		b = sc.nextDouble();
		System.out.print("Altura: ");
		h = sc.nextDouble();
		System.out.println("�rea: " + b*h);
	}
}
