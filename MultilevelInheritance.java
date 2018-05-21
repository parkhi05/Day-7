
package multilevelinheritance;
     class Add
{
    public void sum(int a,int b)
    {
        int r = a+b;
        System.out.println("Sum is :"+r);
       // System.out.println("The sum of two numbers are ");
    }
}
     class Multiply extends Add
     {
         public void mul(int n,int m)
         {   
               int res;
               res = n*m;
            System.out.println("Multiplication is :"+res);
         }
     }
   class Division extends Multiply
   {
       public void div(int a,int b)
       {
           int d = a/b;
            System.out.println("Division is :"+d);
           
       }
   }

public class MultilevelInheritance {


    public static void main(String[] args) {
        Division obj = new Division();
     obj.mul(2,3);
     obj.sum(5,10);
     obj.div(8,2);
      
    }
    
}
