package com.nttdata.microserviceaccount.domain;


import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Account {

    @Id
    private String id;
    private String customertype;
    private String idmoney;
    private String accountnumber;
    private String residue;
}
