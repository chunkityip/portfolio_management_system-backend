package com.ck.wealth.pms.dto;

import com.ck.wealth.pms.entity.RiskProfile;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Locked;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponse {

    private String id;
    private String name;
    private String email;
    private RiskProfile riskProfile;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
