package DHS.WSDJ.repository;

import DHS.WSDJ.domain.member.Admin;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface AdminRepository extends JpaRepository<Admin, Long> {

	Optional<Admin> findById(Long id);
}
