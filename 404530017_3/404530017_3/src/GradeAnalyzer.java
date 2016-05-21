import java.util.ArrayList;

class MyCount {
	String name;
	int cnt;

	MyCount() {
	}

	MyCount(String _name, int _cnt) {
		this.name = _name;
		this.cnt = _cnt;
	}

	public String toString() {
		return this.name + " = " + this.cnt;
	}
}

public class GradeAnalyzer {
	int CntUserInput = 0, A1 = 0, A2 = 0, A3 = 0, B1 = 0, B2 = 0, B3 = 0, C1 = 0, C2 = 0, C3 = 0, D = 0, F = 0;
	double Total = 0, SD = 0, Avg = 0, GetNum = 0, SDtemp = 0;
	ArrayList<Double> NumScore = new ArrayList<Double>();

	boolean Test = true;

	// 其實我覺得這邊宣告為靜態變數有點多餘.
	static boolean inValidGrade(double aGrade) {
		if (aGrade <= 110 && aGrade >= 0) {
			return true;
		}
		return false;
	}

	void addGrade(double aGrade) {
		// 你這個Test從來就沒改變, 其實是多餘的喔.
		if (Test) {
			// 何不先檢查是否正確再放進去呢?
			NumScore.add(aGrade);
			if (aGrade > 110 || aGrade < 0) {
				NumScore.remove(aGrade);
			}
			if (aGrade <= 110 && aGrade >= 98) {
				A1++;
			} else if (aGrade < 98 && aGrade >= 92) {
				A2++;
			} else if (aGrade < 92 && aGrade >= 90) {
				A3++;
			} else if (aGrade < 90 && aGrade >= 88) {
				B1++;
			} else if (aGrade < 88 && aGrade >= 82) {
				B2++;
			} else if (aGrade < 82 && aGrade >= 80) {
				B3++;
			} else if (aGrade < 80 && aGrade >= 78) {
				C1++;
			} else if (aGrade < 78 && aGrade >= 72) {
				C2++;
			} else if (aGrade < 72 && aGrade >= 70) {
				C3++;
			} else if (aGrade < 70 && aGrade >= 60) {
				D++;
			} else if (aGrade < 60 && aGrade >= 0) {
				F++;
			}

		}

	}

	void analyzeGrade() {
		for (int i = 0; i < NumScore.size(); i++) {
			Total += NumScore.get(i);
		}
		CntUserInput = NumScore.size();
		Avg = Total / CntUserInput;
		for (int i = 0; i < NumScore.size(); i++) {
			SDtemp += (NumScore.get(i) - Avg) * (NumScore.get(i) - Avg);
		}
		SD = Math.round((Math.sqrt(SDtemp / CntUserInput)));
	}

	public String toString() {

		return "The grade distribution is: " + "\n" + "A+ = " + A1 + "\n" + "A = " + A2 + "\n" + "A- = " + A3 + "\n"
				+ "B+ = " + B1 + "\n" + "B = " + B2 + "\n" + "B- = " + B3 + "\n" + "C+ = " + C1 + "\n" + "C = " + C2
				+ "\n" + "C- = " + C3 + "\n" + "D = " + D + "\n" + "F = " + F + "\n";
	}
}
