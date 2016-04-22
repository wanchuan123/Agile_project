package code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

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
	private LinkedList<Grades> aList;
	private int[] weights = {10,10,10,30,40};
	private int[] newWeight;
	public GradeSystems(){
		
		try {
			//1. 開檔 input file 
			String filePath = new File("").getAbsolutePath();
			FileReader r = new FileReader(filePath+"/gradeInput.txt");
	        Scanner sc = new Scanner(new BufferedReader(r));
	        
	      //2. 用LinkedList建構an empty list of grades叫 aList
	        aList = new LinkedList<Grades>();
	        
	        while (sc.hasNextLine()) {
	            String ID = sc.next();
	            
	            //第一筆讀進來時，ID前面會多一個空字元
	            if(ID.length()==10){
	            	ID = ID.substring(1);
	            }
	            
	            String name = sc.next();
	            int lab1 = sc.nextInt();
	            int lab2 = sc.nextInt();
	            int lab3 = sc.nextInt();
	            int midTerm = sc.nextInt();
	            int finalExam = sc.nextInt();

	            Grades aGrade = new Grades(ID,name,lab1,lab2,lab3,midTerm,finalExam);
	            
	            int aTotalGrade = aGrade.calculateTotalGrade(weights);
	            aGrade.setTotalGrade(aTotalGrade);
	            aList.add(aGrade);
	        }
	        sc.close();
	    }
		catch (FileNotFoundException e) {
	        e.printStackTrace();
	    }
		
	}
	
	//看aGradeSystem有否含此ID
	public boolean containsID(String ID){
		boolean bool = false;
		for(int i=0; i<aList.size();i++){
			//System.out.println(aList.get(i).getID()+"  "+ID);
			String studentID = aList.get(i).getID();
			if(ID.equals(studentID)){
				bool = true;
				break;
			}
		}
		return bool;
	}
	
	//show 這 ID 的 grade
	public void showGrade(String ID){
		int grade = 0;
		for(int i=0; i<aList.size();i++){
			if(aList.get(i).getID().equals(ID)){
				grade = aList.get(i).getTotalGrade();
				break;
			}
		}
		System.out.println(grade);
	}
	
	//這 ID 的 name
	public String getName(String ID){
		String name = "";
		for(int i=0; i<aList.size();i++){
			if(aList.get(i).getID().equals(ID)){
				name = aList.get(i).getName();
				break;
			}
		}
		return name;
	}
		
	/*
	 * 	1. 取得這 ID 的 theTotalGrade
	 *	2. 令rank 為 1 
	 *	3. loop aGrade in aList if aTotalGrade > theTotalGrade then rank加1(退1名) end loop
	 *	4. show 這 ID 的 rank
	 *	 註: showGrade(ID) showRank(ID) 也可放在UI class 那將是另一種設計 軟體設計無唯一，但是 在這個 project 你初次學習 所以請遵守此設計
	 */
	public void showRank(String ID){
		int rank = 1;
		double theTotalGrade = 0;
		double aTotalGrade = 0;
		for(int i=0; i<aList.size();i++){
			if(aList.get(i).getID().equals(ID)){
				theTotalGrade = aList.get(i).getTotalGrade();
			}
		}
		
		for(int i=0; i<aList.size();i++){
			aTotalGrade = aList.get(i).getTotalGrade();
			if(aTotalGrade > theTotalGrade){
				rank += 1;
			}
		}
		
		System.out.println(rank);
	}
	
	/*
	 *  1. showOldWeights() 
	 *	2. getNewWeights() 
	 *	3. setWeights(weights)
	 * 	4. loop aGrade in aList to calculateTotalGrade(weights) end loop
	 */
	public void updateWeights(){
		showOldWeights();
		getNewWeights();
		setWeights(newWeight);
		for(int i=0; i<aList.size();i++){
			int aTotalGrade = aList.get(i).calculateTotalGrade(weights);
			aList.get(i).setTotalGrade(aTotalGrade);
		}
	}
	
	public void showOldWeights(){
		System.out.println("舊配分");
		System.out.println("lab1 : " + weights[0] +"%");
		System.out.println("lab2 : " + weights[1] +"%");
		System.out.println("lab3 : " + weights[2] +"%");
		System.out.println("mid-term : " + weights[3] +"%");
		System.out.println("final exam : " + weights[4] +"%");
	}
	
	// get user input and print
	public void getNewWeights(){
		newWeight = new int[5];
		Scanner sc = new Scanner(System.in);
		String input = "N";
		while(input.equals("N")){
			System.out.println("輸入新配分");
			System.out.print("lab1 : ");
			newWeight[0] = sc.nextInt();
			System.out.print("lab2 : ");
			newWeight[1] = sc.nextInt();
			System.out.print("lab3 : ");
			newWeight[2] = sc.nextInt();
			System.out.print("mid-term : ");
			newWeight[3] = sc.nextInt();
			System.out.print("final exam : ");
			newWeight[4] = sc.nextInt();

			System.out.println("lab1 : " + newWeight[0] +"%");
			System.out.println("lab2 : " + newWeight[1] +"%");
			System.out.println("lab3 : " + newWeight[2] +"%");
			System.out.println("mid-term : " + newWeight[3] +"%");
			System.out.println("final exam : " + newWeight[4] +"%");
			System.out.print("以上正確嗎? Y(Yes) 或 N(No)");
			
			input = sc.next();
			if(input.equals("Y")){
				System.out.println("新配分設定完成");	
			}
		}
		
		
	}
	
	// set new weights
	public void setWeights(int[] weights){
		this.weights = weights;
	}

	
}
