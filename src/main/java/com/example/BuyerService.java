package com.example;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
public class BuyerService {
    private final BuyerRepository buyerRepository;

//    //로그인
//    public void login(BuyerRequest.LoginDTO reqDTO){
//        buyerRepository.login(reqDTO);
//    }

    //회원가입
    @Transactional
    public void wantToJoin(BuyerRequest.JoinDTO reqDTO) {
        buyerRepository.join(reqDTO);
    }

}
