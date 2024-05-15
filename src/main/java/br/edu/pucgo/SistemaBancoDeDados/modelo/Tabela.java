package br.edu.pucgo.SistemaBancoDeDados.modelo;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table
public class Tabela {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTabela;

    private String NomeDaTabela;

    @ManyToOne
    @JoinColumn(name = "id_banco_de_dados", nullable = false)
    private BancoDeDados bancoDeDados;

    public Long getIdTabela() {
        return idTabela;
    }

    public void setIdTabela(Long idTabela) {
        this.idTabela = idTabela;
    }

    public String getNomeDaTabela() {
        return NomeDaTabela;
    }

    public void setNomeDaTabela(String nomeDaTabela) {
        NomeDaTabela = nomeDaTabela;
    }

    public BancoDeDados getBancoDeDados() {
        return bancoDeDados;
    }

    public void setBancoDeDados(BancoDeDados bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }
}
