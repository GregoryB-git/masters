package p6;

import V5.n;

public abstract class w
{
  public static final u a(q0 paramq0)
  {
    return new v(paramq0);
  }
  
  public static final boolean c(u paramu, Object paramObject)
  {
    Throwable localThrowable = n.b(paramObject);
    boolean bool;
    if (localThrowable == null) {
      bool = paramu.n(paramObject);
    } else {
      bool = paramu.l(localThrowable);
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     p6.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */