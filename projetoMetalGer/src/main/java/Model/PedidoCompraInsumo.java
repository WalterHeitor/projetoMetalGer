/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@GenericGenerator(
    name = "optimized-sequence-PedidoCompraInsumo",
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
@Table(name="pedido_compra_insumo")
public class PedidoCompraInsumo implements Serializable {//pergunta oa prof esta classe pode  virar extends
    //variaveis
    @GeneratedValue(generator="optimized-sequence-PedidoCompraInsumo")
    @Id
    private Long id_pedCompIns;
    @Column 
    private int quantidade;
    @Column
    private double valor_unitario;
    //relaçoes ---Pedido de Compra
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = PedidoCompra.class)
    @JoinColumn(name = "id_pedido_compra", nullable = true)
    private PedidoCompra pedidoCompra;
    //---Insumo
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Insumo.class)
    @JoinColumn(name = "id_insumo", nullable = true)
    private Insumo insumo;
    //metodos

    public PedidoCompraInsumo() {
    }

    public PedidoCompraInsumo(int quantidade, double valor_unitario, PedidoCompra pedidoCompra, Insumo insumo) {
        this.quantidade = quantidade;
        this.valor_unitario = valor_unitario;
        this.pedidoCompra = pedidoCompra;
        this.insumo = insumo;
    }

    
    public Long getId_pedCompIns() {
        return id_pedCompIns;
    }

    public void setId_pedCompIns(Long id_pedCompIns) {
        this.id_pedCompIns = id_pedCompIns;
    }

   

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public PedidoCompra getPedidoCompra() {
        return pedidoCompra;
    }

    public void setPedidoCompra(PedidoCompra pedidoCompra) {
        this.pedidoCompra = pedidoCompra;
    }
   

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }
    
}
