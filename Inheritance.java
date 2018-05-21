
package inheritance;

   //Single inheritance 
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


public class Inheritance {


    public static void main(String[] args) {
     Multiply obj = new Multiply();
     obj.mul(2,3);
     obj.sum(5,10);
   
    }
    
}
