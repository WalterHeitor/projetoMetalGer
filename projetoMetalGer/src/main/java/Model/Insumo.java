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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@GenericGenerator(
 name = "optimized-sequence-insumos",
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
@Table(name="insumo")
public class Insumo implements Serializable {
    @GeneratedValue(generator="optimized-sequence-insumos")
    @Id
    private int id_insumo;
    @Column
    private String descricao_produto;
    @Column
    private int cod_insumo;
    @Column
    private int unidade;
   
 //relaçoes
 //PedidoCompraInsumo
    @OneToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = PedidoCompraInsumo.class, mappedBy = "insumo")
    private Set<PedidoCompraInsumo> compraInsumos;
    
 //MaoObraOrdemServico
    @OneToMany(fetch= FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = MaoObraOrdemServico.class, mappedBy = "insumo")
    private Set<MaoObraOrdemServico> maoObraOrdemServicos;
    
 //construtores

    public Insumo() {
    }

    public Insumo(String descricao_produto, int cod_insumo, int unidade) {
        this.descricao_produto = descricao_produto;
        this.cod_insumo = cod_insumo;
        this.unidade = unidade;
    }   

    public Insumo(int id_insumo, String descricao_produto, int cod_insumo, int unidade, Set<PedidoCompraInsumo> compraInsumos) {
        this.id_insumo = id_insumo;
        this.descricao_produto = descricao_produto;
        this.cod_insumo = cod_insumo;
        this.unidade = unidade;

        this.compraInsumos = compraInsumos;
    }
    

    public int getId_insumo() {
        return id_insumo;
    }

    public void setId_insumo(int id_insumo) {
        this.id_insumo = id_insumo;
    }

    public String getDescricao_produto() {
        return descricao_produto;
    }

    public void setDescricao_produto(String descricao_produto) {
        this.descricao_produto = descricao_produto;
    }

    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
    }

    public int getCod_insumo() {
        return cod_insumo;
    }

    public void setCod_insumo(int cod_insumo) {
        this.cod_insumo = cod_insumo;
    }

    public void addPedidoCompraInsumo(PedidoCompraInsumo compraInsumo){
        if(this.compraInsumos == null){
            this.compraInsumos = new HashSet<PedidoCompraInsumo>();
        }
        this.compraInsumos.add(compraInsumo);
    }
    
    public void addMaoObraOrdemServico(MaoObraOrdemServico servico){
        if(this.maoObraOrdemServicos == null){
            this.maoObraOrdemServicos = new HashSet<MaoObraOrdemServico>();
        }
        this.maoObraOrdemServicos.add(servico);
    }
}
