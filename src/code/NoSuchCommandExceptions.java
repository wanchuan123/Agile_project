package code;

/** ***********************************************************************
class NoSuchCommandExceptions 當指令輸入錯誤時顯示"指令錯了"

NoSuchCommandExceptions() 建構子
************************************************************************ */
public class NoSuchCommandExceptions extends Exception {

	public NoSuchCommandExceptions(){
		System.out.println("指令錯了");
	}
}
