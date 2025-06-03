package L0;

import F0.T;
import d0.A;
import g0.z;

public abstract class e
{
  public final T a;
  
  public e(T paramT)
  {
    a = paramT;
  }
  
  public final boolean a(z paramz, long paramLong)
  {
    boolean bool;
    if ((b(paramz)) && (c(paramz, paramLong))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public abstract boolean b(z paramz);
  
  public abstract boolean c(z paramz, long paramLong);
  
  public static final class a
    extends A
  {
    public a(String paramString)
    {
      super(null, false, 1);
    }
  }
}

/* Location:
 * Qualified Name:     L0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */