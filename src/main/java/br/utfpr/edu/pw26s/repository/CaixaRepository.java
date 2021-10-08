package br.utfpr.edu.pw26s.repository;

import br.utfpr.edu.pw26s.model.Caixa;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CaixaRepository extends JpaRepository<Caixa, Long> {

}
