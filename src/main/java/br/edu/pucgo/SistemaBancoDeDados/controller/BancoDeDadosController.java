package br.edu.pucgo.SistemaBancoDeDados.controller;

import br.edu.pucgo.SistemaBancoDeDados.modelo.BancoDeDados;
import br.edu.pucgo.SistemaBancoDeDados.modelo.Usuario;
import br.edu.pucgo.SistemaBancoDeDados.service.BancoDeDadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/BancoDeDados")
public class BancoDeDadosController {

    @Autowired
    private BancoDeDadosService bancoDeDadosService;

    @GetMapping
    public List<BancoDeDados> getAllbancoDeDados(){
        return bancoDeDadosService.getAllBancoDeDados();
    }

    @PostMapping
    public BancoDeDados insertBancoDeDados(@RequestBody BancoDeDados bancoDeDados){
        return bancoDeDadosService.insertBancoDeDados(bancoDeDados);
    }

    @PutMapping
    public BancoDeDados updateBancoDeDados(@RequestBody BancoDeDados bancoDeDados){
        return bancoDeDadosService.updateBancoDeDados(bancoDeDados);
    }

    @DeleteMapping("/{id}")
    public void deleteBancoDeDados(@PathVariable Long id){
        bancoDeDadosService.deleteBancoDeDados(id);
    }

    @GetMapping("/BuscarPorNome")
    public List<BancoDeDados> getByNome(@RequestParam(name = "nomeDoBanco") String nomeDoBanco){
        return bancoDeDadosService.getByNomeBD(nomeDoBanco);
    }
}
