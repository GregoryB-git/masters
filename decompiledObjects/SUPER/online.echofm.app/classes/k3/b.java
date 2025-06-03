package k3;

import c3.g;
import c3.y;
import r3.a;

public abstract class b
{
  public final a a;
  public final Class b;
  
  public b(a parama, Class paramClass)
  {
    a = parama;
    b = paramClass;
  }
  
  public static b a(final b paramb, a parama, Class paramClass)
  {
    return new a(parama, paramClass, paramb);
  }
  
  public final a b()
  {
    return a;
  }
  
  public final Class c()
  {
    return b;
  }
  
  public abstract g d(q paramq, y paramy);
  
  public class a
    extends b
  {
    public a(Class paramClass, b.b paramb)
    {
      super(paramClass, null);
    }
    
    public g d(q paramq, y paramy)
    {
      return paramb.a(paramq, paramy);
    }
  }
  
  public static abstract interface b
  {
    public abstract g a(q paramq, y paramy);
  }
}

/* Location:
 * Qualified Name:     k3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */