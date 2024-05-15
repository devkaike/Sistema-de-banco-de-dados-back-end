package br.edu.pucgo.SistemaBancoDeDados.service;

import br.edu.pucgo.SistemaBancoDeDados.dao.ColunaDao;
import br.edu.pucgo.SistemaBancoDeDados.modelo.Coluna;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColunaService {
    @Autowired
    private ColunaDao colunaDao;

    public List<Coluna> getAllColuna(){
        return (List<Coluna>) colunaDao.findAll();
    }

    public Coluna insertColuna(Coluna coluna){
        return colunaDao.save(coluna);
    }

    public Coluna updateColuna(Coluna coluna){
        return colunaDao.save(coluna);
    }

    public void deleteColuna(Long id){
        colunaDao.deleteById(id);
    }

}
