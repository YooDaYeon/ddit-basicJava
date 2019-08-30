package d_array;

public class Array_02 {
	public static void main(String[] args) {
		/*
		1. 정렬
		  - 어떤 데이터를 빠르고 쉽게 찾기 위해 일정한 순서대로 데이터들을 가지런하게 나열하는 작업
		  - 버블정렬, 선택정렬, 삽입정렬
		 
		2. 버블정렬 (bubble sort)
		  - 인접한 데이터 간의 교환이 계속적으로 일어나면서 정렬이 이뤄짐
		  - 한 회전이 끝날 때 가장 큰값이 가장 뒤에 확정됨 
		 
		3. 선택정렬(select sort)
		  - 정렬의 대상에서 최솟값을 찾아 맨앞의 내용과 교체하는 방식
		  - 한 회전에 끝날 때 가장 작은 값이 앞에 확정됨 
		  
		  
		  
		*/
		
		int[] arr = new int[]{5,2,3,1,4};
		
		for(int j=0;j<arr.length-1;j++){
			for(int i=0;i<arr.length-1-j;i++){
				for(int k=0;k<arr.length;k++){
					int temp;
					
					if(i!=arr.length-1){
						if(arr[i]>arr[i+1]){
							temp=arr[i];
							arr[i]=arr[i+1];
							arr[i+1]=temp;
						}
					}
					
					System.out.print(arr[k]);
				}
			System.out.println();
			}
		}
		// 선택 정렬
			
			int[] arr2=new int[]{5,2,3,1,4};
			
			
			for(int j=1;j<arr2.length;j++){
				int num=0;
				int min=arr2[0];
				for(int i=1;i<arr2.length;i++){
					
					if(min>arr2[i]){
						min=arr2[i];
						num=i;
					}
							
				}
				
				int temp2=arr2[0];
				arr2[0]=arr[num];
				arr2[num]=temp2;
				
				for(int i=0;i<arr2.length;i++){
					System.out.print(arr2[i] + " ");	
				}
				System.out.println();
			}
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
	}
}
