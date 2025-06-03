package gb;

import java.util.concurrent.Executor;
import x6.b;

public final class r1$h
  implements Executor
{
  public final m2<? extends Executor> a;
  public Executor b;
  
  public r1$h(j3 paramj3)
  {
    a = paramj3;
  }
  
  public final void execute(Runnable paramRunnable)
  {
    try
    {
      if (b == null)
      {
        localExecutor = (Executor)a.b();
        b.z("%s.getObject()", localExecutor, b);
        b = localExecutor;
      }
      Executor localExecutor = b;
      localExecutor.execute(paramRunnable);
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     gb.r1.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */