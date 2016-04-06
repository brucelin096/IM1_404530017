
import java.lang.String;

public class Easter {
	static String calculateEaster(int year) {
		int a = year % 19;
		int b = year / 100;// Math.floor(), -2.
		int c = year % 100;
		int d = b / 4;// Math.floor()
		int e = b % 4;
		int f = ((b + 8) / 25);// Math.floor()
		int g = ((b - f + 1) / 3);// Math.floor()
		int h = ((19 * a) + b - d - g + 15) % 30;
		int i = c / 4;// Math.floor()
		int k = c % 4;
		int l = (32 + (2 * e) + (2 * i) - h - k) % 7;
		int m = ((a + (11 * h) + (22 * l)) / 451);// Math.floor()
		int month = (h + l - (7 * m) + 114) / 31;
		int day = (h + l - (7 * m) + 114) % 31 + 1;

		// 或許你在這邊把字串串接好然後回傳, 是不是就可以印出了呢?
		// return "In " + year + ",Easter Sunday is : month is = " + month+ "
		// day is = " + day;
		
		return String.valueOf(month);
	}

	static String calculateEaster2(int year) {
		int a = year % 19;
		int b = year / 100;
		int c = year % 100;
		int d = b / 4;
		int e = b % 4;
		int f = ((b + 8) / 25);
		int g = ((b - f + 1) / 3);
		int h = ((19 * a) + b - d - g + 15) % 30;
		int i = c / 4;
		int k = c % 4;
		int l = (32 + (2 * e) + (2 * i) - h - k) % 7;
		int m = ((a + (11 * h) + (22 * l)) / 451);
		int month = (h + l - (7 * m) + 114) / 31;
		int day = (h + l - (7 * m) + 114) % 31 + 1;
		return String.valueOf(day);
	}
}
