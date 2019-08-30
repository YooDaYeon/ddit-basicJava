package y_exam;

import java.util.Scanner;

public class Exam_05 {
	public static void main(String[] args){
		
		/*완료
		[5-1] 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명
		하시오. 
		a. int[] arr[]; // 2차 배열 선언
		b. int[] arr = {1,2,3,}; // 마지막 쉼표는 있어도 괜춘
		c. int[] arr = new int[5]; 5개 배열 선언
		d. int[] arr = new int[5]{1,2,3,4,5}; // 두번째 대괄호에는 숫자 넣음 안됨
		e. int arr[5]; // 배열을 선언할 땐 배열 크기를 지정 못함
		f. int[] arr[] = new int[3][];
		정답 : d,e
		*/
		
		
		/*완료
		[5-2] 다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가?
		int[][] arr = {
		{ 5, 5, 5, 5, 5},
		{ 10, 10, 10},
		{ 20, 20, 20, 20},
		{ 30, 30} -> 답 : 2
		};
		*/
		int[][] arr1 = {
				{ 5, 5, 5, 5, 5},
				{ 10, 10, 10},
				{ 20, 20, 20, 20},
				{ 30, 30}
				};
		System.out.println("2번 :" +arr1[3].length);
		/*완료
		[5-3] 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		[연습문제]/ch5/Exercise5_3.java
		class Exercise5_3
		{
		public static void main(String[] args)
		{
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		*
		(1) 알맞은 코드를 넣어 완성하시오.
		*
		System.out.println("sum="+sum);
		}
		}
		[실행결과]
		sum=150
		*/
		int[] arr2 = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i=0;i < arr2.length;i++){
			sum+=arr2[i];
		}
		System.out.println("3번 sum="+sum);
		
		/*완료
		[5-4] 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
		[연습문제]/ch5/Exercise5_4.java
		class Exercise5_4
		{
		public static void main(String[] args)
		{
		int[][] arr = {
		{ 5, 5, 5, 5, 5},
		{10,10,10,10,10},
		{20,20,20,20,20},
		{30,30,30,30,30}
		};
		int total = 0;
		float average = 0;
		*
		(1) 알맞은 코드를 넣어 완성하시오.
		*
		System.out.println("total="+total);
		System.out.println("average="+average);
		} // end of main
		} // end of class
		[실행결과]
		total=325
		average=16.25
		*/
		int[][] arr3 = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		int total = 0;
		float average = 0;
		
		for(int i=0;i<arr3.length;i++){
			for(int j=0;j<arr3[i].length;j++){
				total += arr3[i][j];
			}
		}
		average = (float)total/(arr3.length * arr3[0].length);
		System.out.println("4번 total="+total + "  average=" + average);
		
		/*완료
		[5-5] 다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프
		로그램이다. (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		[참고] Math.random()을 사용했기 때문에 실행결과와 다를 수 있다.
		*/
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i=0; i< ballArr.length;i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
		
		//(1) 알맞은 코드를 넣어 완성하시오.
			for(int k=0;k<ballArr.length;k++){
				if(ballArr[k]==j){
					tmp=ballArr[k];
					ballArr[k]=ballArr[i];
					ballArr[i]=tmp;
				}
			}
		 }
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		//* (2) *
		for(int i=0;i<ball3.length;i++){
			ball3[i]=ballArr[i];
		}
		System.out.print("5번");
		for(int i=0;i<ball3.length;i++) {
			System.out.print(ball3[i]);
		}
		System.out.println();
		/*
		[연습문제]/ch5/Exercise5_5.java
		class Exercise5_5 {
		public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i=0; i< ballArr.length;i++) {
		int j = (int)(Math.random() * ballArr.length);
		int tmp = 0;
		*
		(1) 알맞은 코드를 넣어 완성하시오.
		* }
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		* (2) *
		for(int i=0;i<ball3.length;i++) {
		System.out.print(ball3[i]);
		}
		} // end of main
		} // end of class
		[실행결과]
		486
		*/
				
		/*완료
		[5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변
		수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하
		라. 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. (1)에 알맞은 코드를 넣어서
		프로그램을 완성하시오.
		[Hint] 나눗셈 연산자와 나머지 연산자를 사용해야 한다.
		[실행결과]
		money=2680
		500원: 5
		100원: 1
		50원: 1
		10원: 3
		*/
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("6번 : money="+money);
		for(int i=0;i<coinUnit.length;i++) {
			int a=0;		
			a=money/coinUnit[i];
			System.out.println(coinUnit[i] +"원: " +a);
			money=money-(coinUnit[i]*a);
		}
		
		/*
		[연습문제]/ch5/Exercise5_6.java
		class Exercise5_6 {
		public static void main(String args[]) {
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money="+money);
		for(int i=0;i<coinUnit.length;i++) {
		*
		(1) 알맞은 코드를 넣어 완성하시오.
		* }
		} // main
		}
		[실행결과]
		money=2680
		500원: 5
		100원: 1
		50원: 1
		10원: 3
		*/
		
		/*완료
		[5-7] 문제 5-6에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄
		금액을 입력받아 계산한다. 보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름
		돈이 부족합니다.’라고 출력하고 종료한다. 지불할 돈이 충분히 있으면, 거스름돈을 지불
		한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. (1)에 알맞은 코드를 넣
		어서 프로그램을 완성하시오.
		*/
		if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		int money1 = Integer.parseInt(args[0]);
		System.out.println("7번 : money="+money1);
		int[] coinUnit1 = {500, 100, 50, 10 }; // 동전의 단위
		int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
		for(int i=0;i<coinUnit1.length;i++) {
			int coinNum = 0;
		
//		(1) 아래의 로직에 맞게 코드를 작성하시오.
//		1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
		coinNum=money1/coinUnit1[i];
//		2. 배열 coin에서 coinNum만큼의 동전을 뺀다.
//		(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
		if(coin[i]>=coinNum){
			coin[i] -= coinNum;
		}else{
			coinNum = coin[i];//coin을 많이 빼야는데 갖고 있는 개수가 적어서 최대 개수를 저기 넣음
			coin[i]=0;
		}
//		3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
		money1=money1-(coinUnit1[i]*coinNum);
		System.out.println(coinUnit1[i]+"원: "+coinNum);
		}
		if(money1 > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램을 종료한다.
		}
		System.out.println("=남은 동전의 개수 =");
		for(int i=0;i<coinUnit1.length;i++) {
			System.out.println(coinUnit1[i]+"원:"+coin[i]);
		}		
		 
		
		/*어정쩡
		[5-8] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
		을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
		[연습문제]/ch5/Exercise5_8.java
		3*** 
		2** 
		2** 
		4****
		*/
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		
		for(int i=0; i < answer.length;i++) {
		//* (1) 알맞은 코드를 넣어 완성하시오. * 
			counter[answer[i]-1]++;
			
			/*if(answer[i]==1){
				counter[0]++;
			}else if(answer[i]==2){
				counter[1]++;
			}else if(answer[i]==3){
				counter[2]++;
			}else if(answer[i]==4){
				counter[3]++;
			}
			*/
		}
		System.out.println("8번");
		for(int i=0; i < counter.length;i++) {
		//(2) 알맞은 코드를 넣어 완성하시오.
			System.out.print(counter[i]);
			for(int j=0;j<counter[i];j++){
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		/*복습
		[5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
		[연습문제]/ch5/Exercise5_9.java
		*/
		char[][] star = {
			{'*','*',' ',' ',' '},
			{'*','*',' ',' ',' '},
			{'*','*','*','*','*'},
			{'*','*','*','*','*'}
			};
			char[][] result = new char[star[0].length][star.length];
			
			for(int i=0; i < star.length;i++) {
				for(int j=0; j < star[i].length;j++) {
					System.out.print(star[i][j]);
				}
				System.out.println();
				}
			System.out.println();
			
			for(int i=0; i < star.length;i++) {
				for(int j=0; j < star[i].length;j++) {
			//바꾸는 소스
					result[j][3-i]=star[i][j];
			 }
			}
			for(int i=0; i < result.length;i++) {
				for(int j=0; j < result[i].length;j++) {
				System.out.print(result[i][j]);
				}
			System.out.println();
			}	
	
		/*
		[실행결과]
		**
		**
		*****
		*****
		****
		****
		**
		**
		**
		*/
	
		/*완료
		[5-11] 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열
		의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다. (1)
		에 알맞은 코드를 넣어서 완성하시오.
		[연습문제]/ch5/Exercise5_11.java
		*/
		int[][] score = {
			  {100, 100, 100}
			, {20, 20, 20}
			, {30, 30, 30}
			, {40, 40, 40}
			, {50, 50, 50}
			};
		int[][] result1 = new int[score.length+1][score[0].length+1];
		for(int i=0; i < score.length;i++) {
			for(int j=0; j < score[i].length;j++) {
				result1[i][j]=score[i][j];
				result1[i][score[0].length]+=score[i][j];
				result1[score.length][j]+=score[i][j];
				result1[score.length][score[0].length]+=result1[i][j];
				// 세로의 총합을 더할 생각 말고 각 개수를 더할 생각을 하면 되었던 문제
			}
		}
		for(int i=0; i < result1.length;i++) {
			for(int j=0; j < result1[i].length;j++) {
			System.out.printf("%4d ",result1[i][j]);
			}
		System.out.println();
		}	
		/*	
		[실행결과]
		100 100 100 300
		20 20 20 60
		30 30 30 90
		40 40 40 120
		50 50 50 150
		240 240 240 720
		*/
		
		
		
		
		
		
		
	}
}
