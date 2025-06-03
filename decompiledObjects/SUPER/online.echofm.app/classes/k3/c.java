package k3;

public abstract class c
{
  public final Class a;
  public final Class b;
  
  public c(Class paramClass1, Class paramClass2)
  {
    a = paramClass1;
    b = paramClass2;
  }
  
  public static c a(final b paramb, Class paramClass1, Class paramClass2)
  {
    return new a(paramClass1, paramClass2, paramb);
  }
  
  public Class b()
  {
    return a;
  }
  
  public Class c()
  {
    return b;
  }
  
  public class a
    extends c
  {
    public a(Class paramClass, c.b paramb)
    {
      super(paramClass, null);
    }
  }
  
  public static abstract interface b {}
}

/* Location:
 * Qualified Name:     k3.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */