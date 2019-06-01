/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
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
//relaçoes
 //ordem de serviço
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = OrdemServico.class)
    @JoinColumn(name = "id_ordem_servico", nullable = true)
    private OrdemServico ordem_servico;
    
    

    public FuncionarioOrdemServico() {
    }

    public FuncionarioOrdemServico(String descricao, String status_servico, Date dt_prevista, OrdemServico ordem_servico) {
        this.descricao = descricao;
        this.status_servico = status_servico;
        this.dt_prevista = dt_prevista;
        this.ordem_servico = ordem_servico;
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

    public String getStatus_servico() {
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

    public OrdemServico getOrdem_servico() {
        return ordem_servico;
    }

    public void setOrdem_servico(OrdemServico ordem_servico) {
        this.ordem_servico = ordem_servico;
    }
   
}

