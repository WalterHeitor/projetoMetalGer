/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@GenericGenerator(
 name = "optimized-sequence-pedidocompra",
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
@Table(name="pedido_compra")
public class PedidoCompra implements Serializable {
    @GeneratedValue(generator="optimized-sequence-pedidocompra")
    @Id
    private int id_pedido_compra;
    @Temporal(TemporalType.DATE)
    private Date dt_emicao;  
    @Column
    private double valor_total;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Projetos.class)
    @JoinColumn(name = "id_projeto", nullable = true)
    private Projetos projetos;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Pessoa.class)
    @JoinColumn(name = "id_pessoa", nullable = true)
    private Pessoa pessoa;
    

    public PedidoCompra() {
    }

    public PedidoCompra(Date dt_emicao, Projetos projetos, Pessoa pessoa) {
        this.dt_emicao = dt_emicao;
        this.projetos = projetos;
        this.pessoa = pessoa;
    }
    

    public PedidoCompra(Date dt_emicao, double valor_total, Projetos projetos, Pessoa pessoa) {
        this.dt_emicao = dt_emicao;
        this.valor_total = valor_total;
        this.projetos = projetos;
        this.pessoa = pessoa;
    }

    public int getId_pedido_compra() {
        return id_pedido_compra;
    }

    public void setId_pedido_compra(int id_pedido_compra) {
        this.id_pedido_compra = id_pedido_compra;
    }

    public Date getDt_emicao() {
        return dt_emicao;
    }

    public void setDt_emicao(Date dt_emicao) {
        this.dt_emicao = dt_emicao;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public Projetos getProjetos() {
        return projetos;
    }

    public void setProjetos(Projetos projetos) {
        this.projetos = projetos;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    

    public void limpa(){
     
     this.dt_emicao = null;
     
     this.valor_total=0;
    }

    



    

    

    
    
    
}
