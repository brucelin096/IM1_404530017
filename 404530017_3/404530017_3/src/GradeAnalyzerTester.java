/*
 * [A]98
 * [TA's Advise]
 * 1. 有出了一點小小的邏輯錯誤, 不過沒什麼太大問題.
 * 2. 有些建議寫在你的程式碼中囉, 記得看一下!
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {
	public static void main(String[] args) {

		String Input = "";
		GradeAnalyzer GA = new GradeAnalyzer();

		while (true) {
			Input = JOptionPane.showInputDialog(null, "Please Insert scores");
			if (Input.equalsIgnoreCase("Q")) {
				break;
			}
			try {
				GA.addGrade(Double.parseDouble(Input));
			} catch (Exception e) {
				System.out.println("Please Insert Valid Numbers");
			}
		}
		if (GA.CntUserInput < 2) {
			System.out.println("You did not enter enough grades to analyze. Please enter at least 2 valid grades");
		}
		// 應該用else把以下包起來, 因為如果<2 則不會作下面這段, -2
		GA.analyzeGrade();
		System.out.println("You entered " + GA.CntUserInput
				+ " valid grades from 0 to 110. Invalid grades are ignored! Print 'Q' to Quit");
		System.out.println("The average =  " + (int) GA.Avg + " with a standard deviation = " + (int) GA.SD);
		System.out.print("The grade distribution is: " + "\n" + "A+ = " + GA.A1 + "\n" + "A = " + GA.A2 + "\n" + "A- = "
				+ GA.A3 + "\n" + "B+ = " + GA.B1 + "\n" + "B = " + GA.B2 + "\n" + "B- = " + GA.B3 + "\n" + "C+ = "
				+ GA.C1 + "\n" + "C = " + GA.C2 + "\n" + "C- = " + GA.C3 + "\n" + "D = " + GA.D + "\n" + "F = " + GA.F
				+ "\n");
	}
}
