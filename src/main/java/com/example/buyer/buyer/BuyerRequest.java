package com.example.buyer.buyer;

import lombok.Data;

public class BuyerRequest {

    @Data
    public static class LoginDTO {
        private String buyername;
        private String password;
    }

    @Data
    public static class JoinDTO {
        private String buyername;
        private String password;
        private String email;

        public Buyer toEntity() {
            return Buyer.builder()
                    .buyername(buyername)
                    .password(password)
                    .email(email)
                    .build();
        }
    }
}