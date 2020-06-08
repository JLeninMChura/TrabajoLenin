import java.util.Scanner;

public class Ejemplo1{
public static Scanner tecla = new Scanner(System.in);

public static void main(String args[]){
System.out.println();

//daclaramos variables
int Tiempo,Salario;
double Incremento =0,SalarioAnual = 0,SalarioTotal = 0;
//Datos de Entrada
System.out.println("Ingrese el tiempo en anhos de servicio");
Tiempo=tecla.nextInt();
System.out.println("Ingrese el salario del Docente");
Salario=tecla.nextInt();
//Variable que dara paso a una iteración
int i = 1;
//Proceso
while(i<=Tiempo){
	
Incremento = Salario*0.10;
SalarioAnual = Salario+Incremento;

System.out.println("El Salario Anual del anhos "+i+" es de:S/ "+SalarioAnual+"Soles");
i++;
}
//Datos de salida
SalarioTotal=SalarioAnual*Tiempo;	

System.out.println("El Salario Total de docente es;S/."+SalarioTotal+"Soles");

}
}
