package F2;

import android.os.Process;

public final class b
  implements Runnable
{
  public final Runnable o;
  
  public b(Runnable paramRunnable, int paramInt)
  {
    o = paramRunnable;
  }
  
  public final void run()
  {
    Process.setThreadPriority(0);
    o.run();
  }
}

/* Location:
 * Qualified Name:     F2.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */