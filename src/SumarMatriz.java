//PRACTICA MATRICES 
class SumarMatriz
  {
   public static void main  (String[] args)
     {
       int A [][]= {{5,1,0},{5,2,0},{5,3,0}};
       int Suma = 0;
       //System.out.println("valores introducidos:");
       for(int f=0; f<A.length; f++)
        {
         for(int c=0; c<A[f].length; c++)
          {
            Suma = Suma+A[f][c];
            //System.out.print();
          }
         System.out.println(Suma);
        }
     }
  }