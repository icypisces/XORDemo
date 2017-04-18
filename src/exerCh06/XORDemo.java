package exerCh06;

public class XORDemo {

	public static void main(String[] args) {
		long x = 24L;		//000...00011000
		long y = 18L;		//000...00010010
		
		long r = x & y;		//000...00010000 => 16
		long s = x | y;		//000...00011010 => 26
		long z = x ^ y;		//000...00001010 => 10
		System.out.println("x=" + x);			//����    �[�K�� 
		System.out.println("y=" + y);			//�[�K��    ����
		System.out.println("z=" + z);			//�[�K��
		System.out.println("-----------------------");
		System.out.println("z^x=" + (z^x));		//z��x�٭�=>y
		System.out.println("z^y=" + (z^y));		//z��y�٭�=>x
		
		
		//�Nx���ȶK��p��L(10�i��)�A�A�ഫ��2�i��D
		//�Ny���ȶK��p��L(10�i��)�A�A�ഫ��2�i��D
		//�N��ӭȾa�k���(�������h�ɹs)�A�i�椬���ιB��(�ۦP��false=>0�A�۲���true=>1)�D
		//���o�ȫ�K��p��L(2�i��)�A�A�ഫ��10�i��A���Pz�ۦP�D
		//�Gz��x�Py���O�ର2�i���A�i�椬���ιB��A�A�ഫ��10�i��ұo���ȡD
		
		
		System.out.println("-----------------------");
		System.out.println("r=" + r);
		System.out.println("s=" + s);
	}

}
