package br.edu.util.figurasplanas;
import java.util.Scanner;

public class Circulo {
	public double r;
	public void calcArea() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Raio: ");
		r = sc.nextDouble();
		System.out.println("�rea: " + 3.1415*r*r + "\nPer�metro: " + 2*3.1415*r);
	}
}