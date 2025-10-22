package preparatoria;
class VectorBuscar
   {
    public static void main (String[] args)
     {
      int [] buscar = {5, 0, 8}; 
      int e=0, NumB=0, NumE=0;
         while(e<3)
         {
          if(NumB==buscar[e])
            NumE=1;
          e++;
         }
          if(NumE==1)
            System.out.print("Numero encontrado");
          else
            System.out.print("Numero no encontrado");
       }
   }