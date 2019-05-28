package Model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrdemServico.class)
public abstract class OrdemServico_ {

	public static volatile SingularAttribute<OrdemServico, String> statusServco;
	public static volatile SingularAttribute<OrdemServico, Date> dt_fim;
	public static volatile SingularAttribute<OrdemServico, Date> dt_Prevista;
	public static volatile SingularAttribute<OrdemServico, Projetos> projetos;
	public static volatile SingularAttribute<OrdemServico, Date> dt_inicio;
	public static volatile SingularAttribute<OrdemServico, Long> id_ordem_servico;
	public static volatile SingularAttribute<OrdemServico, String> descricao_servico;

}

