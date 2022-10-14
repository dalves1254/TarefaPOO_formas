package br.edu.util.figurasespaciais;
import java.util.Scanner;

public class Cilindro {
	public double r, h;
	public void calcVolume() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Raio: ");
		r = sc.nextDouble();
		System.out.print("Altura: ");
		h = sc.nextDouble();
		System.out.println("Volume: " + 3.1415*r*r*h);
	}
}