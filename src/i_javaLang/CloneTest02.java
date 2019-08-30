package i_javaLang;

import java.util.Arrays;

public class CloneTest02 {
	public static void main(String[] args) {
		Point[] arr = {new Point(100,100),new Point(200,200),new Point(200,100)};
		Point[] arrClone = arr.clone(); //배열안의 주소들만 복사
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		
		arr[0].x=10;
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));	
		
	}
}


class Point{
	int x,y;
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}