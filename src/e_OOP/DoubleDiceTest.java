package e_OOP;

public class DoubleDiceTest {
	public static void main(String[] args) {
	//throwDice호출 총 이동거리를 반환	
		DoubleDice test = new DoubleDice();
		int result1=test.throwDice();
		System.out.println("결과 : " +result1);
	}
}


class DoubleDice{
	//전역변수 없음
	//메서드명 : throwDice
	//인스턴스 메서드
	int throwDice(){
			int result=0;
		
			int x=(int)(Math.random()*6+1);
			int y=(int)(Math.random()*6+1);
			
			if(x!=y){
				System.out.println(x +" " +y);
			}else if(x==y){
				System.out.println(x +" " +y +" 한번 더");
				result=throwDice();
			}
			
			result+=(x+y); // result+x+y
			//int result=x+y;
			//if(x==y)result+=throwDice();  한문장으로 해결 가능
			
			return result;
	}
	
	
}