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
 name = "optimized-sequence-emprestimo_ferramenta",
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
@Table(name="emprestimo_ferramenta")
public class EmprestimoFerramenta implements Serializable {
    @Id
    @GeneratedValue(generator="optimized-sequence-emprestimo_ferramenta")
    private Long id_emprestimo_ferramenta;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_saida_emp")
    private Date dt_saida_emp;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_entrega")
    private Date dt_entrega;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Ferramenta.class)
    @JoinColumn(name = "id_ferramenta", nullable = true)
    private Ferramenta ferramenta;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Pessoa.class)
    @JoinColumn(name = "id_pessoa", nullable = true)
    private Pessoa pessoa;
    
    //construtor

    public EmprestimoFerramenta() {
    }

    public EmprestimoFerramenta(Date dt_saida_emp, Date dt_entrega, Ferramenta ferramenta, Pessoa pessoa) {
        this.dt_saida_emp = dt_saida_emp;
        this.dt_entrega = dt_entrega;
        this.ferramenta = ferramenta;
        this.pessoa = pessoa;
    }
    
    //getts setts

    public Long getId_emprestimo_ferramenta() {
        return id_emprestimo_ferramenta;
    }

    public void setId_emprestimo_ferramenta(Long id_emprestimo_ferramenta) {
        this.id_emprestimo_ferramenta = id_emprestimo_ferramenta;
    }

    public Date getDt_saida_emp() {
        return dt_saida_emp;
    }

    public void setDt_saida_emp(Date dt_saida_emp) {
        this.dt_saida_emp = dt_saida_emp;
    }

    public Date getDt_entrega() {
        return dt_entrega;
    }

    public void setDt_entrega(Date dt_entrega) {
        this.dt_entrega = dt_entrega;
    }

    public Ferramenta getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(Ferramenta ferramenta) {
        this.ferramenta = ferramenta;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    
    
    
}
