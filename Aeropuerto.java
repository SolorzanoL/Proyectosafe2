/*
@Autor:Nohemi Solorzano
@Versión: 1.0
@Fecha: 15/06/21
*/
import java.util.Scanner;
public class Aeropuerto{
   public static void main(String args[]){
   /*Declaracion de Atributos e Instanciación de objetos*/
   String numVue = "";
   String horSal = "";
   String linAer = "";
   String  tipVue = "";
   int numPas=0, totPas=0, totNac = 0, totInt =0, totPasNac =0, totPasInt =0;
   /*Inicializacion de los atributos*/

   Scanner leer = new Scanner(System.in);
   char resp;	
   /*Instanciamos un objeto leer tipo Scanner para la captura de los datos*/

   /*Entrada de Datos*/
   System.out.println("################################################################################");
   System.out.println("             BIENVENIDOS  AL  REGISTRO DE VUELOS                                ");
   System.out.println("################################################################################");
   System.out.println();
      
   System.out.print("Desea Registrar un Vuelo [s/n]:");
   resp = leer.next().charAt(0);/*Metodo de la libreria Scanner paara leer una variable de tipo char*/ 

   while ( resp == 's'){
      leer.nextLine();/*limpiar bufer de teclado*/
      System.out.print("Introduzca la Linea Aerea: Avensa , Aeropostal , Zuliana , Aserca:  ");
      linAer = leer.nextLine();
      System.out.print("Introduzca el Numero de Vuelo:    ");
      numVue = leer.nextLine();
      System.out.print("Introduzca la Hora de Salida :    ");
      horSal = leer.nextLine();
      System.out.print("Introduzca el Numero de Pasajeros: " );
      numPas  = leer.nextInt();
      leer.nextLine();
      System.out.print("Introduzca Tipo de Vuelo  <N>acional  , <I>nternacional:  ");
      tipVue = leer.nextLine();
	   
	   if (tipVue.equalsIgnoreCase("N")){/*instruccion sensible a mayuscula y minuscula*/
         totPasNac += numPas;
         totNac++;
      }     
      else{
	        totPasInt += numPas;
           totInt++;
        }  
        System.out.println();
        System.out.print("Desea Registrar otro Vuelo [s/n]:");
        resp = leer.next().charAt(0);
        System.out.println();
   }//while
   for (int i=0 ; i <2 ; i++){
      System.out.println("   ");
   }

   System.out.println("###############################################################################");
   System.out.println("                    R E P O R T E    D E   V U E L O S                         ");
   System.out.println("###############################################################################");
   System.out.println();
	System.out.println(" Cantidad Total de Pasajeros Internacionales:  "+ totPasInt);
   System.out.println(" Cantidad Total de Pasajeros Nacionales:  "+ totPasNac);
   
   System.out.println(" Total de Vuelos Internacionales:  "+ totInt);
          
	if (totNac > totInt){
      System.out.println(" Hubo más Vuelos Nacionales  "+ totNac + " que  Internacionales   "+ totInt);
   }else if (totNac < totInt){
            System.out.println(" Hubo más Vuelos Internacionales  "+ totInt + " que  Nacionales   "+ totNac);
         } else {
	         System.out.println(" Hubo igual numero de Vuelos Nacionales  " + totNac + " Internacionales  "+ totInt);
	      }
   totPas = totPasNac + totPasInt;
   System.out.println();
   System.out.println("###############################################################################");
   System.out.println(" Total de Pasajeros que salieron de este Aeropuerto:  "+ totPas);
   System.out.println("###############################################################################");
   for (int i=0 ; i <5 ; i++){ /*instruccion for para dejar espacios en blanco para el reporte*/
      System.out.println("   ");
   }

 }//fin del metodo main
}//fin de la clase