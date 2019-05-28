/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 *
 * @author walter heitor
 */
@PrimaryKeyJoinColumn(name="id_pessoa")
@Entity
@Table(name ="funcionario")
public class Funcionario extends Pessoa implements Serializable{
    //campos obrigatorios
//filiaçao
    @Column
    private String pai_func;
    @Column
    private String mae_func;
//Dados pessoais
    @Column
    private String cart_profissional_serie_func;
    @Column
    private String cart_reservista_func;
    @Column
    private String cart_resrvis_categoria_func;
    @Column
    private String titulo_eleitor_func;
    @Column
    private String cart_identidade_func;
    @Temporal(TemporalType.DATE)
    private Date emissao_cart_identidade;
    @Column
    private String orgao_emissorcart_identidade_func;
    @Column
    private String cpf_func;
    @Column
    private String pis_func;
    @Temporal(TemporalType.DATE)
    private Date dt_pis_func;
    @Column
    private String local_nasc_func; 
    @Temporal(TemporalType.DATE)
    private Date dt_nasc_func;
    @Column
    private String estado_civil_func;
    @Column
    private String grau_instrucao_func;
    //nao obrigatorios
    @Column
    private String peso_func;
    @Column
    private String cabelo_func;
    @Column
    private String pele_func;
    @Column
    private String defeitos_func;
    @Column
    private String ex_admicional;
//contrato entrada
    @Temporal(TemporalType.DATE)
    private Date dt_admicao;
    @Temporal(TemporalType.DATE)
    private Date dt_fgts;
    @Column
    private String cargo_atual;
    @Column
    private String tipo_salario;
    @Column
    private String local_trabalho;
    @Column
    private String membro_cipa;
//contrato saida
    @Temporal(TemporalType.DATE)
    private Date dt_saida_func;
    @Column(length=100)
    private String ex_admiconal;
    @Column(length=100)
    private String cod_afastamento_func;
 //anotaçao gearis
    @Column
    private String ferias_periodo_gozo_func;
    @Column
    private String alteracao_salario_func;
    @Column
    private String contribuicao_sindical_func;
    @Column 
    private String movimento_afastamento_func;
    @Column
    private String anotacoes_gerais_func;
    //construtores
    public Funcionario() {
    }
//dados pessoais

    public Funcionario(String pai_func, String mae_func, String cart_profissional_serie_func, String cart_reservista_func, String cart_resrvis_categoria_func, String titulo_eleitor_func, String cart_identidade_func, Date emissao_cart_identidade, String orgao_emissorcart_identidade_func, String cpf_func, String pis_func, Date dt_pis_func, String local_nasc_func, Date dt_nasc_func, String estado_civil_func, String grau_instrucao_func, String peso_func, String cabelo_func, String pele_func, String defeitos_func, String nome, int tipo) {
        super(nome, tipo);
        this.pai_func = pai_func;
        this.mae_func = mae_func;
        this.cart_profissional_serie_func = cart_profissional_serie_func;
        this.cart_reservista_func = cart_reservista_func;
        this.cart_resrvis_categoria_func = cart_resrvis_categoria_func;
        this.titulo_eleitor_func = titulo_eleitor_func;
        this.cart_identidade_func = cart_identidade_func;
        this.emissao_cart_identidade = emissao_cart_identidade;
        this.orgao_emissorcart_identidade_func = orgao_emissorcart_identidade_func;
        this.cpf_func = cpf_func;
        this.pis_func = pis_func;
        this.dt_pis_func = dt_pis_func;
        this.local_nasc_func = local_nasc_func;
        this.dt_nasc_func = dt_nasc_func;
        this.estado_civil_func = estado_civil_func;
        this.grau_instrucao_func = grau_instrucao_func;
        this.peso_func = peso_func;
        this.cabelo_func = cabelo_func;
        this.pele_func = pele_func;
        this.defeitos_func = defeitos_func;
    }

    public Funcionario(String pai_func, String mae_func, String cart_profissional_serie_func, String cart_reservista_func, String cart_resrvis_categoria_func, String titulo_eleitor_func, String cart_identidade_func, Date emissao_cart_identidade, String orgao_emissorcart_identidade_func, String cpf_func, String pis_func, Date dt_pis_func, String local_nasc_func, Date dt_nasc_func, String estado_civil_func, String grau_instrucao_func, String peso_func, String cabelo_func, String pele_func, String defeitos_func, String ex_admicional, Date dt_admicao, Date dt_fgts, String cargo_atual, String tipo_salario, String local_trabalho, String membro_cipa, Date dt_saida_func, String ex_admiconal, String cod_afastamento_func, String ferias_periodo_gozo_func, String alteracao_salario_func, String contribuicao_sindical_func, String movimento_afastamento_func, String anotacoes_gerais_func, String nome, int tipo) {
        super(nome, tipo);
        this.pai_func = pai_func;
        this.mae_func = mae_func;
        this.cart_profissional_serie_func = cart_profissional_serie_func;
        this.cart_reservista_func = cart_reservista_func;
        this.cart_resrvis_categoria_func = cart_resrvis_categoria_func;
        this.titulo_eleitor_func = titulo_eleitor_func;
        this.cart_identidade_func = cart_identidade_func;
        this.emissao_cart_identidade = emissao_cart_identidade;
        this.orgao_emissorcart_identidade_func = orgao_emissorcart_identidade_func;
        this.cpf_func = cpf_func;
        this.pis_func = pis_func;
        this.dt_pis_func = dt_pis_func;
        this.local_nasc_func = local_nasc_func;
        this.dt_nasc_func = dt_nasc_func;
        this.estado_civil_func = estado_civil_func;
        this.grau_instrucao_func = grau_instrucao_func;
        this.peso_func = peso_func;
        this.cabelo_func = cabelo_func;
        this.pele_func = pele_func;
        this.defeitos_func = defeitos_func;
        this.ex_admicional = ex_admicional;
        this.dt_admicao = dt_admicao;
        this.dt_fgts = dt_fgts;
        this.cargo_atual = cargo_atual;
        this.tipo_salario = tipo_salario;
        this.local_trabalho = local_trabalho;
        this.membro_cipa = membro_cipa;
        this.dt_saida_func = dt_saida_func;
        this.ex_admiconal = ex_admiconal;
        this.cod_afastamento_func = cod_afastamento_func;
        this.ferias_periodo_gozo_func = ferias_periodo_gozo_func;
        this.alteracao_salario_func = alteracao_salario_func;
        this.contribuicao_sindical_func = contribuicao_sindical_func;
        this.movimento_afastamento_func = movimento_afastamento_func;
        this.anotacoes_gerais_func = anotacoes_gerais_func;
    }
    

 //getrs setrs

    public String getPai_func() {
        return pai_func;
    }

    public void setPai_func(String pai_func) {
        this.pai_func = pai_func;
    }

    public String getMae_func() {
        return mae_func;
    }

    public void setMae_func(String mae_func) {
        this.mae_func = mae_func;
    }

    public String getCart_profissional_serie_func() {
        return cart_profissional_serie_func;
    }

    public void setCart_profissional_serie_func(String cart_profissional_serie_func) {
        this.cart_profissional_serie_func = cart_profissional_serie_func;
    }

    public String getCart_reservista_func() {
        return cart_reservista_func;
    }

    public void setCart_reservista_func(String cart_reservista_func) {
        this.cart_reservista_func = cart_reservista_func;
    }

    public String getCart_resrvis_categoria_func() {
        return cart_resrvis_categoria_func;
    }

    public void setCart_resrvis_categoria_func(String cart_resrvis_categoria_func) {
        this.cart_resrvis_categoria_func = cart_resrvis_categoria_func;
    }

    public String getTitulo_eleitor_func() {
        return titulo_eleitor_func;
    }

    public void setTitulo_eleitor_func(String titulo_eleitor_func) {
        this.titulo_eleitor_func = titulo_eleitor_func;
    }

    public String getCart_identidade_func() {
        return cart_identidade_func;
    }

    public void setCart_identidade_func(String cart_identidade_func) {
        this.cart_identidade_func = cart_identidade_func;
    }

    public Date getEmissao_cart_identidade() {
        return emissao_cart_identidade;
    }

    public void setEmissao_cart_identidade(Date emissao_cart_identidade) {
        this.emissao_cart_identidade = emissao_cart_identidade;
    }

    public String getOrgao_emissorcart_identidade_func() {
        return orgao_emissorcart_identidade_func;
    }

    public void setOrgao_emissorcart_identidade_func(String orgao_emissorcart_identidade_func) {
        this.orgao_emissorcart_identidade_func = orgao_emissorcart_identidade_func;
    }

    public String getCpf_func() {
        return cpf_func;
    }

    public void setCpf_func(String cpf_func) {
        this.cpf_func = cpf_func;
    }

    public String getPis_func() {
        return pis_func;
    }

    public void setPis_func(String pis_func) {
        this.pis_func = pis_func;
    }

    public Date getDt_pis_func() {
        return dt_pis_func;
    }

    public void setDt_pis_func(Date dt_pis_func) {
        this.dt_pis_func = dt_pis_func;
    }

    public String getLocal_nasc_func() {
        return local_nasc_func;
    }

    public void setLocal_nasc_func(String local_nasc_func) {
        this.local_nasc_func = local_nasc_func;
    }

    public Date getDt_nasc_func() {
        return dt_nasc_func;
    }

    public void setDt_nasc_func(Date dt_nasc_func) {
        this.dt_nasc_func = dt_nasc_func;
    }

    public String getEstado_civil_func() {
        return estado_civil_func;
    }

    public void setEstado_civil_func(String estado_civil_func) {
        this.estado_civil_func = estado_civil_func;
    }

    public String getGrau_instrucao_func() {
        return grau_instrucao_func;
    }

    public void setGrau_instrucao_func(String grau_instrucao_func) {
        this.grau_instrucao_func = grau_instrucao_func;
    }

    public String getPeso_func() {
        return peso_func;
    }

    public void setPeso_func(String peso_func) {
        this.peso_func = peso_func;
    }

    public String getCabelo_func() {
        return cabelo_func;
    }

    public void setCabelo_func(String cabelo_func) {
        this.cabelo_func = cabelo_func;
    }

    public String getPele_func() {
        return pele_func;
    }

    public void setPele_func(String pele_func) {
        this.pele_func = pele_func;
    }

    public String getDefeitos_func() {
        return defeitos_func;
    }

    public void setDefeitos_func(String defeitos_func) {
        this.defeitos_func = defeitos_func;
    }

    public String getEx_admicional() {
        return ex_admicional;
    }

    public void setEx_admicional(String ex_admicional) {
        this.ex_admicional = ex_admicional;
    }

    public Date getDt_admicao() {
        return dt_admicao;
    }

    public void setDt_admicao(Date dt_admicao) {
        this.dt_admicao = dt_admicao;
    }

    public Date getDt_fgts() {
        return dt_fgts;
    }

    public void setDt_fgts(Date dt_fgts) {
        this.dt_fgts = dt_fgts;
    }

    public String getCargo_atual() {
        return cargo_atual;
    }

    public void setCargo_atual(String cargo_atual) {
        this.cargo_atual = cargo_atual;
    }

    public String getTipo_salario() {
        return tipo_salario;
    }

    public void setTipo_salario(String tipo_salario) {
        this.tipo_salario = tipo_salario;
    }

    public String getLocal_trabalho() {
        return local_trabalho;
    }

    public void setLocal_trabalho(String local_trabalho) {
        this.local_trabalho = local_trabalho;
    }

    public String getMembro_cipa() {
        return membro_cipa;
    }

    public void setMembro_cipa(String membro_cipa) {
        this.membro_cipa = membro_cipa;
    }

    public Date getDt_saida_func() {
        return dt_saida_func;
    }

    public void setDt_saida_func(Date dt_saida_func) {
        this.dt_saida_func = dt_saida_func;
    }

    public String getEx_admiconal() {
        return ex_admiconal;
    }

    public void setEx_admiconal(String ex_admiconal) {
        this.ex_admiconal = ex_admiconal;
    }

    public String getCod_afastamento_func() {
        return cod_afastamento_func;
    }

    public void setCod_afastamento_func(String cod_afastamento_func) {
        this.cod_afastamento_func = cod_afastamento_func;
    }

    public String getFerias_periodo_gozo_func() {
        return ferias_periodo_gozo_func;
    }

    public void setFerias_periodo_gozo_func(String ferias_periodo_gozo_func) {
        this.ferias_periodo_gozo_func = ferias_periodo_gozo_func;
    }

    public String getAlteracao_salario_func() {
        return alteracao_salario_func;
    }

    public void setAlteracao_salario_func(String alteracao_salario_func) {
        this.alteracao_salario_func = alteracao_salario_func;
    }

    public String getContribuicao_sindical_func() {
        return contribuicao_sindical_func;
    }

    public void setContribuicao_sindical_func(String contribuicao_sindical_func) {
        this.contribuicao_sindical_func = contribuicao_sindical_func;
    }

    public String getMovimento_afastamento_func() {
        return movimento_afastamento_func;
    }

    public void setMovimento_afastamento_func(String movimento_afastamento_func) {
        this.movimento_afastamento_func = movimento_afastamento_func;
    }

    public String getAnotacoes_gerais_func() {
        return anotacoes_gerais_func;
    }

    public void setAnotacoes_gerais_func(String anotacoes_gerais_func) {
        this.anotacoes_gerais_func = anotacoes_gerais_func;
    }
    
    

   
    
  
}
