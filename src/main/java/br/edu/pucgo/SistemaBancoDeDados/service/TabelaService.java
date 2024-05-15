package br.edu.pucgo.SistemaBancoDeDados.service;

import br.edu.pucgo.SistemaBancoDeDados.dao.TabelaDao;
import br.edu.pucgo.SistemaBancoDeDados.modelo.Tabela;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TabelaService {
    @Autowired
    private TabelaDao tabelaDao;

    public List<Tabela> getAllTabela(){
        return (List<Tabela>) tabelaDao.findAll();
    }

    public Tabela insertTabela(Tabela tabela){
        return tabelaDao.save(tabela);
    }

    public Tabela updateTabela(Tabela tabela){
        return tabelaDao.save(tabela);
    }

    public void deleteTabela(Long id){
        tabelaDao.deleteById(id);
    }
}
