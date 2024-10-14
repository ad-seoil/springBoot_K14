package absAndInterface;

public class MyMain {
	
	public static void main(String[] args) {
//		MyFunInter m1 = new MyFunInter(); // 생성자가 없기때문에 불러올 수가 없음
		MyFunInter m2 = new MyClass();
		
		// 선언
		MyFunInter m1 = new MyFunInter() {
			
			@Override
			public void m1() {
				System.out.println("인터메소드");
			}
			
		};
		
		MyFunInter m3 = new MyClass();	
		// 사용
		m1.m1();
		
		// 람다식
		// 람다식의 전제조건 - 추상메소드가 하나만 존재해야함
		MyFunInter m4 = () -> System.out.println("인터메소드");
		
		m3.m1();
		
	}
}
