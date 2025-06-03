package G1;

import E1.k;
import O1.C;
import O1.C.a;
import O1.P;
import O1.n.b;
import O1.r;
import O1.v;
import V5.t;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import x1.N;
import y1.p;
import y1.p.a;

public final class f
{
  public static final f a = new f();
  public static final String b;
  public static final ScheduledExecutorService c = Executors.newSingleThreadScheduledExecutor();
  public static volatile ScheduledFuture d;
  public static final Object e = new Object();
  public static final AtomicInteger f = new AtomicInteger(0);
  public static volatile m g;
  public static final AtomicBoolean h = new AtomicBoolean(false);
  public static String i;
  public static long j;
  public static int k;
  public static WeakReference l;
  
  static
  {
    String str1 = f.class.getCanonicalName();
    String str2 = str1;
    if (str1 == null) {
      str2 = "com.facebook.appevents.internal.ActivityLifecycleTracker";
    }
    b = str2;
  }
  
  public static final Activity l()
  {
    WeakReference localWeakReference = l;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (localWeakReference != null) {
      if (localWeakReference == null) {
        localObject2 = localObject1;
      } else {
        localObject2 = (Activity)localWeakReference.get();
      }
    }
    return (Activity)localObject2;
  }
  
  public static final UUID m()
  {
    m localm = g;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (localm != null)
    {
      localObject2 = g;
      if (localObject2 == null) {
        localObject2 = localObject1;
      } else {
        localObject2 = ((m)localObject2).d();
      }
    }
    return (UUID)localObject2;
  }
  
  public static final boolean o()
  {
    boolean bool;
    if (k == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final void p(Activity paramActivity)
  {
    c.execute(new d());
  }
  
  public static final void q()
  {
    if (g == null) {
      g = m.g.b();
    }
  }
  
  public static final void t(long paramLong, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "$activityName");
    if (g == null) {
      g = new m(Long.valueOf(paramLong), null, null, 4, null);
    }
    ??? = g;
    if (??? != null) {
      ((m)???).k(Long.valueOf(paramLong));
    }
    if (f.get() <= 0)
    {
      Object localObject2 = new e(paramLong, paramString);
      synchronized (e)
      {
        d = c.schedule((Runnable)localObject2, a.n(), TimeUnit.SECONDS);
        localObject2 = t.a;
      }
    }
    long l1 = j;
    long l2 = 0L;
    if (l1 > 0L) {
      l2 = (paramLong - l1) / 'Ϩ';
    }
    i.e(paramString, l2);
    paramString = g;
    if (paramString != null) {
      paramString.m();
    }
  }
  
  public static final void u(long paramLong, String arg2)
  {
    Intrinsics.checkNotNullParameter(???, "$activityName");
    if (g == null) {
      g = new m(Long.valueOf(paramLong), null, null, 4, null);
    }
    Object localObject1;
    if (f.get() <= 0)
    {
      localObject1 = n.a;
      n.e(???, g, i);
      m.g.a();
      g = null;
    }
    synchronized (e)
    {
      d = null;
      localObject1 = t.a;
      return;
    }
  }
  
  public static final void v(Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    l = new WeakReference(paramActivity);
    f.incrementAndGet();
    a.k();
    long l1 = System.currentTimeMillis();
    j = l1;
    String str = P.t(paramActivity);
    B1.e.l(paramActivity);
    z1.b.d(paramActivity);
    K1.e.h(paramActivity);
    k.b();
    paramActivity = new b(l1, str, paramActivity.getApplicationContext());
    c.execute(paramActivity);
  }
  
  public static final void w(long paramLong, String paramString, Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramString, "$activityName");
    Object localObject = g;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((m)localObject).e();
    }
    if (g == null)
    {
      g = new m(Long.valueOf(paramLong), null, null, 4, null);
      localObject = n.a;
      localObject = i;
      Intrinsics.checkNotNullExpressionValue(paramContext, "appContext");
      n.c(paramString, null, (String)localObject, paramContext);
    }
    else if (localObject != null)
    {
      long l1 = paramLong - ((Long)localObject).longValue();
      if (l1 > a.n() * 1000)
      {
        localObject = n.a;
        n.e(paramString, g, i);
        localObject = i;
        Intrinsics.checkNotNullExpressionValue(paramContext, "appContext");
        n.c(paramString, null, (String)localObject, paramContext);
        g = new m(Long.valueOf(paramLong), null, null, 4, null);
      }
      else if (l1 > 1000L)
      {
        paramString = g;
        if (paramString != null) {
          paramString.h();
        }
      }
    }
    paramString = g;
    if (paramString != null) {
      paramString.k(Long.valueOf(paramLong));
    }
    paramString = g;
    if (paramString != null) {
      paramString.m();
    }
  }
  
  public static final void x(Application paramApplication, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramApplication, "application");
    if (!h.compareAndSet(false, true)) {
      return;
    }
    O1.n localn = O1.n.a;
    O1.n.a(n.b.t, new a());
    i = paramString;
    paramApplication.registerActivityLifecycleCallbacks(new a());
  }
  
  public static final void y(boolean paramBoolean)
  {
    if (paramBoolean) {
      B1.e.f();
    } else {
      B1.e.e();
    }
  }
  
  public final void k()
  {
    synchronized (e)
    {
      if (d != null)
      {
        ScheduledFuture localScheduledFuture = d;
        if (localScheduledFuture != null) {
          localScheduledFuture.cancel(false);
        }
      }
    }
    d = null;
    localt = t.a;
  }
  
  public final int n()
  {
    Object localObject = v.a;
    localObject = v.f(B.m());
    if (localObject == null) {
      return j.a();
    }
    return ((r)localObject).k();
  }
  
  public final void r(Activity paramActivity)
  {
    B1.e.j(paramActivity);
  }
  
  public final void s(Activity paramActivity)
  {
    Object localObject = f;
    if (((AtomicInteger)localObject).decrementAndGet() < 0)
    {
      ((AtomicInteger)localObject).set(0);
      Log.w(b, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
    }
    k();
    long l1 = System.currentTimeMillis();
    localObject = P.t(paramActivity);
    B1.e.k(paramActivity);
    paramActivity = new c(l1, (String)localObject);
    c.execute(paramActivity);
  }
  
  public static final class a
    implements Application.ActivityLifecycleCallbacks
  {
    public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      C.e.b(N.s, f.g(), "onActivityCreated");
      g.a();
      f.p(paramActivity);
    }
    
    public void onActivityDestroyed(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      C.e.b(N.s, f.g(), "onActivityDestroyed");
      f.h(f.a, paramActivity);
    }
    
    public void onActivityPaused(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      C.e.b(N.s, f.g(), "onActivityPaused");
      g.a();
      f.i(f.a, paramActivity);
    }
    
    public void onActivityResumed(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      C.e.b(N.s, f.g(), "onActivityResumed");
      g.a();
      f.v(paramActivity);
    }
    
    public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      Intrinsics.checkNotNullParameter(paramBundle, "outState");
      C.e.b(N.s, f.g(), "onActivitySaveInstanceState");
    }
    
    public void onActivityStarted(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      f.j(f.f() + 1);
      C.e.b(N.s, f.g(), "onActivityStarted");
    }
    
    public void onActivityStopped(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      C.e.b(N.s, f.g(), "onActivityStopped");
      p.b.i();
      f.j(f.f() - 1);
    }
  }
}

/* Location:
 * Qualified Name:     G1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */