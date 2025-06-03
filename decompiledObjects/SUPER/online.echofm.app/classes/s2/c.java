package s2;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class c
  extends Thread
{
  public final WeakReference o;
  public final long p;
  public final CountDownLatch q;
  public boolean r;
  
  public c(a parama, long paramLong)
  {
    o = new WeakReference(parama);
    p = paramLong;
    q = new CountDownLatch(1);
    r = false;
    start();
  }
  
  public final void a()
  {
    a locala = (a)o.get();
    if (locala != null)
    {
      locala.c();
      r = true;
    }
  }
  
  public final void run()
  {
    try
    {
      if (!q.await(p, TimeUnit.MILLISECONDS)) {
        a();
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      a();
    }
  }
}

/* Location:
 * Qualified Name:     s2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */