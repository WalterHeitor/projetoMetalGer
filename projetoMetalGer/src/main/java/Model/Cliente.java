/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
/**
 *
 * @author walter heitor
 */
@PrimaryKeyJoinColumn(name="id_pessoa")
@Entity
@Table(name ="cliente")
public class Cliente extends Pessoa implements Serializable {
    @Column
    private String razao_social;
    @Column
    private String fantasia;
    @Column
    private String cnpj;

    

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Cliente(){}
    public Cliente(String nome, int tipo) {
        super(nome, tipo);
    }

    public Cliente(String razao_social, String fantasia, String cnpj, String nome, int tipo) {
        super(nome, tipo);
        this.razao_social = razao_social;
        this.fantasia = fantasia;
        this.cnpj = cnpj;
    }
    
    
}
