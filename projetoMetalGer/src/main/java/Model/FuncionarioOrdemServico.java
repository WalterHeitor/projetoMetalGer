/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@GenericGenerator(
 name = "optimized-sequence-Funcionario_Ordem_Servico",
 strategy = "enhanced-sequence",
 parameters = {
 @Parameter(name="prefer_sequence_per_entity", value="true"),
 @Parameter(name="optimizer", value="hilo"),
 @Parameter(name="increment_size", value="1")})
/**
 *
 * @author walter heitor
 */
@Entity
@Table(name ="funcionario_ordem_sevico")
public class FuncionarioOrdemServico implements Serializable {
    @GeneratedValue(generator="optimized-sequence-Funcionario_Ordem_Servico")
    @Id
    private Long id_funcionario_ordem_servico;
    @Column
    private String descricao;
    @Column
    private String status_servico;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_prevista")
    private Date dt_prevista;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_fim")
    private Date dt_fim;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_inicio")
    private Date dt_inicio;
   
    
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Pessoa.class)
    @JoinColumn(name = "id_pessoa", nullable = true)
    private Pessoa pessoa;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = OrdemServico.class)
    @JoinColumn(name = "id_ordem_servico", nullable = true)
    private OrdemServico ordem_servico;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Insumo.class)
    @JoinColumn(name = "id_insumo", nullable = true)
    private Insumo insumo;

    public FuncionarioOrdemServico() {
    }

    public FuncionarioOrdemServico(String descricao, String status_servico, Date dt_prevista, Date dt_fim, Date dt_inicio, Pessoa pessoa, OrdemServico ordem_servico) {
        this.descricao = descricao;
        this.status_servico = status_servico;
        this.dt_prevista = dt_prevista;
        this.dt_fim = dt_fim;
        this.dt_inicio = dt_inicio;
        this.pessoa = pessoa;
        this.ordem_servico = ordem_servico;
    }

    public FuncionarioOrdemServico(String descricao, String status_servico, Date dt_prevista, Date dt_fim, Date dt_inicio, Pessoa pessoa, OrdemServico ordem_servico, Insumo insumo) {
        this.descricao = descricao;
        this.status_servico = status_servico;
        this.dt_prevista = dt_prevista;
        this.dt_fim = dt_fim;
        this.dt_inicio = dt_inicio;
        this.pessoa = pessoa;
        this.ordem_servico = ordem_servico;
        this.insumo = insumo;
    }

    public Long getId_funcionario_ordem_servico() {
        return id_funcionario_ordem_servico;
    }

    public void setId_funcionario_ordem_servico(Long id_funcionario_ordem_servico) {
        this.id_funcionario_ordem_servico = id_funcionario_ordem_servico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String isStatus_servico() {
        return status_servico;
    }

    public void setStatus_servico(String status_servico) {
        this.status_servico = status_servico;
    }

    public Date getDt_prevista() {
        return dt_prevista;
    }

    public void setDt_prevista(Date dt_prevista) {
        this.dt_prevista = dt_prevista;
    }

    public Date getDt_fim() {
        return dt_fim;
    }

    public void setDt_fim(Date dt_fim) {
        this.dt_fim = dt_fim;
    }

    public Date getDt_inicio() {
        return dt_inicio;
    }

    public void setDt_inicio(Date dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public OrdemServico getOrdem_servico() {
        return ordem_servico;
    }

    public void setOrdem_servico(OrdemServico ordem_servico) {
        this.ordem_servico = ordem_servico;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }
 
    
    
    

    
}

