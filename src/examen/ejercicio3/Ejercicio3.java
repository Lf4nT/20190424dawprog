package examen.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner ky = new Scanner(System.in);
		List<String> list = new ArrayList<>();
		boolean fin = false;
		do {
			System.out.print(">");
			String token;
			token = ky.skip("ip [0-9]+\\s+ mensaje [a-zA-ZáéíóúÁÉÍÓÚ]+\\s+ usuario [a-zA-ZáéíóúÁÉÍÓÚ]+").match()
					.group();
			if (token.equals("fin")) {
				fin = true;
			} else if (token == null) {
				throw new RuntimeException("No Introduzcas Elementos Vacios");
			} else {
				list.add(token);
			}
			System.out.println(list);
		} while (fin != true);
		ky.close();
	}
}