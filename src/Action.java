import java.util.Scanner;


public class Action {

	// INFO.
	// ---------------------------------------------------------------------------
	// choices are decisions, made by the actual player. these choices can lead
	// to move/event.
	// ---------------------------------------------------------------------------

	// INIT VARIABLES.
	// ---------------------------------------------------------------------------
	private String choice; // Player input
	private String type; // Type of action
	private String error; // Defines the error, if no type is found
	Scanner input = new Scanner(System.in);
	// ---------------------------------------------------------------------------

	// Constructor, initializes a new Choice Object
	public Action() {
		super();
	}

	// Ask Player for Input and detects action / type of action
	public void setAction() {
		choice = input.nextLine();
		for (int i = 0; i < choice.length(); ++i) {
			if (choice.substring(0, i + 1).contains(" ")) {
				type = choice.substring(0, i);
				break;
			}
		}
		choice = choice.substring(type.length()+1, choice.length());
	}

	// Return selected Target 
	public String getTarget() {
		return choice;
	}

	// Return Type of action
	public String getType() {
		return type;
	}
	
	// ---------------------------------------------------------------------------
	
	// Define different Types of action
}