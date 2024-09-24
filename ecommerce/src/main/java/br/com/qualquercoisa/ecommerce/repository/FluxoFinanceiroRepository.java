package br.com.qualquercoisa.ecommerce.repository;

import br.com.qualquercoisa.ecommerce.entity.FluxoFinanceiro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FluxoFinanceiroRepository extends CrudRepository<FluxoFinanceiro, Long> {
}
