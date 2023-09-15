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
		double delta = Math.pow(b, 2) - (4*a*c);
		if(delta < 0) {
			System.out.println("Não existe raiz no conjunto dos números reais");
			System.exit(0);
		}
		return delta;
	}
	
	public double x1() {
		return (-b + Math.sqrt(calcularDelta()))/(2*a);
	}
	public double x2() {
		return (-b - Math.sqrt(calcularDelta()))/(2*a);
	}
	
}
