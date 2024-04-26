package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Repository
public class BuyerRepository {
    private final EntityManager em;



//    public Buyer login(BuyerRequest.LoginDTO reqDTO) {
//    Query query = em.createNativeQuery("select * from buyer_tb where buyername=? and password=?", Buyer.class);
//    query.setParameter(1, reqDTO.getBuyername());
//    query.setParameter(2, reqDTO.getPassword());
//    Buyer buyer = (Buyer) query.getSingleResult();
//    return buyer;
//    }

    public void join(BuyerRequest.JoinDTO reqDTO) {
        Query query = em.createNativeQuery("insert into buyer_tb(buyername, password,created_at) values(?,?,now())");
        query.setParameter(1, reqDTO.getBuyername());
        query.setParameter(2, reqDTO.getPassword());
        query.executeUpdate();
    }
}
