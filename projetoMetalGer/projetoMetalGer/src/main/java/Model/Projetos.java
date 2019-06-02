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
 name = "optimized-sequence-projetos",
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
@Table(name="projetos")
public class Projetos implements Serializable {
    @GeneratedValue(generator="optimized-sequence-projetos")
    @Id
    private int id_projeto;
    @Column
    private String local_projeto;
    @Column
    private String titulo_projeto;
    @Column
    private String subtitulo_projeto;
    @Column
    private String projetado;
    @Column 
    private String desenhado;
    @Column
    private String revisado;
    @Column
    private String aprovado;
    
    //cliente
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Pessoa.class)
    @JoinColumn(name = "id_pessoa", nullable = true)
    private Pessoa pessoa;

    public Projetos() {
    }

    public Projetos(String local_projeto, String titulo_projeto, String subtitulo_projeto, String projetado, String desenhado, String revisado, String aprovado) {
        this.local_projeto = local_projeto;
        this.titulo_projeto = titulo_projeto;
        this.subtitulo_projeto = subtitulo_projeto;
        this.projetado = projetado;
        this.desenhado = desenhado;
        this.revisado = revisado;
        this.aprovado = aprovado;
    }

    public Projetos(String local_projeto, String titulo_projeto, String subtitulo_projeto, String projetado, String desenhado, String revisado, String aprovado, Pessoa pessoa) {
        this.local_projeto = local_projeto;
        this.titulo_projeto = titulo_projeto;
        this.subtitulo_projeto = subtitulo_projeto;
        this.projetado = projetado;
        this.desenhado = desenhado;
        this.revisado = revisado;
        this.aprovado = aprovado;
        this.pessoa = pessoa;
    }
    
    
    //gets sets

    public int getId_projeto() {
        return id_projeto;
    }

    public void setId_projeto(int id_projeto) {
        this.id_projeto = id_projeto;
    }

    public String getLocal_projeto() {
        return local_projeto;
    }

    public void setLocal_projeto(String local_projeto) {
        this.local_projeto = local_projeto;
    }

    public String getTitulo_projeto() {
        return titulo_projeto;
    }

    public void setTitulo_projeto(String titulo_projeto) {
        this.titulo_projeto = titulo_projeto;
    }

    public String getSubtitulo_projeto() {
        return subtitulo_projeto;
    }

    public void setSubtitulo_projeto(String subtitulo_projeto) {
        this.subtitulo_projeto = subtitulo_projeto;
    }

    public String getProjetado() {
        return projetado;
    }

    public void setProjetado(String projetado) {
        this.projetado = projetado;
    }

    public String getDesenhado() {
        return desenhado;
    }

    public void setDesenhado(String desenhado) {
        this.desenhado = desenhado;
    }

    public String getRevisado() {
        return revisado;
    }

    public void setRevisado(String revisado) {
        this.revisado = revisado;
    }

    public String getAprovado() {
        return aprovado;
    }

    public void setAprovado(String aprovado) {
        this.aprovado = aprovado;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    
    
    
}
