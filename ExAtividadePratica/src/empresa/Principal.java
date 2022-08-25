package empresa;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
	/*
		Visibilidade UML
		
		Simbolo	| Significado
		   +	|   Público
		   -	|   Privado
		   #	|   Protegido
	
	   									    ATIVIDADE PRÁTICA
	   									    
												Cofrinho
											- ListaMoedas
											+ adicionar(Moeda)
											+ remoer(Moeda)	
											+ listagemMoedas()	
											+ totalConvertido()
													◇			
													|			
													|			
											   <<Abstract>>
											   	  Moeda	
											  valor:double
												+ info()					
											  + converter()
											  	    △
											  		|
											  		|
				 -----------------------------------------------------------------------
				|									|								    |	
				|									|									|
			  Dolar							      Euro								   Real
			  info()				     		  info()							  info()				
		  + converter()						  + converter()					      + converter()
		  
	
	    O trabalho consiste em implementar um pequeno sistema que emula um "Cofrinho de moedas" em Java. 
	    
	    	[x] Crie um menu em que é oferecido ao usuário:
			[x]	Adicionar moedas de diferentes valores e países em seu cofrinho
			[x] Remover moedas específicas do cofrinho.
			[x] Listar todas as moedas que estão dentro do cofrinho
			[x] Calcular quanto dinheiro existe no cofrinho convertido para Real
			[x] Objetivo principal do trabalho é avaliar o bom uso do conceito de herança e polimorfismo. 
			[x] O projeto deve possuir uma classe Principal, além das classes descritas no diagrama UML acima.
			[x] A classe Cofrinho deve possuir como atributo uma coleção de Moedas, que por sua vez é uma classe mãe abstrata 
			de outras classes específicas de Dolar, Euro, Real, etc... 
			[x] A coleção de Moedas pode ser implementada utilizando um ArrayList, ou qualquer outra estrutura de dados que julgue pertinente.
		
		Demais detalhes de implementação ficam a cargo do aluno que pode desenvolver também classes extras ou adicionar métodos e atributos conforme julgar necessário.
   
	 */	
		
		/*
		Cofrinho
		1 - Adicionar Moeda
			* Escolha Moeda
				1 - Real
				2 - Dolar
				3 - Euro 
		2 - Remover Moeda
		3 - Lista Moedas
				Real - 0.00
				Dolar - 0.00
				Euro - 0.00
		4 - Calcular Total Convertido p/ Real
		0 - Encerrar
	*/

	    int selecao=0; // Variavel Seleção - do & while 
	    int num=0;// Variavel num - do & while 
	    double num2=0.0;// Variavel num - do & while 
	    Scanner in = new Scanner(System.in); //Captura de Teclas 
	    Cofrinho c = new Cofrinho(); //Atribuição de Classe
	    // Looping do & while
	    do{
	    	// Menu Principal
	        System.out.println("*** Cofrinho de Moedas ***\n");
	        System.out.println("Selecione uma das informaçoes abaixo: ");
	        System.out.println(" 1. Mostrar Moeda(s)");
	        System.out.println(" 2. Adicionar Moeda(s)");
	        System.out.println(" 3. Remover Moeda(s)");
	        System.out.println(" 4. Total de Moeda(s) Convertido");
	        System.out.print(" 0. Para Sair\n");
	        selecao=in.nextInt(); //Captura de Teclas 
	        switch(selecao) { //Retorno Teclado 
	    case 1: //Do&While(Opções)
	        c.lista();
	        System.out.println("\n");
	        break;
	    case 2:
	    	// Looping do & while
	    	do {
		        System.out.println("*** Cofrinho de Moedas ***\n");
		        System.out.println(" 1. Real");
		        System.out.println(" 2. Dolar");
		        System.out.println(" 3. Euro");
		        System.out.print(" 4. Para Voltar\n\n");
		        selecao=in.nextInt();
	    		switch(selecao) {
		    		case 1:
		    	        System.out.println("\n");
		    	        System.out.print("Adicione o valor em reais: ");
		    	        num2=in.nextFloat();
		    	        c.lista.add(new Real(num2));
		    	        break;
		    		case 2:
		    	        System.out.println("\n");
		    	        System.out.print("Adicione o valor em dollar: ");
		    	        num2=in.nextFloat();
		    	        c.lista.add(new Dolar(num2));
		    	        break;
		    		case 3:
		    	        System.out.println("\n");
		    	        System.out.print("Adicione o valor em euro: ");
		    	        num2=in.nextFloat();
		    	        c.lista.add(new Euro(num2));
		    	        break;
		    	    case 4:
		    	        System.out.println("");
		    	        System.out.print("Voltando para o menu...\n");
		    	        break;
		    	    default:
		    	        System.out.println("Escolha Invalida, Tente Novamente!\n");
	    		}
	    	} while (selecao!=4);    
	    	break;
	    case 3:       	
	    	c.remove();
	    	System.out.println("\n");
	        break;
	    case 4:   
	        System.out.println("\n");
	        System.out.printf("Valor Total Convertido em Reais: %.2f\n", c.calcularTotal());
	        break;
	    case 0:
	        System.out.println("");
	        System.out.print("Encerrango o programa...!");
	        break;
	    default:
	        System.out.println("Escolha Invalida, Tente Novamente!\n");
	    	}
		}
		while(selecao!=0);
	
	// End Code
	}
}
