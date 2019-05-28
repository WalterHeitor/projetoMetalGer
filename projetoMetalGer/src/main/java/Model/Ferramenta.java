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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@GenericGenerator(
 name = "optimized-sequence-Ferramenta",
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
@Table(name="Ferramenta")
public class Ferramenta implements Serializable {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id_ferramenta;
    
    @Column(unique=true, nullable=false,
         insertable=true, updatable=true)
        private int codigo_ferra;
    @Column
    private  String status;
    @Column
    private String descricao_ferr;
    @Column
    private String num_nota_fiscal_ferr;
    @Temporal(TemporalType.DATE)
    @Column(name="dt_aquisicao_ferr")
    private Date dt_aquisicao_ferr;
    @Column
    private String categoria_ferr;
    @Temporal(TemporalType.DATE)
    @Column(name="dt_entrega_ferr")
    private Date dt_entrega_ferr;
    @Column
    private String patrimonio_ferr;
    @Column
    private String local_ferr;
   
    @OneToOne(
        mappedBy = "ferramenta",
        cascade = CascadeType.PERSIST
    )
    EmprestimoFerramenta emprestimo_ferramenta;
    //construtor

    public Ferramenta() {
    }

    public Ferramenta(int codigo_ferra, String status, String descricao_ferr, String num_nota_fiscal_ferr, Date dt_aquisicao_ferr, String categoria_ferr, Date dt_entrega_ferr, String patrimonio_ferr, String local_ferr) {
        this.codigo_ferra = codigo_ferra;
        this.status = status;
        this.descricao_ferr = descricao_ferr;
        this.num_nota_fiscal_ferr = num_nota_fiscal_ferr;
        this.dt_aquisicao_ferr = dt_aquisicao_ferr;
        this.categoria_ferr = categoria_ferr;
        this.dt_entrega_ferr = dt_entrega_ferr;
        this.patrimonio_ferr = patrimonio_ferr;
        this.local_ferr = local_ferr;
    }

    public Ferramenta(int codigo_ferra, String status, String descricao_ferr, String num_nota_fiscal_ferr, Date dt_aquisicao_ferr, String categoria_ferr, Date dt_entrega_ferr, String patrimonio_ferr, String local_ferr, EmprestimoFerramenta emprestimo_ferramenta) {
        this.codigo_ferra = codigo_ferra;
        this.status = status;
        this.descricao_ferr = descricao_ferr;
        this.num_nota_fiscal_ferr = num_nota_fiscal_ferr;
        this.dt_aquisicao_ferr = dt_aquisicao_ferr;
        this.categoria_ferr = categoria_ferr;
        this.dt_entrega_ferr = dt_entrega_ferr;
        this.patrimonio_ferr = patrimonio_ferr;
        this.local_ferr = local_ferr;
        this.emprestimo_ferramenta = emprestimo_ferramenta;
    }

    public Long getId_ferramenta() {
        return id_ferramenta;
    }

    public void setId_ferramenta(Long id_ferramenta) {
        this.id_ferramenta = id_ferramenta;
    }

    public int getCodigo_ferra() {
        return codigo_ferra;
    }

    public void setCodigo_ferra(int codigo_ferra) {
        this.codigo_ferra = codigo_ferra;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescricao_ferr() {
        return descricao_ferr;
    }

    public void setDescricao_ferr(String descricao_ferr) {
        this.descricao_ferr = descricao_ferr;
    }

    public String getNum_nota_fiscal_ferr() {
        return num_nota_fiscal_ferr;
    }

    public void setNum_nota_fiscal_ferr(String num_nota_fiscal_ferr) {
        this.num_nota_fiscal_ferr = num_nota_fiscal_ferr;
    }

    public Date getDt_aquisicao_ferr() {
        return dt_aquisicao_ferr;
    }

    public void setDt_aquisicao_ferr(Date dt_aquisicao_ferr) {
        this.dt_aquisicao_ferr = dt_aquisicao_ferr;
    }

    public String getCategoria_ferr() {
        return categoria_ferr;
    }

    public void setCategoria_ferr(String categoria_ferr) {
        this.categoria_ferr = categoria_ferr;
    }

    public Date getDt_entrega_ferr() {
        return dt_entrega_ferr;
    }

    public void setDt_entrega_ferr(Date dt_entrega_ferr) {
        this.dt_entrega_ferr = dt_entrega_ferr;
    }

    public String getPatrimonio_ferr() {
        return patrimonio_ferr;
    }

    public void setPatrimonio_ferr(String patrimonio_ferr) {
        this.patrimonio_ferr = patrimonio_ferr;
    }

    public String getLocal_ferr() {
        return local_ferr;
    }

    public void setLocal_ferr(String local_ferr) {
        this.local_ferr = local_ferr;
    }

    public EmprestimoFerramenta getEmprestimo_ferramenta() {
        return emprestimo_ferramenta;
    }

    public void setEmprestimo_ferramenta(EmprestimoFerramenta emprestimo_ferramenta) {
        this.emprestimo_ferramenta = emprestimo_ferramenta;
    }

    

    

    

    


   
}
