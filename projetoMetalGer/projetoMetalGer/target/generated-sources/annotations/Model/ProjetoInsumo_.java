package Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(ProjetoInsumo.class)
public abstract class ProjetoInsumo_ {

	public static volatile SingularAttribute<ProjetoInsumo, Long> id_projeto_insumo;
	public static volatile SingularAttribute<ProjetoInsumo, Projetos> projetos;
	public static volatile SingularAttribute<ProjetoInsumo, Insumo> insumo;

}

