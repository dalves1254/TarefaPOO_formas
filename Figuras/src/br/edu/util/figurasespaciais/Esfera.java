package br.edu.util.figurasespaciais;
import java.util.Scanner;

public class Esfera {
	public double r;
	public void calcVolume() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Raio: ");
		r = sc.nextDouble();
		System.out.println("Volume: " + (4*3.1415*r*r*r)/3);
	}
}