/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.CascadeType;
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
 name = "optimized-sequence-projetoinsumo",
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
@Table(name="projeto_insumo")
public class ProjetoInsumo {
    @GeneratedValue(generator="optimized-sequence-projetoinsumo")
    @Id
   private Long id_projeto_insumo;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Projetos.class)
    @JoinColumn(name = "id_projeto", nullable = false)
    private Projetos projetos;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Insumo.class)
    @JoinColumn(name = "id_insumo", nullable = false)
    private Insumo insumo;

    public ProjetoInsumo() {
    }

    public ProjetoInsumo(Projetos projetos, Insumo insumo) {
        this.projetos = projetos;
        this.insumo = insumo;
    }

    public Long getId_projeto_insumo() {
        return id_projeto_insumo;
    }

    public void setId_projeto_insumo(Long id_projeto_insumo) {
        this.id_projeto_insumo = id_projeto_insumo;
    }

    public Projetos getProjetos() {
        return projetos;
    }

    public void setProjetos(Projetos projetos) {
        this.projetos = projetos;
    }

    public Insumo getInsumo() {
        return insumo;
    }

    public void setInsumo(Insumo insumo) {
        this.insumo = insumo;
    }
    
    
}
