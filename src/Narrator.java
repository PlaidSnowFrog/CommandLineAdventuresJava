import java.util.Scanner;

public class Narrator {
	public static String Welcome() {
		Scanner scan = new Scanner(System.in);
		String username;
		
		System.out.println("Welcome, this is a text based adventure game");
		System.out.print("Insert your character's name:  ");
		
		username = scan.nextLine();
		return username;
	}
	
	public static int Beginning() {
		Scanner scan = new Scanner(System.in);
		int choice;
		
		System.out.println("You wake up, but as you get out of bed, you realize that you are not where you went to sleep");
		System.out.println("You are in a blank space, everything is white, but behind you there is a door, it seems to be the only way out");
		
		do {
			System.out.println("Will you\n1 - Go through the door\n2 - Wait for something to happen");
			choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("You walk through the door, as you do it disappears behind you, you are no longer in a blank space, but you are in a forest");
				return 1;
			case 2:
				System.out.println("After a while, the door disappears, you are now trapped forever in this endless void");
				return 2;
			default:
				System.out.println("Invalid input");
				break;
			}
		} while (choice != 1 && choice != 2);
		
		return 0; // This should not be returned
	}
	
	// Give up route
	public static int Trapped() {
		Scanner scan = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Will you\n1 - Look for another way out\n2 - Give up");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("After a while of searching, you find a black dot, it is the only thing not white in this place, it's about as big as your hand");
				return 3;
			case 2:
				System.out.println("You give up, you stop searching, but in this void, for some reason, you don't age or get hungry");
				System.out.println("After what feels like years, but you're not sure, you begin to lose colour, your skin is becoming white, you are becoming part of the void");
				return 4;	
			default:
				System.out.println("Invalid input");
			}
		} while (choice != 1 && choice != 2);
		
		return 0; // This should not be returned
	}
	
	public static int FoundBlackDot() {	
		Scanner scan = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("You pick up the black dot, but it suddenly jumps out of your hand\nEven though it doesn't have eyes, you feel like it's looking at you, and you are sure that it, whatever it is, is hostile");
			System.out.println("Will you\n1 - Run Away\n2 - Fight it");
			
			choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("You run away, you only turn back after about an hour, but when you do you realize you haven't moved an inch");
				System.out.println("An eye appears on the black dot, it's looking at you, you feel an intense pain, before fading into nothingness, you are now part of the void");
				return 5;
			case 2:
				System.out.println("You throw yourself at the black dot, you try punching it, but as soon as you touch it, the white void becomes black\nA giant eye appears and looks at you, when suddenly, you pass out\nWhen you wake up, you realize you have gone back in time");
				return 0;
			default:
				System.out.println("Invalid input");
			}
			
		} while (choice != 1 && choice != 2);
		
		return 0; // This should not be returned
	}
	
	public static int BecomeBlackDot() {
		Scanner scan = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("You think that you have faded completely, you can't even see yourself, but just when all hope is lost, you feel an immense pain and you become a black dot, you are now as big as your hand once was, but you feel as if you now have control over time in this void");
			System.out.println("A human is approaching you, you hope he can get you out of here, but he simply picks you up confused, so you jump back to let him know that you are alive, the human jumps towards you, trying to punch you");
			
			System.out.println("Will you\n1 - Send yourself back in time\n2 - Send the human back in time");
			choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("You send yourself back in time to the first decision...");
				return 0;
			case 2:
				System.out.println("After you send him back in time and nothing happens for months, you begin to lose hope, you look for the him in the past and the future, but you never find him, you begin to wonder if he even really existed");
				return 5;
			default:
				System.out.println("Invalid input");
			}
		} while (choice != 1 && choice != 2);
		
		return 0; // This should not be returned
	}
	
	
	// Walk through the door route
	public static int JustWalked() {
		Scanner scan = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Will you\n1 - Explore\n2 - Look for shelter");
			choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("You begin exploring, after a while, you find an abbandoned house");
				return 6;
			case 2:
				System.out.println("You look for shelter and after a while, you find a cave near a lake");
				return 7;
			default:
				System.out.println("Invalid input");
				break;
			}
		} while (choice != 1 && choice != 2);
		
		return 0; // This should not be returned
	}
	
	public static int FoundHouse() {
		Scanner scan = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Will you\n1 - Go and see what's inside\n2 - Go and explore somewhere else");
			choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("You go inside and find out that house is not abbandoned at all!");
				System.out.println("It's full of other people in the same situation as you, they welcome you and you all live peaceful lives together");
				return 8; // Good Ending
			case 2:
				System.out.println("After a while of searching, you find another door, you trip and fall into it, you are now in the same situation as before");
				return 0;
			default:
				System.out.println("Invalid input");
				break;
			}
		} while (choice != 1 && choice !=2);
		
		return 0; // This should not be returned
	}
	
	public static int FoundCave() {
		Scanner scan = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("Will you\n1 - Go inside the cave\n2 - Go swim in the lake");
			choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("The cave is full of other people in the same situation as you, they welcome you and you all live peaceful lives together");
				return 8; // Good Ending
			case 2:
				System.out.println("You jump in the lake, and as soon as you do, you feel something dragging you down, it's another human!");
				System.out.println("You try to explain your situation, but he doesn't listen and drown you");
				return 5; // GAME OVER
			default:
				System.out.println("Invalid input");
				break;
			}
		} while (choice != 1 && choice != 2);
		
		return 0; // This should not be returned
	}
}
