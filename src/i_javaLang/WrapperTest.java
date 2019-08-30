package i_javaLang;

public class WrapperTest {
	public static void main(String[] args) {
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1==i2); //주소비교이기에 false
		System.out.println(i1.equals(i2));//equals는 오버라이딩을 통해 값비교를 하게 함
		
		System.out.println(i1); //toString메서드가 오버라이딩 되어있어서 값 출력

		Integer i3=i1;
		
		int i4 = new Integer(200);
		
		Object[] a = new Object[3];
		a[0]=20;
		
		int i5=(int)a[0];
		
		
		
		
		
		System.out.println(100==i1);
		
		
		//1. 최대, 최소값
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE); // bit수
		
		//Bytes => byte
		//Integer.BYTES => 4
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
