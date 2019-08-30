package c_sentence;

public class Sentence_01 {
	public static void main(String[] args) {
		// ctrl + spacebar + enter
		/*
		1.조건문 (if, switch)
		  - 조건식과 문장을 포함하는 블럭{}으로 구성됨
		  - 조건식과 연산결과에 따라 프로그램의 실행흐름을 변경할 수 있음
		  
		2. if문
		  - 구조
		   1) 기본구조
		     if(조건식){
		     	조건식이 true일 때 수행될 문장
		     } 
		     
		   2) 1단변신
		   		if(조건식){
		   			조건식이 true일 때 수행될 문장
		   		} else {
		   			조건식이 false일 때 수행될 문장
		   		}
		   		
		   3) 2단변신
		   		if(조건식){						범위 지정 후 ctrl + alt + 아래화살표 : 밑에 복사
		   			조건식이 true일 때 수행될 문장
		   		} else if(조건식2){
		   			조건식이 false이고 조건식2가 true일 때 수행될 문장
		   		} else{
		   			조건식1과 조건식2가 false일 때 수행될 문장
		   		}
		 
		*/
		int a = -20;
		
		if(a>0){
			System.out.println("양수");
		} else if(a<0){
			System.out.println("음수");
		} else
			System.out.println("0이다");
		
		boolean power=true;
		
		//power의 값이 true이면 "불켜졌습니다"를 출력하라
		if(power==true){
			System.out.println("불켜졌습니다");
		}else{
			System.out.println("불꺼졌습니다");
		}
		
		// 0(포함)~100(포함)의 정수값을 저장할 수 있는 변수 score를 선언 및 랜덤한 값으로 초기화하라
		int score = (int)(Math.random()*101);
		// score의 점수가 90점 이상이면 "A"출력
		// score의 점수가 80점 이상이면 "B"출력
		// score의 점수가 70점 이상이면 "C"출력
		// score의 점수가 60점 이상이면 "D"출력
		// score의 점수가 60점 미만이면 "나가"출력
		if(score>=90){
			System.out.print("A");
			
			if(score>=95){
				System.out.println("+");
			}else
				System.out.println("-");
		
		}else if(score>=80){
			System.out.print("B");
			
			if(score>=85){
				System.out.println("+");
			}else
				System.out.println("-");
		}else if(score>=70){
			System.out.print("C");
			
			if(score>=75){
				System.out.println("+");
			}else
				System.out.println("-");
		}else if(score>=60){
			System.out.print("D");
			if(score>=65){
				System.out.println("+");
			}else
				System.out.println("-");
		}else
			System.out.println("나가");
		
		// 위 문장을 switch문으로 변경
		// 단, case는 5개 default1개로 구성
		switch(score/10){
		case 10: case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("나가");
		
		}
		
		
			
	
	
		
		/*
		2. switch문
		  - 조건의 경우가 많을 때는 if문 보다는 switch문을 사용하는 것이 더 알아보기 쉬움
		  - 조건의 결과값으로 int형 범위의 정수값을 허용
		  - 구조
		    switch(조건식){ //값
		    case 값1 : 
		    	조건식과 값1이 동일할 경우 수행
		    	break;	
		    case 값2 : 
		    	조건식과 값2이 동일할 경우 수행	
		    	break;
		    default :
		    	조건식과 일치하는 case가 없을 때 수행
		    }
		*/
		
		//1에서5사이의 랜덤한 값을 저장하는 변수 random을 선언 및 초기화하라
		int random = (int)(Math.random()*5+1);
		
		// random의 값이 5이면 "강남에 아파트 100평 당첨"을 출력하라
		// random의 값이 4이면 "강남에 아파트 40평 당첨"을 출력하라
		// random의 값이 3이면 "부가티 풀옵셥 당첨"을 출력하라
		// random의 값이 2이면 "샤넬백 당첨"을 출력하라
		// random의 값이 1이면 "교보빌딩 10채 내놔"을 출력하라
		
		switch(random){
		case 5 :
			System.out.println("강남에 아파트 100평 당첨");
			break;
		case 4 :
			System.out.println("강남에 아파트 40평 당첨");
			break;
		case 3 :
			System.out.println("부가티 풀옵셥 당첨");
			break;
		case 2 :
			System.out.println("샤넬백 당첨");
			break;
		case 1 :
			System.out.println("교보빌딩 10채 내놔");
			break;
		}
		
		
		
		
	}

}
