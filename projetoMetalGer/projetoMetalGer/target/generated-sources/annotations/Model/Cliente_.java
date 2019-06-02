package Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Cliente.class)
public abstract class Cliente_ extends Model.Pessoa_ {

	public static volatile SingularAttribute<Cliente, String> fantasia;
	public static volatile SingularAttribute<Cliente, String> razao_social;
	public static volatile SingularAttribute<Cliente, String> cnpj;

}

