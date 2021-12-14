package com.nttdata.microserviceaccount.application.impl;

import com.nttdata.microserviceaccount.application.AccountOperations;
import com.nttdata.microserviceaccount.application.model.AccountRepository;
import com.nttdata.microserviceaccount.domain.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AccountOperationsImpl implements AccountOperations {


    private final AccountRepository repository;


    @Override
    public Flux<Account> queryAll() {
        return repository.getAll();
    }


    @Override
    public Mono<Account> findId(String id) {
        return repository.getId(id);
    }

    @Override
    public Mono<Account> create(Account account) {
        return repository.save(account);
    }

    @Override
    public Mono<Account> update(String id, Account account) {
        return repository.update(id, account);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.delete(id);
    }
}
