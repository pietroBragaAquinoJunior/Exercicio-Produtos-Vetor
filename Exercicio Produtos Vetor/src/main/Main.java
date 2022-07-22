package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		
		/* O programa lê Informações sobre N produtos e calcula a média. */
		/* Exercício em Java para treinamento de FOR e Vetores de Classes. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Calcular a média de quantos produtos?");
		int nProdutos = sc.nextInt();
		
		Produto[] vetorProdutos = new Produto[nProdutos];
		
		for(int i=0;i<nProdutos;i++) {
			System.out.println("Nome do produto?");
			String nome = sc.next();
			System.out.println("Preço do produto?");
			double preco = sc.nextDouble();
			
			vetorProdutos[i] = new Produto(nome, preco);
		}
		
		double soma = 0;
		
		System.out.print("A média dos produtos:");
		for(int i=0;i<nProdutos;i++) {
			soma += vetorProdutos[i].getPreco();
			System.out.print(" " +vetorProdutos[i].getNome()+ " ");
		}
		
		System.out.printf("é igual a: %.4f", soma/nProdutos);
		
	}

}
