
public class Pairing {

//	INFO.
//	---------------------------------------------------------------------------
//  Pair is used to link a action to an event. Pair is there for simplifying
//	the task of developing a game. the developer simply creates a new pairing.
//	the pairing can be set by adding nameofpairing.setPairing(action, event)
//	---------------------------------------------------------------------------

//	INIT VARIABLES.
//  ---------------------------------------------------------------------------	
 	private String action;
 	private String event;
 	private Action object;
//	---------------------------------------------------------------------------
	
	public Pairing(Character object, String action, String event){
		this.action = action;
		this.event = event;
		this.object = object;
		if (action == object.getChoice()){
			System.out.printf("Hey it works");
		}
	}
	
	public String getPairing(){
		return action;
	}

	
	// OK, here, link pairing to event and create combination mechanism
	// ----------------------
	
}
