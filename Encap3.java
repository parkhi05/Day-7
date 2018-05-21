 
package encap3;
//import java.util.*;
class Test {
    private int n;
  

    public int getN() {
        
        
        
        return n;
    }

    public void setN(int n) {
        this.n = n;
           System.out.println(getN());
    }
    
}
class Test1{
    public void show()
    {
        Test t = new Test();
        t.setN(2);
       
    }
            
}
class Test2{
    public void display()
    {
        Test1 obj = new Test1();
        obj.show();
    }
}


public class Encap3 {

    public static void main(String[] args) {
        //int n,m;
//        Scanner sc = new Scanner(System.in);
//           System.out.println("Enter the first value : ");
//           n=sc.nextInt();
//           System.out.println("Enter the second value : ");
//           m=sc.nextInt();
           
           
        Test2 test1 = new Test2();
        test1.display();
        
    }
    
}
