package com.example;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Table(name = "buyer_tb")
@Entity
public class Buyer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(unique = true, length = 20, nullable = false)
    private String buyername;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String email;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @Builder
    public Buyer(Integer id, String buyername, String password, String email, LocalDateTime createdAt) {
        this.id = id;
        this.buyername = buyername;
        this.password = password;
        this.email = email;
        this.createdAt = createdAt;
    }
}
