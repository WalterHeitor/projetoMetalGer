package Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pessoa.class)
public abstract class Pessoa_ {

	public static volatile SingularAttribute<Pessoa, Integer> id_pessoa;
	public static volatile SingularAttribute<Pessoa, Integer> tipo;
	public static volatile SetAttribute<Pessoa, Telefone> telefone;
	public static volatile SetAttribute<Pessoa, EmprestimoFerramenta> emprestimo_ferramenta;
	public static volatile SetAttribute<Pessoa, Enderecos> enderecos;
	public static volatile SetAttribute<Pessoa, Dependentes> dependentes;
	public static volatile SetAttribute<Pessoa, MaoObraOrdemServico> maoObraOrdemServicos;
	public static volatile SingularAttribute<Pessoa, String> nome;
	public static volatile SetAttribute<Pessoa, Projetos> projetoses;
	public static volatile SetAttribute<Pessoa, PedidoCompra> pedidoCompras;

}

