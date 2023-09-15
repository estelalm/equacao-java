/* Calcula as duas raízes de um equação do segundo grau
 * Autor: Estela Alves de Moraes
 * Data: 15/09/2023
 * Versão corrigida
 * 
 * ax²+bx+c=0  
 * 
 * (-b±√(b²-4ac))/(2a)
 */

package br.sp.senai.jandira;

import javax.swing.JOptionPane;

public class CalcularEquacao {
	
	private double a, b, c;
	
	public double getA() {
		return a;
	}
	public void setA(double a){
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b){
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c){
		this.c = c;
	}
	
//	public double delta() {
//		return Math.pow(b, 2)-(4*a*c);
//	}
	
	public double calcularDelta() {
		if(a==0) {
			a =1;
		}
		double delta = Math.pow(b, 2) - (4*a*c);
		if(delta < 0) {
			JOptionPane.showMessageDialog(null, "A equação não possui raizes reais");
			System.out.println("A equação não possui raizes reais");
			System.exit(0);
		}
		return delta;
	}
	

	public double x1() {
		if(a==0) {
			a =1;
		}
		return (-b + Math.sqrt(calcularDelta()))/(2*a);
	}
	public double x2() {
		if(a==0) {
			a =1;
		}
		return (-b - Math.sqrt(calcularDelta()))/(2*a);
	}
	
	
	public double [] calcularRaizes() {
		if(a==0) {
			a =1;
		}
		double x1 = (-b + Math.sqrt(calcularDelta()))/(2*a);
		double x2 = (-b - Math.sqrt(calcularDelta()))/(2*a);
		
		//cria um vetor e atribui os 2 valores à ele
		double raizes[] = {x1, x2};
		
		return raizes;
	}
	
	
}
