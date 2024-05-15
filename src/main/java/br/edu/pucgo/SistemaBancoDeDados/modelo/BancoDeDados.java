package br.edu.pucgo.SistemaBancoDeDados.modelo;

import javax.persistence.*;

@Entity
@Table
public class BancoDeDados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdBancoDeDados;

    private String NomeDoBanco;

    private String TipoDoBanco;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;


    public Long getIdBancoDeDados() {
        return IdBancoDeDados;
    }

    public void setIdBancoDeDados(Long idBancoDeDados) {
        IdBancoDeDados = idBancoDeDados;
    }

    public String getNomeDoBanco() {
        return NomeDoBanco;
    }

    public void setNomeDoBanco(String nomeDoBanco) {
        NomeDoBanco = nomeDoBanco;
    }

    public String getTipoDoBanco() {
        return TipoDoBanco;
    }

    public void setTipoDoBanco(String tipoDoBanco) {
        TipoDoBanco = tipoDoBanco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
