import java.util.Locale;
import java.util.Scanner;

public class Main {

       public static void main(String[] args) {            

             // *************
             // Programa 1
             // *************      

             int y = 32;
             double x = 10.123456;
             String nome = "Ricardo";
             int idade = 48;
             double renda = 15000.809890890;
             
             System.out.println("**********");
             System.out.println("PROGAMA 1");
             System.out.println(y);
             System.out.printf("%.2f%n",x);
             System.out.printf("%.4f%n",x);
             System.out.println("Olá Mundo!");
             System.out.println("Bom Dia!");

             //Locale.setDefault(Locale.US);

             System.out.printf("Resultado = %.2f metros.%n",x);
             System.out.printf("%.4f%n",x);
             System.out.printf("%s tem %d anos e renda de %.2f reais.%n",nome,idade,renda);
   
             // *************
             // Programa 2
             // *************
            
             String product1 = "Computer";
             String product2 = "Office desk";

             int age = 30;
             int code = 5290;

             char gender = 'F';          
             double price1 = 2100.0;
             double price2 = 650.50;
             double measure = 53.234567;                          

             System.out.println("**********");
             System.out.println("PROGAMA 2");
             System.out.println("Products:");
             System.out.printf("%s wicth price is R$ %.2f%n",product1,price1);
             System.out.printf("%s wicth price is R$ %.2f%n",product2,price2);
             System.out.println("");
             System.out.printf("Record: %d years old, code %d and gender: %s%n",age,code,gender);
             System.out.println("");
             System.out.printf("Measure with eight decimal places: %.8f%n",measure);
             System.out.printf("Rounded (three decimal places): %.3f%n",measure);
             Locale.setDefault(Locale.US);
             System.out.printf("US decimal point: %.3f%n",measure);
             
             System.out.println("**********");
             System.out.println("PROGAMA 3");
             int a, b;
             double resultado;a = 5;
             b = 2;
             resultado = (double)a / b;
             System.out.println(resultado);
             
             double xa;
             int xb;
             xa = 5.0;
             xb = (int) xa;
             System.out.println(xb);
             
             System.out.println("**********");
             System.out.println("PROGAMA 4");
           
             Scanner sc = new Scanner(System.in);
             
             /*String xx;
             int yy;
             double zz;
             xx = sc.next();
             yy = sc.nextInt();
             zz = sc.nextDouble();
             System.out.println("DADOS DIGITADOS:");
             System.out.println(xx);
             System.out.println(yy);
             System.out.println(zz);*/
             
             String s1, s2, s3;
             s1= sc.nextLine();
             s2= sc.nextLine();
             s3= sc.nextLine();
             System.out.println("DADOS DIGITADOS:");
             System.out.println(s1);
             System.out.println(s2);
             System.out.println(s3);
             
             sc.close();
    	   
    	   
       }
}