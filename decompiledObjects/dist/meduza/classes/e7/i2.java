package e7;

import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzdi;
import d2.q;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

public final class i2<V>
  extends FutureTask<V>
  implements Comparable<i2<V>>
{
  public final long a;
  public final boolean b;
  public final String c;
  
  public i2(e2 parame2, Runnable paramRunnable, boolean paramBoolean, String paramString)
  {
    super(zzdi.zza().zza(paramRunnable), null);
    long l = e2.t.getAndIncrement();
    a = l;
    c = paramString;
    b = paramBoolean;
    if (l == Long.MAX_VALUE) {
      zzjo.b("Tasks index overflow");
    }
  }
  
  public i2(e2 parame2, Callable paramCallable, boolean paramBoolean)
  {
    super(zzdi.zza().zza(paramCallable));
    long l = e2.t.getAndIncrement();
    a = l;
    c = "Task exception on worker thread";
    b = paramBoolean;
    if (l == Long.MAX_VALUE) {
      zzjo.b("Tasks index overflow");
    }
  }
  
  public final int compareTo(Object paramObject)
  {
    paramObject = (i2)paramObject;
    boolean bool = b;
    if (bool != b)
    {
      if (bool) {
        return -1;
      }
      return 1;
    }
    long l1 = a;
    long l2 = a;
    if (l1 < l2) {
      return -1;
    }
    if (l1 > l2) {
      return 1;
    }
    d.zzj().p.c("Two tasks share the same index. index", Long.valueOf(a));
    return 0;
  }
  
  public final void setException(Throwable paramThrowable)
  {
    d.zzj().o.c(c, paramThrowable);
    super.setException(paramThrowable);
  }
}

/* Location:
 * Qualified Name:     e7.i2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */