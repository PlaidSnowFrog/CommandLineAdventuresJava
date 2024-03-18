import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;

public class FileHandler {
	public static void save(int level, String username) throws IOException {
		BufferedWriter Writer = new BufferedWriter(new FileWriter(".log"));
		
		Writer.write(level + "\n" + username + "\n");
	}
    public static void read(int definer) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(".log"));
        List<String> lines = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }

        reader.close();

        for (int i = 0; i < Math.min(definer, lines.size()); i++) {
            System.out.println(lines.get(i));
        }
    }
}
