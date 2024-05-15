package br.edu.pucgo.SistemaBancoDeDados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import br.edu.pucgo.SistemaBancoDeDados.modelo.Usuario;
import br.edu.pucgo.SistemaBancoDeDados.service.UsuarioService;
import java.util.List;

@RestController
@RequestMapping("/Usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    @GetMapping
    public List<Usuario> getAllUsuarios(){

        return usuarioService.getAllUsuario();
    }

    @PostMapping
    public Usuario insertUsuarios(@RequestBody Usuario usuario){

        return usuarioService.insertUsuario(usuario);
    }

    @PutMapping
    public Usuario updateUsuarios(@RequestBody Usuario usuario){

        return usuarioService.updateUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuarios(@PathVariable long id){

        usuarioService.deleteUsuario(id);
    }
}