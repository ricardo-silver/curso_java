package entities;

public class Funcionario {
	
	public String name;
	public double salary;
	public double tax;
	
	public double salarioLiquido() {
		return salary - tax;
	}
	
	public double salarioReajustado(double x) {
		
		return salarioLiquido() + ( salary * x / 100 );
	}
	
}
