package com.salafiaji.thetrustbank.service.impl;

import com.salafiaji.thetrustbank.dto.BankResponse;
import com.salafiaji.thetrustbank.dto.EnquiryRequest;
import com.salafiaji.thetrustbank.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
}
