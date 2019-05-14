package examen.ejercicio3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Pattern p = Pattern.compile("(?:(?:\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5]).){3}(?:\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])");
		System.out.print("IP: ");
		System.out.println(p.matcher(s.nextLine()).matches());
	}
	
}