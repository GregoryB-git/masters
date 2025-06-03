package com.google.firebase.perf.metrics;

import G4.b;
import G4.f;
import L4.k;
import M4.l;
import N4.m;
import N4.m.b;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnDrawListener;
import androidx.annotation.Keep;
import androidx.lifecycle.d.b;
import androidx.lifecycle.g;
import androidx.lifecycle.o;
import com.google.firebase.perf.session.SessionManager;
import com.google.protobuf.r.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AppStartTrace
  implements Application.ActivityLifecycleCallbacks, g
{
  public static final l M = new M4.a().a();
  public static final long N = TimeUnit.MINUTES.toMicros(1L);
  public static volatile AppStartTrace O;
  public static ExecutorService P;
  public l A;
  public l B;
  public l C;
  public l D;
  public l E;
  public l F;
  public l G;
  public J4.a H;
  public boolean I;
  public int J;
  public final b K;
  public boolean L;
  public boolean o = false;
  public final k p;
  public final M4.a q;
  public final C4.a r;
  public final m.b s;
  public Context t;
  public WeakReference u;
  public WeakReference v;
  public boolean w = false;
  public final l x;
  public final l y;
  public l z;
  
  public AppStartTrace(k paramk, M4.a parama, C4.a parama1, ExecutorService paramExecutorService)
  {
    Object localObject = null;
    z = null;
    A = null;
    B = null;
    C = null;
    D = null;
    E = null;
    F = null;
    G = null;
    I = false;
    J = 0;
    K = new b(null);
    L = false;
    p = paramk;
    q = parama;
    r = parama1;
    P = paramExecutorService;
    s = m.z0().N("_experiment_app_start_ttid");
    if (Build.VERSION.SDK_INT >= 24) {
      paramk = l.f(G4.a.a());
    } else {
      paramk = null;
    }
    x = paramk;
    parama = (s3.n)s3.e.o().k(s3.n.class);
    paramk = (k)localObject;
    if (parama != null) {
      paramk = l.f(parama.b());
    }
    y = paramk;
  }
  
  public static AppStartTrace k()
  {
    AppStartTrace localAppStartTrace;
    if (O != null) {
      localAppStartTrace = O;
    } else {
      localAppStartTrace = l(k.l(), new M4.a());
    }
    return localAppStartTrace;
  }
  
  public static AppStartTrace l(k paramk, M4.a parama)
  {
    if (O == null)
    {
      try
      {
        if (O == null)
        {
          AppStartTrace localAppStartTrace = new com/google/firebase/perf/metrics/AppStartTrace;
          C4.a locala = C4.a.g();
          ThreadPoolExecutor localThreadPoolExecutor = new java/util/concurrent/ThreadPoolExecutor;
          long l = N;
          TimeUnit localTimeUnit = TimeUnit.SECONDS;
          LinkedBlockingQueue localLinkedBlockingQueue = new java/util/concurrent/LinkedBlockingQueue;
          localLinkedBlockingQueue.<init>();
          localThreadPoolExecutor.<init>(0, 1, l + 10L, localTimeUnit, localLinkedBlockingQueue);
          localAppStartTrace.<init>(paramk, parama, locala, localThreadPoolExecutor);
          O = localAppStartTrace;
        }
      }
      finally
      {
        break label91;
      }
      break label96;
      label91:
      throw paramk;
    }
    label96:
    return O;
  }
  
  public static boolean n(Context paramContext)
  {
    Object localObject1 = (ActivityManager)paramContext.getSystemService("activity");
    if (localObject1 == null) {
      return true;
    }
    localObject1 = ((ActivityManager)localObject1).getRunningAppProcesses();
    if (localObject1 != null)
    {
      paramContext = paramContext.getPackageName();
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append(paramContext);
      ((StringBuilder)localObject2).append(":");
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject1).next();
        if ((importance == 100) && ((processName.equals(paramContext)) || (processName.startsWith((String)localObject2)))) {
          return true;
        }
      }
    }
    return false;
  }
  
  @Keep
  public static void setLauncherActivityOnCreateTime(String paramString) {}
  
  @Keep
  public static void setLauncherActivityOnResumeTime(String paramString) {}
  
  @Keep
  public static void setLauncherActivityOnStartTime(String paramString) {}
  
  public final l j()
  {
    l locall = y;
    if (locall != null) {
      return locall;
    }
    return M;
  }
  
  public final l m()
  {
    l locall = x;
    if (locall != null) {
      return locall;
    }
    return j();
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    try
    {
      if ((I) || (z != null)) {
        break label106;
      }
      if ((!L) && (!n(t))) {
        bool = false;
      }
    }
    finally
    {
      break label109;
    }
    boolean bool = true;
    L = bool;
    paramBundle = new java/lang/ref/WeakReference;
    paramBundle.<init>(paramActivity);
    u = paramBundle;
    z = q.a();
    if (m().d(z) > N) {
      w = true;
    }
    return;
    label106:
    return;
    label109:
    throw paramActivity;
  }
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity)
  {
    if ((!I) && (!w) && (r.h())) {
      paramActivity.findViewById(16908290).getViewTreeObserver().removeOnDrawListener(K);
    }
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    boolean bool;
    try
    {
      if ((I) || (w)) {
        break label256;
      }
      bool = r.h();
      if (bool)
      {
        localObject1 = paramActivity.findViewById(16908290);
        ((View)localObject1).getViewTreeObserver().addOnDrawListener(K);
        localObject2 = new G4/b;
        ((b)localObject2).<init>(this);
        M4.e.e((View)localObject1, (Runnable)localObject2);
        localObject2 = new G4/c;
        ((G4.c)localObject2).<init>(this);
        G4.d locald = new G4/d;
        locald.<init>(this);
        M4.h.a((View)localObject1, (Runnable)localObject2, locald);
      }
    }
    finally
    {
      break label259;
    }
    Object localObject1 = B;
    if (localObject1 != null) {
      return;
    }
    localObject1 = new java/lang/ref/WeakReference;
    ((WeakReference)localObject1).<init>(paramActivity);
    v = ((WeakReference)localObject1);
    B = q.a();
    H = SessionManager.getInstance().perfSession();
    Object localObject2 = F4.a.e();
    localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append("onResume(): ");
    ((StringBuilder)localObject1).append(paramActivity.getClass().getName());
    ((StringBuilder)localObject1).append(": ");
    ((StringBuilder)localObject1).append(j().d(B));
    ((StringBuilder)localObject1).append(" microseconds");
    ((F4.a)localObject2).a(((StringBuilder)localObject1).toString());
    localObject1 = P;
    paramActivity = new G4/e;
    paramActivity.<init>(this);
    ((Executor)localObject1).execute(paramActivity);
    if (!bool) {
      v();
    }
    return;
    label256:
    return;
    label259:
    throw paramActivity;
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity)
  {
    label47:
    try
    {
      if ((!I) && (A == null) && (!w))
      {
        A = q.a();
        return;
      }
    }
    finally
    {
      break label47;
      return;
    }
  }
  
  public void onActivityStopped(Activity paramActivity) {}
  
  @androidx.lifecycle.n(d.b.ON_STOP)
  @Keep
  public void onAppEnteredBackground()
  {
    if ((!I) && (!w) && (D == null))
    {
      D = q.a();
      s.G((m)m.z0().N("_experiment_firstBackgrounding").L(m().e()).M(m().d(D)).v());
    }
  }
  
  @androidx.lifecycle.n(d.b.ON_START)
  @Keep
  public void onAppEnteredForeground()
  {
    if ((!I) && (!w) && (C == null))
    {
      C = q.a();
      s.G((m)m.z0().N("_experiment_firstForegrounding").L(m().e()).M(m().d(C)).v());
    }
  }
  
  public final void p()
  {
    m.b localb1 = m.z0().N(M4.c.p.toString()).L(j().e()).M(j().d(B));
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add((m)m.z0().N(M4.c.q.toString()).L(j().e()).M(j().d(z)).v());
    if (A != null)
    {
      m.b localb2 = m.z0();
      localb2.N(M4.c.r.toString()).L(z.e()).M(z.d(A));
      localArrayList.add((m)localb2.v());
      localb2 = m.z0();
      localb2.N(M4.c.s.toString()).L(A.e()).M(A.d(B));
      localArrayList.add((m)localb2.v());
    }
    localb1.E(localArrayList).F(H.a());
    p.D((m)localb1.v(), N4.d.s);
  }
  
  public final void q(m.b paramb)
  {
    if ((E != null) && (F != null) && (G != null))
    {
      P.execute(new f(this, paramb));
      v();
    }
  }
  
  public final void r()
  {
    if (G != null) {
      return;
    }
    G = q.a();
    s.G((m)m.z0().N("_experiment_onDrawFoQ").L(m().e()).M(m().d(G)).v());
    if (x != null) {
      s.G((m)m.z0().N("_experiment_procStart_to_classLoad").L(m().e()).M(m().d(j())).v());
    }
    m.b localb = s;
    String str;
    if (L) {
      str = "true";
    } else {
      str = "false";
    }
    localb.K("systemDeterminedForeground", str);
    s.J("onDrawCount", J);
    s.F(H.a());
    q(s);
  }
  
  public final void s()
  {
    if (E != null) {
      return;
    }
    E = q.a();
    s.L(m().e()).M(m().d(E));
    q(s);
  }
  
  public final void t()
  {
    if (F != null) {
      return;
    }
    F = q.a();
    s.G((m)m.z0().N("_experiment_preDrawFoQ").L(m().e()).M(m().d(F)).v());
    q(s);
  }
  
  public void u(Context paramContext)
  {
    try
    {
      bool = o;
      if (bool) {
        return;
      }
      o.i().g().a(this);
      paramContext = paramContext.getApplicationContext();
      if (!(paramContext instanceof Application)) {
        break label89;
      }
      ((Application)paramContext).registerActivityLifecycleCallbacks(this);
      if ((!L) && (!n(paramContext))) {
        bool = false;
      }
    }
    finally
    {
      break label92;
    }
    boolean bool = true;
    L = bool;
    o = true;
    t = paramContext;
    label89:
    return;
    label92:
    throw paramContext;
  }
  
  public void v()
  {
    try
    {
      boolean bool = o;
      if (!bool) {
        return;
      }
      o.i().g().c(this);
      ((Application)t).unregisterActivityLifecycleCallbacks(this);
      o = false;
      return;
    }
    finally {}
  }
  
  public final class b
    implements ViewTreeObserver.OnDrawListener
  {
    public b() {}
    
    public void onDraw()
    {
      AppStartTrace.i(AppStartTrace.this);
    }
  }
  
  public static class c
    implements Runnable
  {
    public final AppStartTrace o;
    
    public c(AppStartTrace paramAppStartTrace)
    {
      o = paramAppStartTrace;
    }
    
    public void run()
    {
      if (AppStartTrace.g(o) == null) {
        AppStartTrace.h(o, true);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.perf.metrics.AppStartTrace
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */