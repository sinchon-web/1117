package exam;

import java.util.Scanner;

//구구단 출력 
//2*1=2 3*1=3 4*1=4 5*1=5 6*1=6 7*1=7 8*1=8 9*1=9
//2*2=2 3*2=3 4*2=4 5*2=5 6*1=6 7*1=7 8*1=8 9*1=9
//2*3=2 3*3=3 4*3=4 5*3=5 6*1=6 7*1=7 8*1=8 9*1=9
//2*4=2 3*4=3 4*4=4 5*4=5 6*1=6 7*1=7 8*1=8 9*1=9
//2*4=2 3*5=3 4*5=4 5*5=5 6*1=6 7*1=7 8*1=8 9*1=9
//2*6=2 3*5=3 4*6=4 5*6=5 6*1=6 7*1=7 8*1=8 9*1=9
//2*7=2 3*6=3 4*7=4 5*7=5 6*1=6 7*1=7 8*1=8 9*1=9
//2*8=2 3*7=3 4*8=4 5*8=5 6*1=6 7*1=7 8*1=8 9*1=9
//2*9=2 3*8=3 4*9=4 5*9=5 6*1=6 7*1=7 8*1=8 9*1=9
//이름 국어 영어 수학 점수 입력받고 총점 평균(소수3자리에서 반올림하여 2자리로 표현) 출력해주세요
public class Test01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		String phone;
		//변수에 이름저장
		System.out.print("이름입력 : ");
		name=sc.nextLine();//토큰??? : 화이트스페이스(공백,탭,엔터)앞의 문자열만 읽는다
		System.out.print("전화입력 : ");
		phone=sc.nextLine();//엔터까지 읽는다.
		
		
		//변수값을 모니터로 출력
		System.out.println("\n--------------");
		System.out.println("  print area");
		System.out.println("--------------");
		System.out.println(name);
		System.out.println(phone);
		System.out.println("--------------");
		

	}

}
