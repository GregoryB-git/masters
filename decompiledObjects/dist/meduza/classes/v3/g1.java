package v3;

import android.os.Looper;
import java.util.concurrent.TimeoutException;
import v5.a0.a;
import v5.c;
import v5.k;
import v5.m;
import x6.b;

public final class g1
{
  public final b a;
  public final a b;
  public final c c;
  public int d;
  public Object e;
  public Looper f;
  public boolean g;
  public boolean h;
  public boolean i;
  
  public g1(g0 paramg0, b paramb, r1 paramr1, int paramInt, c paramc, Looper paramLooper)
  {
    b = paramg0;
    a = paramb;
    f = paramLooper;
    c = paramc;
  }
  
  public final void a(long paramLong)
  {
    try
    {
      b.H(g);
      boolean bool;
      if (f.getThread() != Thread.currentThread()) {
        bool = true;
      } else {
        bool = false;
      }
      b.H(bool);
      long l1 = c.d();
      for (long l2 = paramLong;; l2 = l1 + paramLong - l2)
      {
        bool = i;
        if ((bool) || (l2 <= 0L)) {
          break;
        }
        c.c();
        wait(l2);
        l2 = c.d();
      }
      if (bool) {
        return;
      }
      TimeoutException localTimeoutException = new java/util/concurrent/TimeoutException;
      localTimeoutException.<init>("Message delivery timed out.");
      throw localTimeoutException;
    }
    finally {}
  }
  
  public final void b(boolean paramBoolean)
  {
    try
    {
      h = (paramBoolean | h);
      i = true;
      notifyAll();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void c()
  {
    b.H(g ^ true);
    g = true;
    synchronized ((g0)b)
    {
      if ((!H) && (r.getThread().isAlive()))
      {
        p.k(14, this).a();
      }
      else
      {
        m.f("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        b(false);
      }
      return;
    }
  }
  
  public static abstract interface a {}
  
  public static abstract interface b
  {
    public abstract void q(int paramInt, Object paramObject);
  }
}

/* Location:
 * Qualified Name:     v3.g1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */