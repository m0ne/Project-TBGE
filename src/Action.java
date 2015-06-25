public class Action{
	
// 	INFO.
// 	---------------------------------------------------------------------------
//	choices are decisions, made by the actual player. these choices can lead to move/event. 
//	---------------------------------------------------------------------------
	
//	INIT VARIABLES.
//  ---------------------------------------------------------------------------	
	private String choice;
	private String move;
//	---------------------------------------------------------------------------
	
	//	Constructor, initializes a new Choice Object
	public Action(){
		super();
	}
	
	//	Creates a Choice
	public void setChoice(String choice){
		this.choice = choice;
	}

	//	Returns the Name of the Choice Object
	public String getChoice(){
		return choice;
	}
	// Creates a new Move
	public void setMove(String move){
		this.move = move;
	}
	
	// Gets the last defined Move
	public String getMove(){
		return move;
		
	}
	
}
