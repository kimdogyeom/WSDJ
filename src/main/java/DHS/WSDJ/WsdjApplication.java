package DHS.WSDJ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaAuditing
@SpringBootApplication
@EnableJpaRepositories()
@EntityScan(basePackages = "DHS.WSDJ.domain")  // 엔티티가 있는 패키지를 지정
public class WsdjApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsdjApplication.class, args);
	}

}
