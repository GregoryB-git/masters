package y2;

import android.content.Context;
import android.content.Intent;
import b.a0;
import java.util.UUID;
import o2.d;
import o2.o.b;
import p2.r;
import x2.s;
import x2.t;
import z2.a.b;
import z2.c;

public final class y
  implements Runnable
{
  public final void run()
  {
    try
    {
      if (!(a.a instanceof a.b))
      {
        Object localObject = b.toString();
        s locals = e.c.t((String)localObject);
        if ((locals != null) && (!b.f()))
        {
          w2.a locala = e.b;
          d locald = c;
          ((r)locala).e((String)localObject, locald);
          localObject = androidx.work.impl.foreground.a.b(d, a0.s(locals), c);
          d.startService((Intent)localObject);
        }
        else
        {
          localObject = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject).<init>("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
          throw ((Throwable)localObject);
        }
      }
    }
    finally
    {
      a.j(localThrowable);
    }
  }
}

/* Location:
 * Qualified Name:     y2.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */