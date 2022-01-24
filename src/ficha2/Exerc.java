package ficha2;

import java.util.Scanner;

public class Exerc {
	public static void main(String[] args) {
		
    	Scanner dadosUt = new Scanner(System.in);
        /*
    	System.out.println("Insira valores para a altura e a base do triangulo: ");
        float h = dadosUt.nextFloat();
        
        float b = dadosUt.nextFloat();
        float area = areaTriang(b, h);
        System.out.println("Area do triangulo é: " + area);
        
        System.out.println("Insira valores para a altura e o cumprimento do retangulo: ");
        float c = dadosUt.nextFloat();
        float area2 =  areaRetang(h,c);
        System.out.println("Area do retangulo é: " + area2);
        
        System.out.println("Insira valores para z: ");
        float z = dadosUt.nextFloat();
        float area3 = areaCal(b, c, h, z);
        System.out.println("A area é igual a: " + area3);
        */
        
        System.out.println("Insira um número factorial: ");
        float n = dadosUt.nextFloat();
        System.out.println("Os números factoriais são: " + factor(n));
        
        		

	}
	
	public static float areaTriang(float b, float h) {
		
		float area = ((b * h) / 2);
		return area;
	}
	
	public static float areaRetang (float h, float c) {
		float area2 = (h*c);
		return area2;
	}
	
	
	public static float areaCal(float b, float c, float h, float z) {
		float area = ((b * h) / 2);
		float area2 = (h*c);
		
		float area3 = 0;
		if(z==1) {
			System.out.println("Area é igual ao do triangulo: " + area);
			return area;
		}
		else {
			return area2;
		}
	}
	
	public static void factor(float n) {
		for (float i = 1; i <= n; ++i) {

		      // if number is divided by i
		      // i is the factor
		      if (n % i == 0) {
		        System.out.print(n + " ");
		      }
		}
	}
	
	}
