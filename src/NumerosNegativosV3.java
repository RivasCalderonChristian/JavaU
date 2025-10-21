import java.io.*;
class NumerosNegativosV3
  {    
    public static void main(String[] args)
     {
      //declarar variables e introducir informacion
      int a[] = {-3,1,-25};
      //Procesar la informacion es decir, organizar la tabla de multiplicacion
      for(int i=0; i < a.length; i++)
       {
        if(a[i]<0)
         {
          a[i]=100;
          System.out.println(a[i]);
         }
        else
         System.out.println(a[i]);
       }
     }
  }
