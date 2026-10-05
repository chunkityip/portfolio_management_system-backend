package com.ck.wealth.pms.dto;

import com.ck.wealth.pms.entity.Client;
import com.ck.wealth.pms.entity.RiskProfile;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ClientRequest {

    @NotBlank(message = "Client name is required")
    private String name;

    @NotBlank(message = "Client email is required")
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank(message = "Risk profile cannot be null")
    private RiskProfile riskProfile;
}
