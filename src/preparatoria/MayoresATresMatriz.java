package preparatoria;
//PRACTICA MATRICES 
class MayoresATresMatriz
  {
   public static void main  (String[] args)
     {
       int A [][]= {{5,1,0},{5,2,0},{5,3,0}};
       int nMtres=0;
       System.out.println("valores introducidos mayores a 3:");
       for(int f=0; f<A.length; f++)
        {
         for(int c=0; c<A[f].length; c++)
          {
            //System.out.print(A[f][c] +" ");
            if(A[f][c]>3)
              nMtres++;
          }
         //System.out.println();
        }
      System.out.println(nMtres++);
     }
  }