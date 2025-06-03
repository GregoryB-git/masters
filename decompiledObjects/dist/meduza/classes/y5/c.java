package y5;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class c
  extends Thread
{
  public final WeakReference<a> a;
  public final long b;
  public final CountDownLatch c;
  public boolean d;
  
  public c(a parama, long paramLong)
  {
    a = new WeakReference(parama);
    b = paramLong;
    c = new CountDownLatch(1);
    d = false;
    start();
  }
  
  public final void run()
  {
    try
    {
      if (!c.await(b, TimeUnit.MILLISECONDS))
      {
        a locala1 = (a)a.get();
        if (locala1 != null)
        {
          locala1.b();
          d = true;
        }
      }
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      a locala2 = (a)a.get();
      if (locala2 != null)
      {
        locala2.b();
        d = true;
      }
    }
  }
}

/* Location:
 * Qualified Name:     y5.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */