package com.nttdata.microserviceaccount.infraestructure.model.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document("account")
public class AccountDao {

    @Id
    private String id;
    private String customertype;
    private String idmoney;
    private String accountnumber;
    private String residue;
}
