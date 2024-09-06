package DHS.WSDJ.domain.member;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ADMIN")
public class Admin extends Member {

    // 관리자 특정 필드나 메서드
}