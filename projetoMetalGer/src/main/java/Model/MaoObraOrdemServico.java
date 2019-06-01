/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
@GenericGenerator(
    name = "optimized-sequence-MaoObraServico",
    strategy = "enhanced-sequence",
    parameters = {
        @Parameter(name="prefer_sequence_per_entity", value="true"),
        @Parameter(name="optimizer", value="hilo"),
        @Parameter(name="increment_size", value="1")})
/**
 *
 * @author walter heitor
 */
public class MaoObraOrdemServico {
    
//variaveis
    @GeneratedValue(generator="optimized-sequence-MaoObraServico")
    @Id
    private Long id_mao_obra;
    @Column
    private String descricaoOperacao;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_fim")
    private Date dt_fim;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dt_inicio")
    private Date dt_inicio;
    @Column
    private float qtd_insumo;
 
 //pessoa
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Pessoa.class)
    @JoinColumn(name = "id_pessoa", nullable = true)
    private Pessoa pessoa;
  
//insumo
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Insumo.class)
    @JoinColumn(name = "id_insumo", nullable = true)
    private Insumo insumo;
    
}
