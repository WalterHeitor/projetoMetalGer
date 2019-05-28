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
 name = "optimized-sequence-dependentes",
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
@Table(name="dependentes")
public class Dependentes implements Serializable {
    @GeneratedValue(generator="optimized-sequence-dependentes")
    @Id
    private Long id_dependentes;
    @Column
    private String nome;
    @Column
    private String parentesco;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_nasc")
    private Date dt_nasc;
    @Column
    private double salario_familia;
    @Column
    private double imposto_renda;
    @Column
    private double salario_educacao;
    
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Pessoa.class)
    @JoinColumn(name = "id_pessoa", nullable = true)
    private Pessoa pessoa;
    
    //construtores
    public Dependentes() {
    }

    public Dependentes(String nome, String parentesco, Date dt_nasc, double salario_familia, double imposto_renda, double salario_educacao) {
        this.nome = nome;
        this.parentesco = parentesco;
        this.dt_nasc = dt_nasc;
        this.salario_familia = salario_familia;
        this.imposto_renda = imposto_renda;
        this.salario_educacao = salario_educacao;
    }
    
    public Dependentes(String nome, String parentesco, Date dt_nasc, double salario_familia, double imposto_renda, double salario_educacao, Pessoa pessoa) {
        this.nome = nome;
        this.parentesco = parentesco;
        this.dt_nasc = dt_nasc;
        this.salario_familia = salario_familia;
        this.imposto_renda = imposto_renda;
        this.salario_educacao = salario_educacao;
        this.pessoa = pessoa;
    }
    
    //getts setts

    public Long getId_dependentes() {
        return id_dependentes;
    }

    public void setId_dependentes(Long id_dependentes) {
        this.id_dependentes = id_dependentes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Date getDt_nasc() {
        return dt_nasc;
    }

    public void setDt_nasc(Date dt_nasc) {
        this.dt_nasc = dt_nasc;
    }

    public double getSalario_familia() {
        return salario_familia;
    }

    public void setSalario_familia(double salario_familia) {
        this.salario_familia = salario_familia;
    }

    public double getImposto_renda() {
        return imposto_renda;
    }

    public void setImposto_renda(double imposto_renda) {
        this.imposto_renda = imposto_renda;
    }

    public double getSalario_educacao() {
        return salario_educacao;
    }

    public void setSalario_educacao(double salario_educacao) {
        this.salario_educacao = salario_educacao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}
