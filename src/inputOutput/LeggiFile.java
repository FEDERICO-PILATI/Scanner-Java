package inputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeggiFile {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\Utente\\eclipse-workspace\\InputOutput\\src\\inputOutput\\mio_file.txt");
		try {
			Scanner in = new Scanner(f);

			while (in.hasNext()) {
				System.out.println(in.nextLine());
			}
			in.close(); // chiudo lo scanner
		} catch (FileNotFoundException e) { // questa è un'eccezione
			e.printStackTrace();
		}
	}

}
