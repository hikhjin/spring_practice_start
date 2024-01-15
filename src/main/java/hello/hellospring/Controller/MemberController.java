package hello.hellospring.Controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // 빈에 등록
public class MemberController {
    /*
    @Controller -> 스프링 컨테이너가 MemberController 객체를 생성, 스프링 빈이 관리됨
    @Autowired -> 스프링 컨테이너에 저장되어 있던 것을 가져와서 연결해줌
     */

    private final MemberService memberService;
    @Autowired // 의존성 주입
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
