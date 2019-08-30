package c_sentence;

import java.util.Scanner;

public class Sentence_02 {
	public static void main(String[] args){
		/*
		1. 반복문(for, while, do-while)
			- 어떤 작업ㅇ르 반복적으로 수행되도록 할 때 사용
			- 반복문은 주어진 조건이 만족하는 동안 주어진 문장을 반복적으로 수행함으로
			  조건식을 포함
			- for문은 반복횟수를 알 때 활용, while문은 반복 횟수를 모를 때 사용
			
		2. for문
			- 기본구조
			  for(초기화; 조건식; 증감식){
			  	조건식이 만족될 때 수행될 문장
			  }
		 
		 
		*/
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);

		// 0 -> 10 증가량 1씩
		for(int i=0; i<11; i++){ //자바는 끝은 미포함 형태로 만듦
		 System.out.println(i);
		}
		
		// 1~10까지의 합계를 구하라
		int sum=0;
		for(int i=1;i<11;i++){
			sum += i;
		}
		System.out.println(sum);
		
		// 34(미포함)~95(포함)까지의 홀수일 때의 합계를 구하라
		int sum1=0;
		
		for(int i=35;i<96;i++){
			if(i%2==1){
				sum1+=i;
			}
		}
		System.out.println(sum1);
		// ctrl + shift + b 누르면 누른 곳까지만 컴파일함, f11 : 디버깅 모드로 사용하는 단축키
		// 나오는 화면에서 왼쪽위는 쓰레드, 오른쪽 위는 변수와 breakpoint 찍은 위치
		
		// 2 * 1 =2 형식으로 2단 출력
		for(int i=2;i<9;i++){ 
			for(int j=1;j<10;j++){
				if(i%2==1&&j%2==0){
				System.out.printf("%d * %d = %d\n",i,j,i*j);
				}
			
			}
		}
		
		/*
		3. while문
			- 조건식과 수행되어야할 블럭{}만으로 구성됨
			- 카운터로 사용할 변수의 증감식을 함께 사용해 for문과 같이 구성할 수 있음
			- 구조
				while(조건식){
					조건식이 true일 때 수행될 문장
				}
			
		*/
		
		for(int i=0;i<11;i++){
			System.out.println(i);
		}
		
		int num=0;
		while(num<11){
			System.out.println(num);
			num++;
		}
		
		// 1~10 합계
		int n1=1;
		int sum2=0;
		
		while(n1<11){
			if(n1%2==1){
			sum2+=n1;
			}
			n1++;
			
		}
		System.out.println("while합계 : " +sum2);
		
		// 1~?까지의 합이 100보다 커지는 ?의 값은?
		int i3=0,sum3=0;
		
		while(true){
			
			if(sum3>100)
				break;
			
			i3++;
			sum3 += i3; // 이 문장을 맨 위에 둬도 됨
			
	
		}
		System.out.println(i3);
		
	
		/*
		4. do-while
			- while문의 변형으로  기본구조는 while문과 유사하나 {}을 먼저 수행하고 조건식을 판단한다
			- 기본구조
			  do{
			  
			  }while(조건식);
			
		*/
		//Scanner sc = new Scanner(System.in); //콘솔창에서 입력받을 수 있는 환경구성
		//int result = sc.nextInt(); //int형 정수값만 받을 때 사용 가능,범위도 int값만큼 가능
		//System.out.println(result);
		
		
		/*System.out.println("문자를 입력해주시오");
		String str = sc.next();
		System.out.println(str);
		*/
		
		//문장을 입력 받아서 입력받은 문장을 출력
		//단, 입력받은 문장이 "x"이면 종료
		
		/*
		String str="";
		
		do{
			
			System.out.println("문자를 입력해주시오");
			str = sc.next(); // 콘솔창에 문자열을 받을 준비
			System.out.println(str);
			
		}while(!str.equals("x")); //do 안의 변수는 while문에서 사용하는 변수랑 다름
		*/
		
		//continue : for문은 증감식, while문은 조건식으로 이동
		
		
		
	}

}
