package Model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Dependentes.class)
public abstract class Dependentes_ {

	public static volatile SingularAttribute<Dependentes, Double> salario_educacao;
	public static volatile SingularAttribute<Dependentes, Pessoa> pessoa;
	public static volatile SingularAttribute<Dependentes, Double> salario_familia;
	public static volatile SingularAttribute<Dependentes, String> parentesco;
	public static volatile SingularAttribute<Dependentes, Long> id_dependentes;
	public static volatile SingularAttribute<Dependentes, Double> imposto_renda;
	public static volatile SingularAttribute<Dependentes, String> nome;
	public static volatile SingularAttribute<Dependentes, Date> dt_nasc;

}

