import java.util.Scanner;

public class Ejemplo6{
public static Scanner tecla = new Scanner(System.in);

public static void main(String args[]){
System.out.println();
//Declaramos las variables
int NumArt;
double PagoTotal=0,CostoArt,Descuento=0;
double CostoArt1=0,CostoArt2=0,CostoArt3=0;
//Datos de entrada
System.out.println("Ingrese el numero de articulos que desee costear");
NumArt=tecla.nextInt();
//Valor que dara paso a una iteración
int i=1;
//Proceso y datos de entrada
while(i<=NumArt){
System.out.println("Ingrese el costo del articulo numero"+i);
CostoArt=tecla.nextDouble();
//Proceso de costeo de cada articulo
if(CostoArt>=200){
	Descuento=CostoArt*0.15;
	CostoArt1=CostoArt-Descuento;
}else if(CostoArt>100&&CostoArt<200){
	Descuento=CostoArt*0.12;
	CostoArt2=CostoArt-Descuento;
}else{
	Descuento=CostoArt*0.10;
	CostoArt3=CostoArt-Descuento;
}
System.out.println("El costo del articulo numero "+i+"es de:S/."+CostoArt+"Soles,y su descuento es de:S/."+Descuento+"Soles");
i++;
}
//Datos de salida
PagoTotal=CostoArt1+CostoArt2+CostoArt3;
System.out.println("El pago total por compra de los "+NumArt+" es de:S/."+PagoTotal+"Soles");
}
}
