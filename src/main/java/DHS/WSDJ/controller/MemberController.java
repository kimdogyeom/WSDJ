package DHS.WSDJ.controller;

import DHS.WSDJ.service.JoinRequestDto;
import DHS.WSDJ.service.LoginRequestDto;
import DHS.WSDJ.service.MemberService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

	private final MemberService memberService;

	@PostMapping("/join")
	public ResponseEntity<String> joinMember(@Valid @RequestBody JoinRequestDto dto) {

		String token = memberService.join(dto);

		return ResponseEntity.status(HttpStatus.OK).body(token);
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@Valid @RequestBody LoginRequestDto dto) {
		String token = memberService.login(dto);

		return ResponseEntity.status(HttpStatus.OK).body(token);
	}

}
