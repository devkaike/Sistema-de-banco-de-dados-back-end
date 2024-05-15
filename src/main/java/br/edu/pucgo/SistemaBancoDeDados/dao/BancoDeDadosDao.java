package br.edu.pucgo.SistemaBancoDeDados.dao;

import br.edu.pucgo.SistemaBancoDeDados.modelo.BancoDeDados;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BancoDeDadosDao extends CrudRepository<BancoDeDados, Long> {
    @Query(value = "SELECT u FROM BancoDeDados u WHERE u.NomeDoBanco LIKE %?1%")
    List<BancoDeDados> buscarPorNome(String nomeDoBanco);

}
