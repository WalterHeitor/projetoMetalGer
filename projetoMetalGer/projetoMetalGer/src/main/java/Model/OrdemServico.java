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
    private Date dt_prevista;
    @Column
    private String descricao_servico;
    @Column
    private String statusservco;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Projetos.class)
    @JoinColumn(name = "id_projeto", nullable = true)
    private Projetos projetos;

    public OrdemServico() {
    }

    public OrdemServico(Date dt_inicio, Date dt_fim, Date dt_prevista, String descricao_servico, String statusservco, Projetos projetos) {
        this.dt_inicio = dt_inicio;
        this.dt_fim = dt_fim;
        this.dt_prevista = dt_prevista;
        this.descricao_servico = descricao_servico;
        this.statusservco = statusservco;
        this.projetos = projetos;
    }

    public OrdemServico(Date dt_inicio, Date dt_fim, Date dt_prevista, String descricao_servico, String statusservco) {
        this.dt_inicio = dt_inicio;
        this.dt_fim = dt_fim;
        this.dt_prevista = dt_prevista;
        this.descricao_servico = descricao_servico;
        this.statusservco = statusservco;
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

    public Date getDt_prevista() {
        return dt_prevista;
    }

    public void setDt_prevista(Date dt_prevista) {
        this.dt_prevista = dt_prevista;
    }

    public String getDescricao_servico() {
        return descricao_servico;
    }

    public void setDescricao_servico(String descricao_servico) {
        this.descricao_servico = descricao_servico;
    }

    public String getStatusservco() {
        return statusservco;
    }

    public void setStatusservco(String statusservco) {
        this.statusservco = statusservco;
    }

   

    public Projetos getProjetos() {
        return projetos;
    }

    public void setProjetos(Projetos projetos) {
        this.projetos = projetos;
    }

    

    

    

    
    
    
}
