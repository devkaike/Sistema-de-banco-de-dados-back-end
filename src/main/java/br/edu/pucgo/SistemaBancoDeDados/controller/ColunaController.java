package br.edu.pucgo.SistemaBancoDeDados.controller;

import br.edu.pucgo.SistemaBancoDeDados.modelo.Coluna;
import br.edu.pucgo.SistemaBancoDeDados.service.ColunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Coluna")
public class ColunaController {

    @Autowired
    private ColunaService colunaService;

    @GetMapping
    public List<Coluna> getAllColuna(){
        return colunaService.getAllColuna();
    }

    @PostMapping
    public Coluna insertColuna(@RequestBody Coluna coluna){
        return colunaService.insertColuna(coluna);
    }
    @PutMapping
    public Coluna updateColuna(@RequestBody Coluna coluna){
        return colunaService.updateColuna(coluna);
    }
    @DeleteMapping("/{id}")
    public void deleteColuna(@PathVariable Long id){
        colunaService.deleteColuna(id);
    }
}
