package main;

import java.util.Scanner;

public class Complexa {

	
	public static void main(String [] arg) {
		
		
	System.out.println("Digite dois numeros");
	
	Scanner multi = new Scanner(System.in);
	
	int numA = multi.nextInt();
	int numB = multi.nextInt();
	
	int b = (numA*numB) + (numA-numB);
	int a = (numA * numB) - (numA - numB);
	
	System.out.println("Resultado sub " + a);
	System.out.println("Resultado soma " + b);
	}

		
		
}










//Crie uma fun��o chamada opera��oComplexa() que recebe dois n�meros e retorna a soma da multiplica��o desses mesmos dois n�meros 
//com a subtra��o desses dois n�meros. Dever� utilizar as fun��es j� definidas previamente. 


//multiplica��o(a,b)+ subtra��o(a,b)

 
// (numUm*numDois) + (numUm-numDois).
 

//multiplica��o(a,b)+ subtra��o(a,b)

