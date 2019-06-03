package Model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(MaoObraOrdemServico.class)
public abstract class MaoObraOrdemServico_ {

	public static volatile SingularAttribute<MaoObraOrdemServico, Pessoa> pessoa;
	public static volatile SingularAttribute<MaoObraOrdemServico, Float> qtd_insumo;
	public static volatile SingularAttribute<MaoObraOrdemServico, Date> Hr_fim;
	public static volatile SingularAttribute<MaoObraOrdemServico, Float> qtd_horas_trab;
	public static volatile SingularAttribute<MaoObraOrdemServico, Date> dt_fim;
	public static volatile SingularAttribute<MaoObraOrdemServico, FuncionarioOrdemServico> funcionarioOrdemServico;
	public static volatile SingularAttribute<MaoObraOrdemServico, Insumo> insumo;
	public static volatile SingularAttribute<MaoObraOrdemServico, Date> dt_inicio;
	public static volatile SingularAttribute<MaoObraOrdemServico, Date> Hr_inicio;
	public static volatile SingularAttribute<MaoObraOrdemServico, Long> id_mao_obra;
	public static volatile SingularAttribute<MaoObraOrdemServico, String> descricaoOperacao;

}

