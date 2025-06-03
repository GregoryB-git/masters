package R2;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import b3.c;
import com.google.android.gms.internal.measurement.G6;
import com.google.android.gms.internal.measurement.H6;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.s7;
import com.google.android.gms.internal.measurement.t6;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class C3
  extends f1
{
  public k4 c;
  public v3 d;
  public final Set e = new CopyOnWriteArraySet();
  public boolean f;
  public final AtomicReference g = new AtomicReference();
  public final Object h = new Object();
  public boolean i = false;
  public PriorityQueue j;
  public q3 k = q3.c;
  public final AtomicLong l = new AtomicLong(0L);
  public long m = -1L;
  public final c6 n;
  public boolean o = true;
  public x p;
  public final U5 q = new c4(this);
  
  public C3(N2 paramN2)
  {
    super(paramN2);
    n = new c6(paramN2);
  }
  
  public final boolean A()
  {
    return false;
  }
  
  public final ArrayList C(String paramString1, String paramString2)
  {
    if (e().J())
    {
      j().G().a("Cannot get conditional user properties from analytics worker thread");
      return new ArrayList(0);
    }
    if (f.a())
    {
      j().G().a("Cannot get conditional user properties from main thread");
      return new ArrayList(0);
    }
    AtomicReference localAtomicReference = new AtomicReference();
    a.e().v(localAtomicReference, 5000L, "get conditional user properties", new b4(this, localAtomicReference, null, paramString1, paramString2));
    paramString1 = (List)localAtomicReference.get();
    if (paramString1 == null)
    {
      j().G().b("Timed out waiting for get conditional user properties", null);
      return new ArrayList();
    }
    return S5.t0(paramString1);
  }
  
  public final Map D(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (e().J())
    {
      paramString1 = j().G();
      paramString2 = "Cannot get user properties from analytics worker thread";
      paramString1.a(paramString2);
    }
    for (;;)
    {
      return Collections.emptyMap();
      if (f.a())
      {
        paramString1 = j().G();
        paramString2 = "Cannot get user properties from main thread";
        break;
      }
      localObject = new AtomicReference();
      a.e().v((AtomicReference)localObject, 5000L, "get user properties", new a4(this, (AtomicReference)localObject, null, paramString1, paramString2, paramBoolean));
      paramString2 = (List)((AtomicReference)localObject).get();
      if (paramString2 != null) {
        break label127;
      }
      j().G().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(paramBoolean));
    }
    label127:
    paramString1 = new t.a(paramString2.size());
    Object localObject = paramString2.iterator();
    while (((Iterator)localObject).hasNext())
    {
      R5 localR5 = (R5)((Iterator)localObject).next();
      paramString2 = localR5.a();
      if (paramString2 != null) {
        paramString1.put(p, paramString2);
      }
    }
    return paramString1;
  }
  
  public final void E(long paramLong, boolean paramBoolean)
  {
    n();
    v();
    j().F().a("Resetting analytics data (FE)");
    Object localObject = u();
    ((m3)localObject).n();
    f.b();
    if ((s7.a()) && (f().s(K.x0))) {
      p().I();
    }
    boolean bool = a.p();
    localObject = i();
    e.b(paramLong);
    if (!TextUtils.isEmpty(iv.a())) {
      v.b(null);
    }
    if ((G6.a()) && (((m3)localObject).f().s(K.q0))) {
      p.b(0L);
    }
    q.b(0L);
    if (!((m3)localObject).f().R()) {
      ((l2)localObject).E(bool ^ true);
    }
    w.b(null);
    x.b(0L);
    y.b(null);
    if (paramBoolean) {
      t().a0();
    }
    if ((G6.a()) && (f().s(K.q0))) {
      ue.a();
    }
    o = (bool ^ true);
  }
  
  public final void F(z paramz)
  {
    e().D(new j4(this, paramz));
  }
  
  public final void G(q3 paramq3)
  {
    n();
    boolean bool;
    if (((paramq3.y()) && (paramq3.x())) || (t().e0())) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool != a.q())
    {
      a.w(bool);
      paramq3 = i().L();
      if ((!bool) || (paramq3 == null) || (paramq3.booleanValue())) {
        S(Boolean.valueOf(bool), false);
      }
    }
  }
  
  public final void H(q3 paramq3, long paramLong)
  {
    v();
    int i1 = paramq3.b();
    if ((i1 != -10) && (paramq3.s() == null) && (paramq3.u() == null))
    {
      j().M().a("Discarding empty consent settings");
      return;
    }
    q3 localq3;
    synchronized (h)
    {
      localq3 = k;
      bool1 = q3.k(i1, localq3.b());
      i2 = 0;
      boolean bool2 = false;
      if (!bool1) {
        break label148;
      }
      bool3 = paramq3.t(k);
      bool1 = bool2;
      if (paramq3.y())
      {
        bool1 = bool2;
        if (!k.y()) {
          bool1 = true;
        }
      }
    }
    paramq3 = paramq3.o(k);
    k = paramq3;
    int i2 = 1;
    break label155;
    label148:
    boolean bool1 = false;
    boolean bool3 = bool1;
    label155:
    if (i2 == 0)
    {
      j().J().b("Ignoring lower-priority consent settings, proposed settings", paramq3);
      return;
    }
    long l1 = l.getAndIncrement();
    if (bool3)
    {
      T(null);
      e().G(new i4(this, paramq3, paramLong, l1, bool1, localq3));
      return;
    }
    paramq3 = new l4(this, paramq3, l1, bool1, localq3);
    if ((i1 != 30) && (i1 != -10))
    {
      e().D(paramq3);
      return;
    }
    e().G(paramq3);
  }
  
  public final void I(u3 paramu3)
  {
    v();
    A2.n.i(paramu3);
    if (!e.add(paramu3)) {
      j().L().a("OnEventListener already registered");
    }
  }
  
  public final void J(v3 paramv3)
  {
    n();
    v();
    if (paramv3 != null)
    {
      v3 localv3 = d;
      if (paramv3 != localv3)
      {
        boolean bool;
        if (localv3 == null) {
          bool = true;
        } else {
          bool = false;
        }
        A2.n.m(bool, "EventInterceptor already set.");
      }
    }
    d = paramv3;
  }
  
  public final void P(Bundle paramBundle, int paramInt, long paramLong)
  {
    v();
    Object localObject = q3.i(paramBundle);
    if (localObject != null)
    {
      j().M().b("Ignoring invalid consent setting", localObject);
      j().M().a("Valid consent values are 'granted', 'denied'");
    }
    localObject = q3.d(paramBundle, paramInt);
    if ((n6.a()) && (f().s(K.S0)))
    {
      if (((q3)localObject).z()) {
        H((q3)localObject, paramLong);
      }
      localObject = z.b(paramBundle, paramInt);
      if (((z)localObject).j()) {
        F((z)localObject);
      }
      paramBundle = z.d(paramBundle);
      if (paramBundle != null) {
        b0("app", "allow_personalized_ads", paramBundle.toString(), false);
      }
      return;
    }
    H((q3)localObject, paramLong);
  }
  
  public final void Q(Bundle paramBundle, long paramLong)
  {
    A2.n.i(paramBundle);
    Bundle localBundle = new Bundle(paramBundle);
    if (!TextUtils.isEmpty(localBundle.getString("app_id"))) {
      j().L().a("Package name should be null when calling setConditionalUserProperty");
    }
    localBundle.remove("app_id");
    A2.n.i(localBundle);
    n3.a(localBundle, "app_id", String.class, null);
    n3.a(localBundle, "origin", String.class, null);
    n3.a(localBundle, "name", String.class, null);
    n3.a(localBundle, "value", Object.class, null);
    n3.a(localBundle, "trigger_event_name", String.class, null);
    n3.a(localBundle, "trigger_timeout", Long.class, Long.valueOf(0L));
    n3.a(localBundle, "timed_out_event_name", String.class, null);
    n3.a(localBundle, "timed_out_event_params", Bundle.class, null);
    n3.a(localBundle, "triggered_event_name", String.class, null);
    n3.a(localBundle, "triggered_event_params", Bundle.class, null);
    n3.a(localBundle, "time_to_live", Long.class, Long.valueOf(0L));
    n3.a(localBundle, "expired_event_name", String.class, null);
    n3.a(localBundle, "expired_event_params", Bundle.class, null);
    A2.n.e(localBundle.getString("name"));
    A2.n.e(localBundle.getString("origin"));
    A2.n.i(localBundle.get("value"));
    localBundle.putLong("creation_timestamp", paramLong);
    String str = localBundle.getString("name");
    paramBundle = localBundle.get("value");
    if (k().q0(str) != 0)
    {
      j().G().b("Invalid conditional user property name", h().g(str));
      return;
    }
    if (k().w(str, paramBundle) != 0)
    {
      j().G().c("Invalid conditional user property value", h().g(str), paramBundle);
      return;
    }
    Object localObject = k().A0(str, paramBundle);
    if (localObject == null)
    {
      j().G().c("Unable to normalize conditional user property value", h().g(str), paramBundle);
      return;
    }
    n3.b(localBundle, localObject);
    paramLong = localBundle.getLong("trigger_timeout");
    if ((!TextUtils.isEmpty(localBundle.getString("trigger_event_name"))) && ((paramLong > 15552000000L) || (paramLong < 1L)))
    {
      j().G().c("Invalid conditional user property timeout", h().g(str), Long.valueOf(paramLong));
      return;
    }
    paramLong = localBundle.getLong("time_to_live");
    if ((paramLong <= 15552000000L) && (paramLong >= 1L))
    {
      e().D(new Z3(this, localBundle));
      return;
    }
    j().G().c("Invalid conditional user property time to live", h().g(str), Long.valueOf(paramLong));
  }
  
  public final void R(Boolean paramBoolean)
  {
    v();
    e().D(new g4(this, paramBoolean));
  }
  
  public final void S(Boolean paramBoolean, boolean paramBoolean1)
  {
    n();
    v();
    j().F().b("Setting app measurement enabled (FE)", paramBoolean);
    i().v(paramBoolean);
    if (paramBoolean1) {
      i().C(paramBoolean);
    }
    if ((a.q()) || ((paramBoolean != null) && (!paramBoolean.booleanValue()))) {
      t0();
    }
  }
  
  public final void T(String paramString)
  {
    g.set(paramString);
  }
  
  public final void U(String paramString1, String paramString2, long paramLong, Bundle paramBundle)
  {
    n();
    if ((d != null) && (!S5.H0(paramString2))) {}
    for (boolean bool = false;; bool = true) {
      break;
    }
    V(paramString1, paramString2, paramLong, paramBundle, true, bool, true, null);
  }
  
  public final void V(String paramString1, String paramString2, long paramLong, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString3)
  {
    A2.n.e(paramString1);
    A2.n.i(paramBundle);
    n();
    v();
    if (!a.p())
    {
      j().F().a("Event not sent since app measurement is disabled");
      return;
    }
    Object localObject1 = p().H();
    if ((localObject1 != null) && (!((List)localObject1).contains(paramString2)))
    {
      j().F().c("Dropping non-safelisted event. event name, origin", paramString2, paramString1);
      return;
    }
    boolean bool1 = f;
    int i1 = 0;
    int i2 = 0;
    if (!bool1)
    {
      f = true;
      try
      {
        bool1 = a.t();
        if (!bool1) {
          localObject1 = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, a().getClassLoader());
        } else {
          localObject1 = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
        }
        try
        {
          ((Class)localObject1).getDeclaredMethod("initialize", new Class[] { Context.class }).invoke(null, new Object[] { a() });
        }
        catch (Exception localException)
        {
          j().L().b("Failed to invoke Tag Manager's initialize() method", localException);
        }
        if (!"_cmp".equals(paramString2)) {
          break label324;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        j().J().a("Tag Manager is not found and thus will not be used");
      }
    }
    if (paramBundle.containsKey("gclid")) {
      a0("auto", "_lgclid", paramBundle.getString("gclid"), b().a());
    }
    if ((H6.a()) && (f().s(K.Z0)) && (paramBundle.containsKey("gbraid"))) {
      a0("auto", "_gbraid", paramBundle.getString("gbraid"), b().a());
    }
    label324:
    if ((paramBoolean1) && (S5.L0(paramString2))) {
      k().Q(paramBundle, iy.a());
    }
    if ((!paramBoolean3) && (!"_iap".equals(paramString2)))
    {
      localObject2 = a.L();
      bool1 = ((S5)localObject2).C0("event", paramString2);
      i3 = 2;
      if (bool1) {
        if (!((S5)localObject2).o0("event", r3.a, r3.b, paramString2)) {
          i3 = 13;
        } else if (((S5)localObject2).i0("event", 40, paramString2)) {
          i3 = 0;
        }
      }
      if (i3 != 0)
      {
        j().H().b("Invalid public event name. Event will not be logged (FE)", h().c(paramString2));
        a.L();
        paramString1 = S5.I(paramString2, 40, true);
        i1 = i2;
        if (paramString2 != null) {
          i1 = paramString2.length();
        }
        a.L();
        S5.M(q, i3, "_ev", paramString1, i1);
        return;
      }
    }
    Object localObject2 = s().C(false);
    if ((localObject2 != null) && (!paramBundle.containsKey("_sc"))) {
      d = true;
    }
    if ((paramBoolean1) && (!paramBoolean3)) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    S5.L((w4)localObject2, paramBundle, bool1);
    bool1 = "am".equals(paramString1);
    boolean bool2 = S5.H0(paramString2);
    if ((paramBoolean1) && (d != null) && (!bool2) && (!bool1))
    {
      j().F().c("Passing event to registered event handler (FE)", h().c(paramString2), h().b(paramBundle));
      A2.n.i(d);
      d.a(paramString1, paramString2, paramBundle, paramLong);
      return;
    }
    if (!a.s()) {
      return;
    }
    i2 = k().v(paramString2);
    if (i2 != 0)
    {
      j().H().b("Invalid event name. Event will not be logged (FE)", h().c(paramString2));
      k();
      paramString1 = S5.I(paramString2, 40, true);
      i3 = i1;
      if (paramString2 != null) {
        i3 = paramString2.length();
      }
      a.L();
      S5.N(q, paramString3, i2, "_ev", paramString1, i3);
      return;
    }
    localObject2 = E2.f.c(new String[] { "_o", "_sn", "_sc", "_si" });
    localObject2 = k().F(paramString3, paramString2, paramBundle, (List)localObject2, paramBoolean3);
    A2.n.i(localObject2);
    if ((s().C(false) != null) && ("_ae".equals(paramString2)))
    {
      paramBundle = uf;
      long l1 = d.b().b();
      long l2 = l1 - b;
      b = l1;
      if (l2 > 0L) {
        k().P((Bundle)localObject2, l2);
      }
    }
    Object localObject3;
    if ((t6.a()) && (f().s(K.p0))) {
      if ((!"auto".equals(paramString1)) && ("_ssr".equals(paramString2)))
      {
        localObject3 = k();
        paramBundle = ((BaseBundle)localObject2).getString("_ffr");
        if (E2.n.a(paramBundle)) {
          paramBundle = null;
        } else if (paramBundle != null) {
          paramBundle = paramBundle.trim();
        }
        if (V5.a(paramBundle, iv.a()))
        {
          ((m3)localObject3).j().F().a("Not logging duplicate session_start_with_rollout event");
          return;
        }
        iv.b(paramBundle);
      }
      else if ("_ae".equals(paramString2))
      {
        paramBundle = kiv.a();
        if (!TextUtils.isEmpty(paramBundle)) {
          ((BaseBundle)localObject2).putString("_ffr", paramBundle);
        }
      }
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(localObject2);
    if (f().s(K.Q0)) {
      paramBoolean1 = u().F();
    } else {
      paramBoolean1 = is.b();
    }
    if ((ip.a() > 0L) && (i().y(paramLong)) && (paramBoolean1))
    {
      j().K().a("Current session is expired, remove the session number, ID, and engagement time");
      a0("auto", "_sid", null, b().a());
      a0("auto", "_sno", null, b().a());
      a0("auto", "_se", null, b().a());
      iq.b(0L);
    }
    if (((BaseBundle)localObject2).getLong("extend_session", 0L) == 1L)
    {
      j().K().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
      a.K().e.b(paramLong, true);
    }
    paramBundle = new ArrayList(((BaseBundle)localObject2).keySet());
    Collections.sort(paramBundle);
    i2 = paramBundle.size();
    int i3 = 0;
    while (i3 < i2)
    {
      localObject3 = paramBundle.get(i3);
      i1 = i3 + 1;
      localObject3 = (String)localObject3;
      i3 = i1;
      if (localObject3 != null)
      {
        k();
        Bundle[] arrayOfBundle = S5.x0(((BaseBundle)localObject2).get((String)localObject3));
        i3 = i1;
        if (arrayOfBundle != null)
        {
          ((Bundle)localObject2).putParcelableArray((String)localObject3, arrayOfBundle);
          i3 = i1;
        }
      }
    }
    for (i3 = 0; i3 < localArrayList.size(); i3++)
    {
      localObject3 = (Bundle)localArrayList.get(i3);
      if (i3 != 0) {
        localObject2 = "_ep";
      } else {
        localObject2 = paramString2;
      }
      ((BaseBundle)localObject3).putString("_o", paramString1);
      paramBundle = (Bundle)localObject3;
      if (paramBoolean2) {
        paramBundle = k().r0((Bundle)localObject3);
      }
      localObject2 = new I((String)localObject2, new D(paramBundle), paramString1, paramLong);
      t().D((I)localObject2, paramString3);
      if (!bool1)
      {
        localObject2 = e.iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((u3)((Iterator)localObject2).next()).a(paramString1, paramString2, new Bundle(paramBundle), paramLong);
        }
      }
    }
    if ((s().C(false) != null) && ("_ae".equals(paramString2))) {
      u().E(true, true, b().b());
    }
  }
  
  public final void W(String paramString1, String paramString2, long paramLong, Object paramObject)
  {
    e().D(new T3(this, paramString1, paramString2, paramObject, paramLong));
  }
  
  public final void X(String paramString1, String paramString2, Bundle paramBundle)
  {
    long l1 = b().a();
    A2.n.e(paramString1);
    Bundle localBundle = new Bundle();
    localBundle.putString("name", paramString1);
    localBundle.putLong("creation_timestamp", l1);
    if (paramString2 != null)
    {
      localBundle.putString("expired_event_name", paramString2);
      localBundle.putBundle("expired_event_params", paramBundle);
    }
    e().D(new Y3(this, localBundle));
  }
  
  public final void Y(String paramString1, String paramString2, Bundle paramBundle, String paramString3)
  {
    m();
    x0(paramString1, paramString2, b().a(), paramBundle, false, true, true, paramString3);
  }
  
  public final void Z(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, long paramLong)
  {
    if (paramString1 == null) {
      paramString1 = "app";
    }
    if (paramBundle == null) {
      paramBundle = new Bundle();
    }
    if ((paramString2 == "screen_view") || ((paramString2 == null) || (!paramString2.equals("screen_view"))))
    {
      if ((paramBoolean2) && (d != null) && (!S5.H0(paramString2))) {}
      for (boolean bool = false;; bool = true) {
        break;
      }
      x0(paramString1, paramString2, paramLong, paramBundle, paramBoolean2, bool, paramBoolean1, null);
      return;
    }
    s().O(paramBundle, paramLong);
  }
  
  public final void a0(String paramString1, String paramString2, Object paramObject, long paramLong)
  {
    A2.n.e(paramString1);
    A2.n.e(paramString2);
    n();
    v();
    if ("allow_personalized_ads".equals(paramString2))
    {
      if ((paramObject instanceof String))
      {
        localObject = (String)paramObject;
        if (!TextUtils.isEmpty((CharSequence)localObject))
        {
          paramObject = ((String)localObject).toLowerCase(Locale.ENGLISH);
          paramString2 = "false";
          long l1;
          if ("false".equals(paramObject)) {
            l1 = 1L;
          } else {
            l1 = 0L;
          }
          paramObject = Long.valueOf(l1);
          localObject = im;
          if (((Long)paramObject).longValue() == 1L) {
            paramString2 = "true";
          }
          ((r2)localObject).b(paramString2);
        }
      }
      for (paramString2 = (String)paramObject;; paramString2 = (String)paramObject)
      {
        localObject = "_npa";
        paramObject = paramString2;
        break label152;
        if (paramObject != null) {
          break;
        }
        im.b("unset");
      }
    }
    Object localObject = paramString2;
    label152:
    if (!a.p())
    {
      j().K().a("User property not set since app measurement is disabled");
      return;
    }
    if (!a.s()) {
      return;
    }
    paramString1 = new R5((String)localObject, paramLong, paramObject, paramString1);
    t().J(paramString1);
  }
  
  public final void b0(String paramString1, String paramString2, Object paramObject, boolean paramBoolean)
  {
    c0(paramString1, paramString2, paramObject, paramBoolean, b().a());
  }
  
  public final void c0(String paramString1, String paramString2, Object paramObject, boolean paramBoolean, long paramLong)
  {
    String str = paramString1;
    if (paramString1 == null) {
      str = "app";
    }
    int i1 = 0;
    int i2 = 0;
    int i3;
    if (paramBoolean)
    {
      i3 = k().q0(paramString2);
    }
    else
    {
      paramString1 = k();
      if (!paramString1.C0("user property", paramString2)) {}
      do
      {
        i3 = 6;
        break;
        if (!paramString1.n0("user property", s3.a, paramString2))
        {
          i3 = 15;
          break;
        }
      } while (!paramString1.i0("user property", 24, paramString2));
      i3 = 0;
    }
    if (i3 != 0)
    {
      k();
      paramString1 = S5.I(paramString2, 24, true);
      i1 = i2;
      if (paramString2 != null) {
        i1 = paramString2.length();
      }
      a.L();
      S5.M(q, i3, "_ev", paramString1, i1);
      return;
    }
    if (paramObject != null)
    {
      i2 = k().w(paramString2, paramObject);
      if (i2 != 0)
      {
        k();
        paramString1 = S5.I(paramString2, 24, true);
        if (!(paramObject instanceof String))
        {
          i3 = i1;
          if (!(paramObject instanceof CharSequence)) {}
        }
        else
        {
          i3 = String.valueOf(paramObject).length();
        }
        a.L();
        S5.M(q, i2, "_ev", paramString1, i3);
        return;
      }
      paramString1 = k().A0(paramString2, paramObject);
      if (paramString1 != null) {
        W(str, paramString2, paramLong, paramString1);
      }
      return;
    }
    W(str, paramString2, paramLong, null);
  }
  
  public final Boolean e0()
  {
    AtomicReference localAtomicReference = new AtomicReference();
    return (Boolean)e().v(localAtomicReference, 15000L, "boolean test flag value", new O3(this, localAtomicReference));
  }
  
  public final Double f0()
  {
    AtomicReference localAtomicReference = new AtomicReference();
    return (Double)e().v(localAtomicReference, 15000L, "double test flag value", new h4(this, localAtomicReference));
  }
  
  public final Integer g0()
  {
    AtomicReference localAtomicReference = new AtomicReference();
    return (Integer)e().v(localAtomicReference, 15000L, "int test flag value", new e4(this, localAtomicReference));
  }
  
  public final Long h0()
  {
    AtomicReference localAtomicReference = new AtomicReference();
    return (Long)e().v(localAtomicReference, 15000L, "long test flag value", new f4(this, localAtomicReference));
  }
  
  public final String i0()
  {
    return (String)g.get();
  }
  
  public final String j0()
  {
    w4 localw4 = a.I().P();
    if (localw4 != null) {
      return b;
    }
    return null;
  }
  
  public final String k0()
  {
    w4 localw4 = a.I().P();
    if (localw4 != null) {
      return a;
    }
    return null;
  }
  
  public final String l0()
  {
    if (a.M() != null) {
      return a.M();
    }
    try
    {
      Context localContext = a();
      String str = a.P();
      H2 localH2 = new R2/H2;
      localH2.<init>(localContext, str);
      str = localH2.b("google_app_id");
      return str;
    }
    catch (IllegalStateException localIllegalStateException)
    {
      a.j().G().b("getGoogleAppId failed with exception", localIllegalStateException);
    }
    return null;
  }
  
  public final String m0()
  {
    AtomicReference localAtomicReference = new AtomicReference();
    return (String)e().v(localAtomicReference, 15000L, "String test flag value", new W3(this, localAtomicReference));
  }
  
  public final void n0()
  {
    n();
    v();
    if (!a.s()) {
      return;
    }
    Object localObject;
    if (f().s(K.k0))
    {
      localObject = f().F("google_analytics_deferred_deep_link_enabled");
      if ((localObject != null) && (((Boolean)localObject).booleanValue()))
      {
        j().F().a("Deferred Deep Link feature enabled.");
        e().D(new H3(this));
      }
    }
    t().X();
    o = false;
    String str = i().N();
    if (!TextUtils.isEmpty(str))
    {
      g().o();
      if (!str.equals(Build.VERSION.RELEASE))
      {
        localObject = new Bundle();
        ((BaseBundle)localObject).putString("_po", str);
        z0("auto", "_ou", (Bundle)localObject);
      }
    }
  }
  
  public final void o0()
  {
    if (((a().getApplicationContext() instanceof Application)) && (c != null)) {
      ((Application)a().getApplicationContext()).unregisterActivityLifecycleCallbacks(c);
    }
  }
  
  public final void p0()
  {
    if ((g7.a()) && (f().s(K.M0)))
    {
      if (e().J())
      {
        j().G().a("Cannot get trigger URIs from analytics worker thread");
        return;
      }
      if (f.a())
      {
        j().G().a("Cannot get trigger URIs from main thread");
        return;
      }
      v();
      j().K().a("Getting trigger URIs (FE)");
      Object localObject = new AtomicReference();
      e().v((AtomicReference)localObject, 5000L, "get trigger URIs", new D3(this, (AtomicReference)localObject));
      localObject = (List)((AtomicReference)localObject).get();
      if (localObject == null)
      {
        j().G().a("Timed out waiting for get trigger URIs");
        return;
      }
      e().D(new G3(this, (List)localObject));
    }
  }
  
  public final void q0()
  {
    n();
    if (it.b())
    {
      j().F().a("Deferred Deep Link already retrieved. Not fetching again.");
      return;
    }
    long l1 = iu.a();
    iu.b(1L + l1);
    if (l1 >= 5L)
    {
      j().L().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
      it.a(true);
      return;
    }
    if ((n6.a()) && (f().s(K.U0)))
    {
      if (p == null) {
        p = new V3(this, a);
      }
      p.b(0L);
      return;
    }
    a.u();
  }
  
  public final void r0()
  {
    n();
    if ((!s0().isEmpty()) && (!i))
    {
      v5 localv5 = (v5)s0().poll();
      if (localv5 == null) {
        return;
      }
      Object localObject1 = k().Q0();
      if (localObject1 == null) {
        return;
      }
      i = true;
      j().K().b("Registering trigger URI", o);
      localObject1 = ((q1.a)localObject1).c(Uri.parse(o));
      int i1 = 0;
      if (localObject1 == null)
      {
        i = false;
        s0().add(localv5);
        return;
      }
      Object localObject2 = i().H();
      ((SparseArray)localObject2).put(q, Long.valueOf(p));
      l2 locall2 = i();
      Object localObject3 = new int[((SparseArray)localObject2).size()];
      long[] arrayOfLong = new long[((SparseArray)localObject2).size()];
      while (i1 < ((SparseArray)localObject2).size())
      {
        localObject3[i1] = ((SparseArray)localObject2).keyAt(i1);
        arrayOfLong[i1] = ((Long)((SparseArray)localObject2).valueAt(i1)).longValue();
        i1++;
      }
      localObject2 = new Bundle();
      ((BaseBundle)localObject2).putIntArray("uriSources", (int[])localObject3);
      ((BaseBundle)localObject2).putLongArray("uriTimestamps", arrayOfLong);
      n.b((Bundle)localObject2);
      localObject3 = new M3(this);
      c.a((b3.e)localObject1, new Q3(this, localv5), (Executor)localObject3);
    }
  }
  
  public final PriorityQueue s0()
  {
    if (j == null)
    {
      B3.a();
      j = A3.a(K3.a(y3.a, E3.o));
    }
    return j;
  }
  
  public final void t0()
  {
    n();
    String str = im.a();
    if (str != null) {
      if ("unset".equals(str))
      {
        a0("app", "_npa", null, b().a());
      }
      else
      {
        long l1;
        if ("true".equals(str)) {
          l1 = 1L;
        } else {
          l1 = 0L;
        }
        a0("app", "_npa", Long.valueOf(l1), b().a());
      }
    }
    if ((a.p()) && (o))
    {
      j().F().a("Recording app launch after enabling measurement for the first time (FE)");
      n0();
      if ((G6.a()) && (f().s(K.q0))) {
        ue.a();
      }
      e().D(new S3(this));
      return;
    }
    j().F().a("Updating Scion state (FE)");
    t().b0();
  }
  
  public final void u0(u3 paramu3)
  {
    v();
    A2.n.i(paramu3);
    if (!e.remove(paramu3)) {
      j().L().a("OnEventListener had not been registered");
    }
  }
  
  public final void w0(Bundle paramBundle)
  {
    Q(paramBundle, b().a());
  }
  
  public final void x0(String paramString1, String paramString2, long paramLong, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString3)
  {
    paramBundle = S5.E(paramBundle);
    e().D(new U3(this, paramString1, paramString2, paramLong, paramBundle, paramBoolean1, paramBoolean2, paramBoolean3, paramString3));
  }
  
  public final void y0(String paramString1, String paramString2, Bundle paramBundle)
  {
    Z(paramString1, paramString2, paramBundle, true, true, b().a());
  }
  
  public final void z0(String paramString1, String paramString2, Bundle paramBundle)
  {
    n();
    U(paramString1, paramString2, b().a(), paramBundle);
  }
}

/* Location:
 * Qualified Name:     R2.C3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */