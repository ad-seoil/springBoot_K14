
import java.util.Date;

public class UnderstandDI {

	public static void main(String[] args) {
		// 날짜를 구하기 위해서 Date 클래스의 기능에 의존
		Date date = new Date();
		System.out.println("현재 시간 : " + date);
		// toString() 참조변수가 print문의 매게변수로 사용되면 toString()은 자동호출
		Member m1 = new Member();
		Member m2 = new Member("홍길동", "길동이");
		
		memberUse1(m2);
		memberUse1();
	}
	
	public static void getDate(Date d) {
		Date date = d;
		System.out.println(date);
	}
	
	// 객체간의 관계(결합) 약해야 좋은 프로그램
	// 객체간의 응집력이 강해야함
	public static void memberUse1() {
		// 강한 결합 : 직접생성
		Member member1 = new Member();
	}
	
	public static void memberUse1(Member m) {
		// 약한 결합 : 생성된 것을 주입 받음 - 의존 주입(Dependency Injection)
		Member member2 = m;
	}
}
