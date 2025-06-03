package R2;

import A2.n;
import E2.e;
import android.content.Context;
import android.os.Handler;
import com.google.android.gms.internal.measurement.t0;

public abstract class x
{
  public static volatile Handler d;
  public final o3 a;
  public final Runnable b;
  public volatile long c;
  
  public x(o3 paramo3)
  {
    n.i(paramo3);
    a = paramo3;
    b = new w(this, paramo3);
  }
  
  public final void a()
  {
    c = 0L;
    f().removeCallbacks(b);
  }
  
  public final void b(long paramLong)
  {
    a();
    if (paramLong >= 0L)
    {
      c = a.b().a();
      if (!f().postDelayed(b, paramLong)) {
        a.j().G().b("Failed to schedule delayed post. time", Long.valueOf(paramLong));
      }
    }
  }
  
  public abstract void d();
  
  public final boolean e()
  {
    return c != 0L;
  }
  
  public final Handler f()
  {
    if (d != null) {
      return d;
    }
    try
    {
      if (d == null)
      {
        t0 localt0 = new com/google/android/gms/internal/measurement/t0;
        localt0.<init>(a.a().getMainLooper());
        d = localt0;
      }
    }
    finally
    {
      break label59;
    }
    Handler localHandler = d;
    return localHandler;
    label59:
    throw localHandler;
  }
}

/* Location:
 * Qualified Name:     R2.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */