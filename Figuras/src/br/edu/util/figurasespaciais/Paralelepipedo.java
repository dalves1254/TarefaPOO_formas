package br.edu.util.figurasespaciais;
import java.util.Scanner;

public class Paralelepipedo {
	public double c, l, h;
	public void calcVolume() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Comprimento: ");
		c = sc.nextDouble();
		System.out.print("Largura: ");
		l = sc.nextDouble();
		System.out.print("Altura: ");
		h = sc.nextDouble();
		System.out.println("Volume: " + c*l*h);
	}
}