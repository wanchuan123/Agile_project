package code;

import java.util.LinkedList;
import java.util.Scanner;

public class UI {
	
	private GradeSystems aGradeSystem;
	private String ID;
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
		aGradeSystem = new GradeSystems();
		System.out.println("輸入ID或Q(結束使用)？");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String input = sc.nextLine();
			if(input.equals("Q")){
				showFinishMsg();
				break;
			}
			else if(checkID(input)){
				showWelcomeMsg(input);
				showPromptCommand();
				System.out.println();
				while(sc.hasNext()){
					input = sc.nextLine();
					if(input.equals("E")){
						break;
					}
					else{
						promptCommand(input);
					}
				}
				System.out.print("輸入ID或Q(結束使用)？");
			}
			else{
				System.out.println("指令錯了");
			}
		}

	}
	
	/*
	 * 1. 要aGradeSystem 做containsID(ID) 看 ID是否含在 aGradeSystem內
	 * 2. if not, throw an object of NoSuchIDExceptions
	 * 3. 回傳 true
	 */
	public boolean checkID(String ID) throws NoSuchIDExceptions {
		if(!aGradeSystem.containsID(ID)){
			return false;
		}
		else{
			return true;
		}
		
	}
	
	/*
	 * 1. prompt user for inputCommand (call checkID(String ID))
	 * 2. if inputCommand is not G (Grade),R (Rank), W (Weights), or E (Exit),throws an object of NoSuchCommandException
	 * 3. if inputCommand is E (Exit) then break
	 * 4. else: G aGradeSystem.showGrade(ID), R showRank(ID), W updateWeights()
	 */
	public void promptCommand(String input) throws NoSuchCommandExceptions {
		
		if(input.equals("G")){
			aGradeSystem.showGrade(ID);
		}
		else if(input.equals("R")){
			aGradeSystem.showRank(ID);
		}
		else if(input.equals("W")){
			aGradeSystem.updateWeights();
		}
		else{
			System.out.println("指令錯了");
		}
		showPromptCommand();
	}
	
	// show the end.
	public void showFinishMsg(){
		System.out.print("結束了");
	}
	
	// show welcome ex: Welcome 李威廷
	public void showWelcomeMsg(String ID){
		String name = aGradeSystem.getName(ID);
		this.ID = ID;
		System.out.println("Welcome "+name);
	}
	
	//show prompt command
	public void showPromptCommand(){
		System.out.println("輸入指令");
		System.out.println("1) G 顯示成績 (Grade)");
		System.out.println("2) R 顯示排名 (Rank)");
		System.out.println("3) W 更新配分 (Weight)");
		System.out.println("4) E 離開選單 (Exit)");
	}
	
}
