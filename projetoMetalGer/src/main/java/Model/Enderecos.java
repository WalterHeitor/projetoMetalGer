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
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@GenericGenerator(
    name = "optimized-sequence-endereco",
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
@Table(name ="enderecos")
public class Enderecos implements Serializable {
    @Id
    @GeneratedValue(generator="optimized-sequence-endereco")
    private Integer id_endereco;
    @Column
    private String largadouro;
    @Column
    private String cidade;
    @Column
    private String estado;
    @Column
    private String cep;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Pessoa.class)
    @JoinColumn(name = "id_pessoa", nullable = true)
    private Pessoa pessoa;
    public Enderecos() {
    }

    public Enderecos(String largadouro, String cidade, String estado, String cep) {
        this.largadouro = largadouro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public Enderecos(String largadouro, String cidade, String estado, String cep, Pessoa pessoa) {
        this.largadouro = largadouro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.pessoa = pessoa;
    }
    

    public Integer getId_endereco() {
        return id_endereco;
    }

    public void setId_endereco(Integer id_endereco) {
        this.id_endereco = id_endereco;
    }

    public String getLargadouro() {
        return largadouro;
    }

    public void setLargadouro(String largadouro) {
        this.largadouro = largadouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    
    
}
