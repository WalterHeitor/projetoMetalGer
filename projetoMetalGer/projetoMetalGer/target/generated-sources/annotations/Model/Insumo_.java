package Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Insumo.class)
public abstract class Insumo_ {

	public static volatile SingularAttribute<Insumo, String> descricao_produto;
	public static volatile SingularAttribute<Insumo, Integer> id_insumo;
	public static volatile SetAttribute<Insumo, MaoObraOrdemServico> maoObraOrdemServicos;
	public static volatile SingularAttribute<Insumo, Integer> cod_insumo;
	public static volatile SingularAttribute<Insumo, Integer> unidade;
	public static volatile SetAttribute<Insumo, PedidoCompraInsumo> compraInsumos;

}

