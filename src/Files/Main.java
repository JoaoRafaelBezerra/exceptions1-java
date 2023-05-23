package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {// Leitura com  FileReader e BufferedReader

	public static void main(String[] args) {
		
		String path = "C:\\Users\\lnbre\\disgraca.txt";
		 
		FileReader fr  = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
		    br = new BufferedReader(fr);
		    
		    String line = br.readLine();
		    
		    while(line != null) {
		    	System.out.println(line);
		    	line = br.readLine();
		    }
		}catch(IOException e){
	    	System.out.println("Error: " + e.getMessage());
	    }finally {
	    	try {
	    		if(br  != null) {
	    			br.close();
	    		}
	    		if(fr != null) {
	    			fr.close();
	    		}
	    	}catch(IOException e) {
	    		e.printStackTrace();
	    	}
	    }
	}

}
