package com.example.demo.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShelterDto {
    private Integer id;
    private String orgNm;
    private String careNm;
    private String jibunAddr;
    private String weekOprStime;
    private String weekOprEtime;
    private String closeDay;
    private String careTel;
    private String saveTrgtAnimal;

    public Shelter toEntity() {
        Shelter shelter = new Shelter();
        shelter.setId(this.id);
        shelter.setOrgNm(this.orgNm);
        shelter.setCareNm(this.careNm);
        shelter.setJibunAddr(this.jibunAddr);
        shelter.setWeekOprStime(this.weekOprStime);
        shelter.setWeekOprEtime(this.weekOprEtime);
        shelter.setCloseDay(this.closeDay);
        shelter.setCareTel(this.careTel);
        shelter.setSaveTrgtAnimal(this.saveTrgtAnimal);

        return toEntity();
    }
}
