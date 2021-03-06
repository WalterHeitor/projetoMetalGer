/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
    name = "optimized-sequence-MaoObraServico",
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
@Table(name="mao_obra_servico")
public class MaoObraOrdemServico {
    
//variaveis
    @GeneratedValue(generator="optimized-sequence-MaoObraServico")
    @Id
    private Long id_mao_obra;
    @Column
    private String descricaoOperacao;
    @Temporal(TemporalType.DATE)
    @Column(name="dt_inicio")
    private Date dt_inicio;
    @Temporal(TemporalType.DATE)
    @Column(name="dt_fim")
    private Date dt_fim;  
    @Temporal(TemporalType.TIME)
    @Column
    private Date Hr_inicio;
    @Temporal(TemporalType.TIME)
    @Column
    private Date Hr_fim;
    @Column
    private float qtd_insumo;
    @Column
    private float qtd_horas_trab;
 
 //pessoa
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Pessoa.class)
    @JoinColumn(name = "id_pessoa", nullable = true)
    private Pessoa pessoa;
  
//insumo
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Insumo.class)
    @JoinColumn(name = "id_insumo", nullable = true)
    private Insumo insumo;
    
//funcionario ordem serviço
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = FuncionarioOrdemServico.class)
    @JoinColumn(name = "id_funcionario_ordem_servico", nullable = true)
    private FuncionarioOrdemServico funcionarioOrdemServico;
//contrutores

    public MaoObraOrdemServico() {
    }

    public MaoObraOrdemServico(String descricaoOperacao, Date dt_inicio, Date dt_fim, float qtd_horas_trab, Pessoa pessoa, FuncionarioOrdemServico funcionarioOrdemServico) {
        this.descricaoOperacao = descricaoOperacao;
        this.dt_inicio = dt_inicio;
        this.dt_fim = dt_fim;
        this.qtd_horas_trab = qtd_horas_trab;
        this.pessoa = pessoa;
        this.funcionarioOrdemServico = funcionarioOrdemServico;
    }
    

    public MaoObraOrdemServico(String descricaoOperacao, Date dt_fim, Date dt_inicio, Date Hr_inicio, Date Hr_fim,  Pessoa pessoa, FuncionarioOrdemServico funcionarioOrdemServico) {
        this.descricaoOperacao = descricaoOperacao;
        this.dt_fim = dt_fim;
        this.dt_inicio = dt_inicio;
        this.Hr_inicio = Hr_inicio;
        this.Hr_fim = Hr_fim;
        this.pessoa = pessoa;
        this.funcionarioOrdemServico = funcionarioOrdemServico;
    }

    public MaoObraOrdemServico(float qtd_insumo, Insumo insumo) {
        this.qtd_insumo = qtd_insumo;
        this.insumo = insumo;
    }

//gets sets
    public Long getId_mao_obra() {
        return id_mao_obra;
    }

    public void setId_mao_obra(Long id_mao_obra) {
        this.id_mao_obra = id_mao_obra;
    }

    public String getDescricaoOperacao() {
        return descricaoOperacao;
    }

    public void setDescricaoOperacao(String descricaoOperacao) {
        this.descricaoOperacao = descricaoOperacao;
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

    public float getQtd_insumo() {
        return qtd_insumo;
    }

    public void setQtd_insumo(float qtd_insumo) {
        this.qtd_insumo = qtd_insumo;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }

    public Date getHr_inicio() {
        return Hr_inicio;
    }

    public void setHr_inicio(Date Hr_inicio) {
        this.Hr_inicio = Hr_inicio;
    }

    public Date getHr_fim() {
        return Hr_fim;
    }

    public void setHr_fim(Date Hr_fim) {
        this.Hr_fim = Hr_fim;
    }

    public float getQtd_horas_trab() {
        return qtd_horas_trab;
    }

    public void setQtd_horas_trab(float qtd_horas_trab) {
        this.qtd_horas_trab = qtd_horas_trab;
    }
    

    public FuncionarioOrdemServico getFuncionarioOrdemServico() {
        return funcionarioOrdemServico;
    }

    public void setFuncionarioOrdemServico(FuncionarioOrdemServico funcionarioOrdemServico) {
        this.funcionarioOrdemServico = funcionarioOrdemServico;
    }
    
    
}
