package com.example.buyer.buyer;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class BuyerController {
    private final BuyerService buyerService;
    private final HttpSession session;
    private final HttpSession SessionBuyer sessionbuyer;

    //상품목록보기
    @GetMapping({"/order"})
    public String list() {

        return "order/list";
    }

    //로그인
    @PostMapping("/login")
    public String login(BuyerRequest.LoginDTO reqDTO) {
        SessionBuyer sessionBuyer = buyerService.wantToLogin(reqDTO);
        session.setAttribute("sessionBuyer", sessionBuyer);
        return "redirect:/";
    }

    @GetMapping("/login-form")
    public String loginForm() {
        return "/buyer/login-form";
    }

    //회원가입
    @PostMapping("/join")
    public String join(BuyerRequest.JoinDTO reqDTO) {
        buyerService.wantToJoin(reqDTO);
        System.out.println("회원가입 : " + reqDTO);
        return "redirect:/"; // 로그인폼(login-form) 갈 예정이나 뷰를 구현못해서 일단 메인으로 해둠.
    }

    @GetMapping("/join-form")
    public String joinForm() {
        return "buyer/join-form"; // join-form 화면만 요청
    }
}
