package inputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ScriviDentroUnFile {
	public static void main(String[] args) {

		File f = new File(
				"C:\\\\Users\\\\Utente\\\\eclipse-workspace\\\\InputOutput\\\\src\\\\inputOutput\\\\mio_file.txt");

		try {
			// scrive qualcosa dentro un file (sovrascrive ciò che c'è scritto)
			PrintWriter out = new PrintWriter(f);

			// scriverà questo nel file mio_file.txt
			out.println("prima riga del file");
			out.print("seconda riga");
			out.println(2);

			out.close();
			System.out.println("eseguito");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
