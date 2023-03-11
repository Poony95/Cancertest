package cancertest;

import java.util.Date;
import java.util.Scanner;
public class Cancerif {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		
		String name, result;
		int thisyear = today.getYear() + 1900;
		int age, useryear;
		
		System.out.println("*** 암 검진 대상자 판별 ***");
		System.out.println("이름을 입력하세요");
		name = sc.next();
		
		System.out.println("출생연도를 입력하세요");
		useryear = sc.nextInt();
		
		age = thisyear - useryear;
		
		System.out.println("*** 암 검진 대상자 판별 결과 ***");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("현재연도 : " + thisyear);
		System.out.println("출생연도 : " + useryear);
		
		if (age >= 40 && thisyear % 2 == useryear % 2) {
			
			result = "가능";
		}
		else {
			result = "불가능";
			
			System.out.println(name + "님은 무료 암 검진이 " + result + "합니다.");
		}
	}

}
