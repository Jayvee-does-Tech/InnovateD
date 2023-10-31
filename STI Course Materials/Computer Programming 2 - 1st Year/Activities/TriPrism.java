package triprism;

class ETriPrism <T>
{
  private T length,base,height;
  
  T getLength()
  {
    return length;
  }
  
  T getBase()
  {
    return base;
  }
  
  T getHeight()
  {
    return height;
  }
  
  
  void setLength(T l)
  {
    this.length = l;
  }
  
  void setHeight(T h)
  {
    this.height = h;
  }
  
  void setBase(T b)
  {
    this.base = b;
  }
}
public class TriPrism {

    public static void main(String[] args) {
      ETriPrism<Integer> tp1 = new ETriPrism<>();
     
     
     tp1.setLength(10);
     tp1.setBase(7);
     tp1.setHeight(5);
     
     
     double volume = tp1.getLength()*(0.5*tp1.getBase()*tp1.getHeight());
     
     System.out.println("Triangular Prism 1");
     System.out.println("Length: "+tp1.getLength());
     System.out.println("Base: "+tp1.getBase());
     System.out.println("Height: "+tp1.getHeight());
     System.out.println("The volume of the triangular prism is "+volume);
     
     
     ETriPrism<Double> tp2 = new ETriPrism<>();
   
   
     tp2.setLength(9.10);
     tp2.setBase(6.25);
     tp2.setHeight(4.20);
     
     
     volume = tp2.getLength()*(0.5*tp2.getBase()*tp2.getHeight());
     
     System.out.println("Triangular Prism 2");
     System.out.println("Length: "+tp2.getLength());
     System.out.println("Base: "+tp2.getBase());
     System.out.println("Height: "+tp2.getHeight());
     System.out.println("The volume of the triangular prism is "+volume);
     
   }
}
    
    
    

