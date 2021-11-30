package com.nttdata.microserviceaccount.infraestructure.repository.impl;

import com.nttdata.microserviceaccount.application.model.AccountRepository;
import com.nttdata.microserviceaccount.domain.Account;
import com.nttdata.microserviceaccount.infraestructure.model.dao.AccountDao;
import com.nttdata.microserviceaccount.infraestructure.repository.IAccountCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class AccountCrudRepositoryImpl implements AccountRepository {

    @Autowired
    private IAccountCrudRepository repository;


    @Override
    public Mono<Account> getId(String id) {
        return repository.findById(id)
                .map(this::mapAccountDaoToUser);
    }

    @Override
    public Flux<Account> getAll() {
        return repository.findAll()
                .map(this::mapAccountDaoToUser);
    }

    @Override
    public Mono<Account> save(Account account) {
        return repository.save(mapAccountToUserDao(account))
                .map(this::mapAccountDaoToUser);
    }

    @Override
    public Mono<Account> update(String id, Account account) {
        return repository.save(mapAccountToUserDao(account))
                .map(this::mapAccountDaoToUser);
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }




    //metodos

    private Account mapAccountDaoToUser(AccountDao accountDao){
        Account account = new Account();
        account.setId(accountDao.getId());
        account.setCustomertype(accountDao.getCustomertype());
        account.setIdmoney(accountDao.getIdmoney());
        account.setAccountnumber(accountDao.getAccountnumber());
        account.setResidue(accountDao.getResidue());
        return account;
    }

    private AccountDao mapAccountToUserDao(Account account){
        AccountDao accountDao = new AccountDao();
        accountDao.setId(account.getId());
        accountDao.setCustomertype(account.getCustomertype());
        accountDao.setIdmoney(account.getIdmoney());
        accountDao.setAccountnumber(account.getAccountnumber());
        accountDao.setResidue(account.getResidue());
        return accountDao;
    }
}
