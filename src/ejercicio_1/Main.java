package ejercicio_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduzca la URL del fichero a buscar:");
		String file = keyboard.nextLine();
		AskFile buscar = new AskFile(file);
		System.out.println(buscar.showFile());

	}

}
