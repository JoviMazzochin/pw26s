package br.utfpr.edu.pw26s.repository;

import br.utfpr.edu.pw26s.model.PedidoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoItemRepository extends JpaRepository<PedidoItem, Long> {
}
