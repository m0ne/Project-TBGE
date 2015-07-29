 import java.util.Scanner;

// All Information to Character
public class Character extends Item{
	
	
// 	INFO.
// 	---------------------------------------------------------------------------
//	The Character Class is used to create new Characters. who would have guessed that
//	But not only can friendly characters be created but moreover enemies and other creatures
//	---------------------------------------------------------------------------
	
//	INIT VARIABLES.
//  ---------------------------------------------------------------------------	
	private String[][] inventory = new String[20][50];
	// ArrayList<String> item = new ArrayList<String>();
	private String name;
	private int talkingSpeed;
	private Scanner scanner = new Scanner(System.in);
	private String choice;
	private int health;
	private int row;
	private int col;
	private Action methodChoice = new Action();
// ---------------------------------------------------------------------------
	
	// Character Constructor, Initializes a new Character
	public Character() {
		super();
	}
	
	// Create a new Character
	public Character(String newCharacter) {
		name = newCharacter;
	
	}

	public void getCharacterInformation() {
		System.out.printf("Character Name: " + name + "\n");
		System.out.printf("Talking Speed: " + talkingSpeed + "\n\n");
	}
	
	// Set Characters Lifes 
	public void setHealth(int health){
		this.health = health; 
	}
	
	// Get Characters remaining Lifes
	public int getHealth(){
		return health;
	}
	
	// Add new items to the Inventory
	public void addToInventory(Item newItem) {

		// Interate through rows (find category)
		for (row = 0; row < inventory.length; row++) {
			if (inventory[row][0] == newItem.getItemCategory()) {
				inventory[row][0] = newItem.getItemCategory();
				++row;
				break;
			} else if (inventory[row][0] == null) {
				inventory[row][0] = newItem.getItemCategory();
				++row;
				break;
			}
		}

		// Interate through collums (find free slot)
		for (col = 0; col < inventory[row].length; col++) {
			if (inventory[row][col] == null) {
				inventory[row][col] = newItem.getItemName();
				break;
			}
		}
	}


	// Display Inventory
	public void getInventory() {
		System.out.printf("Inventory:\n-----------------\n");
		// Interate through rows
		for (row = 0; row < inventory.length; row++) {

			// Interate through collums
			for (col = 0; col < inventory[row].length; col++) {
				if (inventory[row][col] == null) {
					System.out.printf("\n");
					break;
				}
				if (row == inventory.length){
					System.out.printf("\n");
					continue;
				}
				System.out.printf(inventory[row][col] + "\t");
			}
		}
	}

	// Set talkingSpeed
	public void setTalkingSpeed(int talkingSpeed) {
		this.talkingSpeed = talkingSpeed;
	}

	// Get talkingSpeed
	public void getTalkingSpeed() {
		System.out.println(talkingSpeed);
	}

	// Outputs text, including a timer and a sentence builder
	public void speak(String[] sentence) {

		// Creating the Builder
		StringBuilder sb = new StringBuilder();

		// Speaking (incl. timer) && Appending single words to sentence
		for (int i = 0; i < sentence.length; i++) {
			sb.append(sentence[i]);
			System.out.printf(sentence[i] + " ");

			// Sleep for x seconds (defined in speed)
			try {
				// to sleep for speed seconds
				Thread.sleep(talkingSpeed);
			} catch (InterruptedException e) {
				// catching InterruptedException clears interrupt flag
				Thread.currentThread().interrupt();
				return;
			}
		}
		System.out.printf("\n\n");
		// If sentence is needed output (sb1)
	}

	// Ressource hungry way to output text
	public void newSpeak(String sentence) {
		for (int i = 0; i < sentence.length(); ++i) {
			System.out.printf(sentence.substring(i, i + 1));

			// Sleep for x seconds (defined in speed)
			try {
				// to sleep for speed seconds
				Thread.sleep(talkingSpeed);
			} catch (InterruptedException e) {
				// catching InterruptedException clears interrupt flag
				Thread.currentThread().interrupt();
				return;
			}
		}
		System.out.printf("\n\n");
		// If sentence is needed output "sentence"

	}

//	// Sets User choice
//	public void setChoice() {
//		choice = scanner.nextLine();
//		scanner.close();
//	}
//
//	// Gets User Choice
//	public String getChoice() {
//		return choice;
//	}
}
