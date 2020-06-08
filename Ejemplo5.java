import java.math.BigInteger;
import java.util.Scanner;

public class Ejemplo5{
public static Scanner teclado = new Scanner(System.in);

public static void main(String args[]){
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
}
