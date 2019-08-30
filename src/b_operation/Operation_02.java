package b_operation;

public class Operation_02 {
	public static void main(String[] args){
		/*
		1. 증감 연산자(++,--)
		  - 증가연산자(++) : 피연산자의 값을 1 증가시킨다
		  - 감소연산자(--) : 피연산자의 값을 1 감소시킨다
	
		 */
		int i1=3;
		i1++;
		System.out.println(i1);
		++i1;
		System.out.println(i1);
		
		int i2=5;
		int i3=++i2; // i2 = 6, i3 = 6
		
		int i4=4;
		int i5=i4++; // i5 = 4, i4 = 5
		System.out.println("i4 : "+i4);
		System.out.println("i5 : "+i5);
		
		int i6=36;
		int i7=12;
		int i8= ++i6 + ++i7 + i6++; // 37+13+37
		// i6 :38  , i7 :13 , i8 : 87
		
		/*
		2.부호연산자 (+,-)
		  - boolean형과 char형에는 사용할 수 없다
		  
		3.비트전환 연산자 (~)
		  - 정수형과 char형에만 사용할 수 있다
		  - 피연산자를 2진수로 표현했을 때 0은 1로 1은 0으로 바꾼다
		
		  10   : 00001010
		 ~10   : 11110101 => -11 10의 1의 보수
		 ~10+1 : 11110110 => -10 10의 2의 보수
		
		*/
		byte b2=10;
		int b3=~b2;//-11
		System.out.println(b3);
		
		/*
		4. 논리부정 연산자(!)
			- boolean형에만 사용 가능
			- true -> false, false -> true
		*/
		
		boolean power = false;
		System.out.println(!power);
		
		power = !power;
		System.out.println(power);
		
		power = !power;
		System.out.println(power);
		
		/*
		5. 산술연산자
		  - 사칙연산자(+,-,*,/), 나머지 연산자(%), 쉬프트연산자(<<,>>,>>>)
		  - 이항연산자 임으로 피연산자의 크기가 4바이트보다 작으면 4바이트형으로 변환 후 연산을 수행
		
		6. 사칙연산자(+,-,*,/)
		  - 두 개의 피연산자 중 자료형의 표현범위가 큰 쪽에 맞춰서 형변환 후 연산을 수행 
		    : int + float => float + float => float 
		    
		  - int형 (4바이트)형보다 작은 크기의 자료형간의 연산 시에는 둘다 int형으로 변환 후 연산
			: byte + char => int + int => int
			
		  - 나눗셈의 경우 0으로 나누는 것은 금지
		*/
		int a =10;
		long b = 30L;
		byte c = 50;
		short d = 600;
		
		// b와 c의 합을 저장할 수 있는 변수 e를 만들어주세요
		long e = (b+c); // 어차피 롱값이니까 뒤에 L안 붙여도됨
		
		// c와 d의 합계를 변수 f에 저장하라
		int f = c+d;
		System.out.println(f);
		
		// 'D', '가', 3.14f 의 합을 변수 g에 저장하라
		char a1='D',a2='가';
		float a3=3.14f;
		
		float a4=a1+a2+a3;
		
		System.out.println(a4);
		
		/*
		7. 나머지 연산자(%)
		  - 왼쪽의 피연산자를 오른쪽 피연산자로 나누고 난 나머지 값을 돌려준다
		  - boolean형에는 사용할 수 없다
		
		*/
		int aa=20;
		int bb=8;
		int cc=aa/bb; //2
		int dd=aa%bb; //4
		
		// 20을 8로 나눈 몫은 2이고 나머지는 4다
		System.out.println(aa+"을 " +bb +"로 나눈 몫은 " +cc +"이고 나머지는 " +dd +"다");
		
		/*
		8. 쉬프트 연산자(<<. >>, >>>)
		  - 정수형 변수에만 사용 가능하다
		  - 피연산자의 각자리(2진수)를 오른쪽 또는 왼쪽으로 이동한다
		  - 곱셈과 나눗셈을 할 때 연산 속도가 좋음으로 사용한다
		  - << : x<<n은 x*2^n
		  - >> : x>>n은 x/2^n
	 
		 */
		
		byte bbb=10;
		System.out.println(bbb<<3); //10*2의3승 = 80
		
		/*
		9. 비교연산자
		 - 두 개의 변수 또는 리터럴을 비교하는 데 사용되는 연산자
		 - 주로 조건문과 반복문의 조건식에 사용되며 연산결과는 boolean형의 결과를 얻는다
		 - 이항연산자다
		 
		10. 대소비교 연산자(<, >, <=, >=)
		  - 기본형의 boolean형을 제외한 나머지 자료형에 사용 가능
		  
		11. 등가비교 연산자( ==, != )
		  - 모든 자료형에 사용 가능(기본형, 참조형 모두 가능)
			
		  	    수식		연산결과
		  	  x < y		x가 y보다 작을 때만 true, 그 외에는 false
		  	  x > y		x가 y보다   클 때만 true, 그 외에는 false
		  	  x <= y	x가 y보다 작거나 같을 때만 true 그 외에는 false
		      x >= y	x가 y보다 크거나 같을 때만 true 그 외에는 false
		  	  x == y	x가 y보다 같을 때만 true 그 외에는 false
		  	  x != y	x가 y보다 다를 때만 true 그 외에는 false
		  
		 */
		
		System.out.println('0' == 0); // 48 == 0 
		System.out.println(0.1 == 0.1f);
		System.out.println(0.5 == 0.5f);
		
		/*
		12. 논리연산자( &&, || )
		  - 피연산자로 boolean형 또는 boolean형 값을 결과로 하는 조건식만을 허용
		  - && (AND결합) : 피연산자 양쪽 모두 true일 때 true의 결과를 얻음
		    || (OR결합) : 피연산자 중 어느 한쪽만 true 이면 true임
		    
		  - &&의 연산우선순위가 ||의 연산우선순위보다 높다
		
		*/
		int x = 10;
		//x의 값이 0이상 15이하이면 true의 결과를 얻도록 하라
		// 0<=x && x<=15
		boolean result = 0<=x && x<=15;
		System.out.println(result);
		
		// 1. 'J'를 저장할 수 있는 변수 ddd를 선언 및 초기화하라
			char ddd='J';
		// 2. ddd의 값이 영어 대문자일 때 true인 조건식을 만들라
			boolean aaa= 'A'<= ddd && ddd <= 'Z';
			System.out.println(aaa);
			
		// 3. ddd의 값이 영어 소문자일 때 true인 조건식을 만들라
			boolean aaaa='a' <= ddd && ddd <= 'z';
			System.out.println(aaaa);
			
		// 4. ddd의 값이 영문자일 때 true인 조건식을 만들라
			boolean bbbb= 'A' <= ddd && ddd <= 'Z' || 'a' <= ddd && ddd <= 'z';
			System.out.println(bbbb);
			
		// 5. ddd의 값이 숫자일 때 true인 조건식을 만들라
			boolean cccc='0' <= ddd && ddd <= '9' ; 
			System.out.println(cccc);
			
		// 6. ddd의 값이 영문자 또는 숫자형 일때 true인 조건식을 만들라
			boolean dddd='A' <= ddd && ddd <= 'Z' || 'a' <= ddd && ddd <= 'z' || '0' <= ddd && ddd <='9';
			System.out.println(dddd);
	
			
		/*
		  13. 비트연산자(&, |, ^)
		    - 이진 비트연산을 수행한다.
		    - 실수형에는 사용할 수 없다.
		    
		    | (OR)  : 피연산자 중 한쪽의 값이 1이면 1의 결과를 얻는다.
		    & (AND) : 피연산자 양쪽 모두 1이면 1의 결과를 얻는다.
		    ^ (XOR) : 피연산자의 값이 서로 다를 때 1의 결과를 얻는다.
		    
		    3  : 00000011
		    5  : 00000101
		  3|5  : 00000111 => 7
		  3&5  : 00000001 => 1
		  3^5  : 00000110 => 5 
		   	
		*/	
		
		/*
		14. 삼항연산자
		  - 세걔의 피연산자를 필요로 하기 때문에 삼항 연산자로 이름 지어 졌다
		  - 기본구조
		  	조건식 ? 식1 : 식2
		
		*/
		int x2 = 10;
		int re1 = x2 > 0 ? x2 : -x2;
		System.out.println(re1);
		
		// 정수값을 저장할 수 있는 변수 x3에 45의 값을 저장하라
		int x3=45;
		// x3의 값이 짝수이면 "짝수", 홀수이면 "홀수"를 저장할 수 있는 result8을 만들라
		String result8 = x3%2==0 ? "짝수" : "홀수";
		System.out.println(result8);
			
		// 1,2,3 중의 한 값을 저장할 수 있는 변수 score 를 선언 및 초기화하라
		int score=3;
		// score의 값이 1이면 '가', 2이면 '나', 3이면 '다'의 값을 저장할 수 있는 변수
		// result9을 만들라
		char result9 = score==1 ? '가' : score==2 ? '나': '다';
		System.out.println(result9);
		
		/*
		15. 대입연산자 ( =, op= )
		  - 변수에 값 또는 수식의 연산 결과를 저장하는 데 사용된다.
		  - 연산자 중 가장 낮은 연산 우선순위를 가진다.
		
		*/
		
		// 변수 i9에 20의 값을 저장하라
		int i9=20;
		
		// i9에 5를 더한 값 i9에 저장하라
		i9 = i9 + 5;
		
		System.out.println(i9);
			
		//i9를 4로 나눗셈한 결과를 i9에 저장하라
		i9 = i9/4;
		System.out.println(i9);
		
		/*
		16. Math.random() // 0 <= Math.random() < 1
		
		*/
		
		int random = (int)(Math.random()*6+1);
		System.out.println(random);
		
		// 1~45까지의 번호 중 하나를 랜덤하게 뽑아 lotto변수에 저장하라
		int lotto=(int)(Math.random()*45+1);
		System.out.println(lotto);
		
		// 0~100 사이의 점수 중 하나를 랜덤하게 뽑아서 score2에 저장하라
		int score2 = (int)(Math.random()*101);
		System.out.println(score2);
		
		/*
		17. 반올림
		  - 
				
		*/
		float ff= 3.141592f;
		
		// 소숫점 네번째 자리에서 반올림하여 세번째 자리까지 표현하라
		// 3.142가 나오면 됨
		// 3.141592 * 1000 => 3141.592
		// 3141.592 + 0.5  => 3142.092
		// (int)3142.092   => 3142
		// 3142/ 1000f     => 3.142
		
		float result10 = (int)(ff*1000+0.5)/1000f;
		System.out.println(result10);
		
		// 465.2653의 값을 소숫점 둘째자리에서 반올림하여 첫째자리까지 표현하라
		// r1*10 	   => 4652.653
		// r1*10 + 0.5 => 4653.153
		// (int)(r1*10 + 0.5) => 4653
		// (int)(r1*10 + 0.5) / 10f => 465.3
		
		float r1 = 465.2653f;
		r1 = (int)(r1*10 + 0.5) / 10f;
		System.out.println(r1);
		
		
		
	}
}
