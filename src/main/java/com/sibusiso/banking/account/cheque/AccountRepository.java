package com.sibusiso.banking.account.cheque;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<ChequeAccount, Integer> {
    @Query(value = "SELECT * FROM cheque_account account WHERE account.account_number=:accountNumber", nativeQuery = true)
    public List<ChequeAccount> getAccount(@Param("accountNumber") String accountNumber);

    @Modifying
    @Query(value = "UPDATE cheque_account account SET account.amount=:amount WHERE account.account_number=:accountNumber", nativeQuery = true)
    @Transactional
    public int updateAccount(@Param("accountNumber") String accountNumber, @Param("amount") Double amount);
}
