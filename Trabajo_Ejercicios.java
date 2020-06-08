import java.math.BigInteger;
import java.util.Scanner;

public class Trabajo_Ejercicios{
	public static Scanner tecla=new Scanner(System.in);



//1------------------------------------------------------------
public static void Ejemplo1(){
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

//2------------------------------------------------------------------
public static void Ejemplo2(){
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

//3------------------------------------------------------------------------------
public static void Ejemplo3(){
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

//4------------------------------------------------------------------------------
public static void Ejemplo4(){
System.out.println();

String Color="V,R,B";
int Verde=0,Blanco=0,Rojo=0,NumFocos;

System.out.println("Ingrese el numero de cantidad del lote de focos");
NumFocos=tecla.nextInt();
System.out.println("Los colores de focos se clasifican en:");
System.out.println("Blanco=B");
System.out.println("Verde=V");
System.out.println("Rojo=R");
int i=1;

while(i<=NumFocos){
System.out.println("Ingrese la letra del color para el foco numero"+i);
Color=tecla.next();

if(Color.toUpperCase().equals("B")){
Blanco=Blanco+1;
System.out.println("");
}else if(Color.toUpperCase().equals("V")){
Verde=Verde+1;
}else{
Rojo=Rojo+1;
}
i++;
}
System.out.println("=====================================================");
System.out.println("---El nunmero de focos de color Blanco es:"+Blanco);
System.out.println("---El numero de focos de color Verde es:"+Verde);
System.out.println("---El numero de focos de color Rojo es:"+Rojo);
System.out.println("=====================================================");
}

//5-----------------------------------------------------------------------
public static void Ejemplo5(){
System.out.println();
BigInteger ahorroAnual=BigInteger.valueOf(0),ahorroDia,Progresion;
int tiempoAnho;
BigInteger razon=BigInteger.valueOf(3),X=BigInteger.valueOf(0);

System.out.println("Ingrese el tiempo total de dias de ahorro");
tiempoAnho=teclado.nextInt();

String mesTexto="Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,septiembre,Octubre,Noviembre,Diciembre";
String[] mes=mesTexto.split(",");

int mesNum=0,mesNumContador=0;
int z=1;

while(z<=tiempoAnho&&mesNum<12){
X=BigInteger.valueOf(3).pow(z-1);
ahorroDia=razon.multiply(X);
System.out.println("El ahorro total del dia"+z+"es:"+ahorroDia);
z++;
mesNumContador++;

if(mesNumContador==30){
System.out.println("El ahorro total del mes"+mes[mesNum]+"es:"+ahorroDia);
mesNum++;
mesNumContador=0;
}
}
X=BigInteger.valueOf(3).pow(tiempoAnho-1);
ahorroAnual=razon.multiply(X);
System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
System.out.println("---Ahorro total del anho es de:"+ahorroAnual+"Pesos");
System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
}

//6---------------------------------------------------------------------------
public static void Ejemplo6 (){
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

//7------------------------------------------------------------------------------------------
public static void Ejemplo7 (){
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

//8----------------------------------------------------------------
public static void Ejemplo8 (){
	System.out.println();
int Nota,Alumnos=0,Alumno1=0,Alumno2=0;
double Aprobado;

System.out.println("Ingrese el numero de alumnos");
Alumnos=tecla.nextInt();
System.out.println("Ingrese la nota minima aprobatoria");
Aprobado=tecla.nextDouble();

int i=1;

while(i<=Alumnos){
	System.out.println("Ingrese la nota del alumno numero"+i);
	Nota=tecla.nextInt();
	
if(Nota>=Aprobado){
	Alumno1=Alumno1+1;
	
}else{
Alumno2=Alumno2+1;
}
i++;
}
System.out.println("Son"+Alumno1+"los alumnos APROBADOS");
System.out.println("Son"+Alumno2+"los alumnos REPROBADOS");
}

//9---------------------------------------------------------------------
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
  public static void Ejemplo9 (){
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

//10----------------------------------------------------------------------------
public static void Ejemplo10 (){
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





public static void main(String args[]){

char Opcion='S';
String NumAlgorit="1";

do{
System.out.println("Ingrese el numero del algoritmo que desea ejecutar:");
System.out.println();
System.out.println("Ejemplo1=1");
System.out.println("Ejemplo2=2");
System.out.println("Ejemplo3=3");
System.out.println("Ejemplo4=4");
System.out.println("Ejemplo5=5");
System.out.println("Ejemplo6=6");
System.out.println("Ejemplo7=7");
System.out.println("Ejemplo8=8");
System.out.println("Ejemplo9=9");
System.out.println("Ejemplo10=10");
NumAlgorit=tecla.next();

switch(NumAlgorit){
case"1:Ejemplo1();break;
case"1:Ejemplo2();break;
case"1:Ejemplo3();break;
case"1:Ejemplo4();break;
case"1:Ejemplo5();break;
case"1:Ejemplo6();break;
case"1:Ejemplo7();break;
case"1:Ejemplo8();break;
case"1:Ejemplo9();break;
case"1:Ejemplo10();break;

default:System.out.println("Esa opcion -NO EXISTE- Por favor debe seleccionar una de las opciones presentadas");
System.out.println();
}
System.out.println();
System.out.println("---¿Desea ejecutar mas algoritmos?---");
System.out.println();
System.out.println("Si=S");
System.out.println("Si=N");
System.out.println();
Opcion=tecla.next().toUpperCase().charAt(O);
}while(Opcion=='S');
}
}