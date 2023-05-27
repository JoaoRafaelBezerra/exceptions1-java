package Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {// Escrevendo com bufferedWritter e fileWriter

	public static void main(String[] args) {
		
		String[] lines = new String[] { "Goodi morning", "good naite ", "good evening"};
		String path = "C:\\Users\\lnbre\\disgraca.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
		    
		    for(String line : lines) {
		    	bw.write(line);
		    	bw.newLine();
		    }
		}catch(IOException e){
	    	System.out.println("Error: " + e.getMessage());
	    }
	}
}


