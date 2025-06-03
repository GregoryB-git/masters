package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.WorkerParameters;
import androidx.work.d.a;
import b.m;
import b3.a;
import ec.i;
import java.util.concurrent.Executor;
import o2.j;
import rb.h;
import t2.b;
import t2.b.b;
import x2.s;
import z2.c;

public final class ConstraintTrackingWorker
  extends androidx.work.d
  implements t2.d
{
  public final WorkerParameters e;
  public final Object f;
  public volatile boolean o;
  public final c<d.a> p;
  public androidx.work.d q;
  
  public ConstraintTrackingWorker(Context paramContext, WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
    e = paramWorkerParameters;
    f = new Object();
    p = new c();
  }
  
  public final void d(s arg1, b paramb)
  {
    i.e(???, "workSpec");
    i.e(paramb, "state");
    j localj = j.d();
    String str = a.a;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Constraints changed for ");
    localStringBuilder.append(???);
    localj.a(str, localStringBuilder.toString());
    if ((paramb instanceof b.b)) {
      synchronized (f)
      {
        o = true;
        paramb = h.a;
      }
    }
  }
  
  public final void g()
  {
    androidx.work.d locald = q;
    if ((locald != null) && (!locald.f()))
    {
      int i;
      if (Build.VERSION.SDK_INT >= 31) {
        i = c;
      } else {
        i = 0;
      }
      locald.i(i);
    }
  }
  
  public final c h()
  {
    b.c.execute(new m(this, 9));
    c localc = p;
    i.d(localc, "future");
    return localc;
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.workers.ConstraintTrackingWorker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */