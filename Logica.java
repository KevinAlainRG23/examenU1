package menu;
import java.util.ArrayList;
import java.util.List;

public class Logica{// llave de inicio de la clase

    char p[] = {'v', 'v', 'f', 'f'};
    char q[] = {'v', 'f', 'v', 'f'};


char cadena1[]=new char[5];
char cadena2[]=new char[6];
char cadena3[]=new char[5];

Logica(){
String ecuacion="[(p->q)^p]->q";
metodo1(ecuacion);
}

// recorrido de la expresion
private void metodo1(String ecuacion){// llave de inicio del metodo1
String aux="";
char arreglo[]=ecuacion.toCharArray();
          char c, cc,ccc;

for(int i=0; i<arreglo.length;i++){//lave del for
if(arreglo[i]=='('){
             
do{
aux+=arreglo[i];
i++;
}while(arreglo[i]!=')');
}
}//cierre de la llave del for
    String auxx="";
       
  for(int j=0; j<arreglo.length;j++){// llave de inicio del for
  if(arreglo[j]=='^'){// llave de inicio del if
 do{
  auxx+=arreglo[j];
  j++;
  }while(arreglo[j]!=']');
 
  
  }//llave de cierre del if
    }//llave de cierre del for 
       Final();
}// llave de cierre del metodo1




//evaluacion de la expresion
private void Evaluacion (char c,char cc){// llave del metodo evaluacion
for(int i=0; i<p.length;i++){//llave del for
if(p[i]=='v' && q[i]=='f'){
cadena1[i]='f';
}else{
cadena1[i]='v';
}
}// cierre de la llave del for
}// cierre del metodo evaluciaon



private void eva2(char ccc){//inicio
  for(int i=0; i<p.length; i++){
           if(cadena1[i]=='v' && p[i]=='v'){
               cadena2[i]='v';
           }else{
               cadena2[i]='f';
           }
       }
}//fin

 
       private void Final(){
       for(int i=0; i<q.length; i++){
           if(cadena2[i]=='v' && q[i]=='f'){
               cadena3[i]='f';
           }else{
               cadena3[i]='v';
           }
       }
       for(int i=0; i<cadena3.length; i++){
           System.out.println(cadena3[i]);
       }
   }    

}// llave de cierre de la clase
