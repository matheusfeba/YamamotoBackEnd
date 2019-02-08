package br.com.fiap.anotacao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//Anota��es para atributos
@Target(ElementType.FIELD)
public @interface Coluna {
	
	String nome();
	
	String tipo();
	
	int tamanho() default 255;
}
