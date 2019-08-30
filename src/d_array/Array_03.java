package d_array;

public class Array_03 {
	public static void main(String[] args) {
		
		/*
		1. 다차원 배열
		  - 자바에서는 1차원 배열뿐만 아니라 2차원 이상의 다차원 배열로 허용
		  
		2. 2차원 배열
		  - 배열의 선언
		   int[][] a;
		   int a[][];
		   int[] a[];
		   
		   - 배열의 생성
		   	 int[][] a = new int[3][4]; 뒤의 배열 크기는 안써줘도 됨
		   	 
		
		
		*/
		
		int[][] a = new int[3][];
		a[0] = new int[2];
		a[1] = new int[4];
		a[2] = new int[3];
		
		/*
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[1][2]=50;
		a[1][3]=60;
		a[2][0]=70;
		a[2][1]=80;
		a[2][2]=90;
		*/		
		
		int sum=0;
		
	
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				sum += 10;
				a[i][j]+=sum;

				System.out.println("a[" +i +"]" +"[" +j +"] = " + a[i][j]);
			}
			
		}
		
		
		int sum1=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				
				sum1 += a[i][j];
				
			}
			
		}
		System.out.println("총합계 : " + sum1);
		
		
		int count=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				
				count++;
			}
			
		}
		
		System.out.println(count);
		System.out.println("총평균" + (float)sum1/count);
		
		
		// 6명의 이름을 저장할 수 있는 변수 name을 선언하고 주변친구 6명의 이름으로 초기화하라
		String name[] = {"박영춘","유민하","손영하","김환석","손주형","김두한"};
		// 국 영 수 사 과 오라클 자바
		String subject[]={"국","영","수","사","과","오라클","자바"};
		// 6명의 7과목의 점수를 저장할 수 있는 변수 score를 선언 및 생성하라
		int score[][] = new int[name.length][subject.length];
		
		
		// score 각방의 점수를 0~100점 사이의 랜덤한 점수로 변경하라
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				score[i][j]=(int)(Math.random()*101);
			}
		}
		
		// 사람별 합계
		int sum2[]=new int[name.length];
		for(int i=0;i<score.length;i++){
			for(int j=0;j<score[i].length;j++){
				sum2[i]+=score[i][j];
			}
		}	
		
		// 평균
		float avg[]=new float[name.length];
		for(int i=0;i<score.length; i++){
			avg[i]=(int)(((float)sum2[i]/score[i].length+0.005f)*100)/100f;
		}	
		
		//과목별 합계
		int sum3[]=new int[subject.length];
		for(int i=0;i<subject.length;i++){
			for(int j=0;j<name.length;j++){
				sum3[i]+=score[j][i];
			}
		}
		
		// 과목별 평균
		float avg1[]=new float[subject.length];
		for(int i=0;i<subject.length;i++){
			avg1[i]=(int)(((float)sum3[i]/name.length+0.005f)*100)/100f;
		}
		
		// 석차	
		int rank[] = new int[name.length];
		for(int j=0;j<score.length;j++){
			rank[j]=1;
			for(int i=0;i<score.length;i++){
				if(sum2[j]<sum2[i]){
					rank[j]++;
				}
			}
		}
					
		// 출력문
		System.out.print("\t");
		for(int k=0;k<subject.length;k++){
			System.out.print(subject[k] +"\t" );
		}
		System.out.print("합계\t");
		System.out.print("평균\t");
		System.out.print("석차\t");
		
		System.out.println();
		
		for(int i=0;i<score.length;i++){
			System.out.printf(name[i] +"\t");
			for(int j=0;j<sum3.length;j++){
				System.out.print(score[i][j] +"\t");
			}
			System.out.print(sum2[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(rank[i] + "\t");
			
			System.out.println();			
		}	
			
		System.out.printf("합계" +"\t");
		
		for(int i=0;i<subject.length;i++){
				System.out.print(sum3[i] +"\t");
		}
		
		System.out.println();
		
		System.out.printf("평균" +"\t");
		for(int i=0;i<subject.length;i++){
			System.out.print(avg1[i] +"\t");
		}
			
		
			
			
			
			
			
			
			
			
		
		
		
	}
}
