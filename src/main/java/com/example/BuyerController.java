package com.example;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class BuyerController {
    public final BuyerRepository buyerRepository;
    public final BuyerService buyerService;

    //상품목록보기
    @GetMapping({"/order", "/"})
    public String list(){

        return "order/list";
    }

    //로그인
//    @PostMapping("/login")
//    public String login(BuyerRequest.LoginDTO reqDTO, HttpSession session){
//        Buyer sessionBuyer = buyerService.login(reqDTO);
//        session.setAttribute("sessionBuyer", sessionBuyer);
//        return "redirect:/";
//    }

    //회원가입
    @PostMapping("/join")
    public String join(BuyerRequest.JoinDTO reqDTO){
       buyerService.join(reqDTO);
        return "redirect:/";
    }

    @GetMapping("/join-form")
    public String join(){
        return "buyer/join-form";
    }




}
