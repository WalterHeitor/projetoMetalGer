package Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PedidoCompraInsumo.class)
public abstract class PedidoCompraInsumo_ {

	public static volatile SingularAttribute<PedidoCompraInsumo, Long> id_pedCompIns;
	public static volatile SingularAttribute<PedidoCompraInsumo, PedidoCompra> pedidoCompra;
	public static volatile SingularAttribute<PedidoCompraInsumo, Insumo> insumo;
	public static volatile SingularAttribute<PedidoCompraInsumo, Integer> quantidade;
	public static volatile SingularAttribute<PedidoCompraInsumo, Double> valor_unitario;

}

