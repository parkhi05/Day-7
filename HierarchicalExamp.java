
package hierarchicalexamp;
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
   class Division extends Add
   {
       public void div(int a,int b)
       {
           int d = a/b;
            System.out.println("Division is :"+d);
           
       }
   }
public class HierarchicalExamp {

   
    public static void main(String[] args) {
       Multiply ob1 =  new Multiply();
       Division ob2 = new Division();
       ob1.sum(2, 3);
       ob2.sum(2, 2);
       
    }
    
}
