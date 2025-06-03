package androidx.work;

import android.content.Context;
import java.util.concurrent.Executor;
import z2.c;

public abstract class Worker
  extends d
{
  public c<d.a> e;
  
  public Worker(Context paramContext, WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
  }
  
  public final s7.e<o2.d> b()
  {
    final c localc = new c();
    b.c.execute(new a(localc));
    return localc;
  }
  
  public final c h()
  {
    e = new c();
    b.c.execute(new e(this));
    return e;
  }
  
  public abstract d.a j();
  
  public final class a
    implements Runnable
  {
    public final void run()
    {
      try
      {
        b.getClass();
        IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
        localIllegalStateException.<init>("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
        throw localIllegalStateException;
      }
      finally {}
    }
  }
}

/* Location:
 * Qualified Name:     androidx.work.Worker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */