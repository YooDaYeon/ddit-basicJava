package a_variable;

public class VariableType {
	public static void main(String[] args){
		
		/*
		 변수의 타입
		 
		 1. 기본형타입(primitive type)
		 	- boolean, char, byte, short, int, long, float, double
		 
		 
		 2. 참조형타입(reference type) 
		 	- 주소를 저장하는데 사용
		 	- 4byte의 저장공간 가짐
		 
		*/
		
		// 정수 50을 저장할 수 있는 변수를 선언 및 초기화하기
		int 	   i	=50;
	//	[변수타입] [변수명]
		/*
		 1. 종류
		 	- 논리형 : true, false 중 하나의 값을 가짐 ex) boolean
		 	- 문자형 : 단 하나의 문자 저장 ex) char
		 	- 정수형 : 정수만 저장 가능 ex) byte, short, int, long
		 	- 실수형 : 실수를 저장 가능 ex) float, double
		 
		 2. 기본형 변수의 크기(1byte=8bit)
		 	- 1byte : boolean, byte
		 	- 2byte : char,short
		 	- 4byte : float,int
		 	- 8byte : double,long
		  */
		//변수명 power 값은 true를 저장해주세요
		boolean power=true;
		//변수명 lang 값은 'A'
		char lang='A';
		
		/*
	
		3. 논리형 - boolean(기본값 false)
			- boolean형 변수에는 true와 false 중 하나를 저장할 수 있다.
			- boolean형 변수는 대답(yes,no), 스위치(on/off)등의 논리구조에 주로 사용
			- 데이터를 다루는 최소단위가 1byte임으로 1byte의 크기를 가짐
		 */
		// 변수명 answer, 값 true
		boolean answer=true;
		
		/*
		4. 문자형 - char
			- java는 Unicode문자 체계를 이용하기 때문에 2byte의 크기를 가짐
			
		 */
		char c='A';
		char d='\u0041';
		char e=65;
		
		System.out.println(e);
		/*
		5. 정수형 - byte, short, int, long
			- 기본 자료형은 int
			- 변수에 저장하려는 정수값의 범위에 따라 4개의 정수형 중 하나를 선택하면 됨
			- byte, short의 경우 크기가 작아서 범위를 넘어서는 경우가 많음
				그래서 대표형인 int형을 많이 사용
	
		 */
		// 정수값 50 저장할 수 있는 변수를 선언 및 초기화 하기
			byte aa=50;
		// 정수값 30000을 저장할 수 있는 변수를 선언 및 초기화 하기
			short bb=30000;
		// 정수값 1000000을 저장할 수 있는 변수를 선언 및 초기화 하기
			int cc=1000000;
		// 정수값 5000000000을 저장할 수 있는 변수를 선언 및 초기화 하기
			long dd=5000000000l;
			
			byte qq=126;
			System.out.println(qq);//126
			qq++;
			System.out.println(qq);//127
			qq++;
			System.out.println(qq);//-128 오버플로우
			qq++;
			System.out.println(qq);//-127
			
			// overflow
			// 변수가 자신이 저장할 범위를 넘었을 때 최솟값부터 다시 표현하는 현상
			
		/*
		6. 실수형 -float, double
			- 실수를 저장하는 데 사용
			- float : 1+8+23
			- double : 1+11+52
			- 실수형 중 사용할 자료형을 선택할 때는 값의 범위만이 아닌 
				정밀도도 중요한 요소가 됨

		*/
		
		// 3.14159254862 float 타입 변수에 저장
			float f=3.14159254862f;
		// 3.14159254862 double타입의 변수에 저장
			double fd=3.14159254862;
			
			System.out.println(fd);
		
			System.out.println(0.1==0.1f); //왼쪽은 double형 오른쪽은 float형인데 2의 -n승만 표현 가능해서 0.1은 0.1에 근접한값이고
			System.out.println(0.5==0.5f); // 0.5로는 값이 떨어지기에 true가 나옴
			
			/*
			7. String : 문자열 (참조형)
			  - 기본값 : null
			
	
			*/
			String name="";// null은 주소가 없는 것, ""은 주소가 있는데 값이 없음
			
			String a1=7+"5";//7은 int 5는 String형인데 둘이 연산할 수 없어서 더 센 형인 String형으로 바꿔서 75라는 문자열 생성
			
			String a2=" "+7;
			System.out.println(a2);//공백+7
			
			String a3=7+7+"6";//왼쪽부터 계산을 실행하기 때문
			System.out.println(a3);
			
			String a4=7+"6"+7;
			System.out.println(a4);
			
			String a5="hi"+true;//문자열이 세기에 true도 그냥 문자열로 만들어버림
			System.out.println(a5);
			
			int i1=67;
			byte b1=(byte)i1; //cast 연산자
			
			short c1=(short)i1;
			
			long d1=i1;//문제 없어서 앞에 생략
			
			/*
			기본형의 형변환
			byte < short < int < long < float < double  : 포함 관계
				    char <
			*/
			
			// 45.67과 23.1432의 합에서 정수 부분만 저장하라
			float e1=45.67f;
			float e2=23.1432f;
			
			float e3=e1+e2;      int e5=(int)(e1+e2);
			int e4=(int)e3;
			
			System.out.println(e4);
			System.out.println(e5);
			
			// 'F'를 변수에 저장하라 aa1
			char aa1='F';
			// 3.141592를 변수에 저장하라 aa2
			float aa2=3.141592f;
			// aa1과 aa2를 더했을 때  결과를 문자로 만들어라 
			System.out.println((char)(aa1+aa2));
			
			
			
			
			
			
			
			
			
			
			
			
	}
}
