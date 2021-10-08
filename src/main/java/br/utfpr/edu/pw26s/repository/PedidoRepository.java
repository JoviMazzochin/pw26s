package br.utfpr.edu.pw26s.repository;

import br.utfpr.edu.pw26s.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
