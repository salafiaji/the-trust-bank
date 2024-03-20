package com.salafiaji.thetrustbank.service.impl;

import com.salafiaji.thetrustbank.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);
}
