/*
 * [A]100
 * [TA's advise]
 * 1.Good Job!
 * */

class RectangleTester {
	String name;
	double Height;
	double Width;
	double x;
	double y;

	// RectangleTester(){this("empty",-1,-1,-1,-1);}//���������l�Ʒ|���A���{����n
	
	public RectangleTester(String name, double Heigh, double Width, double x, double y) {
		this.name = name;
		this.Height = Heigh;
		this.Width = Width;
		this.x = x;
		this.y = y;
	}

	double getHeigh() {
		return this.Height;
	}

	double getWidth() {
		return this.Width;
	}

	public String toString() {
		return "java.Rectangle[x=" + this.x + ",y=" + this.y + ",width=" + this.Width + ",heigh=" + this.Height + "]";
	}
	// �W���O���F�мg�榡 ���L�ŦX�ڭ̭n���榡

}

public class Rectangle {

	public static void main(String[] args) {
		RectangleTester S1 = new RectangleTester("S1", 18, 57, 15, 25);

		System.out.println(S1);
		System.out.println("Area=" + S1.getHeigh() * S1.getWidth());
		System.out.println("Perimeter=" + (S1.getHeigh() + S1.getWidth()) * 2);
		RectangleTester S2 = new RectangleTester("S1", 47, 60, 0, 12);
		System.out.println(S2);
		System.out.println("Area=" + S2.getHeigh() * S2.getWidth());
		System.out.println("Perimeter=" + (S2.getHeigh() + S2.getWidth()) * 2);
		System.out.println("�{������");
	}

}
