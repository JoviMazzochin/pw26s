package br.utfpr.edu.pw26s.repository;

import br.utfpr.edu.pw26s.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
