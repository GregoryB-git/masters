package V2;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

public final class E
  implements Runnable
{
  public E(F paramF, j paramj) {}
  
  public final void run()
  {
    try
    {
      try
      {
        j localj = F.e(p).a(o.j());
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
      p.d(localh);
      return;
    }
    catch (CancellationException localCancellationException)
    {
      p.b();
      return;
    }
    if ((localCancellationException.getCause() instanceof Exception))
    {
      p.d((Exception)localCancellationException.getCause());
      return;
    }
    p.d(localCancellationException);
  }
}

/* Location:
 * Qualified Name:     V2.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */