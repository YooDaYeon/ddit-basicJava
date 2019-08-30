package i_javaLang;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String text = "100,200,300,400,500";
		
		StringTokenizer st = new StringTokenizer(text,",");
		
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		System.out.println("============split============"); //빈 문자열 포함
		String data = "100,,,200,,300";
		String[] result = data.split("0,"); //안에 들어있는 문자가 연속된 구분자로 되어 빼고 출력
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
		
		System.out.println("==========StringToken==========="); //빈 문자열 포함 안함
		StringTokenizer st2 = new StringTokenizer(data,"0,"); //0과,를 각각의 구분자로 따져서 빼고 출력
		while(st2.hasMoreTokens()){
			System.out.println(st2.nextToken());
		}
		
		
		
		
		
		
	}
}
