import java.util.Scanner;

public class Ejemplo7{
public static Scanner tecla= new Scanner(System.in);

public static void main(String args[]){
System.out.println();

int DepositoMensual,DepositoAnual=0,TiempoInversion;
double InteresAnual=0,InversionFinalAnual=0,InversionFinalTotal=0;

System.out.println("Ingrese el tiempo en anhos que invertira en este banco");
TiempoInversion=tecla.nextInt();
System.out.println("Ingrese el monto mensual que depositara en el banco");
DepositoMensual= tecla.nextInt();

int i=1;

while(i<=TiempoInversion){
	DepositoAnual=DepositoMensual*12;
	InteresAnual=DepositoAnual*0.10;
	InversionFinalAnual=InteresAnual+DepositoAnual;
	
	System.out.println("La inversion final anual de anho"+i+" es de:S/."+InversionFinalAnual+"Soles");
	i++;
}
InversionFinalTotal=InversionFinalAnual*TiempoInversion;
System.out.println("La inversion final de los"+TiempoInversion+" años mas el interes del 10% por cada anho es de:S/."+InversionFinalTotal+"Soles");
}
}