package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.a;
import androidx.work.d;
import androidx.work.d.a;
import androidx.work.d.a.c;
import androidx.work.impl.WorkDatabase;
import b3.b;
import ec.i;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p2.k0;
import x2.n;
import x2.t;
import x2.x;

public final class DiagnosticsWorker
  extends Worker
{
  public DiagnosticsWorker(Context paramContext, WorkerParameters paramWorkerParameters)
  {
    super(paramContext, paramWorkerParameters);
  }
  
  public final d.a j()
  {
    Object localObject1 = k0.d(a);
    i.d(localObject1, "getInstance(applicationContext)");
    Object localObject2 = c;
    i.d(localObject2, "workManager.workDatabase");
    Object localObject3 = ((WorkDatabase)localObject2).u();
    n localn = ((WorkDatabase)localObject2).s();
    x localx = ((WorkDatabase)localObject2).v();
    localObject2 = ((WorkDatabase)localObject2).r();
    b.c.getClass();
    Object localObject4 = ((t)localObject3).h(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
    localObject1 = ((t)localObject3).n();
    localObject3 = ((t)localObject3).c();
    String str;
    if ((((Collection)localObject4).isEmpty() ^ true))
    {
      o2.j localj = o2.j.d();
      str = b.a;
      localj.e(str, "Recently completed work:\n\n");
      o2.j.d().e(str, b.a(localn, localx, (x2.j)localObject2, (List)localObject4));
    }
    if ((((Collection)localObject1).isEmpty() ^ true))
    {
      localObject4 = o2.j.d();
      str = b.a;
      ((o2.j)localObject4).e(str, "Running work:\n\n");
      o2.j.d().e(str, b.a(localn, localx, (x2.j)localObject2, (List)localObject1));
    }
    if ((((Collection)localObject3).isEmpty() ^ true))
    {
      localObject4 = o2.j.d();
      localObject1 = b.a;
      ((o2.j)localObject4).e((String)localObject1, "Enqueued work:\n\n");
      o2.j.d().e((String)localObject1, b.a(localn, localx, (x2.j)localObject2, (List)localObject3));
    }
    return new d.a.c();
  }
}

/* Location:
 * Qualified Name:     androidx.work.impl.workers.DiagnosticsWorker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */