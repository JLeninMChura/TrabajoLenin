import java.util.Scanner;

public class Ejemplo3{
public static Scanner tecla = new Scanner(System.in);

public static void main(String args[]){
	System.out.println();
//Declaramos las variables
int Mayor,Menor,Igual,NumCant;
int Num;
//Datos de entrada
System.out.println("Ingrese la cantidad de numeros que desea comparar con 0");
NumCant=tecla.nextInt();
//Variable que dara paso a un iteración
int i=1;
//Proceso y datos de entrada
while(i<=NumCant){
//Datos de entrada 
System.out.println("Ingrese el valor numero "+i+" que desee compara con 0");
Num=tecla.nextInt();
//Proceso y Datos de salida
if(Num>0){
System.out.println();
System.out.println("El numero"+Num+" es Mayor que 0");
}else if(Num==0){
System.out.println("El numero"+Num+" es igual que 0");
}else{
System.out.println("El numero"+Num+" es Menor que 0");
}
i++;
}
}
}
