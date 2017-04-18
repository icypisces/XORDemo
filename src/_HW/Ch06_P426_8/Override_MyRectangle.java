package _HW.Ch06_P426_8;

import _HW.Ch06_P426_7.MyRectangle;

public class Override_MyRectangle extends MyRectangle {
	
	private double width;
	private double depth;
	
	Override_MyRectangle(double width, double depth) {
		super(width, depth);
		this.width = width;
		this.depth= depth;
		// TODO Auto-generated constructor stub
	}
	
	Override_MyRectangle() {
		super();
	}
	
	Override_MyRectangle R1 = new Override_MyRectangle(10,20);
	Override_MyRectangle R2 = new Override_MyRectangle(10,20);
	Override_MyRectangle R3 = new Override_MyRectangle(20,10);

	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	
	

}
