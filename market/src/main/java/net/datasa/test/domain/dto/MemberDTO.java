package net.datasa.test.domain.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 회원정보 DTO
 */
@Builder
@Data
@NoArgsConstructor // default생성자
@AllArgsConstructor	// 매개변수있는 생성자
public class MemberDTO {
	String memberId;
	String memberPw;
	String memberName;
	String phone;
}
