package DHS.WSDJ.controller;

import DHS.WSDJ.service.LoginRequestDto;
import DHS.WSDJ.service.MemberService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class AdminController {

	private final MemberService adminService;
	private final MemberService studentService;

	public AdminController(
		@Qualifier("adminMemberServiceImpl") MemberService adminService,
		@Qualifier("adminMemberServiceImpl") MemberService studentService )
	{
		this.adminService = adminService;
		this.studentService = studentService;
	}

	@PostMapping("join")
	public ResponseEntity<?> join(MemberJoinDto joinDto) {
		return null;
	}
}
