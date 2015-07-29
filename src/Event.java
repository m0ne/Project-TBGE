
public class Event {
	
// 	INFO.
// 	---------------------------------------------------------------------------	
// 	In the Event Class the Game Creator can design Events which can be used
// 	Events may be triggered out of Decisions, Battles, Pathways, or maybe
// 	just because of fun
//	---------------------------------------------------------------------------

//	INIT VARIABLES.
//  ---------------------------------------------------------------------------
	private String event;
	private String target;
	private String action;
	private String value;
	
//	---------------------------------------------------------------------------

	// Constructor, Initializes new Event
	public Event(String event){
		this.event = event;
	}
	
	// Changes the name of the event after creation (saving objects)
	public void setEvent(String event){
		this.event = event;
		
	}
	
	// Get Event name
	public String getEvent(){
		return event;
		
	}
	
	// Define Event value -> action -> target 
	public void defineEvent(Character target, Character action, String value){
		this.target = target;
		this.action = action;
		this.value = value;
		
	}
	
}
