import java.util.Scanner;

public class Ejemplo2{
public static Scanner tecla = new Scanner(System.in);

public static void main(String args[]){
	System.out.println();
//Declaramos las variables
int NumHamburguesa;
double PrecioHamburguesa = 0;
double PagoTotal= 0;
String PagoTarjeta ="NO";
//Datos de entrada y Proceso
for(int TipoHam=1;TipoHam<=3;TipoHam++){
switch (TipoHam){
case 1: System.out.println("Ingresa la cantidad de Hamburguesas de tipo simples:");
PrecioHamburguesa=20;
break;
case 2: System.out.println("Ingresa la cantidad de Hamburguesas de tipo doble:");
PrecioHamburguesa=25;
break;
case 3: System.out.println("Ingresa la cantidad de Hamburguesas de tipo triple:");
PrecioHamburguesa=28;
break;
default: System.out.println("Por favor seleccione uno de los tipos de hamburguesa presentados");
}
NumHamburguesa=tecla.nextInt();
PagoTotal+=PrecioHamburguesa*NumHamburguesa;
}
System.out.println("¿Desea pagar con tarjeta?");
PagoTarjeta=tecla.next();
if(PagoTarjeta.toUpperCase().equals("SI")){
PagoTotal=PagoTotal-(PagoTotal*0.05);
}
//Datos de salida
System.out.println("El costo total a pagar por las Hambuguesas es:"+PagoTotal);

}
}