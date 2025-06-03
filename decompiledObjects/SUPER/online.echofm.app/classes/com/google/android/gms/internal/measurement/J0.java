package com.google.android.gms.internal.measurement;

import A2.n;
import E2.e;
import E2.h;
import Q2.a;
import R2.H2;
import R2.u3;
import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class J0
{
  public static volatile J0 j;
  public final String a;
  public final e b;
  public final ExecutorService c;
  public final a d;
  public final List e;
  public int f;
  public boolean g;
  public String h;
  public volatile x0 i;
  
  public J0(Context paramContext, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    if ((paramString1 != null) && (J(paramString2, paramString3))) {}
    for (;;)
    {
      a = paramString1;
      break;
      paramString1 = "FA";
    }
    b = h.d();
    c = l0.a().a(new U0(this), u0.a);
    d = new a(this);
    e = new ArrayList();
    boolean bool = E(paramContext);
    int k = 1;
    if ((bool) && (!S()))
    {
      h = null;
      g = true;
      Log.w(a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
      return;
    }
    if (!J(paramString2, paramString3))
    {
      h = "fa";
      if ((paramString2 != null) && (paramString3 != null))
      {
        Log.v(a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
      }
      else
      {
        int m;
        if (paramString2 == null) {
          m = 1;
        } else {
          m = 0;
        }
        if (paramString3 != null) {
          k = 0;
        }
        if ((m ^ k) != 0) {
          Log.w(a, "Specified origin or custom app id is null. Both parameters will be ignored.");
        }
      }
    }
    else
    {
      h = paramString2;
    }
    n(new M0(this, paramString2, paramString3, paramContext, paramBundle));
    paramContext = (Application)paramContext.getApplicationContext();
    if (paramContext == null)
    {
      Log.w(a, "Unable to register lifecycle notifications. Application null.");
      return;
    }
    paramContext.registerActivityLifecycleCallbacks(new c());
  }
  
  public static boolean E(Context paramContext)
  {
    try
    {
      String str = H2.a(paramContext);
      H2 localH2 = new R2/H2;
      localH2.<init>(paramContext, str);
      paramContext = localH2.b("google_app_id");
      if (paramContext != null) {
        return true;
      }
    }
    catch (IllegalStateException paramContext)
    {
      for (;;) {}
    }
    return false;
  }
  
  public static J0 e(Context paramContext)
  {
    return f(paramContext, null, null, null, null);
  }
  
  public static J0 f(Context paramContext, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    n.i(paramContext);
    if (j == null)
    {
      try
      {
        if (j == null)
        {
          J0 localJ0 = new com/google/android/gms/internal/measurement/J0;
          localJ0.<init>(paramContext, paramString1, paramString2, paramString3, paramBundle);
          j = localJ0;
        }
      }
      finally
      {
        break label54;
      }
      break label59;
      label54:
      throw paramContext;
    }
    label59:
    return j;
  }
  
  public final void B(String paramString)
  {
    n(new X0(this, paramString));
  }
  
  public final void C(String paramString1, String paramString2)
  {
    w(null, paramString1, paramString2, false);
  }
  
  public final void D(String paramString1, String paramString2, Bundle paramBundle)
  {
    v(paramString1, paramString2, paramBundle, true, true, null);
  }
  
  public final Long F()
  {
    v0 localv0 = new v0();
    n(new h1(this, localv0));
    return localv0.Z0(120000L);
  }
  
  public final void G(Bundle paramBundle)
  {
    n(new T0(this, paramBundle));
  }
  
  public final void H(String paramString)
  {
    n(new W0(this, paramString));
  }
  
  public final boolean J(String paramString1, String paramString2)
  {
    return (paramString2 != null) && (paramString1 != null) && (!S());
  }
  
  public final void K(Bundle paramBundle)
  {
    n(new l1(this, paramBundle));
  }
  
  public final void L(String paramString)
  {
    n(new Q0(this, paramString));
  }
  
  public final String M()
  {
    v0 localv0 = new v0();
    n(new i1(this, localv0));
    return localv0.a1(120000L);
  }
  
  public final String N()
  {
    v0 localv0 = new v0();
    n(new Y0(this, localv0));
    return localv0.a1(50L);
  }
  
  public final String O()
  {
    v0 localv0 = new v0();
    n(new e1(this, localv0));
    return localv0.a1(500L);
  }
  
  public final String P()
  {
    v0 localv0 = new v0();
    n(new a1(this, localv0));
    return localv0.a1(500L);
  }
  
  public final String Q()
  {
    v0 localv0 = new v0();
    n(new Z0(this, localv0));
    return localv0.a1(500L);
  }
  
  public final void R()
  {
    n(new S0(this));
  }
  
  public final boolean S()
  {
    boolean bool = false;
    try
    {
      Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
      bool = true;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      for (;;) {}
    }
    return bool;
  }
  
  public final int a(String paramString)
  {
    v0 localv0 = new v0();
    n(new g1(this, paramString, localv0));
    paramString = (Integer)v0.v(localv0.o(10000L), Integer.class);
    if (paramString == null) {
      return 25;
    }
    return paramString.intValue();
  }
  
  public final long b()
  {
    Object localObject = new v0();
    n(new b1(this, (v0)localObject));
    localObject = ((v0)localObject).Z0(500L);
    if (localObject == null)
    {
      long l = new Random(System.nanoTime() ^ b.a()).nextLong();
      int k = f + 1;
      f = k;
      return l + k;
    }
    return ((Long)localObject).longValue();
  }
  
  public final x0 c(Context paramContext, boolean paramBoolean)
  {
    try
    {
      paramContext = w0.asInterface(DynamiteModule.d(paramContext, DynamiteModule.e, "com.google.android.gms.measurement.dynamite").c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
      return paramContext;
    }
    catch (DynamiteModule.a paramContext)
    {
      s(paramContext, true, false);
    }
    return null;
  }
  
  public final List g(String paramString1, String paramString2)
  {
    v0 localv0 = new v0();
    n(new N0(this, paramString1, paramString2, localv0));
    paramString2 = (List)v0.v(localv0.o(5000L), List.class);
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = Collections.emptyList();
    }
    return paramString1;
  }
  
  public final Map h(String paramString1, String paramString2, boolean paramBoolean)
  {
    Object localObject = new v0();
    n(new c1(this, paramString1, paramString2, paramBoolean, (v0)localObject));
    paramString1 = ((v0)localObject).o(5000L);
    if ((paramString1 != null) && (paramString1.size() != 0))
    {
      HashMap localHashMap = new HashMap(paramString1.size());
      Iterator localIterator = paramString1.keySet().iterator();
      while (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        paramString2 = paramString1.get((String)localObject);
        if (((paramString2 instanceof Double)) || ((paramString2 instanceof Long)) || ((paramString2 instanceof String))) {
          localHashMap.put(localObject, paramString2);
        }
      }
      return localHashMap;
    }
    return Collections.emptyMap();
  }
  
  public final void i(int paramInt, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    n(new f1(this, false, 5, paramString, paramObject1, null, null));
  }
  
  public final void j(long paramLong)
  {
    n(new V0(this, paramLong));
  }
  
  public final void k(u3 paramu3)
  {
    n.i(paramu3);
    List localList1 = e;
    int k = 0;
    try
    {
      if (k < e.size()) {
        if (paramu3.equals(e.get(k)).first))
        {
          Log.w(a, "OnEventListener already registered.");
          return;
        }
      }
    }
    finally
    {
      for (;;)
      {
        break;
        k++;
        continue;
        b localb = new com/google/android/gms/internal/measurement/J0$b;
        localb.<init>(paramu3);
        List localList2 = e;
        Pair localPair = new android/util/Pair;
        localPair.<init>(paramu3, localb);
        localList2.add(localPair);
        if (i != null) {
          try
          {
            i.registerOnMeasurementEventListener(localb);
            return;
          }
          catch (RemoteException|BadParcelableException|IllegalArgumentException|IllegalStateException|NetworkOnMainThreadException|NullPointerException|SecurityException|UnsupportedOperationException paramu3)
          {
            Log.w(a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
          }
        }
        n(new k1(this, localb));
        return;
      }
    }
  }
  
  public final void l(Activity paramActivity, String paramString1, String paramString2)
  {
    n(new P0(this, paramActivity, paramString1, paramString2));
  }
  
  public final void m(Bundle paramBundle)
  {
    n(new L0(this, paramBundle));
  }
  
  public final void n(a parama)
  {
    c.execute(parama);
  }
  
  public final void r(Boolean paramBoolean)
  {
    n(new R0(this, paramBoolean));
  }
  
  public final void s(Exception paramException, boolean paramBoolean1, boolean paramBoolean2)
  {
    g |= paramBoolean1;
    if (paramBoolean1)
    {
      Log.w(a, "Data collection startup failed. No data will be collected.", paramException);
      return;
    }
    if (paramBoolean2) {
      i(5, "Error with data collection. Data lost.", paramException, null, null);
    }
    Log.w(a, "Error with data collection. Data lost.", paramException);
  }
  
  public final void t(String paramString, Bundle paramBundle)
  {
    v(null, paramString, paramBundle, false, true, null);
  }
  
  public final void u(String paramString1, String paramString2, Bundle paramBundle)
  {
    n(new O0(this, paramString1, paramString2, paramBundle));
  }
  
  public final void v(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, Long paramLong)
  {
    n(new m1(this, paramLong, paramString1, paramString2, paramBundle, paramBoolean1, paramBoolean2));
  }
  
  public final void w(String paramString1, String paramString2, Object paramObject, boolean paramBoolean)
  {
    n(new n1(this, paramString1, paramString2, paramObject, paramBoolean));
  }
  
  public final void x(boolean paramBoolean)
  {
    n(new j1(this, paramBoolean));
  }
  
  public final a z()
  {
    return d;
  }
  
  public abstract class a
    implements Runnable
  {
    public final long o = b.a();
    public final long p = b.b();
    public final boolean q;
    
    public a()
    {
      this(true);
    }
    
    public a(boolean paramBoolean)
    {
      q = paramBoolean;
    }
    
    public abstract void a();
    
    public void b() {}
    
    public void run()
    {
      if (J0.I(J0.this))
      {
        b();
        return;
      }
      try
      {
        a();
        return;
      }
      catch (Exception localException)
      {
        J0.q(J0.this, localException, false, q);
        b();
      }
    }
  }
  
  public static final class b
    extends C0
  {
    public final u3 b;
    
    public b(u3 paramu3)
    {
      b = paramu3;
    }
    
    public final void L(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
    {
      b.a(paramString1, paramString2, paramBundle, paramLong);
    }
    
    public final int a()
    {
      return System.identityHashCode(b);
    }
  }
  
  public final class c
    implements Application.ActivityLifecycleCallbacks
  {
    public c() {}
    
    public final void onActivityCreated(Activity paramActivity, Bundle paramBundle)
    {
      J0.p(J0.this, new o1(this, paramBundle, paramActivity));
    }
    
    public final void onActivityDestroyed(Activity paramActivity)
    {
      J0.p(J0.this, new t1(this, paramActivity));
    }
    
    public final void onActivityPaused(Activity paramActivity)
    {
      J0.p(J0.this, new s1(this, paramActivity));
    }
    
    public final void onActivityResumed(Activity paramActivity)
    {
      J0.p(J0.this, new p1(this, paramActivity));
    }
    
    public final void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
    {
      v0 localv0 = new v0();
      J0.p(J0.this, new u1(this, paramActivity, localv0));
      paramActivity = localv0.o(50L);
      if (paramActivity != null) {
        paramBundle.putAll(paramActivity);
      }
    }
    
    public final void onActivityStarted(Activity paramActivity)
    {
      J0.p(J0.this, new q1(this, paramActivity));
    }
    
    public final void onActivityStopped(Activity paramActivity)
    {
      J0.p(J0.this, new r1(this, paramActivity));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.J0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */