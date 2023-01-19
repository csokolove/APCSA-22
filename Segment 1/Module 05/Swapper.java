public class Swapper
{
   private int a, b;
   public Swapper(int aValue, int bValue)
   {
     a = aValue;
     b = bValue;
   }
   public void swap ()
   {
     a = b;
     b = a;
   }
   public void print ()
   {
     System.out.println("a = " + a + ", and b = " + b);
   }
}