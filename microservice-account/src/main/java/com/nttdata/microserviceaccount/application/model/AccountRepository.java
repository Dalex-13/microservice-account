package com.nttdata.microserviceaccount.application.model;

import com.nttdata.microserviceaccount.domain.Account;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountRepository {

    Mono<Account> getId(String id);
    Flux<Account> getAll();
    Mono<Account> save(Account account);
    Mono<Account> update(String id, Account account);
    Mono<Void> delete(String id);
}
