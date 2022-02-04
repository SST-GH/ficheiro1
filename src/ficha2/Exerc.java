package ficha2;

import java.util.Scanner;

public class Exerc {
	public static void main(String[] args) {
		
    	Scanner dadosUt = new Scanner(System.in);
    	
        
    	/*System.out.println("Insira valores para a altura e a base do triangulo: ");
        float b = dadosUt.nextFloat();
        float h = dadosUt.nextFloat();
        
        float area = areaTriang(b, h);
        System.out.println("Area do triangulo é: " + area);
        
        System.out.println("Insira valores para a altura e o cumprimento do retangulo: ");
        float a = dadosUt.nextFloat();
        float c = dadosUt.nextFloat();
        
        float area2 =  areaRetang(a,c);
        System.out.println("Area do retangulo é: " + area2);
        
        System.out.println("Insira valores: ");
        float x = dadosUt.nextFloat();
        float y = dadosUt.nextFloat();
        float z = dadosUt.nextFloat();
        System.out.println("A area é igual a: " + areaCal(x, y, z));
        */
        
//        System.out.println("Insira um número factorial: ");
//        int n = dadosUt.nextInt();
//        System.out.println("Os números factoriais são: " + factor(n));
//        
//        System.out.println("Insira um número fatorial rec: ");
//        int s = dadosUt.nextInt();
//        System.out.println("Os números factoriais rec são: " + factorRecursivo(s));
        
    	
//    	System.out.println("Insira uma frase: ");
//    	String frase = dadosUt.nextLine();
//    	int minusculas = numTotalVogais(frase.toLowerCase());//para transformar tudo em minúsculas caso forem inseridas.
//    	System.out.println("O número das vogais é: " + minusculas);
    	
//    	System.out.println("Insira uma frase: ");
//    	String f = dadosUt.nextLine();
//    	numVogais(f.toLowerCase());//para transformar tudo em minúsculas caso forem inseridas.
//    	System.out.println("");
    	
    	System.out.println("Insira o número de segundos: ");
    	int seg = dadosUt.nextInt();
    	convertSeconds(seg);
    	
        
        dadosUt.close();

	}
	
	public static float areaTriang(float b, float h) {
		
		float area = ((b * h) / 2); //caso usarmos esta função para outras vezes.
		return area;
		//ou return ((b*h)/2); para usar so aqui
	}
	
	public static float areaRetang (float a, float c) {
		float area2 = (a*c); //caso usarmos esta função para outras vezes.
		return area2;
		//ou return (a*c); para usar so aqui.
	}
	
	
	public static float areaCal(float x, float y, float z) {
		
		if(z==1) {
			System.out.println("Area é igual ao do triângulo: ");
			return areaTriang(x,y);
			
		}
		else {
			System.out.println("Area é igual ao do retângulo: ");
			return areaRetang (x,y);
		}
	}
	
	public static int factor(int n) {
		int r =1;
		for (int i = 1; i <= n; i++) {
			System.out.println( r + "*" + i + "=" + r);
		     r= r*i;
		}
		
		return r;
	}
	
	public static long factorRecursivo(int s ){
	    return s == 1 ? 1 : s * factorRecursivo( s-1 );
	}
	
	public static int numTotalVogais (String fr) {
		
		int contar = 0;
		for(int i = 0; i <fr.length(); i++) {
			
			if (fr.charAt(i) == 'a' || fr.charAt(i) == 'e' || fr.charAt(i) == 'i'
                    || fr.charAt(i) == 'o' || fr.charAt(i) == 'u') {
				
				contar++;
			}
		}
		return contar;
	}
	
	public static void numVogais(String fr) {
			
			int contarA = 0, contarE = 0, contarI=0, contarO=0, contarU=0;
			
			for(int i = 0; i <fr.length(); i++) {
				
				if (fr.charAt(i) == 'a') {
					contarA++;
				}
			
				else if (fr.charAt(i) == 'e') {
					contarE++;
				}
				else if (fr.charAt(i) == 'i') {
					contarI++;
				}
				else if (fr.charAt(i) == 'o') {
					contarO++;
				}
				else if (fr.charAt(i) == 'u') {
					contarU++;
				}
					
				}
			
			System.out.println("a: " + contarA + "\ne: " +contarE + "\ni: " +contarI + "\no: " +contarO + "\nu: " +contarU);
			}
	
	
	
//	Escreva uma função chamada convertSeconds que recebe um número (segundos) e 
//	imprime o número de minutos, horas, dias e meses (considere que um mês tem 30 dias)
	public static void convertSeconds(int aSegs) {
		int minutos = 0, horas = 0, dias = 0, meses = 0, segundos =0;
		
		segundos = aSegs%60; //ele guarda e adiciona o resto no prox.
		meses = aSegs/2_592_000;
		aSegs %=2_592_000;
		dias = aSegs/86400;
		aSegs %=86400;
		horas = aSegs/3600;
		aSegs %=3600;
		minutos = aSegs/60;
		aSegs = aSegs%60;
		
		System.out.println("Minutos: " + minutos + "\nHoras: " + horas + "\nDias: " + dias + "\nMeses: " + meses + "\nSegundos: " + segundos);
		
//		min = 60 Seg
//		h = 3600 Seg (60*60)
//		d = 86400 Seg (24*3600)
//		mes = 2 592 000 Seg (86400*30)
		
		
	}
	
		


}
	
	
	
	

