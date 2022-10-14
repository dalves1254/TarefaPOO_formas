package br.edu.util.escolher;
import java.util.Scanner;
import br.edu.util.figurasespaciais.*;
import br.edu.util.figurasplanas.*;

public class Escolher {
	public static void Inputar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha um tipo de figura:\n1 - Planas\n2 - Espaciais");
		int escolhaTipo = sc.nextInt();
		if (escolhaTipo == 1) {
			System.out.println("Escolha um\n1 - C�rculo\n2 - Losango\n3 - Paralelogramo\n4 - Quadrado\n5 - Ret�ngulo\n6 - Trap�zio\n7 - Tri�ngulo (qualquer)\n8 - Tri�ngulo equil�tero");
			int escolhaFigura = sc.nextInt();
			switch (escolhaFigura) {
			case 1:
				Circulo circulo = new Circulo();
				circulo.calcArea();
				break;
			case 2:
				Losango losango = new Losango();
				losango.calcArea();
				break;
			case 3:
				Paralelogramo paralelogramo = new Paralelogramo();
				paralelogramo.calcArea();
				break;
			case 4:
				Quadrado quadrado = new Quadrado();
				quadrado.calcArea();
				break;
			case 5:
				Retangulo retangulo = new Retangulo();
				retangulo.calcArea();
				break;
			case 6:
				Trapezio trapezio = new Trapezio();
				trapezio.calcArea();
				break;
			case 7:
				Triangulo triQualquer = new Triangulo();
				triQualquer.calcArea();
				break;
			case 8:
				TrianguloEquilatero triEq = new TrianguloEquilatero();
				triEq.calcArea();
				break;
			default:
				System.out.println("Input inv�lido");
				break;
			}
			
		} else if (escolhaTipo == 2) {
			System.out.println("Escolha um\n1 - Cilindro\n2 - Cone\n3 - Esfera\n4 - Paralelep�pedo\n5 - Pir�mide quadrangular\n6 - Prisma");
			int escolhaFigura = sc.nextInt();
			switch (escolhaFigura) {
			case 1:
				Cilindro cilindro = new Cilindro();
				cilindro.calcVolume();
				break;
			case 2:
				Cone cone = new Cone();
				cone.calcVolume();
				break;
			case 3:
				Esfera esfera = new Esfera();
				esfera.calcVolume();
				break;
			case 4:
				Paralelepipedo paral = new Paralelepipedo();
				paral.calcVolume();
				break;
			case 5:
				Piramide pir = new Piramide();
				pir.calcVolume();
				break;
			case 6:
				Prisma prisma = new Prisma();
				prisma.calcVolume();
				break;
			default:
				System.out.println("Input inv�lido");
				break;
			}
		} else {
			System.out.println("Input inv�lido");
		}
	}
}