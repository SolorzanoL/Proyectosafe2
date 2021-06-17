/*
@Autor:Nohemí Solórzano
@Versión: 1.0
@Fecha: 15/06/21
*/
import java.util.Scanner;
public class Universidad{
   public static void main(String args[]){
      /*Declaracion de Atributos e Instanciación de objetos*/
      final double SB = 20000;
      String dec = "", ced = "";
      char sexo;
      int  nHijos = 0, totProf = 0;
      double primHijos = 0;
      double segSoc;
      double impRen;      
      double ded;      
      double sueNet, totSuel = 0;        
      /*Inicializacion de los atributos*/
      Scanner leer = new Scanner(System.in);
      char resp;	
     /*Instanciamos un objeto leer tipo Scanner para la captura de los datos*/

     /*Entrada de Datos*/
     System.out.println("################################################################################");
     System.out.println("             BIENVENIDOS  AL  REGISTRO DE DATOS                                 ");
     System.out.println("################################################################################");
     System.out.println();
      
     System.out.print("Desea Registrar un Profesor [s/n]: ? ");
     resp = leer.next().charAt(0);/*Metodo de la libreria Scanner paara leer una variable de tipo char*/ 
     while ( resp == 's'){
         leer.nextLine();/*limpiar buffer de teclado*/
         System.out.print("Introduzca Sede/Decanato aL que pertenece: Este/Oeste: ");
         dec = leer.nextLine();
         System.out.print("Introduzca la Cedula: ");
         ced = leer.nextLine();
         System.out.print("Introduzca el Sexo: M=Masculino; F=Femenino:  ");
         sexo = leer.next().charAt(0);
         System.out.print("Introduzca el N.de Hijos: ");	     
         nHijos = leer.nextInt();
      
        /*Calculo asignaciones y deducciones*/
         primHijos = 1500 * nHijos;
         segSoc   = SB * 0.04;
         impRen   = SB * 0.02;      
         ded      = segSoc + impRen;      
         sueNet  = SB + primHijos - ded; 
         System.out.println("################################################################################");
         System.out.println("                  R E P O R T E  D E L  P R O F E S O R                         ");
         System.out.println("################################################################################");
         System.out.println();
             
         System.out.println("Decanato/Sede: " + dec);
         System.out.println("Cedula: " + ced + " Sexo: " + sexo );
         System.out.println("Numero de Hijos: "  + nHijos + " Sueldo Base: " + SB);
         System.out.println("Total Asignaciones: " + primHijos);
         System.out.println("Total Deducciones: " + ded);
         System.out.println("Sueldo Neto: " + sueNet);
         totSuel = totSuel + sueNet;
         totProf++;
         System.out.println();
         System.out.print("Procesar otro Profesor [s/n]:  ");
         resp = leer.next().charAt(0);
         System.out.println();

     }//while
     for (int i=0 ; i <2 ; i++){
      System.out.println("   ");
     }

     System.out.println("###############################################################################");
     System.out.println("                    R E P O R T E  D E   S U E L D O S                         ");
     System.out.println("###############################################################################");
     System.out.println();
     System.out.println("TOTAL PROFESORES PROCESADOS                        : "+totProf);
     System.out.println();
    System.out.println("PROMEDIO DE SUELDOS PAGADOS POR LA UNIVERSIDAD: "+ ( totSuel / totProf ));
    for (int i=0 ; i <2 ; i++){
      System.out.println("   ");
    }
    
  }//fin de método main
}//fin de la clase
