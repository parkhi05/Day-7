
package twodassign;


public class TwoDassign {

    public static void main(String[] args) {
      String arr[][] = {
                       {"A,6,3200","B,8,2100","C,2,3000"},
                       {"D,2,4300","E,2,3500","F,3,3700"},
                       {"G,9,2500","H,6,4000","I,1,5600"}
      };
      int i,j,sum=0;
      for(i=0;i<=arr.length-1;i++)
      {
          for(j=0;j<=arr[i].length-1;j++)
          {
           String data[] =arr[i][j].split(",");   
           int fees = Integer.parseInt(data[2]);
           sum=sum+fees;
            // System.out.print(arr[i][j]);
          }
          //System.out.println("");
            
      }
      System.out.println(sum);
      
         
    }
    
}
