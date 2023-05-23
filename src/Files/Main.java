package Files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {// Leitura basica de um arquivo

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\lnbre\\disgraca.txt");
		Scanner sc  = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(IOException e){
			System.out.println("Error : " + e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
		}

	}

}
