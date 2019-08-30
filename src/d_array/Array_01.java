package d_array;

import java.util.Scanner;

public class Array_01 {
	public static void main(String[] args) {
		/*
		1. 배열(Array)이란?
		  - 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것
		  - 3과목 점수
		  	: int mathScore = 20;
		  	: int korScore = 70;
		  	: int engScore = 60;
		  	
		2. 배열의 선언
		  - 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 알리는 대괄호를 붙이면 됨
		  
		   	ex) 변수타입[] 변수명;
		  		변수타입 변수명[];
		  		
		3. 배열의 생성  	
		  - 배열을 선언한 다음에는 배열을 생성해야 된다.
		  - 배열 생성을 위해서는 연산자 'new'와 함께 배열의 크기를 지정해 주어야 한다.
		    ex) int[] a = new int[5];	
		    	int[] a = new int[5]{0,10,20,30,40};
		  		int[] a = {0,10,20,30,40}; // 분할 X
		  		int[] a;
		  		a = new int[]{0,10,20,30,40}; //분할 O
		*/
		int[] a = new int[5]; //5개의 방 => a.length : 5
		
		System.out.println(a[0]); // a를 출력하면 a의 주소 출력
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
	
		for(int i=0;i<5;i++){
			System.out.printf("a[%d]\n",i);
		}
		
		// 0 : 10
		
		// 1 : 20
		
		// 2 : 30
		
		// 3 : 40
		
		// 4 : 50
		
		int sum=0;
		for(int i=0;i<5;i++){
			sum += 10;
			a[i]= sum;
			System.out.printf("%d : %d\n",i,a[i]);			
		}
		
		// 7개의 정수값을 저장할 수 있는 변수 score를 선언 및 생성
			int[] score= new int[7];
		
		// score 변수 각방의 값 출력
			for(int i=0;i<score.length;i++){
				System.out.println(score[i]);
			}
		
		// score의 각방의 값을 0~100사이의 랜덤한 값을 저장하라
			for(int i=0;i<score.length;i++){
				score[i]=(int)(Math.random()*101);	
				System.out.println("랜덤값:" + score[i]);
			}
		
		// 랜덤한 값들의 합	
			int sum1=0;
			for(int i=0;i<score.length;i++){
	
				sum1+=score[i];
			}
			System.out.println("합계: " +sum1);
		
		// 평균 세번째에서 두번째자리까지 구하는것	
			float average=0;
			
			average=(int)(((float)sum1/score.length+0.005f)*100)/100f;
	
			System.out.println("평균: " +average);
			
		// 배열 안에서의 최댓값	
			int max=score[0];
			
			for(int i=0;i<score.length;i++){
				
				if(max<score[i]){
					max=score[i];
					
				}
			}
			System.out.println("최댓값 : " +max);
			
			
		// 배열 안에서의 최솟값	
			
			int min=score[0];
			
			for(int i=0;i<score.length;i++){
				
				if(min>score[i]){
					min=score[i];
				}
				
			}
			System.out.println("최솟값 : " +min);
			
		// 3과목의 정수값을 저장할 수 있는 변수를 선언 및 생성 threeSub
			int[] threeSub = new int[3];
		// 3과목의 값을 사용자로부터 입력받음
			/*for(int i=0;i<threeSub.length;i++){
				System.out.println("값을 입력하시오");
				Scanner scanner = new Scanner(System.in);
				threeSub[i]=scanner.nextInt();
			}
			*/
			
		// 3과목의 합계 
			int sum2=0;
			for(int i=0;i<threeSub.length;i++){
				sum2 += threeSub[i];
			}
			System.out.println("합계 : " +sum2);
			
		// 3과목의 평균
			int avg=0;
			
			avg=sum2/threeSub.length;
			
			System.out.println("평균 : " + avg);
			
		// 정수 6개를 저장할 수 있는 변수 lotto 선언 및 생성
			int[] lotto = new int[6];
		// 1~45 사이의 랜덤한 정수값으로 lotto의 모든방에 입력하라
		// 단. 정수값은 중복되면 안됨
			
			System.out.println("로또: ");
			for(int i=0;i<lotto.length;i++){
				lotto[i]=(int)(Math.random()*45+1);

				for(int j=1;j<i+1;j++){
					if(lotto[j]==lotto[i]){
						
						lotto[j]=(int)(Math.random()*45+1);	
						
						
					}
	
				}
				System.out.print(lotto[i] +" ");
			}
			
		
			
			
			
			
	}
}
