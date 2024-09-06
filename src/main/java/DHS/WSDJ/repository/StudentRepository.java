package DHS.WSDJ.repository;

import DHS.WSDJ.domain.member.Student;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {

	Optional<Student> findById(Long id);
}
