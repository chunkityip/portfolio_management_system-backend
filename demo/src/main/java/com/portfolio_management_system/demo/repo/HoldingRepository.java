package com.portfolio_management_system.demo.repo;

import com.portfolio_management_system.demo.entity.Holding;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HoldingRepository extends JpaRepository<Holding, Long> {
    boolean existsByClientIdAndTicker(Long clientId, String ticker); // A client can have multiple holdings, but each holding should be unique for a given ticker.
    List<Holding> findByClientId(Long clientId); // A client can have multiple holdings, so we return a list of holdings for a given client ID
}
