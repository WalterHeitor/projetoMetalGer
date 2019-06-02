package Model;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FuncionarioOrdemServico.class)
public abstract class FuncionarioOrdemServico_ {

	public static volatile SingularAttribute<FuncionarioOrdemServico, Boolean> status_servico;
	public static volatile SingularAttribute<FuncionarioOrdemServico, Pessoa> pessoa;
	public static volatile SingularAttribute<FuncionarioOrdemServico, Long> id_funcionario_ordem_servico;
	public static volatile SingularAttribute<FuncionarioOrdemServico, Calendar> dt_fim;
	public static volatile SingularAttribute<FuncionarioOrdemServico, OrdemServico> ordem_servico;
	public static volatile SingularAttribute<FuncionarioOrdemServico, Insumo> insumo;
	public static volatile SingularAttribute<FuncionarioOrdemServico, Calendar> dt_inicio;
	public static volatile SingularAttribute<FuncionarioOrdemServico, String> descricao;
	public static volatile SingularAttribute<FuncionarioOrdemServico, Calendar> dt_prevista;

}

