package okhttp3;

import java.util.ArrayDeque;
import java.util.Iterator;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;

class ConnectionPool$1
  implements Runnable
{
  public ConnectionPool$1(ConnectionPool paramConnectionPool) {}
  
  public final void run()
  {
    for (;;)
    {
      ConnectionPool localConnectionPool = a;
      long l1 = System.nanoTime();
      long l2;
      long l3;
      label271:
      try
      {
        Iterator localIterator = d.iterator();
        ??? = null;
        l2 = Long.MIN_VALUE;
        int i = 0;
        int j = i;
        while (localIterator.hasNext())
        {
          RealConnection localRealConnection = (RealConnection)localIterator.next();
          if (localConnectionPool.a(localRealConnection, l1) > 0)
          {
            j++;
          }
          else
          {
            int k = i + 1;
            l3 = l1 - o;
            i = k;
            if (l3 > l2)
            {
              ??? = localRealConnection;
              l2 = l3;
              i = k;
            }
          }
        }
        l3 = b;
        if ((l2 < l3) && (i <= a))
        {
          if (i > 0)
          {
            l2 = l3 - l2;
          }
          else if (j > 0)
          {
            l2 = l3;
          }
          else
          {
            f = false;
            l2 = -1L;
          }
        }
        else
        {
          d.remove(???);
          Util.f(e);
          l2 = 0L;
        }
        if (l2 == -1L) {
          return;
        }
        if (l2 <= 0L) {
          continue;
        }
        l3 = l2 / 1000000L;
      }
      finally {}
      try
      {
        synchronized (a)
        {
          a.wait(l3, (int)(l2 - 1000000L * l3));
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        break label271;
      }
    }
    throw ((Throwable)localObject3);
  }
}

/* Location:
 * Qualified Name:     okhttp3.ConnectionPool.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */