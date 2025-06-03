package R2;

import E2.e;
import E2.h;
import G2.c;
import G2.d;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.t6;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import x.a;

public class N2
  implements o3
{
  public static volatile N2 I;
  public volatile Boolean A;
  public Boolean B;
  public Boolean C;
  public volatile boolean D;
  public int E;
  public int F;
  public AtomicInteger G;
  public final long H;
  public final Context a;
  public final String b;
  public final String c;
  public final String d;
  public final boolean e;
  public final f f;
  public final g g;
  public final l2 h;
  public final Y1 i;
  public final G2 j;
  public final l5 k;
  public final S5 l;
  public final X1 m;
  public final e n;
  public final v4 o;
  public final C3 p;
  public final B q;
  public final q4 r;
  public final String s;
  public V1 t;
  public D4 u;
  public C v;
  public S1 w;
  public boolean x;
  public Boolean y;
  public long z;
  
  public N2(x3 paramx3)
  {
    int i1 = 0;
    x = false;
    G = new AtomicInteger(0);
    A2.n.i(paramx3);
    Object localObject1 = new f(a);
    f = ((f)localObject1);
    M1.a = (f)localObject1;
    localObject1 = a;
    a = ((Context)localObject1);
    b = b;
    c = c;
    d = d;
    e = h;
    A = e;
    s = j;
    D = true;
    Object localObject2 = g;
    if (localObject2 != null)
    {
      localObject3 = u;
      if (localObject3 != null)
      {
        localObject3 = ((BaseBundle)localObject3).get("measurementEnabled");
        if ((localObject3 instanceof Boolean)) {
          B = ((Boolean)localObject3);
        }
        localObject2 = u.get("measurementDeactivated");
        if ((localObject2 instanceof Boolean)) {
          C = ((Boolean)localObject2);
        }
      }
    }
    S2.l((Context)localObject1);
    localObject2 = h.d();
    n = ((e)localObject2);
    Object localObject3 = i;
    long l1;
    if (localObject3 != null) {
      l1 = ((Long)localObject3).longValue();
    } else {
      l1 = ((e)localObject2).a();
    }
    H = l1;
    g = new g(this);
    localObject2 = new l2(this);
    ((l3)localObject2).p();
    h = ((l2)localObject2);
    localObject2 = new Y1(this);
    ((l3)localObject2).p();
    i = ((Y1)localObject2);
    localObject2 = new S5(this);
    ((l3)localObject2).p();
    l = ((S5)localObject2);
    m = new X1(new w3(paramx3, this));
    q = new B(this);
    localObject2 = new v4(this);
    ((f1)localObject2).w();
    o = ((v4)localObject2);
    localObject2 = new C3(this);
    ((f1)localObject2).w();
    p = ((C3)localObject2);
    localObject2 = new l5(this);
    ((f1)localObject2).w();
    k = ((l5)localObject2);
    localObject2 = new q4(this);
    ((l3)localObject2).p();
    r = ((q4)localObject2);
    localObject3 = new G2(this);
    ((l3)localObject3).p();
    j = ((G2)localObject3);
    localObject2 = g;
    int i2 = i1;
    if (localObject2 != null)
    {
      i2 = i1;
      if (p != 0L) {
        i2 = 1;
      }
    }
    if ((((Context)localObject1).getApplicationContext() instanceof Application))
    {
      localObject1 = H();
      if (!(((m3)localObject1).a().getApplicationContext() instanceof Application)) {
        break label602;
      }
      localObject2 = (Application)((m3)localObject1).a().getApplicationContext();
      if (c == null) {
        c = new k4((C3)localObject1);
      }
      if ((i2 ^ 0x1) == 0) {
        break label602;
      }
      ((Application)localObject2).unregisterActivityLifecycleCallbacks(c);
      ((Application)localObject2).registerActivityLifecycleCallbacks(c);
      localObject2 = ((m3)localObject1).j().K();
      localObject1 = "Registered activity lifecycle callback";
    }
    else
    {
      localObject2 = j().L();
      localObject1 = "Application context is not an Application";
    }
    ((a2)localObject2).a((String)localObject1);
    label602:
    ((G2)localObject3).D(new O2(this, paramx3));
  }
  
  public static N2 c(Context paramContext, H0 paramH0, Long paramLong)
  {
    H0 localH0 = paramH0;
    if (paramH0 != null) {
      if (s != null)
      {
        localH0 = paramH0;
        if (t != null) {}
      }
      else
      {
        localH0 = new H0(o, p, q, r, null, null, u, null);
      }
    }
    A2.n.i(paramContext);
    A2.n.i(paramContext.getApplicationContext());
    if (I == null)
    {
      try
      {
        if (I == null)
        {
          paramH0 = new R2/x3;
          paramH0.<init>(paramContext, localH0, paramLong);
          paramContext = new R2/N2;
          paramContext.<init>(paramH0);
          I = paramContext;
        }
      }
      finally
      {
        break label118;
      }
      break label169;
      label118:
      throw paramContext;
    }
    else if (localH0 != null)
    {
      paramContext = u;
      if ((paramContext != null) && (paramContext.containsKey("dataCollectionDefaultEnabled")))
      {
        A2.n.i(I);
        I.m(u.getBoolean("dataCollectionDefaultEnabled"));
      }
    }
    label169:
    A2.n.i(I);
    return I;
  }
  
  public static void f(f1 paramf1)
  {
    if (paramf1 != null)
    {
      if (paramf1.z()) {
        return;
      }
      paramf1 = String.valueOf(paramf1.getClass());
      StringBuilder localStringBuilder = new StringBuilder("Component not initialized: ");
      localStringBuilder.append(paramf1);
      throw new IllegalStateException(localStringBuilder.toString());
    }
    throw new IllegalStateException("Component not created");
  }
  
  public static void h(l3 paraml3)
  {
    if (paraml3 != null)
    {
      if (paraml3.r()) {
        return;
      }
      paraml3 = String.valueOf(paraml3.getClass());
      StringBuilder localStringBuilder = new StringBuilder("Component not initialized: ");
      localStringBuilder.append(paraml3);
      throw new IllegalStateException(localStringBuilder.toString());
    }
    throw new IllegalStateException("Component not created");
  }
  
  public static void i(m3 paramm3)
  {
    if (paramm3 != null) {
      return;
    }
    throw new IllegalStateException("Component not created");
  }
  
  public final C A()
  {
    h(v);
    return v;
  }
  
  public final S1 B()
  {
    f(w);
    return w;
  }
  
  public final V1 C()
  {
    f(t);
    return t;
  }
  
  public final X1 D()
  {
    return m;
  }
  
  public final Y1 E()
  {
    Y1 localY1 = i;
    if ((localY1 != null) && (localY1.r())) {
      return i;
    }
    return null;
  }
  
  public final l2 F()
  {
    i(h);
    return h;
  }
  
  public final G2 G()
  {
    return j;
  }
  
  public final C3 H()
  {
    f(p);
    return p;
  }
  
  public final v4 I()
  {
    f(o);
    return o;
  }
  
  public final D4 J()
  {
    f(u);
    return u;
  }
  
  public final l5 K()
  {
    f(k);
    return k;
  }
  
  public final S5 L()
  {
    i(l);
    return l;
  }
  
  public final String M()
  {
    return b;
  }
  
  public final String N()
  {
    return c;
  }
  
  public final String O()
  {
    return d;
  }
  
  public final String P()
  {
    return s;
  }
  
  public final void Q()
  {
    throw new IllegalStateException("Unexpected call on client side");
  }
  
  public final void R()
  {
    G.incrementAndGet();
  }
  
  public final Context a()
  {
    return a;
  }
  
  public final e b()
  {
    return n;
  }
  
  public final f d()
  {
    return f;
  }
  
  public final G2 e()
  {
    h(j);
    return j;
  }
  
  public final Y1 j()
  {
    h(i);
    return i;
  }
  
  public final void k(H0 paramH0)
  {
    e().n();
    if ((g7.a()) && (g.s(K.M0)) && (L().V0()))
    {
      localObject1 = L();
      ((m3)localObject1).n();
      localObject2 = new IntentFilter();
      ((IntentFilter)localObject2).addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
      localObject3 = new X5(a);
      a.h(((m3)localObject1).a(), (BroadcastReceiver)localObject3, (IntentFilter)localObject2, 2);
      ((m3)localObject1).j().F().a("Registered app receiver");
    }
    Object localObject1 = F().J();
    int i1 = ((q3)localObject1).b();
    Object localObject3 = g.F("google_analytics_default_allow_ad_storage");
    Object localObject2 = g.F("google_analytics_default_allow_analytics_storage");
    if (((localObject3 != null) || (localObject2 != null)) && (F().x(-10)))
    {
      localObject3 = new q3((Boolean)localObject3, (Boolean)localObject2, -10);
    }
    else
    {
      if ((!TextUtils.isEmpty(B().G())) && ((i1 == 0) || (i1 == 30) || (i1 == 10) || (i1 == 30) || (i1 == 30) || (i1 == 40)))
      {
        H().H(new q3(null, null, -10), H);
      }
      else if ((TextUtils.isEmpty(B().G())) && (paramH0 != null) && (u != null) && (F().x(30)))
      {
        localObject3 = q3.d(u, 30);
        if (((q3)localObject3).z()) {
          break label312;
        }
      }
      localObject3 = null;
    }
    label312:
    if (localObject3 != null)
    {
      H().H((q3)localObject3, H);
      localObject1 = localObject3;
    }
    H().G((q3)localObject1);
    if ((n6.a()) && (g.s(K.S0)))
    {
      i1 = F().I().a();
      localObject1 = g.F("google_analytics_default_allow_ad_user_data");
      if ((localObject1 != null) && (q3.k(-10, i1))) {
        localObject3 = H();
      }
      for (paramH0 = new z((Boolean)localObject1, -10);; paramH0 = new z(null, -10))
      {
        ((C3)localObject3).F(paramH0);
        break label601;
        if ((TextUtils.isEmpty(B().G())) || ((i1 != 0) && (i1 != 30))) {
          break;
        }
        localObject3 = H();
      }
      if ((TextUtils.isEmpty(B().G())) && (paramH0 != null) && (u != null) && (q3.k(30, i1)))
      {
        localObject3 = z.b(u, 30);
        if (((z)localObject3).j()) {
          H().F((z)localObject3);
        }
      }
      if ((TextUtils.isEmpty(B().G())) && (paramH0 != null) && (u != null) && (Fm.a() == null))
      {
        localObject3 = z.d(u);
        if (localObject3 != null) {
          H().b0(s, "allow_personalized_ads", ((Boolean)localObject3).toString(), false);
        }
      }
    }
    label601:
    if (Fe.a() == 0L)
    {
      j().K().b("Persisting first open", Long.valueOf(H));
      Fe.b(H);
    }
    Hn.c();
    if (!s())
    {
      if (p())
      {
        if (!L().E0("android.permission.INTERNET")) {
          j().G().a("App is missing INTERNET permission");
        }
        if (!L().E0("android.permission.ACCESS_NETWORK_STATE")) {
          j().G().a("App is missing ACCESS_NETWORK_STATE permission");
        }
        if ((!d.a(a).f()) && (!g.S()))
        {
          if (!S5.c0(a)) {
            j().G().a("AppMeasurementReceiver not registered/enabled");
          }
          if (!S5.d0(a, false)) {
            j().G().a("AppMeasurementService not registered/enabled");
          }
        }
        j().G().a("Uploading is not possible. App measurement disabled");
      }
    }
    else
    {
      if ((!TextUtils.isEmpty(B().G())) || (!TextUtils.isEmpty(B().E())))
      {
        L();
        if (S5.l0(B().G(), F().P(), B().E(), F().O()))
        {
          j().J().a("Rechecking which service to use due to a GMP App Id change");
          F().Q();
          C().H();
          u.Z();
          u.Y();
          Fe.b(H);
          Fg.b(null);
        }
        F().G(B().G());
        F().D(B().E());
      }
      if (!F().J().l(q3.a.q)) {
        Fg.b(null);
      }
      H().T(Fg.a());
      if ((t6.a()) && (g.s(K.p0)) && (!L().W0()) && (!TextUtils.isEmpty(Fv.a())))
      {
        j().L().a("Remote config removed with active feature rollouts");
        Fv.b(null);
      }
      if ((!TextUtils.isEmpty(B().G())) || (!TextUtils.isEmpty(B().E())))
      {
        boolean bool = p();
        if ((!F().B()) && (!g.R())) {
          F().E(bool ^ true);
        }
        if (bool) {
          H().n0();
        }
        Ke.a();
        J().Q(new AtomicReference());
        J().K(Fy.a());
      }
    }
    if ((g7.a()) && (g.s(K.M0)) && (L().V0()))
    {
      paramH0 = H();
      paramH0.getClass();
      new Thread(new M2(paramH0)).start();
    }
    Fo.a(true);
  }
  
  public final void m(boolean paramBoolean)
  {
    A = Boolean.valueOf(paramBoolean);
  }
  
  public final void n()
  {
    E += 1;
  }
  
  public final boolean o()
  {
    return (A != null) && (A.booleanValue());
  }
  
  public final boolean p()
  {
    return x() == 0;
  }
  
  public final boolean q()
  {
    e().n();
    return D;
  }
  
  public final boolean r()
  {
    return TextUtils.isEmpty(b);
  }
  
  public final boolean s()
  {
    if (x)
    {
      e().n();
      Boolean localBoolean = y;
      if ((localBoolean == null) || (z == 0L) || ((localBoolean != null) && (!localBoolean.booleanValue()) && (Math.abs(n.b() - z) > 1000L)))
      {
        z = n.b();
        boolean bool1 = L().E0("android.permission.INTERNET");
        boolean bool2 = true;
        if ((bool1) && (L().E0("android.permission.ACCESS_NETWORK_STATE")) && ((d.a(a).f()) || (g.S()) || ((S5.c0(a)) && (S5.d0(a, false))))) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        localBoolean = Boolean.valueOf(bool1);
        y = localBoolean;
        if (localBoolean.booleanValue())
        {
          bool1 = bool2;
          if (!L().j0(B().G(), B().E())) {
            if (!TextUtils.isEmpty(B().E())) {
              bool1 = bool2;
            } else {
              bool1 = false;
            }
          }
          y = Boolean.valueOf(bool1);
        }
      }
      return y.booleanValue();
    }
    throw new IllegalStateException("AppMeasurement is not initialized");
  }
  
  public final boolean t()
  {
    return e;
  }
  
  public final boolean u()
  {
    e().n();
    h(v());
    Object localObject1 = B().F();
    Object localObject2 = F().u((String)localObject1);
    boolean bool1 = g.P();
    boolean bool2 = false;
    if ((bool1) && (!((Boolean)second).booleanValue()) && (!TextUtils.isEmpty((CharSequence)first)))
    {
      if (!v().w())
      {
        j().L().a("Network is not available for Deferred Deep Link request. Skipping");
        return false;
      }
      Object localObject3 = new StringBuilder();
      if ((n6.a()) && (g.s(K.U0)))
      {
        localObject4 = H();
        ((m3)localObject4).n();
        localObject4 = ((G1)localObject4).t().V();
        if (localObject4 != null) {
          localObject4 = o;
        } else {
          localObject4 = null;
        }
        int i1 = 1;
        if (localObject4 == null)
        {
          i2 = F;
          F = (i2 + 1);
          if (i2 < 10) {
            bool2 = true;
          }
          localObject1 = j().F();
          if (bool2) {
            localObject4 = "Retrying.";
          } else {
            localObject4 = "Skipping.";
          }
          localObject3 = new StringBuilder("Failed to retrieve DMA consent from the service, ");
          ((StringBuilder)localObject3).append((String)localObject4);
          ((StringBuilder)localObject3).append(" retryCount");
          ((a2)localObject1).b(((StringBuilder)localObject3).toString(), Integer.valueOf(F));
          return bool2;
        }
        Object localObject5 = q3.d((Bundle)localObject4, 100);
        ((StringBuilder)localObject3).append("&gcs=");
        ((StringBuilder)localObject3).append(((q3)localObject5).w());
        localObject5 = z.b((Bundle)localObject4, 100);
        ((StringBuilder)localObject3).append("&dma=");
        if (((z)localObject5).g() == Boolean.FALSE) {
          i2 = 0;
        } else {
          i2 = 1;
        }
        ((StringBuilder)localObject3).append(i2);
        if (!TextUtils.isEmpty(((z)localObject5).h()))
        {
          ((StringBuilder)localObject3).append("&dma_cps=");
          ((StringBuilder)localObject3).append(((z)localObject5).h());
        }
        int i2 = i1;
        if (z.d((Bundle)localObject4) == Boolean.TRUE) {
          i2 = 0;
        }
        ((StringBuilder)localObject3).append("&npa=");
        ((StringBuilder)localObject3).append(i2);
        j().K().b("Consent query parameters to Bow", localObject3);
      }
      Object localObject4 = L();
      B();
      localObject2 = ((S5)localObject4).J(82001L, (String)localObject1, (String)first, Fu.a() - 1L, ((StringBuilder)localObject3).toString());
      if (localObject2 != null)
      {
        localObject3 = v();
        localObject4 = new P2(this);
        ((m3)localObject3).n();
        ((l3)localObject3).o();
        A2.n.i(localObject2);
        A2.n.i(localObject4);
        ((m3)localObject3).e().z(new s4((q4)localObject3, (String)localObject1, (URL)localObject2, null, null, (p4)localObject4));
      }
      return false;
    }
    j().F().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    return false;
  }
  
  public final q4 v()
  {
    h(r);
    return r;
  }
  
  public final void w(boolean paramBoolean)
  {
    e().n();
    D = paramBoolean;
  }
  
  public final int x()
  {
    e().n();
    if (g.R()) {
      return 1;
    }
    Boolean localBoolean = C;
    if ((localBoolean != null) && (localBoolean.booleanValue())) {
      return 2;
    }
    if (!q()) {
      return 8;
    }
    localBoolean = F().M();
    if (localBoolean != null)
    {
      if (localBoolean.booleanValue()) {
        return 0;
      }
      return 3;
    }
    localBoolean = g.F("firebase_analytics_collection_enabled");
    if (localBoolean != null)
    {
      if (localBoolean.booleanValue()) {
        return 0;
      }
      return 4;
    }
    localBoolean = B;
    if (localBoolean != null)
    {
      if (localBoolean.booleanValue()) {
        return 0;
      }
      return 5;
    }
    if (A != null)
    {
      if (A.booleanValue()) {
        return 0;
      }
      return 7;
    }
    return 0;
  }
  
  public final B y()
  {
    B localB = q;
    if (localB != null) {
      return localB;
    }
    throw new IllegalStateException("Component not created");
  }
  
  public final g z()
  {
    return g;
  }
}

/* Location:
 * Qualified Name:     R2.N2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */