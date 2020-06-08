import java.util.Scanner;

public class Ejemplo8{
public static Scanner tecla= new Scanner(System.in);

public static void main(String args[]){
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
}