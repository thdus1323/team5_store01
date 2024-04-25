package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class BuyerRepository {
    private final EntityManager em;

    public Buyer findByBuyernameAndPassword(String buyername, String password){
        Query query =
                em.createNativeQuery("select * from Buyer where buyername = :buyername and password =:password", Buyer.class);
        query.setParameter("buyername", buyername);
        query.setParameter("password", password);
        return (Buyer) query.getSingleResult();
    }
}
