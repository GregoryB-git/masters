package p6;

import V5.a;
import X5.g;
import u6.h;

public abstract class H
{
  public static final void a(g paramg, Throwable paramThrowable)
  {
    try
    {
      G localG = (G)paramg.b(G.m);
      if (localG != null)
      {
        localG.h(paramg, paramThrowable);
        return;
      }
    }
    finally
    {
      break label36;
      h.a(paramg, paramThrowable);
      return;
      label36:
      h.a(paramg, b(paramThrowable, localThrowable));
    }
  }
  
  public static final Throwable b(Throwable paramThrowable1, Throwable paramThrowable2)
  {
    if (paramThrowable1 == paramThrowable2) {
      return paramThrowable1;
    }
    paramThrowable2 = new RuntimeException("Exception while trying to handle coroutine exception", paramThrowable2);
    a.a(paramThrowable2, paramThrowable1);
    return paramThrowable2;
  }
}

/* Location:
 * Qualified Name:     p6.H
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */