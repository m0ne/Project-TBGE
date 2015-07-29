import java.util.Scanner;

public class Item extends Action{

	// 	INFO.
//	---------------------------------------------------------------------------
//	This is the place where items can be created. items can have different attributes.
//	Apart from names and categories, items can have functions. functions are necessary to 
//	use them in the game. The player can use these functions. Which effect the item has is defined
//	in the Event class.
//	---------------------------------------------------------------------------	

//	INIT VARIABLES.
//  ---------------------------------------------------------------------------
	private String name;
	private String description = "none";
	private String category = "undefined";
	private String[] functions = new String[20];
	private Scanner scanner = new Scanner(System.in);
	private String choice;
	private int i = 0;
	private String ItemId;
//	---------------------------------------------------------------------------
	
	// Constructor for defines the name
	public Item(){
		super();
	}
	// Constructor for defines the name
	public Item(String name) {
		this.name = name;
	}
		
	public String getItemName(){
		return this.name;
	}
	
	public void setItemId(Item ItemId){
		this.ItemId = ItemId.toString();
	}
	
	public String getItemId(Item ItemId){
		return this.ItemId;
	}
	
	// Prints out all Information about an item
	public void getItemInformation() {
		System.out.printf("Item Information: \n-----------------\n");
		System.out.printf("_Name:\t\t" + name + "\n");
		System.out.printf("_Category:\t" + category + "\n");
		System.out.printf("_Description:\t" + description + "\n");
		System.out.printf("_Functions:\t");
		
		for (int i = 0; i < functions.length; i++) {
			if (functions[i] != null) {
				System.out.printf(functions[i] + "\t");
			} else {
				break;
			}
		}
		System.out.printf("\n\n");
	}
	
	// sets a new Item Category
	public void setItemName(String name) {
		if (this.category != name) {
			System.out.println("Overwrite existing Name? (y/n)");
			choice = scanner.nextLine();

			if (choice.equals("y")) {
				System.out.println("New Name: ");
				this.name = name;
				System.out.println(name);
			} else if (choice.equals("n")) {
				System.out.println("aborted.");
			} else {
				System.out.println("Please try again");
			}
		} else {
			this.name = name;
		}
	}
	
	// Sets a new Item Category
	public void setItemCategory(String category) {
		if (this.category != "undefined") {
			System.out.println("Overwrite existing category? (y/n)");
			choice = scanner.nextLine();

			if (choice.equals("y")) {
				System.out.println("New Category: ");
				this.category = category;
				System.out.println(category);
			} else if (choice.equals("n")) {
				System.out.println("aborted.");
			} else {
				System.out.println("Please try again");
			}
		} else {
			this.category = category;
		}
	}
	
	public String getItemCategory(){
		return category;
	}

	// Sets a new Item Description
	public void setItemDescription(String description) {

		if (this.description != "none") {
			System.out.println("Overwrite existing description? (y/n)");
			choice = scanner.nextLine();

			if (choice.equals("y")) {
				System.out.println("New Description: ");
				this.description = description;
				System.out.println(description);
			} else if (choice.equals("n")) {
				System.out.println("aborted.");
			} else {
				System.out.println("Please try again");
			}
		} else {
			this.description = description;
		}
	}
	
	// Defines 1 Function at a time
	public void setItemFunction(String function) {
		functions[0] = "use";
		functions[1] = "combine";
		for (i = 0; i < functions.length; i++)
			if (functions[i] == null) {
				functions[i] = function;
				break;
			}
	}
}