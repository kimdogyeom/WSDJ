package DHS.WSDJ.repository.memberRepository;

import DHS.WSDJ.domain.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom {

}
