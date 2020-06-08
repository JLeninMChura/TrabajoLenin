import java.util.Scanner;

public class Ejemplo4{
public static Scanner tecla = new Scanner(System.in);

public static void main(String args[]){
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
}

