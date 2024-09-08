package DHS.WSDJ.repository.memberRepository;

import static DHS.WSDJ.domain.member.QMember.member;

import DHS.WSDJ.domain.member.Member;
import com.querydsl.jpa.impl.JPAQueryFactory;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom {

	private final JPAQueryFactory queryFactory;

	@Override
	public Optional<Member> findMemberByLoginId(String loginId) {
		return Optional.ofNullable(queryFactory
			.selectFrom(member)
			.where(member.loginId.eq(loginId))
			.fetchFirst());
	}
}
