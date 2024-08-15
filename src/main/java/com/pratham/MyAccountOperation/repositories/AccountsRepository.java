package com.pratham.MyAccountOperation.repositories;

import com.pratham.MyAccountOperation.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountsRepository extends JpaRepository<Account, Integer>{
    Account findByAccno(int accno);

//    List<Account> findByAcctype(String acctype);
}
