package i_javaLang;

import static java.lang.Math.*;

public class MyMathTest {
	public static void main(String[] args) {
		
		double d = 25.143636;
		
		//반올림
		System.out.println(Math.round(d)); //25
		
		//올림
		System.out.println(ceil(d)); //26.0
		
		//버림
		System.out.println(floor(d)); //25.0
		
		//제곱
		System.out.println(pow(3,4));
		
		//루트
		System.out.println(sqrt(4));
		
		
		// 포인트 객체 두개 생성
		Point2 p  = new Point2(1,2);
		Point2 p1 = new Point2(3,4);
		// Point2클래스에 getDistance메서드를 만든 후 안자값으로 넘겨준 Point와의 거리를 반환
		// 소수점 셋째자리에서 두번째자리로 반올림해서 반환
		double a = p.getDistance(p1);
		
		
		
		
	}
}


class Point2{
	int x,y;
	
	public Point2(int x, int y){
		this.x=x;
		this.y=y;		
	}
	
	double getDistance(Point2 p){
		
		double a=sqrt(pow(x-p.x,2) + pow(y-p.y,2));
		
		return a;
	}

	
	
	
	
	
	
	
}