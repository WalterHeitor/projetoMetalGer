/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@GenericGenerator(
    name = "optimized-sequence-pessoa",
    strategy = "enhanced-sequence",
    parameters = {
        @Parameter(name="prefer_sequence_per_entity", value="true"),
        @Parameter(name="optimizer", value="hilo"),
        @Parameter(name="increment_size", value="1")})
/**
 *
 * @author walter heitor
 */
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name ="pessoa")
public class Pessoa implements Serializable  {
    @Id
    @GeneratedValue(generator="optimized-sequence-pessoa")
    private int id_pessoa;
    @Column
    private String nome;
    @Column
    private int tipo;
 //enderecos
    @OneToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Enderecos.class, mappedBy = "pessoa")
    private Set<Enderecos> enderecos;
 //telefone
    @OneToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Telefone.class, mappedBy = "pessoa")
    private Set<Telefone> telefone;
 //emprestimoferramenta
    @OneToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = EmprestimoFerramenta.class, mappedBy = "pessoa")
    private Set<EmprestimoFerramenta> emprestimo_ferramenta;
// dependentes
    @OneToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Dependentes.class, mappedBy = "pessoa")
    private Set<Dependentes> dependentes;
 // Projetos
    @OneToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Projetos.class, mappedBy = "pessoa")
    private Set<Projetos> projetoses;
 //PedidoCompra
    @OneToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = PedidoCompra.class, mappedBy = "pessoa")
    private Set<PedidoCompra> pedidoCompras ;
 //MaoObraOrdemServiço
    @OneToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = MaoObraOrdemServico.class, mappedBy = "pessoa")
    private Set<MaoObraOrdemServico> maoObraOrdemServicos ;
    
    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    

    public Pessoa() {}
    public Pessoa(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
    
    public void addEnderecos(Enderecos e){
        if(this.enderecos == null){
            this.enderecos = new HashSet<Enderecos>();
        }
        this.enderecos.add(e);
    }
    public void addTelefone(Telefone t){
        if(this.telefone == null){
            this.telefone = new HashSet<Telefone>();
        }
        this.telefone.add(t);
    }
    
    public void addEmprestimoFerramenta(EmprestimoFerramenta e_f){
        if(this.emprestimo_ferramenta == null){
            this.emprestimo_ferramenta = new HashSet<EmprestimoFerramenta>();
        }
        this.emprestimo_ferramenta.add(e_f);
    }
    
   public void addDependentes(Dependentes dp){
        if(this.dependentes == null){
           this.dependentes = new HashSet<Dependentes>();
        }
        this.dependentes.add(dp);
    }
   
   public void addMaoObraOrdemServico(MaoObraOrdemServico servico){
        if(this.maoObraOrdemServicos == null){
           this.maoObraOrdemServicos = new HashSet<MaoObraOrdemServico>();
        }
        this.maoObraOrdemServicos.add(servico);
    }
   
   public void addProjetos(Projetos projetos){
        if(this.projetoses == null){
           this.projetoses = new HashSet<Projetos>();
        }
        this.projetoses.add(projetos);
    }
    
}
