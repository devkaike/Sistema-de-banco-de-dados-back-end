package br.edu.pucgo.SistemaBancoDeDados.controller;

import br.edu.pucgo.SistemaBancoDeDados.modelo.Tabela;
import br.edu.pucgo.SistemaBancoDeDados.service.TabelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Tabela")
public class TabelaController {
    @Autowired
    private TabelaService tabelaService;

    @GetMapping
    public List<Tabela> getAllTabela(){
        return tabelaService.getAllTabela();
    }

    @PostMapping
    public Tabela insertTabela(@RequestBody Tabela tabela){
        return tabelaService.insertTabela(tabela);
    }

    @PutMapping
    public Tabela updateTabela(@RequestBody Tabela tabela){
        return tabelaService.updateTabela(tabela);
    }

    @DeleteMapping("/{id}")
    public void deleteTabela(@PathVariable Long id){
        tabelaService.deleteTabela(id);
    }
}