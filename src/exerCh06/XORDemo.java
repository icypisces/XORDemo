package exerCh06;

public class XORDemo {

	public static void main(String[] args) {
		long x = 24L;		//000...00011000
		long y = 18L;		//000...00010010
		
		long r = x & y;		//000...00010000 => 16
		long s = x | y;		//000...00011010 => 26
		long z = x ^ y;		//000...00001010 => 10
		System.out.println("x=" + x);			//原資料    加密用 
		System.out.println("y=" + y);			//加密用    原資料
		System.out.println("z=" + z);			//加密後
		System.out.println("-----------------------");
		System.out.println("z^x=" + (z^x));		//z用x還原=>y
		System.out.println("z^y=" + (z^y));		//z用y還原=>x
		
		
		//將x的值貼到小算盤(10進位)，再轉換為2進位．
		//將y的值貼到小算盤(10進位)，再轉換為2進位．
		//將兩個值靠右對齊(左不足則補零)，進行互斥或運算(相同為false=>0，相異為true=>1)．
		//取得值後貼到小算盤(2進位)，再轉換為10進位，必與z相同．
		//故z為x與y分別轉為2進位後，進行互斥或運算，再轉換為10進位所得之值．
		
		
		System.out.println("-----------------------");
		System.out.println("r=" + r);
		System.out.println("s=" + s);
	}

}
