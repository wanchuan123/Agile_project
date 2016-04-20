package code;

public class GradeSystems {
	
	/*
	 * 	1. 開檔 input file 
	 *	2. 用LinkedList建構an empty list of grades叫 aList
	 *	3. read line
	 *	4. while not endOfFile
	 *		1.call Grades() 建構aGrade
	 *		2.用Scanner 來 scan line 把各欄位存入aGrade
	 *		3.aGrade.calculateTotalGrade(weights) 回傳aTotalGrade把它存入aGrade
	 *		4.把 aGrade 存入 aList
	 *	   end while
	 */
	public GradeSystems(){

		
	}
	
	//看aGradeSystem有否含此ID
	public boolean containsID(String ID){
		return true;
	}
	
	//show 這 ID 的 grade
	public void showGrade(String ID){
		
	}
	
	/*
	 * 	1. 取得這 ID 的 theTotalGrade
	 *	2. 令rank 為 1 
	 *	3. loop aGrade in aList if aTotalGrade > theTotalGrade then rank加1(退1名) end loop
	 *	4. show 這 ID 的 rank
	 *	 註: showGrade(ID) showRank(ID) 也可放在UI class 那將是另一種設計 軟體設計無唯一，但是 在這個 project 你初次學習 所以請遵守此設計
	 */
	public void showRank(String ID){
		
	}
	
	/*
	 *  1. showOldWeights() 
	 *	2. getNewWeights() 
	 *	3. setWeights(weights)
	 * 	4. loop aGrade in aList to calculateTotalGrade(weights) end loop
	 */
	public void updateWeights(){
		
	}
	
	public void showOldWeights(){
		
	}
	
	// get user input and print
	public void getNewWeights(){
		
	}
	
	// set new weights
	public void setWeights(int[] weights){
		
	}

	
}
