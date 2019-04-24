package examen.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner ky = new Scanner(System.in);
		List<String> registro = new ArrayList<String>();

		String entrada = " ";
		int b = 0;

		do {
			System.out.print(">");
			entrada = ky.nextLine();
			Pattern patron = Pattern.compile("[a-zA-ZáéíóúÁÉÍÓÚ]+:[0-9]+");
			Matcher matpatron = patron.matcher(entrada);

			registro.add(entrada);

		} while (b == 0);

		ky.close();

	}

}