package f_OOP2;

public class InnerEx01 {

	class InstanceInner{//인스턴스 클래스
		int iv=100;
		//static int cv=200; 클래스변수 선언 불가
		static final int CON=200; //상수는 사용 가능
		
	}
	
	static class StaticInner{//스태틱 클래스
		static int cv=10;
		int iv=4000;
	}
	
	void method(){
		class LocalInner{
			int iv=40;
			//static int cv=50; 못씀
		}
		
	}
	
	
	
	
	
	
	
}
