package inputOutput;

import java.util.Scanner;

public class InOut {

	public static void main(String[] args) {
		while (true) {
			System.out.println("cariachiamo gli autori, dammi nome please, oppure digita 'fine' ");
			Scanner s = new Scanner(System.in);

			String parola = s.next(); // posso digitare le stringhe, NON gli int

			Autore a = new Autore(parola);
			System.out.println("hai caricato l'autore: " + parola);

			if (parola.equals("fine"))
				break;
		}
		System.out.println("ok, fine del caricamento autori");

	}

}
