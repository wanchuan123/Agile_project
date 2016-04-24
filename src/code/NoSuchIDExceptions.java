package code;

/** ***********************************************************************
class NoSuchIDExceptions 當輸入的ID不在GradeSystem中顯示"ID錯了"

NoSuchIDExceptions() 建構子
************************************************************************ */
public class NoSuchIDExceptions extends Exception {
	
	public NoSuchIDExceptions(){
		System.out.println("ID錯了");
	}
}
