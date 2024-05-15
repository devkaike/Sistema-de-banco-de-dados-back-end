package br.edu.pucgo.SistemaBancoDeDados.service;

import br.edu.pucgo.SistemaBancoDeDados.dao.UsuarioDao;
import br.edu.pucgo.SistemaBancoDeDados.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioDao usuarioDao;

    public List<Usuario> getAllUsuario(){
        return (List<Usuario>) usuarioDao.findAll();
    }

    public Usuario insertUsuario(Usuario usuario){
        return usuarioDao.save(usuario);
    }

    public Usuario updateUsuario(Usuario usuario){
        return usuarioDao.save(usuario);
    }

    public void deleteUsuario(Long id){
        usuarioDao.deleteById(id);
    }
}



