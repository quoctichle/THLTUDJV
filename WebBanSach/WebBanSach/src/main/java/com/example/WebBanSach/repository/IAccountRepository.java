package com.example.WebBanSach.repository;

import com.example.WebBanSach.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAccountRepository extends JpaRepository<Account,Long> {

}
