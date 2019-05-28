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
 name = "optimized-sequence-ordemservico",
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
@Table(name="ordem_servico")
public class OrdemServico implements Serializable {
    @GeneratedValue(generator="optimized-sequence-ordemservico")
    @Id
    private Long id_ordem_servico;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_inicio")
    private Date dt_inicio;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_fim")
    private Date dt_fim;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_prevista")
    private Date dt_Prevista;
    @Column
    private String descricao_servico;
    @Column
    private String statusServco;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Projetos.class)
    @JoinColumn(name = "id_projeto", nullable = true)
    private Projetos projetos;

    public OrdemServico() {
    }

    public OrdemServico(Date dt_inicio, Date dt_fim, Date dt_Prevista, String descricao_servico, String statusServco, Projetos projetos) {
        this.dt_inicio = dt_inicio;
        this.dt_fim = dt_fim;
        this.dt_Prevista = dt_Prevista;
        this.descricao_servico = descricao_servico;
        this.statusServco = statusServco;
        this.projetos = projetos;
    }
    public OrdemServico(Date dt_inicio, Date dt_fim, Date dt_Prevista, String descricao_servico, String statusServco) {
        this.dt_inicio = dt_inicio;
        this.dt_fim = dt_fim;
        this.dt_Prevista = dt_Prevista;
        this.descricao_servico = descricao_servico;
        this.statusServco = statusServco;
        
    }

    public Long getId_ordem_servico() {
        return id_ordem_servico;
    }

    public void setId_ordem_servico(Long id_ordem_servico) {
        this.id_ordem_servico = id_ordem_servico;
    }

    public Date getDt_inicio() {
        return dt_inicio;
    }

    public void setDt_inicio(Date dt_inicio) {
        this.dt_inicio = dt_inicio;
    }

    public Date getDt_fim() {
        return dt_fim;
    }

    public void setDt_fim(Date dt_fim) {
        this.dt_fim = dt_fim;
    }

    public Date getDt_Prevista() {
        return dt_Prevista;
    }

    public void setDt_Prevista(Date dt_Prevista) {
        this.dt_Prevista = dt_Prevista;
    }

    public String getDescricao_servico() {
        return descricao_servico;
    }

    public void setDescricao_servico(String descricao_servico) {
        this.descricao_servico = descricao_servico;
    }

    public String getStatusServco() {
        return statusServco;
    }

    public void setStatusServco(String statusServco) {
        this.statusServco = statusServco;
    }

    public Projetos getProjetos() {
        return projetos;
    }

    public void setProjetos(Projetos projetos) {
        this.projetos = projetos;
    }

    

    

    

    
    
    
}
