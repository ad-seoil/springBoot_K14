package com.study.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.springboot.bean.Config;
import com.study.springboot.bean.Member;
import com.study.springboot.bean.Printer;

//@SpringBootApplication
public class Ex02JavaCodeDiApplication {

	public static void main(String[] args) {
//		SpringApplication.run(Ex02JavaCodeDiApplication.class, args);
		
		// 1. IoC 컨테이너 생성
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		// 2. Member Bean 가져오기
		Member member1 = (Member)context.getBean("member1");
		member1.print();
		
		// 3. Member Bean 가져오기
		Member member2 = (Member)context.getBean("hello", Member.class);
		member2.print();
		
		// 4.PrinterB Bean 가져오기
		Printer printer = (Printer)context.getBean("printerB", Printer.class);
		member1.setPrinter(printer);	// DI - setter - IoC
		member1.print();
		
		// 5. 싱글톤인지 확인
		// 싱글톤 : 단 하나만의 인스턴스를 생성하여 사용하기 위한 패턴
		
		// 객체의 저장된 주소의 hash값
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		
		// 객체의 저장된 물리적 주소값
		System.out.println(System.identityHashCode(member1));
		System.out.println(System.identityHashCode(member2));
		
		if (member1 == member2) {
			System.out.println("동일한 객체입니다");
		} else {
			System.out.println("서로 다른 객체입니다");
		}
	}

}
