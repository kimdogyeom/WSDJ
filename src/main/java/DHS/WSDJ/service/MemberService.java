package DHS.WSDJ.service;


public interface MemberService {

	String login(LoginRequestDto dto);

	String join(JoinRequestDto dto);

}
