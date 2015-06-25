
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
	private String type = "event"; 
	
//	---------------------------------------------------------------------------

	// Constructor, Initializes new Event
	public Event(String event){
		this.event = event;
	}
	
	// Gets Event name
	public String getEvent(){
		return event;
		
	}
	
	// Defines the functions of Event
	public void setEvent(String target){
}
