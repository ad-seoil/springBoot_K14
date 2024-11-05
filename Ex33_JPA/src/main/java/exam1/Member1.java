package exam1;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// 테이블 생성(매핑) 어노테이션
@Entity
// 테이블명 지정
@Table(name="JpaMember1")
public class Member1 { // table 어노테이션 없으면 클래스명으로 table생성
	// 엔티티 어노테이션을 붙이면 아이디 어노테이션이 반드시 있어야함
	@Id
	//자동발번되는 속성
	@GeneratedValue
	private Long id;
	private String username;
	// 테이블-스네이크방식 네이밍
	@Column(name="create_date")
	private LocalDate createDate; // JAVA-카멜방식 네이밍
	
	protected Member1() {
		
	}

	public Member1(String username, LocalDate createDate) {
		this.username = username;
		this.createDate = createDate;
	}
}

/*
 * @Entity = 해당 클래스가 JPA의 엔티티임을 의미
 *@Id = 엔티티 클르새의 식별자, DB 테이블의 주요 키에 매칠
 *@Column = 매핑한 테이블의 컬럼 이름을 지정
 *			필드에 어노테이션이 없으면, 필드이름과 동일한 이름의 테이블 컬럼에 매핑함
 *
 *
 * */


