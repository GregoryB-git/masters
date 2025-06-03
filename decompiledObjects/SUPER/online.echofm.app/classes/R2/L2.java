package R2;

import A2.n;
import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.q0;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

public final class L2
  extends FutureTask
  implements Comparable
{
  public final long o;
  public final boolean p;
  public final String q;
  
  public L2(G2 paramG2, Runnable paramRunnable, boolean paramBoolean, String paramString)
  {
    super(p0.a().b(paramRunnable), null);
    n.i(paramString);
    long l = G2.F().getAndIncrement();
    o = l;
    q = paramString;
    p = paramBoolean;
    if (l == Long.MAX_VALUE) {
      paramG2.j().G().a("Tasks index overflow");
    }
  }
  
  public L2(G2 paramG2, Callable paramCallable, boolean paramBoolean, String paramString)
  {
    super(p0.a().a(paramCallable));
    n.i(paramString);
    long l = G2.F().getAndIncrement();
    o = l;
    q = paramString;
    p = paramBoolean;
    if (l == Long.MAX_VALUE) {
      paramG2.j().G().a("Tasks index overflow");
    }
  }
  
  public final void setException(Throwable paramThrowable)
  {
    r.j().G().b(q, paramThrowable);
    super.setException(paramThrowable);
  }
}

/* Location:
 * Qualified Name:     R2.L2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */