package br.edu.pucgo.SistemaBancoDeDados.dao;

import br.edu.pucgo.SistemaBancoDeDados.modelo.Tabela;
import org.springframework.data.repository.CrudRepository;

public interface TabelaDao extends CrudRepository<Tabela, Long> {
}
