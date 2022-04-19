package com.example.demo.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Shelter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = true, length = 300)
    private String orgNm;

    @Column(nullable = true, length = 300)
    private String careNm;

    @Column(nullable = true, length = 300)
    private String jibunAddr;

    @Column(nullable = true, length = 300)
    private String weekOprStime;

    @Column(nullable = true, length = 300)
    private String weekOprEtime;

    @Column(nullable = true, length = 300)
    private String closeDay;

    @Column(nullable = true, length = 300)
    private String careTel;

    @Column(nullable = true, length = 300)
    private String saveTrgtAnimal;

}
