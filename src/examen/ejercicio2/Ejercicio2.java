package examen.ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner ky = new Scanner(System.in);

		String s = " ";
		int k = 0;
		int num1;
		int num2;
		List<Integer> L1 = new ArrayList<>();

		do {
			System.out.print(">");
			s = ky.nextLine();
			String[] parts = s.split(" ");
			String a = parts[0];
			String b = parts[1];

			for (int i = 0; i < a.length(); i++) {
				System.out.print("->");
				num1 = ky.nextInt();
				L1.add(num1);
			}

			System.out.println();

			for (int j = 0; j < b.length(); j++) {
				System.out.print("->");
				num2 = ky.nextInt();
				L1.add(num2);
			}
			k = 1;
		} while (k != 1);

	}
}
