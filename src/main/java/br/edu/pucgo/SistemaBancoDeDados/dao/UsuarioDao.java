package br.edu.pucgo.SistemaBancoDeDados.dao;

import br.edu.pucgo.SistemaBancoDeDados.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<Usuario, Long> {
}
