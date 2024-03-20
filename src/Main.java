public class Main {

	public static void main(String[] args) {
		Player player = new Player();
		
		int choice = 0;
		boolean run = true;
		boolean comingSoon = false;
		
		player.name = Narrator.Welcome();
		
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
				comingSoon = true;
				run = false;
				break;
				
			// Trapped
			case 3: // Look for another way out
				choice = Narrator.FoundBlackDot();
				break;
			case 4: // Give up
				choice = Narrator.BecomeBlackDot();
				break;
			
			
			// Lose
			case 5:
				run = false;
				break;
			}
		}
		
		if (!comingSoon) {
			System.out.println("GAME OVER!");
		} else {
			System.out.println("Coming Soon!");
		}
		
	}

}
