public class PerfectNo
{
   //comments
   public static void main(String args[])
    {
     int n=28,sum=0;
    for(int i=1;i<n;i++)
      {
       if(n%i==0)
     {
      
      sum=sum+i;
         
      } 
     } 
      
    System.out.println(sum);
    if(sum==n)
    {
   System.out.println(" Perfect No.");
    }
else
  {
System.out.println("Not Perfect No.");
 
   }

}
}
   
    
   
