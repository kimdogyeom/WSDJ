package DHS.WSDJ;

import DHS.WSDJ.domain.member.Member;
import DHS.WSDJ.domain.member.Role;
import DHS.WSDJ.repository.memberRepository.MemberRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaAuditing
@SpringBootApplication
@EnableJpaRepositories
@EntityScan(basePackages = "DHS.WSDJ.domain")  // 엔티티가 있는 패키지를 지정
public class WsdjApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsdjApplication.class, args);
	}


	public WsdjApplication(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}

	private final MemberRepository memberRepository;

	@PostConstruct
	public void initData(){
		Member member = Member.builder()
			.loginId("아이디")
			.name("테스트홍길동")
			.password("1234")
			.role(Role.ADMIN)
			.build();

		memberRepository.save(member);
	}

}
