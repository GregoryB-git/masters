package nc;

import p2.m0;
import ub.h;
import x6.b;

public final class c0
{
  public static final void a(h paramh, Throwable paramThrowable)
  {
    try
    {
      b0 localb0 = (b0)paramh.get(b0.a.a);
      if (localb0 != null)
      {
        localb0.I(paramh, paramThrowable);
        return;
      }
      m0.M(paramh, paramThrowable);
      return;
    }
    finally
    {
      if (paramThrowable != localThrowable)
      {
        RuntimeException localRuntimeException = new RuntimeException("Exception while trying to handle coroutine exception", localThrowable);
        b.e(localRuntimeException, paramThrowable);
        paramThrowable = localRuntimeException;
      }
      m0.M(paramh, paramThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     nc.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */