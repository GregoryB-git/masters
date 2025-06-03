package okhttp3;

import f;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation.StreamAllocationReference;
import okhttp3.internal.platform.Platform;

public final class ConnectionPool
{
  public static final ThreadPoolExecutor g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.v("OkHttp ConnectionPool", true));
  public final int a = 5;
  public final long b;
  public final Runnable c = new Runnable()
  {
    public final void run()
    {
      for (;;)
      {
        ConnectionPool localConnectionPool = ConnectionPool.this;
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
          synchronized (ConnectionPool.this)
          {
            wait(l3, (int)(l2 - 1000000L * l3));
          }
        }
        catch (InterruptedException localInterruptedException)
        {
          break label271;
        }
      }
      throw ((Throwable)localObject3);
    }
  };
  public final ArrayDeque d = new ArrayDeque();
  public final RouteDatabase e = new RouteDatabase();
  public boolean f;
  
  public ConnectionPool()
  {
    b = localTimeUnit.toNanos(5L);
  }
  
  public final int a(RealConnection paramRealConnection, long paramLong)
  {
    ArrayList localArrayList = n;
    int i = 0;
    while (i < localArrayList.size())
    {
      Object localObject1 = (Reference)localArrayList.get(i);
      if (((Reference)localObject1).get() != null)
      {
        i++;
      }
      else
      {
        localObject1 = (StreamAllocation.StreamAllocationReference)localObject1;
        Object localObject2 = f.l("A connection to ");
        ((StringBuilder)localObject2).append(c.a.a);
        ((StringBuilder)localObject2).append(" was leaked. Did you forget to close a response body?");
        localObject2 = ((StringBuilder)localObject2).toString();
        Platform.a.m(a, (String)localObject2);
        localArrayList.remove(i);
        k = true;
        if (localArrayList.isEmpty())
        {
          o = (paramLong - b);
          return 0;
        }
      }
    }
    return localArrayList.size();
  }
}

/* Location:
 * Qualified Name:     okhttp3.ConnectionPool
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */