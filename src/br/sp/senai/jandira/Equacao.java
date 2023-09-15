package br.sp.senai.jandira;
import java.util.Scanner;
import br.sp.senai.jandira.*;
public class Equacao {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		CalcularEquacao e1 = new CalcularEquacao();
		
		System.out.println("Valor de A:");
		e1.setA(input.nextDouble());
		System.out.println("Valor de B:");
		e1.setB(input.nextDouble());
		System.out.println("Valor de C:");
		e1.setC(input.nextDouble());
		System.out.println();
		
		System.out.println("(" + e1.getA()+")x²"+" + ("+ e1.getB() + ")x " + " + (" + e1.getC() + ") = 0");
//		if(Double.isNaN(e1.delta()) || e1.delta() < 0) {
//			System.out.println("Não é possível resolver a equação para o conjunto dos números reais");
//		}
			System.out.println("x1 = " + e1.x1());
			System.out.println("x2 = " + e1.x2());
		
	}
}
