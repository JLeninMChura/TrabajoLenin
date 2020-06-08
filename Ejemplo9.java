  import java.util.Scanner;
  
  public class Ejemplo9{
public static Scanner teclado=new Scanner(System.in);
//Codigo de numero factorial
public static long NumFactorial(int numero){
	int contador=1;
	long resultado=1;
	if(numero>0){
	while(contador<numero){
	contador++; 
	resultado=resultado*contador;
	}
	}
	return resultado;
}
  public static void main(String args[]){
	 System.out.println();
	 //Declaramos las variables
	 int NumX;
	 double ResultadoFE=1;
	 //Datos de entrada
	 System.out.println("Ingrese el numero X de FE:");
	 NumX=teclado.nextInt();
	 //Proceso
	 for(int Contador=1;Contador<=NumX; Contador++){
		 ResultadoFE+=Math.pow(NumX,Contador)/NumFactorial(Contador);
	 }
	 //Datos de salida
	 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	 System.out.println("----La funcion exponencial de"+NumX+"es"+ResultadoFE);
	 System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
  }
  }
	 
    