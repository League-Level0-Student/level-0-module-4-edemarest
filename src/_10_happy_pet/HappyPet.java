package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		String petType = JOptionPane.showInputDialog("What kind of pet do you want to buy?");
		for (int i = 0; i < 20; i++) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Task", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "pet", "feed", "walk" }, null);
			
			if (task == 0) {
				purr(petType);
			}
			if (task == 1) {
				food(petType);
			}
			if (task == 2) {
				walk(petType);
			}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if (happinessLevel == 5) {
				JOptionPane.showMessageDialog(null,  "You love your pet a lot.");
				break;
			}
	}
	}

	static // 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	void purr(String petType) {
		JOptionPane.showMessageDialog(null, "The " + petType + " purrs.");
		happinessLevel++;
	}
	static void food(String petType) {
		JOptionPane.showMessageDialog(null, "Your " + petType + " likes the food.");
		happinessLevel++;
	}
	static void walk(String petType) {
		JOptionPane.showMessageDialog(null, "Your " + petType + " had fun on the walk.");
		happinessLevel++;
	}
}