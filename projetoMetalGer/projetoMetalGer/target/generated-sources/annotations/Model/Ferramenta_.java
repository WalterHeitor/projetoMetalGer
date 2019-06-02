package Model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Ferramenta.class)
public abstract class Ferramenta_ {

	public static volatile SingularAttribute<Ferramenta, Long> id_ferramenta;
	public static volatile SingularAttribute<Ferramenta, String> patrimonio_ferr;
	public static volatile SingularAttribute<Ferramenta, EmprestimoFerramenta> emprestimo_ferramenta;
	public static volatile SingularAttribute<Ferramenta, Date> dt_aquisicao_ferr;
	public static volatile SingularAttribute<Ferramenta, Integer> codigo_ferra;
	public static volatile SingularAttribute<Ferramenta, String> descricao_ferr;
	public static volatile SingularAttribute<Ferramenta, String> categoria_ferr;
	public static volatile SingularAttribute<Ferramenta, String> num_nota_fiscal_ferr;
	public static volatile SingularAttribute<Ferramenta, Date> dt_entrega_ferr;
	public static volatile SingularAttribute<Ferramenta, String> local_ferr;
	public static volatile SingularAttribute<Ferramenta, String> status;

}

