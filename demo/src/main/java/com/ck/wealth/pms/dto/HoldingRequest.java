package com.ck.wealth.pms.dto;

import com.ck.wealth.pms.entity.AssetClass;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class HoldingRequest {

    @NotBlank(message = "Ticker is required")
    private String ticker;

    @NotNull(message = "Quantity is required")
    @Positive(message = "Quantity must be positive")
    private BigDecimal quantity;

    @NotNull(message = "Average cost is required")
    @Positive(message = "Average cost must be positive")
    private BigDecimal avgCost;

    @NotNull(message = "Asset class is required")
    private AssetClass assetClass;
}
