package entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalGrade() {
		
		double perc1 = (nota1*100)/30;
		double perc2 = (nota2*100)/35;
		double perc3 = (nota3*100)/35;
		
		return (perc1+perc2+perc3)/3;
	}

	public void resultado() {
		
		double res = finalGrade() ;
		
		if (res >= 60) {
		System.out.println("PASS");
		}
		
		else {
			System.out.printf("FAILED%nMISSING %.2f POINTS",60 - res);
		}
	}
}
