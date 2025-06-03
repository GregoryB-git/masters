package L4;

import N4.c.b;
import N4.i.b;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.firebase.perf.session.SessionManager;
import com.google.protobuf.r.a;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public class k
  implements B4.a.b
{
  public static final F4.a F = ;
  public static final k G = new k();
  public B4.a A;
  public c.b B;
  public String C;
  public String D;
  public boolean E = false;
  public final Map o;
  public final ConcurrentLinkedQueue p = new ConcurrentLinkedQueue();
  public final AtomicBoolean q = new AtomicBoolean(false);
  public s3.e r;
  public A4.e s;
  public s4.i t;
  public r4.b u;
  public b v;
  public ExecutorService w = new ThreadPoolExecutor(0, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue());
  public Context x;
  public C4.a y;
  public d z;
  
  public k()
  {
    ConcurrentHashMap localConcurrentHashMap = new ConcurrentHashMap();
    o = localConcurrentHashMap;
    Integer localInteger = Integer.valueOf(50);
    localConcurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", localInteger);
    localConcurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", localInteger);
    localConcurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", localInteger);
  }
  
  public static k l()
  {
    return G;
  }
  
  public static String m(N4.g paramg)
  {
    return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", new Object[] { Boolean.valueOf(paramg.g0()), Integer.valueOf(paramg.d0()), Integer.valueOf(paramg.c0()) });
  }
  
  public static String n(N4.h paramh)
  {
    long l;
    if (paramh.E0()) {
      l = paramh.v0();
    } else {
      l = 0L;
    }
    String str;
    if (paramh.A0()) {
      str = String.valueOf(paramh.o0());
    } else {
      str = "UNKNOWN";
    }
    return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", new Object[] { paramh.x0(), str, new DecimalFormat("#.####").format(l / 1000.0D) });
  }
  
  public static String o(N4.j paramj)
  {
    if (paramj.l()) {
      return p(paramj.n());
    }
    if (paramj.o()) {
      return n(paramj.p());
    }
    if (paramj.f()) {
      return m(paramj.g());
    }
    return "log";
  }
  
  public static String p(N4.m paramm)
  {
    long l = paramm.o0();
    return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", new Object[] { paramm.r0(), new DecimalFormat("#.####").format(l / 1000.0D) });
  }
  
  public static String q(Context paramContext)
  {
    str = "";
    try
    {
      paramContext = getPackageManagergetPackageInfogetPackageName0versionName;
      if (paramContext == null) {
        paramContext = str;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        paramContext = str;
      }
    }
    return paramContext;
  }
  
  public void B(N4.g paramg, N4.d paramd)
  {
    w.execute(new f(this, paramg, paramd));
  }
  
  public void C(N4.h paramh, N4.d paramd)
  {
    w.execute(new h(this, paramh, paramd));
  }
  
  public void D(N4.m paramm, N4.d paramd)
  {
    w.execute(new g(this, paramm, paramd));
  }
  
  public final N4.i E(i.b paramb, N4.d paramd)
  {
    H();
    c.b localb = B.H(paramd);
    if (!paramb.l())
    {
      paramd = localb;
      if (!paramb.o()) {}
    }
    else
    {
      paramd = ((c.b)localb.x()).E(k());
    }
    return (N4.i)paramb.D(paramd).v();
  }
  
  public final void F()
  {
    Context localContext = r.m();
    x = localContext;
    C = localContext.getPackageName();
    y = C4.a.g();
    z = new d(x, new M4.i(100L, 1L, TimeUnit.MINUTES), 500L);
    A = B4.a.b();
    v = new b(u, y.a());
    i();
  }
  
  public final void G(i.b paramb, N4.d paramd)
  {
    if (!v())
    {
      if (t(paramb))
      {
        F.b("Transport is not initialized yet, %s will be queued for to be dispatched later", new Object[] { o(paramb) });
        p.add(new c(paramb, paramd));
      }
      return;
    }
    paramb = E(paramb, paramd);
    if (u(paramb))
    {
      h(paramb);
      SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
    }
  }
  
  public final void H()
  {
    if (y.L())
    {
      if ((B.D()) && (!E)) {
        return;
      }
      try
      {
        String str = (String)V2.m.b(t.a(), 60000L, TimeUnit.MILLISECONDS);
      }
      catch (TimeoutException localTimeoutException) {}catch (InterruptedException localInterruptedException)
      {
        break label88;
      }
      catch (ExecutionException localExecutionException)
      {
        break label111;
      }
      F.d("Task to retrieve Installation Id is timed out: %s", new Object[] { localExecutionException.getMessage() });
      break label131;
      label88:
      F.d("Task to retrieve Installation Id is interrupted: %s", new Object[] { localExecutionException.getMessage() });
      break label131;
      label111:
      F.d("Unable to retrieve Installation Id: %s", new Object[] { localExecutionException.getMessage() });
      label131:
      CharSequence localCharSequence = null;
      if (!TextUtils.isEmpty(localCharSequence)) {
        B.G(localCharSequence);
      } else {
        F.j("Firebase Installation Id is empty, contact Firebase Support for debugging.");
      }
    }
  }
  
  public final void I()
  {
    if ((s == null) && (v())) {
      s = A4.e.c();
    }
  }
  
  public void b(N4.d paramd)
  {
    boolean bool;
    if (paramd == N4.d.q) {
      bool = true;
    } else {
      bool = false;
    }
    E = bool;
    if (v()) {
      w.execute(new e(this));
    }
  }
  
  public final void h(N4.i parami)
  {
    if (parami.l()) {
      F.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", new Object[] { o(parami), j(parami.n()) });
    } else {
      F.g("Logging %s", new Object[] { o(parami) });
    }
    v.b(parami);
  }
  
  public final void i()
  {
    A.j(new WeakReference(G));
    Object localObject = N4.c.h0();
    B = ((c.b)localObject);
    ((c.b)localObject).I(r.r().c()).F(N4.a.a0().D(C).E(A4.a.b).F(q(x)));
    q.set(true);
    while (!p.isEmpty())
    {
      localObject = (c)p.poll();
      if (localObject != null) {
        w.execute(new j(this, (c)localObject));
      }
    }
  }
  
  public final String j(N4.m paramm)
  {
    paramm = paramm.r0();
    if (paramm.startsWith("_st_")) {
      return F4.b.c(D, C, paramm);
    }
    return F4.b.a(D, C, paramm);
  }
  
  public final Map k()
  {
    I();
    Object localObject = s;
    if (localObject != null) {
      localObject = ((A4.e)localObject).b();
    } else {
      localObject = Collections.emptyMap();
    }
    return (Map)localObject;
  }
  
  public final void r(N4.i parami)
  {
    B4.a locala;
    if (parami.l()) {
      locala = A;
    }
    for (parami = M4.b.p;; parami = M4.b.q)
    {
      locala.d(parami.toString(), 1L);
      break;
      if (!parami.o()) {
        break;
      }
      locala = A;
    }
  }
  
  public void s(s3.e parame, s4.i parami, r4.b paramb)
  {
    r = parame;
    D = parame.r().g();
    t = parami;
    u = paramb;
    w.execute(new i(this));
  }
  
  public final boolean t(N4.j paramj)
  {
    Integer localInteger1 = (Integer)o.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
    int i = localInteger1.intValue();
    Integer localInteger2 = (Integer)o.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
    int j = localInteger2.intValue();
    Integer localInteger3 = (Integer)o.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
    int k = localInteger3.intValue();
    if ((paramj.l()) && (i > 0))
    {
      o.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(i - 1));
      return true;
    }
    if ((paramj.o()) && (j > 0))
    {
      o.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(j - 1));
      return true;
    }
    if ((paramj.f()) && (k > 0))
    {
      o.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(k - 1));
      return true;
    }
    F.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", new Object[] { o(paramj), localInteger1, localInteger2, localInteger3 });
    return false;
  }
  
  public final boolean u(N4.i parami)
  {
    if (!y.L())
    {
      F.g("Performance collection is not enabled, dropping %s", new Object[] { o(parami) });
      return false;
    }
    if (!parami.Y().d0())
    {
      F.k("App Instance ID is null or empty, dropping %s", new Object[] { o(parami) });
      return false;
    }
    if (!H4.e.b(parami, x))
    {
      F.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", new Object[] { o(parami) });
      return false;
    }
    if (!z.h(parami))
    {
      r(parami);
      F.g("Event dropped due to device sampling - %s", new Object[] { o(parami) });
      return false;
    }
    if (z.g(parami))
    {
      r(parami);
      F.g("Rate limited (per device) - %s", new Object[] { o(parami) });
      return false;
    }
    return true;
  }
  
  public boolean v()
  {
    return q.get();
  }
}

/* Location:
 * Qualified Name:     L4.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */