package com.ck.wealth.pms.dto;

import com.ck.wealth.pms.entity.AssetClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HoldingResponse {

    private Long id;
    private Long clientId;
    private String ticker;
    private BigDecimal quantity;
    private BigDecimal avgCost;
    private AssetClass assetClass;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}
