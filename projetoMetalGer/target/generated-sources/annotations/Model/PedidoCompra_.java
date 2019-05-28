package Model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PedidoCompra.class)
public abstract class PedidoCompra_ {

	public static volatile SingularAttribute<PedidoCompra, Double> valor_total;
	public static volatile SingularAttribute<PedidoCompra, Date> dt_emicao;
	public static volatile SingularAttribute<PedidoCompra, Pessoa> pessoa;
	public static volatile SingularAttribute<PedidoCompra, Long> id_pedido_compra;
	public static volatile SingularAttribute<PedidoCompra, Projetos> projetos;

}

