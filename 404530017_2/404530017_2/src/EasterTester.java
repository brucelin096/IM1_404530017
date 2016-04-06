
/*
 * [A]95
 * [TA's Advise]
 * 1.你把輪胎開發兩次了喔, 這不是一個明智的選擇, 看一下註解喔, 這部分扣5分.
 * 2.在撰寫程式的時候會盡量避免將同樣功能的function寫成兩個, 一來容易出錯, 二來維護不易.
 * 3.下次可以在javadoc中寫一些註解.
 * */

import java.lang.String;
//import Scanner卻沒使用到他?
import java.util.Scanner;

public class EasterTester {
	public static void main(String[] args) {
		//其實可以寫成這樣.
		//System.out.println(Easter.calculateEaster2(2001));

		System.out.println("In " + 2001 + ",Easter Sunday is : month is = " + Easter.calculateEaster(2001)
				+ " day is = " + Easter.calculateEaster2(2001));
		System.out.println("In " + 2012 + ",Easter Sunday is : month is = " + Easter.calculateEaster(2012)
				+ " day is = " + Easter.calculateEaster2(2012));

	}
}
