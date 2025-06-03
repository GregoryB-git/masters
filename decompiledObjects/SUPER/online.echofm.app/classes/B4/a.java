package B4;

import G4.h.a;
import L4.k;
import M4.b;
import M4.g;
import M4.j;
import M4.l;
import N4.m;
import N4.m.b;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import androidx.fragment.app.n.l;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.protobuf.r.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class a
  implements Application.ActivityLifecycleCallbacks
{
  public static final F4.a F = ;
  public static volatile a G;
  public l A;
  public l B;
  public N4.d C = N4.d.r;
  public boolean D = false;
  public boolean E = true;
  public final WeakHashMap o = new WeakHashMap();
  public final WeakHashMap p = new WeakHashMap();
  public final WeakHashMap q = new WeakHashMap();
  public final WeakHashMap r = new WeakHashMap();
  public final Map s = new HashMap();
  public final Set t = new HashSet();
  public Set u = new HashSet();
  public final AtomicInteger v = new AtomicInteger(0);
  public final k w;
  public final C4.a x;
  public final M4.a y;
  public final boolean z;
  
  public a(k paramk, M4.a parama)
  {
    this(paramk, parama, C4.a.g(), f());
  }
  
  public a(k paramk, M4.a parama, C4.a parama1, boolean paramBoolean)
  {
    w = paramk;
    y = parama;
    x = parama1;
    z = paramBoolean;
  }
  
  public static a b()
  {
    if (G == null)
    {
      try
      {
        if (G == null)
        {
          a locala = new B4/a;
          k localk = k.l();
          M4.a locala1 = new M4/a;
          locala1.<init>();
          locala.<init>(localk, locala1);
          G = locala;
        }
      }
      finally
      {
        break label54;
      }
      break label59;
      label54:
      throw ((Throwable)localObject);
    }
    label59:
    return G;
  }
  
  public static String c(Activity paramActivity)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("_st_");
    localStringBuilder.append(paramActivity.getClass().getSimpleName());
    return localStringBuilder.toString();
  }
  
  public static boolean f()
  {
    return d.a();
  }
  
  public N4.d a()
  {
    return C;
  }
  
  public void d(String paramString, long paramLong)
  {
    Long localLong;
    synchronized (s)
    {
      localLong = (Long)s.get(paramString);
      if (localLong == null) {
        s.put(paramString, Long.valueOf(paramLong));
      }
    }
    s.put(paramString, Long.valueOf(localLong.longValue() + paramLong));
  }
  
  public void e(int paramInt)
  {
    v.addAndGet(paramInt);
  }
  
  public boolean g()
  {
    return z;
  }
  
  public void h(Context paramContext)
  {
    try
    {
      boolean bool = D;
      if (bool) {
        return;
      }
      paramContext = paramContext.getApplicationContext();
      if ((paramContext instanceof Application))
      {
        ((Application)paramContext).registerActivityLifecycleCallbacks(this);
        D = true;
      }
    }
    finally
    {
      break label49;
    }
    return;
    label49:
    throw paramContext;
  }
  
  public void i(a parama)
  {
    synchronized (u)
    {
      u.add(parama);
      return;
    }
  }
  
  public void j(WeakReference paramWeakReference)
  {
    synchronized (t)
    {
      t.add(paramWeakReference);
      return;
    }
  }
  
  public final void k()
  {
    synchronized (u)
    {
      Iterator localIterator = u.iterator();
      a locala;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        locala = (a)localIterator.next();
      } while (locala == null);
      locala.a();
    }
  }
  
  public final void l(Activity paramActivity)
  {
    Trace localTrace = (Trace)r.get(paramActivity);
    if (localTrace == null) {
      return;
    }
    r.remove(paramActivity);
    g localg = ((d)p.get(paramActivity)).e();
    if (!localg.d())
    {
      F.k("Failed to record frame data for %s.", new Object[] { paramActivity.getClass().getSimpleName() });
      return;
    }
    j.a(localTrace, (h.a)localg.c());
    localTrace.stop();
  }
  
  public final void m(String arg1, l paraml1, l paraml2)
  {
    if (!x.L()) {
      return;
    }
    paraml1 = m.z0().N(???).L(paraml1.e()).M(paraml1.d(paraml2)).F(SessionManager.getInstance().perfSession().a());
    int i = v.getAndSet(0);
    synchronized (s)
    {
      paraml1.H(s);
      if (i != 0) {
        paraml1.J(b.r.toString(), i);
      }
    }
    s.clear();
    w.D((m)paraml1.v(), N4.d.s);
  }
  
  public final void n(Activity paramActivity)
  {
    if ((g()) && (x.L()))
    {
      Object localObject = new d(paramActivity);
      p.put(paramActivity, localObject);
      if ((paramActivity instanceof e))
      {
        localObject = new c(y, w, this, (d)localObject);
        q.put(paramActivity, localObject);
        ((e)paramActivity).n().W0((n.l)localObject, true);
      }
    }
  }
  
  public void o(WeakReference paramWeakReference)
  {
    synchronized (t)
    {
      t.remove(paramWeakReference);
      return;
    }
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    n(paramActivity);
  }
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    p.remove(paramActivity);
    if (q.containsKey(paramActivity)) {
      ((e)paramActivity).n().m1((n.l)q.remove(paramActivity));
    }
  }
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityResumed(Activity paramActivity)
  {
    try
    {
      if (!o.isEmpty()) {
        break label93;
      }
      A = y.a();
      o.put(paramActivity, Boolean.TRUE);
      if (E)
      {
        p(N4.d.q);
        k();
        E = false;
      }
    }
    finally
    {
      break label108;
    }
    m(M4.c.u.toString(), B, A);
    p(N4.d.q);
    break label105;
    label93:
    o.put(paramActivity, Boolean.TRUE);
    label105:
    return;
    label108:
    throw paramActivity;
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity)
  {
    try
    {
      if ((!g()) || (!x.L())) {
        break label91;
      }
      if (!p.containsKey(paramActivity)) {
        n(paramActivity);
      }
    }
    finally
    {
      break label94;
    }
    ((d)p.get(paramActivity)).c();
    Trace localTrace = new com/google/firebase/perf/metrics/Trace;
    localTrace.<init>(c(paramActivity), w, y, this);
    localTrace.start();
    r.put(paramActivity, localTrace);
    label91:
    return;
    label94:
    throw paramActivity;
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    try
    {
      if (g()) {
        l(paramActivity);
      }
    }
    finally
    {
      break label90;
    }
    if (o.containsKey(paramActivity))
    {
      o.remove(paramActivity);
      if (o.isEmpty())
      {
        B = y.a();
        m(M4.c.t.toString(), A, B);
        p(N4.d.r);
      }
    }
    return;
    label90:
    throw paramActivity;
  }
  
  public final void p(N4.d arg1)
  {
    C = ???;
    synchronized (t)
    {
      Iterator localIterator = t.iterator();
      if (localIterator.hasNext())
      {
        b localb = (b)((WeakReference)localIterator.next()).get();
        if (localb != null) {
          localb.b(C);
        }
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a();
  }
  
  public static abstract interface b
  {
    public abstract void b(N4.d paramd);
  }
}

/* Location:
 * Qualified Name:     B4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */