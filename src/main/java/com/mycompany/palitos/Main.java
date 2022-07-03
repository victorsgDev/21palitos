
package com.mycompany.palitos;

import java.util.Scanner;


public class Main {

    public static String crearPalitos(int resto)
    {
        
       String texto="";
        for (short i=0;i<resto;i++)
        {
            texto+="|";
            
        }
     return texto;

    }
    
   public static void main(String[] args) {


        System.out.println("¡Bienvenio al juego de los 21 palitos!");
        System.out.println("-----------------");
       
        
        int resto=21;
       
        do{
            System.out.println("Quedan "+resto+" palitos, ¿Cuántos palitos desear retirar?");
            System.out.println(crearPalitos(resto));
            Scanner scanner= new Scanner(System.in);
           
            int eleccion=scanner.nextInt();
            
            while(eleccion>=5 || eleccion<1) 
            {
            System.out.println("Solo puedes introducir un numero del 1 al 4");
            eleccion=scanner.nextInt();
            }
            resto-=eleccion;
            System.out.println(crearPalitos(resto));
            
            System.out.println("Quedan "+resto+" palitos");
            System.out.println("¿Cuántos palitos desea retirar la IA?");
            int numia = 5-eleccion;
            System.out.println("La IA ha retirado "+numia);
            resto-=numia;
            
            System.out.println("Quedan "+resto+" palitos");
            System.out.println(crearPalitos(resto));
            if (resto==1) 
            {
            System.out.println("--------------------------------------------");
            System.out.println("Has perdido");
            break;
            }
        }
        while(resto>=1);

}

 

}
    
