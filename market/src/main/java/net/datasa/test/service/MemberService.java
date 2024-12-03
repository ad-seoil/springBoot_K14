package net.datasa.test.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import net.datasa.test.domain.dto.MemberDTO;
import net.datasa.test.domain.entity.MemberEntity;
import net.datasa.test.repository.MemberRepository;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * 회원정보 서비스
 */
@RequiredArgsConstructor
@Service
@Transactional
public class MemberService {

    //WebSecurityConfig에서 생성한 암호화 인코더
    private final BCryptPasswordEncoder passwordEncoder;
    
    // 회원정보 관련 리파지토리
    private final MemberRepository memberRepository;

    public void join(MemberDTO dto) {
    	// 전달된 회원정보를 테이블에 저장
    	MemberEntity entity = MemberEntity.builder().memberId(dto.getMemberId())
    			.memberPw(passwordEncoder.encode(dto.getMemberPw())).memberName(dto.getMemberName())
    			.phone(dto.getPhone()).build();
    	memberRepository.save(entity);
    	System.out.println(entity);
    }

}
