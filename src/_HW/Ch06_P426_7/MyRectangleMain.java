package _HW.Ch06_P426_7;

public class MyRectangleMain {

	public static void main(String[] args) {
		
		MyRectangle R1 = new MyRectangle(10,20);
		System.out.println( "R1�����n��:" + R1.getArea() );
		
		MyRectangle R2 = new MyRectangle();
		R2.setWidth(10);
		R2.setDepth(20);
		System.out.println( "R2�����n��:" + R2.getArea() );
	}

}
