package j6;

import java.io.Serializable;

public final class c$a
  extends c
  implements Serializable
{
  private final Object writeReplace()
  {
    return a.o;
  }
  
  public int b(int paramInt)
  {
    return c.a().b(paramInt);
  }
  
  public int c()
  {
    return c.a().c();
  }
  
  public static final class a
    implements Serializable
  {
    public static final a o = new a();
    private static final long serialVersionUID = 0L;
    
    private final Object readResolve()
    {
      return c.o;
    }
  }
}

/* Location:
 * Qualified Name:     j6.c.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */