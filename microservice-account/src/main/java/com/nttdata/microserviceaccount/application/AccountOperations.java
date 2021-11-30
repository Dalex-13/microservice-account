package com.nttdata.microserviceaccount.application;

import com.nttdata.microserviceaccount.domain.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountOperations {

    public Flux<Account> queryAll();
    public Mono<Account> findId(String id);
    public Mono<Account> create(Account account);
    public Mono<Account> update(String id, Account account);
    public Mono<Void> delete(String id);
}
