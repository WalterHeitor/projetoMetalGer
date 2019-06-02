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
 //mao de obra
    @OneToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = MaoObraOrdemServico.class, mappedBy = "funcionarioOrdemServico")
    private Set<MaoObraOrdemServico> maoObraOrdemServicos;
    

    public FuncionarioOrdemServico() {
    }

    public FuncionarioOrdemServico(String descricao, String status_servico, Date dt_prevista, OrdemServico ordem_servico) {
        this.descricao = descricao;
        this.status_servico = status_servico;
        this.dt_prevista = dt_prevista;
        this.ordem_servico = ordem_servico;
    }
    
    public FuncionarioOrdemServico(String descricao, String status_servico, Date dt_prevista, OrdemServico ordem_servico, Set<MaoObraOrdemServico> maoObraOrdemServicos) {
        this.descricao = descricao;
        this.status_servico = status_servico;
        this.dt_prevista = dt_prevista;
        this.ordem_servico = ordem_servico;
        this.maoObraOrdemServicos = maoObraOrdemServicos;
    }

    
    
    
    public void addMaoObraOrdemServico(MaoObraOrdemServico servico){
        if(this.maoObraOrdemServicos == null){
           this.maoObraOrdemServicos = new HashSet<MaoObraOrdemServico>();
        }
        this.maoObraOrdemServicos.add(servico);
    }
   
}

