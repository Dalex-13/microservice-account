package com.nttdata.microserviceaccount.infraestructure.repository;

import com.nttdata.microserviceaccount.infraestructure.model.dao.AccountDao;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface IAccountCrudRepository extends ReactiveCrudRepository<AccountDao, String> {
}
