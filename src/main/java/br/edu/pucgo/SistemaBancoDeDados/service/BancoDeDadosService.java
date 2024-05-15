package br.edu.pucgo.SistemaBancoDeDados.service;

import br.edu.pucgo.SistemaBancoDeDados.dao.BancoDeDadosDao;
import br.edu.pucgo.SistemaBancoDeDados.modelo.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BancoDeDadosService {
    @Autowired
    private BancoDeDadosDao bancoDeDadosDao;

    public List<BancoDeDados> getAllBancoDeDados(){
        return (List<BancoDeDados>) bancoDeDadosDao.findAll();
    }

    public BancoDeDados insertBancoDeDados(BancoDeDados bancoDeDados){
        return bancoDeDadosDao.save(bancoDeDados);
    }

    public BancoDeDados updateBancoDeDados(BancoDeDados bancoDeDados){
        return bancoDeDadosDao.save(bancoDeDados);
    }

    public void deleteBancoDeDados(Long id){
        bancoDeDadosDao.deleteById(id);
    }

    public List<BancoDeDados> getByNomeBD(String nome){
        return (List<BancoDeDados>) bancoDeDadosDao.buscarPorNome(nome);
    }
}
