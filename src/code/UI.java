package code;


public class UI {
	
	  
	/*
	 * try 
	 *	1.call GradeSystems() to建構 aGradeSystem
	 *	2.loop1 until Q (Quit)
	 *		1.	checkID(ID)
	 *	3.showWelcomeMsg (ID)
	 *	4.loop2 until E (Exit)
	 *		promptCommand() to prompt for inputCommand 
	 *	  end loop2
	 *	end loop1
	 *	3.showFinishMsg()
	 *	end try
	 */
	public UI() throws NoSuchIDExceptions, NoSuchCommandExceptions {
		
	}
	
	/*
	 * 1. 要aGradeSystem 做containsID(ID) 看 ID是否含在 aGradeSystem內
	 * 2. if not, throw an object of NoSuchIDExceptions
	 * 3. 回傳 true
	 */
	public boolean checkID(String ID) throws NoSuchIDExceptions {
		return true;
	}
	
	/*
	 * 1. prompt user for inputCommand (call checkID(String ID))
	 * 2. if inputCommand is not G (Grade),R (Rank), W (Weights), or E (Exit),throws an object of NoSuchCommandException
	 * 3. if inputCommand is E (Exit) then break
	 * 4. else: G aGradeSystem.showGrade(ID), R showRank(ID), W updateWeights()
	 */
	public void promptCommand() throws NoSuchCommandExceptions {
		
	}
	
	// show the end. ex: Welcome 李威廷
	public void showFinishMsg(String name){
		
	}
	
}
