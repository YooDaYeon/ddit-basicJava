package f_OOP2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class DrawShape extends Frame{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("타이틀을 입력하라");
		String str=sc.next();
		
		DrawShape ds = new DrawShape(str);
		//ds.paint(new Graphics()) 자동호출되서 선언안해도됨
			
	}
	
	public void paint(Graphics g){
		//1. Circle객체 생성
		//	단, 매개변수가 두 개인 생성자를 이용
     	Point p=new Point(100,100);
		Circle c2=new Circle(p,200);
		//2. g.drawOva1()를 이용해 원을 그림
		g.drawOval(c2.center.x,c2.center.y,c2.r*2,c2.r*2);
		//3. Triangle객체 생성
		//   단, 매개변수가 하나인 생성자 이용
		//	 점의 좌표는 100,100 200,200 100,200
		Point[] pp=new Point[3];
		pp[0]=new Point(100,100);
		pp[1]=new Point(200,200);
		pp[2]=new Point(100,200);
		
		Triangle tr = new Triangle(pp);
		//4. g.drawLine()3개를 이용해 삼각형 그림
		g.drawLine(pp[0].x, pp[0].y, pp[1].x, pp[1].y);
		g.drawLine(pp[1].x, pp[1].y, pp[2].x, pp[2].y);
		g.drawLine(pp[2].x, pp[2].y, pp[0].x, pp[0].y);
		
		//5. JVM그리기
		
	}
	
	
	public DrawShape(){
		super("감자토비"); //생성자 내에서 부모의 생성자 호출 시 사용, title명
		setSize(500,500); //가로,세로 너비 조정
		setVisible(true); //눈에 보이게 함
		setBackground(Color.BLUE);
	}
	
	public DrawShape(String title){
		super(title); //생성자 내에서 부모의 생성자 호출 시 사용, title명
		setSize(500,500); //가로,세로 너비 조정
		setVisible(true); //눈에 보이게 함
		setBackground(Color.green);
		setResizable(false); // 크기 고정		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			
		});
	}	
}

/**
 * 점을 관리하기 위한 클래스
 * @author PC09
 *
 */
class Point{
	int x; // 점의 x좌표
	int y; // 점의 y좌표
	
	Point(){
		this(0,0);
	}
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}

class Circle{
	//1. 점 하나를 저장할 수 있는 변수 선언 center
	Point center;
	//2. 정수값 반지름을 저장할 수 있는 변수 선언 r
	int r;
	//3. 매개변수가 두 개인 생성자를 만들라
	//   넘어온 인자값으로 center와 r을 초기화해라
	Circle(Point a,int b){
		center=a;
		r=b;
	}
	//4. 기본생성자를 만들라
	//   단,매개변수가 두개인 생성자를 이용해 점은 100,100 반지름은200으로 만들라
	Circle(){
		this(new Point(100,100),200);
	}	
}


class Triangle{
	//1. 점 3개를 저장할 수 있는 변수 선언 p
	Point[] p;
	//2. 매개변수가 하나인 생성자 생성
	//	 넘어온 인자값으로 p를 초기화
	Triangle(Point[] a){
		p=a;
	}
	//3. 매개변수가 세개인 생성자를 만들라
	//	 넘어온 인자값으로 p를 초기화
	Triangle(Point x, Point y, Point z){
		this(new Point[]{x,y,z});
	}
}
