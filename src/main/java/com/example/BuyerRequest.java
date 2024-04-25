package com.example;

import lombok.Data;

public class BuyerRequest {

    @Data
    public static class LoginDTO{
        private String buyername;
        private String password;
    }

    @Data
    public static class JoinDTO{
        private String buyername;
        private String password;;
    }
}
