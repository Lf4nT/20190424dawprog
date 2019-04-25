package examen.ejercicio2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio2 {

	static int n;
	static int m;

	public static void main(String[] args) {
		n = 0;
		m = 0;
		Scanner ky = new Scanner(System.in);
		System.out.print("Introduce Dos Valores Seguidos de una Cifra: ");
		String s = ky.next();

		if (s.length() == 2) {
			String[] List = s.split("");
			n = Integer.parseInt(List[0]);
			m = Integer.parseInt(List[1]);
		} else {
			System.out.println("Se esperaba un numero de dos cifras");
		}

		for (int i = 0; i < (n + m); i++) {
			System.out.println("->");
			int num = ky.nextInt();
			leerConjuntos(num).add(num);
		}
		ky.close();
	}

	public static Set<Integer> leerConjuntos(int num) {

		Set<Integer> Conjunto1 = new HashSet<Integer>();
		Set<Integer> Conjunto2 = new HashSet<Integer>();

		if (num <= n) {
			Conjunto1.add(num);
		} else {
			Conjunto2.add(num);
		}
		return Conjunto2;
	}

}