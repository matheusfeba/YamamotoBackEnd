package br.com.fiap.teste;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.anotacao.Coluna;
import br.com.fiap.bean.Veiculo;

public class Teste {
	
	public static void main(String[] args) {
		// Instanciar um veículo
		Veiculo v = new Veiculo();

		// API Reflection - recupera o nome da classe
		String nome = v.getClass().getName();
		System.out.println("Nome da classe: ");
		System.out.println(nome);

		// Recuperar os métodos da classe
		Method[] m = v.getClass().getDeclaredMethods();
		System.out.println("Métodos: ");
		//Percorre todos os métodos e exibe o nome
		for (Method item : m) {
			System.out.println(item.getName());
		}
		
		//Recuperar os atributos
		Field[] a = v.getClass().getDeclaredFields();
		System.out.println("Atributos: ");
		
		//Percorre todos os atributos e exibe o nome
		for(Field item : a) {
			System.out.println(item.getName());
		
		//Recuperar a anotação
		Coluna c = item.getAnnotation(Coluna.class);
		System.out.println("Nome: " + c.nome());
		System.out.println("Tamanho: " + c.tamanho());
		System.out.println("Tipo: " + c.tipo());
		
		}
		

	}
}
