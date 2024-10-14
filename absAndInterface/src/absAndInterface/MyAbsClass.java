package absAndInterface;

public abstract class MyAbsClass {
	public abstract void m1();
	public void mym2() {
		System.out.println("일반메소드");
	}
	
	// 추상클래스에서 객체 생성이 안되는 이유는 생성자가 없기 때문에
	public static void main(String[] args) {
		MyAbsClass a = new MyAbs3();
	}
}

abstract class MyAbs2 extends MyAbsClass{
	// 상속을 받았기 때문에 아래의 코드는 적혀있지 않더라도 존재하는 상태
	public void mym2() {
		System.out.println("일반메소드");
	}
}

class MyAbs3 extends MyAbs2 {
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}