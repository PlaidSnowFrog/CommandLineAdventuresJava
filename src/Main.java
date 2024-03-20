import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		int choice = 0;
		int definer = 0;
		boolean run = true;
		boolean goodEnding = false;
		boolean deadOrGood = false;
		
		String name = Narrator.Welcome();
		
		try {
			run = FileHandler.read(name);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (run == false) {
			deadOrGood = true;
		}
		
		while (run == true) {
			switch (choice) {
			case 0:
				choice = Narrator.Beginning();
				break;
			// Beginning
			case 1: // Go through the door
				choice = Narrator.JustWalked();
				break;
			case 2: // Give up
				choice = Narrator.Trapped();
				break;
			
			// Went through the door
			case 6: // Explore
				choice = Narrator.FoundHouse();
				break;
			case 7: // Look for shelter
				
				break;
				
			// Trapped
			case 3: // Look for another way out
				choice = Narrator.FoundBlackDot();
				break;
			case 4: // Give up
				choice = Narrator.BecomeBlackDot();
				break;
			
			// End
			case 5: // Lose
				definer = 2;
				run = false;
				break;
			case 8: // "Win"
				goodEnding = true;
				definer = 1;
				run = false;
				break;
			}
		}
		
		if (!deadOrGood) {
			if (!goodEnding) {
				System.out.println("GAME OVER!");
			} else {
				System.out.println("You found a good ending!");
			}
		}
		
		if (definer == 1 || definer == 2) {
			try {
				FileHandler.save(definer, name);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
