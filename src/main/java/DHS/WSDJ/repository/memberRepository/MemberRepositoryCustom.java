package DHS.WSDJ.repository.memberRepository;

import DHS.WSDJ.domain.member.Member;
import java.util.Optional;

public interface MemberRepositoryCustom {
    Optional<Member> findMemberByLoginId(String loginId);
}