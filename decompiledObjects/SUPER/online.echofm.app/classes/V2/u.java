package V2;

import java.util.concurrent.Executor;

public final class u
  implements Runnable
{
  public u(v paramv, j paramj) {}
  
  public final void run()
  {
    try
    {
      j localj = (j)v.e(p).a(o);
      if (localj == null)
      {
        p.d(new NullPointerException("Continuation returned null"));
        return;
      }
      Executor localExecutor = l.b;
      localj.e(localExecutor, p);
      localj.d(localExecutor, p);
      localj.a(localExecutor, p);
      return;
    }
    catch (Exception localException) {}catch (h localh) {}
    v.f(p).q(localh);
    return;
    if ((localh.getCause() instanceof Exception))
    {
      v.f(p).q((Exception)localh.getCause());
      return;
    }
    v.f(p).q(localh);
  }
}

/* Location:
 * Qualified Name:     V2.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */