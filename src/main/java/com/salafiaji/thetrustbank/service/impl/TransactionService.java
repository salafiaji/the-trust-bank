package com.salafiaji.thetrustbank.service.impl;

import com.salafiaji.thetrustbank.dto.TransactionDto;
import com.salafiaji.thetrustbank.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
