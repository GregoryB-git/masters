package j6;

import b6.a;
import b6.b;
import java.io.Serializable;

public abstract class c
{
  public static final a o = new a(null);
  public static final c p = b.a.b();
  
  public abstract int b(int paramInt);
  
  public int c()
  {
    return b(32);
  }
  
  public static final class a
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
}

/* Location:
 * Qualified Name:     j6.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */