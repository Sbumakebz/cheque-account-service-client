package com.sibusiso.banking.account.cheque;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountTransactionRepository extends JpaRepository<ChequeAccountTransaction, Integer> {
}
