package Model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Enderecos.class)
public abstract class Enderecos_ {

	public static volatile SingularAttribute<Enderecos, String> cidade;
	public static volatile SingularAttribute<Enderecos, String> estado;
	public static volatile SingularAttribute<Enderecos, Pessoa> pessoa;
	public static volatile SingularAttribute<Enderecos, Integer> id_endereco;
	public static volatile SingularAttribute<Enderecos, String> largadouro;
	public static volatile SingularAttribute<Enderecos, String> cep;

}

