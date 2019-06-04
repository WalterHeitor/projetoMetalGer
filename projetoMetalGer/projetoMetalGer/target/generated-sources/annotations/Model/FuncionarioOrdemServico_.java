package Model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(FuncionarioOrdemServico.class)
public abstract class FuncionarioOrdemServico_ {

	public static volatile SingularAttribute<FuncionarioOrdemServico, String> status_servico;
	public static volatile SetAttribute<FuncionarioOrdemServico, MaoObraOrdemServico> maoObraOrdemServicos;
	public static volatile SingularAttribute<FuncionarioOrdemServico, Long> id_funcionario_ordem_servico;
	public static volatile SingularAttribute<FuncionarioOrdemServico, OrdemServico> ordem_servico;
	public static volatile SingularAttribute<FuncionarioOrdemServico, String> descricao;
	public static volatile SingularAttribute<FuncionarioOrdemServico, Date> dt_prevista;

}

