package com.example.buyer.buyer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class BuyerService {
    private final BuyerRepository buyerRepository;

    //로그인
    public Buyer LoginByNameAndPassword(BuyerRequest.LoginDTO reqDTO) {
        buyerRepository.login(reqDTO);
        return Buyer;

    }

    //회원가입
    @Transactional
    public void wantToJoin(BuyerRequest.JoinDTO reqDTO) {
        buyerRepository.join(reqDTO);
    }

}
