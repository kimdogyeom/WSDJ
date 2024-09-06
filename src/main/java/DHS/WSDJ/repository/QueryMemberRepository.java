package DHS.WSDJ.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class QueryMemberRepository {

	private final JPAQueryFactory query;
	private final EntityManager em;

}
