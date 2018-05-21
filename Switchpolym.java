
package switchpolym;
import java.util.*;
class Volume{
    public void vol(float a)
    {
         System.out.println("Volume of a cube is "+(a*a*a));
    }
    public void vol(float l,float b,float h)
    {
        System.out.println("Volume of a cuboid is "+(l*b*h));
    }
//    public void vol(float l , float b)
//    {
//         System.out.println("Area of a rectangle is "+(l*b));
//    }
}
      class Area
{
        public void ar(float l,float b)
        {
            System.out.println("Area of a rectangle is : "+(l*b));
        }
    
}


public class Switchpolym {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu.");
           System.out.println("Enter 1 to find the volume of a cube : ");
        
           System.out.println("Enter 2 to find the volume of a cuboid :  ");
        
           System.out.println("Enter 3 to find the area of rectangle : ");
   
           System.out.println("Enter your choice : ");
           int choice = sc.nextInt();
           Volume v = new Volume();
           Area obj = new Area();
           switch(choice)
           {
               case 1 : 
               {
                  System.out.println("Volume of a cube.. ");
                  System.out.println("Enter the sides : ");
                  float a =sc.nextFloat();
                  v.vol(a);
                  break;
               }
               case 2 :
               {
                 System.out.println("Volume of a cuboid.. ");
                 System.out.println("Enter the length : ");
                float l = sc.nextFloat();
                 System.out.println("Enter the breath : ");
                 float b = sc.nextFloat();
                 System.out.println("Enter the height : ");
                 float h = sc.nextFloat();
                 v.vol(l, b, h);
                 break;
               }
               case 3 :
                       {
                        System.out.println("Area of a rectangle :  ");  
                        System.out.println("Enter the length : ");
                        float l = sc.nextFloat();
                        System.out.println("Enter the breath : ");
                        float b = sc.nextFloat();
                       obj.ar(l, b);
                        break; 
                       }
               default :
                       {
                 System.out.println("You have entered the wrong choice "); 
                 break;
                       }
    
           }
 
    }
    
}
