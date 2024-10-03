package br.com.fiap.ecommerce.repository;

import br.com.fiap.ecommerce.model.Cliente;
import br.com.fiap.ecommerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
