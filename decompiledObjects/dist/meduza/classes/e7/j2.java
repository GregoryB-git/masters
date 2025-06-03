package e7;

import android.app.Application;
import android.content.Context;
import android.os.BaseBundle;
import android.os.SystemClock;
import android.text.TextUtils;
import b1.v;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.android.gms.internal.measurement.zzhx;
import d2.q;
import f;
import java.util.concurrent.atomic.AtomicInteger;
import l6.q0;
import m6.j;
import nc.g0;
import v6.b;
import x6.c;
import x6.d;

public final class j2
  implements c3
{
  public static volatile j2 R;
  public final String A;
  public w0 B;
  public w4 C;
  public z D;
  public t0 E;
  public o4 F;
  public boolean G;
  public Boolean H;
  public long I;
  public volatile Boolean J;
  public Boolean K;
  public Boolean L;
  public volatile boolean M;
  public int N;
  public int O;
  public AtomicInteger P;
  public final long Q;
  public final Context a;
  public final String b;
  public final String c;
  public final String d;
  public final boolean e;
  public final g0 f;
  public final h o;
  public final l1 p;
  public final a1 q;
  public final e2 r;
  public final q5 s;
  public final r6 t;
  public final x0 u;
  public final b.z v;
  public final s4 w;
  public final k3 x;
  public final a y;
  public final l4 z;
  
  public j2(i3 parami3)
  {
    int i = 0;
    G = false;
    P = new AtomicInteger(0);
    Object localObject1 = a;
    Object localObject2 = new g0();
    f = ((g0)localObject2);
    x6.b.c = (g0)localObject2;
    a = ((Context)localObject1);
    b = b;
    c = c;
    d = d;
    e = h;
    J = e;
    A = j;
    M = true;
    localObject2 = g;
    if (localObject2 != null)
    {
      localObject3 = zzg;
      if (localObject3 != null)
      {
        localObject3 = ((BaseBundle)localObject3).get("measurementEnabled");
        if ((localObject3 instanceof Boolean)) {
          K = ((Boolean)localObject3);
        }
        localObject2 = zzg.get("measurementDeactivated");
        if ((localObject2 instanceof Boolean)) {
          L = ((Boolean)localObject2);
        }
      }
    }
    zzhx.zzb((Context)localObject1);
    v = b.z.p;
    localObject2 = i;
    long l;
    if (localObject2 != null) {
      l = ((Long)localObject2).longValue();
    } else {
      l = System.currentTimeMillis();
    }
    Q = l;
    o = new h(this);
    localObject2 = new l1(this);
    ((d3)localObject2).n();
    p = ((l1)localObject2);
    localObject2 = new a1(this);
    ((d3)localObject2).n();
    q = ((a1)localObject2);
    localObject2 = new r6(this);
    ((d3)localObject2).n();
    t = ((r6)localObject2);
    u = new x0(new v(this, 0));
    y = new a(this);
    localObject2 = new s4(this);
    ((j0)localObject2).u();
    w = ((s4)localObject2);
    localObject2 = new k3(this);
    ((j0)localObject2).u();
    x = ((k3)localObject2);
    localObject2 = new q5(this);
    ((j0)localObject2).u();
    s = ((q5)localObject2);
    localObject2 = new l4(this);
    ((d3)localObject2).n();
    z = ((l4)localObject2);
    localObject2 = new e2(this);
    ((d3)localObject2).n();
    r = ((e2)localObject2);
    Object localObject3 = g;
    int j = i;
    if (localObject3 != null)
    {
      j = i;
      if (zzb != 0L) {
        j = 1;
      }
    }
    if ((((Context)localObject1).getApplicationContext() instanceof Application))
    {
      localObject1 = k();
      if ((((q)localObject1).zza().getApplicationContext() instanceof Application))
      {
        localObject3 = (Application)((q)localObject1).zza().getApplicationContext();
        if (d == null) {
          d = new i4((k3)localObject1);
        }
        if ((j ^ 0x1) != 0)
        {
          ((Application)localObject3).unregisterActivityLifecycleCallbacks(d);
          ((Application)localObject3).registerActivityLifecycleCallbacks(d);
          zzjw.b("Registered activity lifecycle callback");
        }
      }
    }
    else
    {
      zzjr.b("Application context is not an Application");
    }
    ((e2)localObject2).u(new q0(1, this, parami3));
  }
  
  public static j2 a(Context paramContext, zzdz paramzzdz, Long paramLong)
  {
    zzdz localzzdz = paramzzdz;
    if (paramzzdz != null) {
      if (zze != null)
      {
        localzzdz = paramzzdz;
        if (zzf != null) {}
      }
      else
      {
        localzzdz = new zzdz(zza, zzb, zzc, zzd, null, null, zzg, null);
      }
    }
    j.i(paramContext);
    j.i(paramContext.getApplicationContext());
    if (R == null)
    {
      try
      {
        if (R == null)
        {
          paramzzdz = new e7/i3;
          paramzzdz.<init>(paramContext, localzzdz, paramLong);
          paramContext = new e7/j2;
          paramContext.<init>(paramzzdz);
          R = paramContext;
        }
      }
      finally {}
    }
    else if (localzzdz != null)
    {
      paramContext = zzg;
      if ((paramContext != null) && (paramContext.containsKey("dataCollectionDefaultEnabled")))
      {
        j.i(R);
        RJ = Boolean.valueOf(zzg.getBoolean("dataCollectionDefaultEnabled"));
      }
    }
    j.i(R);
    return R;
  }
  
  public static void b(j0 paramj0)
  {
    if (paramj0 != null)
    {
      if (c) {
        return;
      }
      throw new IllegalStateException(f.j("Component not initialized: ", String.valueOf(paramj0.getClass())));
    }
    throw new IllegalStateException("Component not created");
  }
  
  public static void c(d3 paramd3)
  {
    if (paramd3 != null)
    {
      if (c) {
        return;
      }
      throw new IllegalStateException(f.j("Component not initialized: ", String.valueOf(paramd3.getClass())));
    }
    throw new IllegalStateException("Component not created");
  }
  
  public final boolean d()
  {
    return f() == 0;
  }
  
  public final boolean e()
  {
    if (G)
    {
      zzl().l();
      Object localObject = H;
      if ((localObject != null) && (I != 0L))
      {
        if (!((Boolean)localObject).booleanValue())
        {
          v.getClass();
          if (Math.abs(SystemClock.elapsedRealtime() - I) <= 1000L) {}
        }
      }
      else
      {
        v.getClass();
        I = SystemClock.elapsedRealtime();
        boolean bool1 = m().q0("android.permission.INTERNET");
        boolean bool2 = true;
        if ((bool1) && (m().q0("android.permission.ACCESS_NETWORK_STATE")) && ((d.a(a).c()) || (o.C()) || ((r6.R(a)) && (r6.c0(a))))) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        localObject = Boolean.valueOf(bool1);
        H = ((Boolean)localObject);
        if (((Boolean)localObject).booleanValue())
        {
          r6 localr6 = m();
          localObject = h().w();
          t0 localt0 = h();
          localt0.t();
          bool1 = bool2;
          if (!localr6.V((String)localObject, w))
          {
            localObject = h();
            ((j0)localObject).t();
            if (!TextUtils.isEmpty(w)) {
              bool1 = bool2;
            } else {
              bool1 = false;
            }
          }
          H = Boolean.valueOf(bool1);
        }
      }
      return H.booleanValue();
    }
    throw new IllegalStateException("AppMeasurement is not initialized");
  }
  
  public final int f()
  {
    zzl().l();
    if (o.B()) {
      return 1;
    }
    Boolean localBoolean = L;
    if ((localBoolean != null) && (localBoolean.booleanValue())) {
      return 2;
    }
    zzl().l();
    if (!M) {
      return 8;
    }
    localBoolean = j().z();
    if (localBoolean != null)
    {
      if (localBoolean.booleanValue()) {
        return 0;
      }
      return 3;
    }
    localBoolean = o.v("firebase_analytics_collection_enabled");
    if (localBoolean != null)
    {
      if (localBoolean.booleanValue()) {
        return 0;
      }
      return 4;
    }
    localBoolean = K;
    if (localBoolean != null)
    {
      if (localBoolean.booleanValue()) {
        return 0;
      }
      return 5;
    }
    if (J != null)
    {
      if (J.booleanValue()) {
        return 0;
      }
      return 7;
    }
    return 0;
  }
  
  public final z g()
  {
    c(D);
    return D;
  }
  
  public final t0 h()
  {
    b(E);
    return E;
  }
  
  public final x0 i()
  {
    return u;
  }
  
  public final l1 j()
  {
    l1 locall1 = p;
    if (locall1 != null) {
      return locall1;
    }
    throw new IllegalStateException("Component not created");
  }
  
  public final k3 k()
  {
    b(x);
    return x;
  }
  
  public final w4 l()
  {
    b(C);
    return C;
  }
  
  public final r6 m()
  {
    r6 localr6 = t;
    if (localr6 != null) {
      return localr6;
    }
    throw new IllegalStateException("Component not created");
  }
  
  public final Context zza()
  {
    return a;
  }
  
  public final b zzb()
  {
    return v;
  }
  
  public final g0 zzd()
  {
    return f;
  }
  
  public final a1 zzj()
  {
    c(q);
    return q;
  }
  
  public final e2 zzl()
  {
    c(r);
    return r;
  }
}

/* Location:
 * Qualified Name:     e7.j2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */