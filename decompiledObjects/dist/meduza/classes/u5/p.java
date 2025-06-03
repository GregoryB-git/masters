package u5;

import android.os.ConditionVariable;

public final class p
  extends Thread
{
  public p(q paramq, ConditionVariable paramConditionVariable)
  {
    super("ExoPlayer:SimpleCacheInit");
  }
  
  public final void run()
  {
    synchronized (b)
    {
      a.open();
      q.l(b);
      b.b.c();
      return;
    }
  }
}

/* Location:
 * Qualified Name:     u5.p
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */