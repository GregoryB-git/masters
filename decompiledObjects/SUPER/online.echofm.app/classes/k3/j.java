package k3;

import r3.a;

public abstract class j
{
  public final a a;
  public final Class b;
  
  public j(a parama, Class paramClass)
  {
    a = parama;
    b = paramClass;
  }
  
  public static j a(final b paramb, a parama, Class paramClass)
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
  
  public class a
    extends j
  {
    public a(Class paramClass, j.b paramb)
    {
      super(paramClass, null);
    }
  }
  
  public static abstract interface b {}
}

/* Location:
 * Qualified Name:     k3.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */