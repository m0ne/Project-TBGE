public class Application {

	public static void main(String[] args) {

// 	LICENSE.	
//	-----------------------------------------------------------------------
//	    TBGE (TextBasedGameEngine), A text based game creation engine
//	    Copyright (C) <2015>  <m0ne>
//
//	    This program is free software: you can redistribute it and/or modify
//	    it under the terms of the GNU General Public License as published by
//	    the Free Software Foundation, either version 3 of the License, or
//	    any later version.
//
//	    This program is distributed in the hope that it will be useful,
//	    but WITHOUT ANY WARRANTY; without even the implied warranty of
//	    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
//	    GNU General Public License for more details.
//
//	    You should have received a copy of the GNU General Public License
//	    along with this program.  If not, see <http://www.gnu.org/licenses/>.
//	---------------------------------------------------------------------------
		
// 	INFO.
//	---------------------------------------------------------------------------
//	Happy welcome. This engine is created by m0ne. The TBGE is a framework for creating
//	text based adventure/roleplaying games. It is a free, open source project. If you want to
//	participate in the development process your invited to do so. Suggestions concerning code
//	or other inputs are welcome. If you have any questions regarding this project
//	Send me an email to m0ne@gmail.com.
//	---------------------------------------------------------------------------	


//	Things to work on;
//				
//		Fix getInventory (Layout;
//		test all methods;
//		Create the Event class
//		
//		
//		
//		
//		
//		
		
//		New outline:  
//		
//		Application.
//														
//			Action
//			Item
//			Character
//		
//			
//			Event
		
		// Initialize new Character
		Character peter = new Character("peter");
		peter.setTalkingSpeed(20);
		
		// getCharacterInformation
		peter.getCharacterInformation();
		
		// SPEAK OLD WAY
		//String[] sentence = { "Hey ", "Peter ", "How ", "Are ", "you" };
		//System.out.printf("\n");
		//peter.speak(sentence);


		peter.setChoice("Hello");
		System.out.printf(peter.getChoice() + "\n\n");
		 
		// Create a new item (1)
		Item i1_axe = new Item("axe");

		// Define Item (1)
		i1_axe.setItemFunction("hit");
		i1_axe.setItemDescription("testDescription");
		i1_axe.setItemCategory("axes");
		i1_axe.getItemInformation();
		peter.addToInventory(i1_axe);
		peter.addToInventory(i1_axe);
		
		
		// Create a new Item(2)
		Item i2_sword = new Item("sword");
		// Define Item (2)
		i2_sword.setItemDescription("testDescription");
		i2_sword.setItemCategory("swords");
		i2_sword.getItemInformation();
		peter.addToInventory(i2_sword);
		peter.addToInventory(i2_sword);
		
		// Outputs inventory
		peter.getInventory();
		
		// Test the speakMethod
		peter.newSpeak("new Speak Test");
		
		// Set a create newChoice
		peter.setChoice("Left");
		System.out.printf(peter.getChoice() + "\n\n");
		
		// Create a new Event
		Event event1 = new Event("event happened");
		Pairing newPairing = new Pairing(peter, "Left", event1 )
		
		// Creating a new Option
		Option o1_left = new Option("Left");
		// Testing Choice --> Option
		if (peter.getChoice() == o1_left.getOption()){
			System.out.println("COOL");
		}
		
	}
}
