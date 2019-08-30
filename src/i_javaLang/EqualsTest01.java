package i_javaLang;

public class EqualsTest01 {
	public static void main(String[] args) {
		//2. Value클래스의 객체를 만들라 v1, 인자값 10
		Value v1 = new Value(10);
		//3. Value클래스의 객체를 만들라 v2, 인자값 10
		Value v2 = new Value(10);
		
		System.out.println(v1==v2); //false
		
		System.out.println(v1.equals(v2)); //false 주소비교
		
		v2=v1;
		
		System.out.println(v1.equals(v2)); //true 주소비교
		
		
		
		
		
		
		
		
		
	}
}


class Value{
	
	int value;
	
	//1.매개변수가 하나인 생성자
	Value(int a){
		
	}
	
	
	
	
	
}