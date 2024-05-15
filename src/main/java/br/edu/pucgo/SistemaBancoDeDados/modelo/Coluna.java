package br.edu.pucgo.SistemaBancoDeDados.modelo;

import javax.persistence.*;

@Entity
@Table
public class Coluna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdColuna;

    private String NomeColuna;

    private String TipoColuna;

    private boolean id;

    private boolean ChaveEstrageira;

    private String NomeDaTabelaEstrageira;

    @ManyToOne
    @JoinColumn(name = "id_tabela", nullable = false)
    private Tabela tabela;


    public Long getIdColuna() {
        return IdColuna;
    }

    public void setIdColuna(Long idColuna) {
        IdColuna = idColuna;
    }

    public String getNomeColuna() {
        return NomeColuna;
    }

    public void setNomeColuna(String nomeColuna) {
        NomeColuna = nomeColuna;
    }

    public String getTipoColuna() {
        return TipoColuna;
    }

    public void setTipoColuna(String tipoColuna) {
        TipoColuna = tipoColuna;
    }

    public boolean isId() {
        return id;
    }

    public void setId(boolean id) {
        this.id = id;
    }

    public boolean isChaveEstrageira() {
        return ChaveEstrageira;
    }

    public void setChaveEstrageira(boolean chaveEstrageira) {
        ChaveEstrageira = chaveEstrageira;
    }

    public String getNomeDaTabelaEstrageira() {
        return NomeDaTabelaEstrageira;
    }

    public void setNomeDaTabelaEstrageira(String nomeDaTabelaEstrageira) {
        NomeDaTabelaEstrageira = nomeDaTabelaEstrageira;
    }

    public Tabela getTabela() {
        return tabela;
    }

    public void setTabela(Tabela tabela) {
        this.tabela = tabela;
    }
}
