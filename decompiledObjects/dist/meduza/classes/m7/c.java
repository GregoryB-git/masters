package m7;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.atomic.AtomicInteger;

public final class c
  extends w
{
  public final void b()
  {
    switch (o)
    {
    default: 
      break;
    case 0: 
      ??? = p).a;
      b.b("unlinkToDeath", new Object[0]);
      n.asBinder().unlinkToDeath(k, 0);
      ??? = p).a;
      n = null;
      g = false;
      return;
    }
    synchronized (p).f)
    {
      if ((p).l.get() > 0) && (p).l.decrementAndGet() > 0))
      {
        p).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
      }
      else
      {
        Object localObject2 = (e)p;
        if (n != null)
        {
          b.b("Unbind from service.", new Object[0]);
          localObject2 = (e)p;
          a.unbindService(m);
          localObject2 = p;
          g = false;
          n = null;
          m = null;
        }
        ((e)p).e();
      }
      return;
    }
  }
}

/* Location:
 * Qualified Name:     m7.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */