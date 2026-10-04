package com.portfolio_management_system.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Holding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @NotBlank(message = "Ticker cannot be blank")
    private String ticker;

    @NotNull(message = "Quantity cannot be null")
    @Positive(message = "Quantity must be positive")
    @DecimalMax(value = "999999999.99", message = "Quantity is too large")
    private BigDecimal quantity;

    @NotNull(message = "Average cost cannot be null")
    @Positive(message = "Average cost must be positive")
    @DecimalMax(value = "999999999.99", message = "Average cost is too large")
    private BigDecimal avgCost;

    @NotNull(message = "Asset class cannot be null")
    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private AssetClass assetClass;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}