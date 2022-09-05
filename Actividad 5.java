import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) { 
	    Scanner sc = new Scanner(System.in);
	    
	    double numero1,numero2,suma,resta,multi,div,modulo;
	    System.out.println("Ingrese dos números:");
	    numero1=sc.nextDouble();
	    numero2=sc.nextDouble();
	    
	    
	    suma = numero1 + numero2;
	    resta = numero1 - numero2;
	    multi = numero1 * numero2;
	    div = numero1 / numero2;
	    modulo = numero1%numero2;
	   
	    System.out.println("El resultado de la suma es:"+suma);
	    System.out.println("El resultado de la resta es:"+resta);
	    System.out.println("El resultado de la multiplicación es:"+multi);
	    System.out.println("El resultado de la división es:"+div);
	    System.out.println("El resultado del modulo es:"+modulo);
	    
	   
	
	}
}


