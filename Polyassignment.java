
package polyassignment;
class Volume {
    public int vol(int l,int b,int h)    //volume of a cuboid
    {
        return(l*b*h);
    }
    public int vol(int a)
    {
        return(a*a*a);                  //volume of a cube
    }
    public double vol(double r)
    {
        return(4/3*Math.PI*r*r*r);
    }
    
}


public class Polyassignment {

 
    public static void main(String[] args) {
        Volume v =  new Volume();
        int x = v.vol(2);      //cube
        System.out.println(x);
        int s =v.vol(1, 2, 3);  //cuboid
        System.out.println(s);
        double w =v.vol(2);
        System.out.println(w);
        
        
        
    }
    
}
