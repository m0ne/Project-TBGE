public class Pairing {

	// INFO.
	// ---------------------------------------------------------------------------
	// Pair is used to link a action to an event. Pair is there for simplifying
	// the task of developing a game. the developer simply creates a new
	// pairing.
	// the pairing can be set by adding nameofpairing.setPairing(action, event)
	// ---------------------------------------------------------------------------

	// INIT VARIABLES.
	// ---------------------------------------------------------------------------
	private Action object; // Character/Diverse Objects
	private String type; // Type of action
	private String action; // actual action
	private Event event; // Event which might happen
	private String choice;
	private String error = "Nothing happened...";
	// ---------------------------------------------------------------------------

	
	// Initializes a new Pairing, in which an object can be linked to a type/action --> event
	public Pairing(Character target, String type, String action, Event event) {
		this.object = target;
		this.type = type;
		this.action = action;
		this.event = event;

	}

	// Modifies an existing Pairing
	public void setPairing(Character target, String type, String action, Event event) {
		this.object = target;
		this.type = type;
		this.action = action;
		this.event = event;
	}

	// returns the Pairing
	public String getPairing() {
		choice = object.getTarget(); // Ask Player's choice
		if (choice.equals(action) && type.equals(object.getType())) {
			return event.getEvent();
		}else {
			return error;
		}
	}
}