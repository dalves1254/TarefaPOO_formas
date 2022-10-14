package br.edu.util.figurasespaciais;
import java.util.Scanner;

public class Piramide {
	public double lado, h;
	public void calcVolume() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lado da base: ");
		lado = sc.nextDouble();
		System.out.println("Altura da pirâmide: ");
		h = sc.nextDouble();
		System.out.println("Volume: " + (lado*lado*h)/3);
	}
}