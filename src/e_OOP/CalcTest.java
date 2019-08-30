package e_OOP;
import java.util.*;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class CalcTest {
	 public static void main(String[] args) {
	 // 숫자를 입력 받음
	 System.out.println("숫자를 입력하라");
	 Scanner scanInt = new Scanner(System.in);
	 double num=scanInt.nextInt();
 
 // 문자열을 입력 받음
// System.out.println("연산문자를 입력하라");
// Scanner scanChar = new Scanner(System.in);
// String ch=scanChar.nextLine();
 
 // 숫자를 입력 받음
// System.out.println("숫자를 입력하라");
// Scanner scanInt2 = new Scanner(System.in);
// int num2=scanInt.nextInt(); 
 
 // 입력받은 부호가 +이면 add메서드
	 Calc calc = new Calc();
 
// if(ch.equals("+")){
//  System.out.println(calc.add(num,num2));
//  
// }
 // 입력받은 부호가 -이면 sub메서드
// if(ch.equals("-")){
//  System.out.println(calc.sub(num,num2));
// }
 // 입력받은 부호가 *이면 multiply메서드
// if(ch.equals("*")){
//  System.out.println(calc.multiply(num,num2));
// }
 // 입력받은 부호가 /이면 divide메서드
// if(ch.equals("/")){
//  System.out.println(calc.divide(num,num2));
// }
 // 를 호출해 연산결과를 출력
 
 // 1~4번을 무한 반복하게 만들어주고 2에서 입력한 부호가
    // 사칙연산이 아닌경우 연산을 종료하라
	 do{
	  System.out.println("연산문자를 입력하라");
	  Scanner scanChar = new Scanner(System.in);
	  String ch=scanChar.nextLine();
	  
	  if(!(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/") || ch.equals("c") || ch.equals("C"))){
		  break;
	  }
	  
	  System.out.println("숫자를 입력하라");
	  Scanner scanInt1 = new Scanner(System.in);
	  double num1=scanInt.nextInt();
	  
	  if(ch.equals("c") || ch.equals("C")){
		  num=num1;
	  }
	  	  
	  if(ch.equals("+")){
	   System.out.println(calc.add(num,num1));
	   num=calc.add(num,num1);
	  }
	  // 입력받은 부호가 -이면 sub메서드	
	  if(ch.equals("-")){
	   System.out.println(calc.sub(num,num1));
	   num=calc.sub(num,num1);
	  }
	  // 입력받은 부호가 *이면 multiply메서드
	  if(ch.equals("*")){
	   System.out.println(calc.multiply(num,num1));
	   num=calc.multiply(num,num1);
	  }
	  // 입력받은 부호가 /이면 divide메서드
	  if(ch.equals("/")){
	   System.out.println(calc.divide(num,num1));
	   num=calc.divide(num,num1);
	  }
	 }while(true);
  
   }
}

class Calc{ //계산기 - 사칙연산만
 
	 double sub(double x,double y){
	  double result = (double)(x-y);
	  return result;
	 }
	 
	 double add(double x,double y){
	  double result =(double)(x+y);
	  return result; 
	 }
	 
	 double multiply(double x,double y){
	  double result =(double)(x*y);
	  return result;
	 }
	 
	 double divide(double x,double y){
	  double result =(double)x/y;
	  return result;
	 }
} 

