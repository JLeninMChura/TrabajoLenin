import java.util.Scanner;

public class Ejemplo10{
public static Scanner tecla= new Scanner(System.in);
	
public static void main(String args[]){
System.out.println();

int Venta1=0,Venta2=0,Venta3=0,Venta=0;
int NumVentas,VentaGlobal=0;
System.out.println("Ingrese el numero de ventas que realizo");
NumVentas=tecla.nextInt();

int i=1;

while(i<=NumVentas){
	
	System.out.println("ingrese la ganancia de la venta numero"+i);
	Venta=tecla.nextInt();
	if(Venta<=10000){
	Venta1=Venta1+Venta;
}else if (Venta>10000&&Venta<=20000){
	Venta2=Venta2+Venta;
}else{
	Venta3=Venta3+Venta;
}
i++;
}
VentaGlobal=Venta1+Venta2+Venta3;

System.out.println("El monto total por las ventas menores o iguales a 10,000 es de:S/."+Venta1+"Soles");
System.out.println("El monto total por las ventas mayores a 10,000 pero menores a 20,000 es de:S/."+Venta2+"Soles");
System.out.println("El monto toal por las ventas mayores a 20,000 es de:S/."+Venta3+"Soles");

System.out.println("El ingreso total por cada una de las ventas es de:S/."+VentaGlobal+"Soles");
	}
}