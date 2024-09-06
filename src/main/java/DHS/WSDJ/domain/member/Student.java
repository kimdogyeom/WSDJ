package DHS.WSDJ.domain.member;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("STUDENT")
public class Student extends Member {

    @Column(name = "grade")
    private int grade;

    // 학생 특정 메서드 등
}