package br.edu.util.figurasespaciais;
import java.util.Scanner;

public class Prisma {
	public double a, h;
	public void calcVolume() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Área da base: ");
		a = sc.nextDouble();
		System.out.print("Altura: ");
		h = sc.nextDouble();
		System.out.println("Volume: " + ((3*Math.sqrt(3))/2)*a*a*h);
	}
}