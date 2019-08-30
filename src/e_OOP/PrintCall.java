package e_OOP;

public class PrintCall {
	public static void main(String[] args) {
		
		CallTest call = new CallTest();
		
		int r1=call.add();
		System.out.println(r1); //1
		int r2=call.add(3);
		System.out.println(r2); //2
		long r3=call.add(5L);
		System.out.println(r3); //3
		int r4=call.add(5,6);
		System.out.println(r4); //4
		long r6=call.add(1L,3L);
		System.out.println(r6); //6
		long r7=call.add(2,3L);
		System.out.println(r7); //7
		
	}
}

class CallTest{
	
	int a1=3;
	int b1=5;
	
	long a2=6L;
	long b2=8L;
	
	//1. a1과 b1의 합을 반환하는 메서드를 만들라 add
	int add(){
		int sum=a1+b1;
		return sum;
	}
	//2. int형 매개변수 하나를 받아서 b1과의 합계를 반환하는 메서드를 만들라 add
	int add(int a){
		int sum=a+b1;
		return sum;
	}
	
	//3. long형 매개변수 하나와 a2의 합계를 반환하는 메서드를 만들라 add
	long add(long a){
		long sum=a+a2;
		return sum;
	}
	
	//4. int형 매개변수 두 개를 받아서 a1,b1 그리고 매개변수 두개의 합을 반환하는 메서드를 생성하라 add
	int add(int a,int b){
		int sum=a+b+a1+b1;
		return sum;
	}
	
	//5. int형 매개변수 두 개를 받아서 a2,b2 그리고 매개변수 두개의 합을 반환하는 메서드를 생성하라 add
//	int add(int a,int b){
//		int sum=a+b+a2+b2;
//		return sum;
//	}
	
	//6. long형 매개변수 두개를 받아서 매개변수의 합을 반환하는 메서드를 만들라 add
	long add(long a, long b){
		long sum=a+b;
		return sum;
	}
	
	//7. int형 매개변수 하나와 long형 매개변수 하나를 받아서 그 합을 반환하는 메서드를 만들라 add
	long add(int a,long b){
		long sum=a+b;
		return sum;
	}
	
}
