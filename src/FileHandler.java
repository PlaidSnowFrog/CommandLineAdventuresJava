import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;

public class FileHandler {
	public static void save(int definer, String name) throws IOException {
		BufferedWriter Writer = new BufferedWriter(new FileWriter(".log", true));
		
		Writer.append(name + "\n" + definer + "\n");
		Writer.close();
	}
	
	public static boolean read(String name) throws IOException {
	    BufferedReader reader = new BufferedReader(new FileReader(".log"));
	    List<String> lines = new ArrayList<>();

	    // Read lines from the file
	    String line;
	    while ((line = reader.readLine()) != null) {
	        lines.add(line);
	    }

	    reader.close();

	    if (lines.size() < 2) {
	    	return true;
	    } else {
		    for (int i = 0; i < lines.size(); i+= 2) {
		    	if (lines.get(i).equals(name)) {
		    		switch (Integer.parseInt(lines.get(i + 1))) {
		    		case 1:
		                System.out.println("Why would you want to ruin his life? " + lines.get(i) + " has already found a good ending.");
		                return false;
		    		case 2:
		                System.out.println(lines.get(i) + " is dead.");
		                return false;
		    		}
		    	}
		    }
	    }
	    
	    return true;
	}
}
