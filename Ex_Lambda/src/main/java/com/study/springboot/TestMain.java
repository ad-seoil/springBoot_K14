package com.study.springboot;

public class TestMain {
	
	public static void main(String[] args) {

		MyFunInterface inter1 = new MyFunInterface() {
			
			@Override
			public void ab1() {
				System.out.println("ab1");
			}
		};
	
		inter1.ab1();
		
		MyFunInterface inter2 = () -> System.out.println("ab1");
		
		inter2.ab1();
		
		MyFuninter2 i2 = a -> System.out.println("ab2 " + a);
		
		i2.ab2(10);
		
		MyFunInter3 i3 = msg -> "hello " + msg;		
		
		System.out.println(i3.ab3("world"));
	}

}
