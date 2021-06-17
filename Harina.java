/*
@Autor:Nohemi Solorzano
@Versión: 1.0
@Fecha: 15/06/21
*/
import java.util.Scanner;
public class Harina{
   public static void main(String args[]){
   /*Declaracion de Atributos e Instanciación de objetos*/
   char rPan, rJuana;	
   int pan = 0, juana = 0,panJuana = 0, ninguna = 0, numEnc = 0;
   float porPan = 0, porJuana = 0, porSi = 0, porNo = 0;
   /*Inicializacion de los atributos*/
 
   Scanner leer = new Scanner(System.in);
   char enc;
   /*Instanciamos un objeto leer tipo Scanner para la captura de los datos*/

   /*Entrada de Datos*/
   System.out.println("################################################################################");
   System.out.println("                  BIENVENIDOS  AL  REGISTRO DE ENCUESTAS                        ");
   System.out.println("################################################################################");
   System.out.println();

   System.out.print("Desea Procesar una  Encuesta [s/n]:");
   enc = leer.next().charAt(0);/*Metodo de la libreria Scanner paara leer una variable de tipo char*/ 
   System.out.println();

   while ( enc == 's'){
      numEnc++;/*contador de encuestas*/
      System.out.print("Consume Ud. Harina Pan [s/n] ? :");
      rPan= leer.next().charAt(0);
      System.out.println();
 
      System.out.print("Consume Ud. Harina Juana [s/n]? :");
      rJuana= leer.next().charAt(0);
      System.out.println();
      /*se procesa la encuesta de acuerdo a la eleccion del encuestado*/
      if (rPan == 's'){
	     pan++;
      }

      if (rJuana == 's'){
	   juana++;
      }

      if ((rPan == 's') && (rJuana == 's')) {
	   panJuana++;
      }

      if ((rPan == 'n') && (rJuana == 'n')){
 	   ninguna++;
      }
 
      System.out.print("Desea Procesar Otra Encuesta [s/n]? :");
      enc= leer.next().charAt(0);
      System.out.println();

   }//while
   for (int i=0 ; i <2 ; i++){
      System.out.println("   ");
   }
   /*/Calculo de porcentajes*/
   porPan = ( pan * 100 / numEnc);
   porJuana = ( juana * 100 / numEnc);
   porSi = ( panJuana * 100 / numEnc);
   porNo = ( ninguna * 100 / numEnc);
   System.out.println("###############################################################################");
   System.out.println("                    R E P O R T E    D E   E N C U E S T A D O S               ");
   System.out.println("###############################################################################");
   System.out.println();

   System.out.println(" Porcentaje de personas que consumen Harina Pan: " + porPan + " %");
   System.out.println(" Porcentaje de personas que consumen Harina Juana: " + porJuana + " %");
   System.out.println(" Porcentaje de personas que consumen Harina Pan y Harina Juana: " + porSi + " %");
   System.out.println(" Porcentaje de personas que NO consumen Harina Pan  ni Harina Juana: " + porNo + " %");
   System.out.println();
   System.out.println("###############################################################################");
   System.out.println(" Total de Personas Encuestadas:                                        " +numEnc);
   System.out.println("###############################################################################");
   for (int i=0 ; i <5 ; i++){/*instruccion for para dejar espacios en blanco para el reporte*/
      System.out.println("   ");
   }

  }//fin del metodo main
}//fin de la clase