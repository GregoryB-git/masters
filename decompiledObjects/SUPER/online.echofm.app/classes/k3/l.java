package k3;

import c3.g;

public abstract class l
{
  public final Class a;
  public final Class b;
  
  public l(Class paramClass1, Class paramClass2)
  {
    a = paramClass1;
    b = paramClass2;
  }
  
  public static l b(final b paramb, Class paramClass1, Class paramClass2)
  {
    return new a(paramClass1, paramClass2, paramb);
  }
  
  public abstract Object a(g paramg);
  
  public Class c()
  {
    return a;
  }
  
  public Class d()
  {
    return b;
  }
  
  public class a
    extends l
  {
    public a(Class paramClass, l.b paramb)
    {
      super(paramClass, null);
    }
    
    public Object a(g paramg)
    {
      return paramb.a(paramg);
    }
  }
  
  public static abstract interface b
  {
    public abstract Object a(g paramg);
  }
}

/* Location:
 * Qualified Name:     k3.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */