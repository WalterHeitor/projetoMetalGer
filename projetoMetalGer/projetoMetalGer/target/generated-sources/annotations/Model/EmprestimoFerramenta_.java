package Model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EmprestimoFerramenta.class)
public abstract class EmprestimoFerramenta_ {

	public static volatile SingularAttribute<EmprestimoFerramenta, Pessoa> pessoa;
	public static volatile SingularAttribute<EmprestimoFerramenta, Long> id_emprestimo_ferramenta;
	public static volatile SingularAttribute<EmprestimoFerramenta, Ferramenta> ferramenta;
	public static volatile SingularAttribute<EmprestimoFerramenta, Calendar> dt_entrega;
	public static volatile SingularAttribute<EmprestimoFerramenta, Calendar> dt_saida_emp;

}

