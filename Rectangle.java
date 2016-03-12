/*
 * [A]99
 * [TA's advise]
 * 1.之後作業請依照規定輸出.
 * 2.Rectangletester及Rectangletester1其實是作相同的事情, 沒有必要將其寫成兩份然後再分別呼叫產生物件, 下方有我寫的註解, 提供給你參考.
 * 3.toString必須要透過overridding的方式, 其要求為相同回傳值及相同method name(toString != toString1), 這部分酌量扣1分
 * 4.想想看Double(類別)與double(資料型態)之間的差異, 這部分不影響程式運算所以不予以扣分.
 * */

class Rectangletester {
	String Rectangle1;
	double Height, Width, x, y;

	Rectangletester() {
	}

	Rectangletester(String _Rectangle1, double _Height1, double _Width1, double _x1, double _y1) {
		this.Rectangle1 = _Rectangle1;
		this.Height = _Height1;
		this.Width = _Width1;
		this.x = _x1;
		this.y = _y1;
	}

	String getRectangle1() {
		return this.Rectangle1;
	}

	Double Height1() {
		return this.Height;
	}

	Double Width1() {
		return this.Width;
	}

	Double X1() {
		return this.x;
	}

	Double Y1() {
		return this.y;
	}

	public String toString1() {
		return "[" + this.Rectangle1 + "] " + "Height=" + this.Height + "   " + "Width=" + this.Width + "   " + "x="
				+ this.x + "   " + "y=" + this.y + "\n" + "area=" + Height * Width + "\n" + "primeter="
				+ (Height + Width) * 2;

	}
}

class Rectangletester1 {
	String Rectangle2;
	double Height, Width, x, y;

	Rectangletester1() {
	}

	Rectangletester1(String _Rectangle2, double _Height2, double _Width2, double _x2, double _y2) {
		this.Rectangle2 = _Rectangle2;
		this.Height = _Height2;
		this.Width = _Width2;
		this.x = _x2;
		this.y = _y2;
	}

	String getRectangle2() {
		return this.Rectangle2;
	}

	Double Height() {
		return this.Height;
	}

	Double Width() {
		return this.Width;
	}

	Double X() {
		return this.x;
	}

	Double Y() {
		return this.y;
	}

	public String toString2() {
		return "[" + this.Rectangle2 + "] " + "Height=" + this.Height + "   " + "Width=" + this.Width + "   " + "x="
				+ this.x + "   " + "y=" + this.y + "\n" + "area=" + Height * Width + "\n" + "primeter="
				+ (Height + Width) * 2;
	}
}

public class Rectangle {
	public static void main(String[] args) {

		Rectangletester r1 = new Rectangletester("Rectangle1", 18, 57, 15, 25);
		System.out.println(r1.toString1());

		//可以用下面這段取代掉
		/*
		Rectangletester r2 = new Rectangletester("Rectangle2", 47, 60, 0, 12);
		System.out.println(r2.toString1());
		 */
		
		Rectangletester1 r2 = new Rectangletester1("Rectangle2", 47, 60, 0, 12);
		System.out.println(r2.toString2());

	}
}
