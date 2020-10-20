package menu;


import java.util.Scanner;

public class Menu {// llave de inicio de la clase 
    public static void main(String[] args) {// llave de inicio del main       
       Scanner x=new Scanner(System.in);// declaracion del scanner
        int opc;// variable que guardara la opcion
        int n=6; //maximo de repeticiones
        do{
           // menu
        System.out.println("===================BIENVENIDO=================");  
        System.out.println("=====QUÉ TIPO DE EXPRESION VA A UTILIZAR======");
        System.out.println("1.-aritmetica.\n2.-logica.\n3.-logica 2\n4.-salir");
        System.out.println("Introduce una opcion");
        opc=x.nextInt();
         
        switch(opc){
            case 1:
              
                /*
                8*3/2^2-4
                24/2^2-4
               24/4-4
                6-4
                2
                */
//                System.out.println("===============================================");
//                System.out.println("ESTA DENTRO DE LA OPCION 1 EXPRESIÓN ARITMETICA");
              //  separar s=new separar();// mandamos a llamar al metodo separar
              //  ExpresionAritmetica1 ea= new ExpresionAritmetica1();
                
                EAritmetica ea= new EAritmetica();
                break;
                
            
            case 2:
//                
//     [(p->q)^p]->q     tautologia      
//                                      todos verdaderos              
//        (p->q)<->(¬pvq)   tautologia      
//                
       Logica l=new Logica();  
                break;
                
                
            case 3:
                  System.out.println("===============================================");
                  System.out.println("ESTA DENTRO DE LA OPCION 3 EXPRESIÓN LOGICA2");   
                int caracter=0;
                
               System.out.println("Ingrese la cadena:");
               String cadena=x.next();
               caracter=cadena.length();
               System.out.println("La Cadena Ingresada Es: "+cadena);
               System.out.println("El Tamaño De La Cadena Es: "+caracter);
               
               char[] cadenadividida=cadena.toCharArray();
               String c="", cc="";
              
             
              //Extraemos los numeros de la cadena 
               for(int i=0; i<cadenadividida.length;i++){
               if(Character.isDigit(cadenadividida[i])){
               c+=cadenadividida[i];
               }
                }
               int tam=0; 
               tam=c.length();
             //Extraemos las letras de la cadena  
             for(int j=0; j<cadenadividida.length;j++){
             if(Character.isLetter(cadenadividida[j])){
             cc+=cadenadividida[j];
             }
             }
            int tam2=0;
            tam2=cc.length();
               
             System.out.println("Los Numeros Son: "+c);
             System.out.println("El Tamaño De Los Numeros Es: "+tam);
             System.out.println("Las Letras son: "+cc);
             System.out.println("El Tamaño De Las Letras Es: "+tam2);
                break;
                
            case 4:
                System.out.println("======GRACIAS VUELVA PRONTO :V=============");
                System.exit(0);
                break;

                
        }//llave de ciere del switch
        
           
         }while(opc<=6);
        
    }// llave de cierre del main  
}// llave de cierre de la clase




/*
c.informacion@cuautla.tecnm.mx
elibro.net/es/lc/cuautla
*/
