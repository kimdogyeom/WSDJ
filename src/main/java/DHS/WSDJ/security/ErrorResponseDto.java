package DHS.WSDJ.security;


import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public class ErrorResponseDto {

	private int status;
	private String message;
	private LocalDateTime timestamp;

}