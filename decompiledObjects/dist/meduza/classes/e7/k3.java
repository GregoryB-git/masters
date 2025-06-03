package e7;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import b.z;
import com.google.android.gms.internal.measurement.zzeb;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService.a;
import d2.q;
import f;
import i6.r;
import i6.t;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l1.a;
import m6.j;
import nc.g0;
import p2.m0;
import r4.c;
import s7.d.a;
import v6.g;

public final class k3
  extends j0
{
  public final w6 A;
  public boolean B = true;
  public d4 C;
  public u3 D;
  public y3 E;
  public final q F = new q(this, 5);
  public i4 d;
  public h3 e;
  public final CopyOnWriteArraySet f = new CopyOnWriteArraySet();
  public boolean o;
  public final AtomicReference<String> p = new AtomicReference();
  public final Object q = new Object();
  public boolean r = false;
  public int s = 1;
  public y3 t;
  public v3 u;
  public PriorityQueue<w5> v;
  public boolean w;
  public e3 x = e3.c;
  public final AtomicLong y = new AtomicLong(0L);
  public long z = -1L;
  
  public k3(j2 paramj2)
  {
    super(paramj2);
    A = new w6(paramj2);
  }
  
  public static void A(k3 paramk3, e3 parame3, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    paramk3.l();
    paramk3.t();
    Object localObject = paramk3.j().y();
    if ((paramLong <= z) && (e3.i(b, b)))
    {
      zzju.c("Dropped out-of-date consent setting, proposed settings", parame3);
      return;
    }
    localObject = paramk3.j();
    ((q)localObject).l();
    int i = b;
    if (((l1)localObject).q(i))
    {
      localObject = ((l1)localObject).v().edit();
      ((SharedPreferences.Editor)localObject).putString("consent_settings", parame3.n());
      ((SharedPreferences.Editor)localObject).putInt("consent_source", i);
      ((SharedPreferences.Editor)localObject).apply();
      i = 1;
    }
    else
    {
      i = 0;
    }
    if (i != 0)
    {
      zzjw.c("Setting storage consent(FE)", parame3);
      z = paramLong;
      if (paramk3.q().E())
      {
        parame3 = paramk3.q();
        parame3.l();
        parame3.t();
        parame3.x(new r(parame3, 3));
      }
      else
      {
        paramk3.q().z(paramBoolean1);
      }
      if (paramBoolean2) {
        paramk3.q().y(new AtomicReference());
      }
    }
    else
    {
      zzju.c("Lower precedence consent source ignored, proposed source", Integer.valueOf(b));
    }
  }
  
  public final void B(Boolean paramBoolean, boolean paramBoolean1)
  {
    l();
    t();
    zzjv.c("Setting app measurement enabled (FE)", paramBoolean);
    j().p(paramBoolean);
    if (paramBoolean1)
    {
      localObject = j();
      ((q)localObject).l();
      localObject = ((l1)localObject).v().edit();
      if (paramBoolean != null) {
        ((SharedPreferences.Editor)localObject).putBoolean("measurement_enabled_from_api", paramBoolean.booleanValue());
      } else {
        ((SharedPreferences.Editor)localObject).remove("measurement_enabled_from_api");
      }
      ((SharedPreferences.Editor)localObject).apply();
    }
    Object localObject = (j2)b;
    ((j2)localObject).zzl().l();
    if ((M) || ((paramBoolean != null) && (!paramBoolean.booleanValue()))) {
      O();
    }
  }
  
  public final void C(String paramString1, String paramString2, long paramLong, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString3)
  {
    j.e(paramString1);
    j.i(paramBundle);
    l();
    t();
    if (!((j2)b).d())
    {
      zzjv.b("Event not sent since app measurement is disabled");
      return;
    }
    Object localObject1 = ms;
    if ((localObject1 != null) && (!((List)localObject1).contains(paramString2)))
    {
      zzjv.d("Dropping non-safelisted event. event name, origin", paramString2, paramString1);
      return;
    }
    boolean bool1 = o;
    int i = 0;
    int j = 0;
    if (!bool1)
    {
      o = true;
      try
      {
        if (!b).e) {
          localObject1 = Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, zza().getClassLoader());
        } else {
          localObject1 = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
        }
        try
        {
          ((Class)localObject1).getDeclaredMethod("initialize", new Class[] { Context.class }).invoke(null, new Object[] { zza() });
        }
        catch (Exception localException)
        {
          zzjr.c("Failed to invoke Tag Manager's initialize() method", localException);
        }
        if (!"_cmp".equals(paramString2)) {
          break label279;
        }
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        zzju.b("Tag Manager is not found and thus will not be used");
      }
    }
    if (paramBundle.containsKey("gclid"))
    {
      localObject2 = paramBundle.getString("gclid");
      ((z)zzb()).getClass();
      F("auto", "_lgclid", localObject2, System.currentTimeMillis());
    }
    label279:
    if (paramBoolean1)
    {
      localObject2 = r6.s;
      for (k = 0; k < 1; k++) {
        if (localObject2[k].equals(paramString2))
        {
          k = 0;
          break label325;
        }
      }
      k = 1;
      label325:
      if (k != 0) {
        k().D(paramBundle, jI.a());
      }
    }
    if ((!paramBoolean3) && (!"_iap".equals(paramString2)))
    {
      localObject2 = ((j2)b).m();
      bool1 = ((r6)localObject2).n0("event", paramString2);
      k = 2;
      if (bool1) {
        if (!((r6)localObject2).Z("event", b.a0.b, b.a0.c, paramString2)) {
          k = 13;
        } else if (((r6)localObject2).Q(40, "event", paramString2)) {
          k = 0;
        }
      }
      if (k != 0)
      {
        zzjq.c("Invalid public event name. Event will not be logged (FE)", i().c(paramString2));
        ((j2)b).m();
        paramString1 = r6.A(paramString2, 40, true);
        i = j;
        if (paramString2 != null) {
          i = paramString2.length();
        }
        ((j2)b).m();
        r6.M(F, null, k, "_ev", paramString1, i);
        return;
      }
    }
    Object localObject2 = p().v(false);
    if ((localObject2 != null) && (!paramBundle.containsKey("_sc"))) {
      d = true;
    }
    if ((paramBoolean1) && (!paramBoolean3)) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    r6.L((q4)localObject2, paramBundle, bool1);
    bool1 = "am".equals(paramString1);
    boolean bool2 = r6.r0(paramString2);
    if ((paramBoolean1) && (e != null) && (!bool2) && (!bool1))
    {
      zzjv.d("Passing event to registered event handler (FE)", i().c(paramString2), i().a(paramBundle));
      j.i(e);
      ((AppMeasurementDynamiteService.a)e).a(paramString1, paramString2, paramBundle, paramLong);
      return;
    }
    if (!((j2)b).e()) {
      return;
    }
    j = k().q(paramString2);
    if (j != 0)
    {
      zzjq.c("Invalid event name. Event will not be logged (FE)", i().c(paramString2));
      k();
      paramString1 = r6.A(paramString2, 40, true);
      k = i;
      if (paramString2 != null) {
        k = paramString2.length();
      }
      ((j2)b).m();
      r6.M(F, paramString3, j, "_ev", paramString1, k);
      return;
    }
    localObject2 = Collections.unmodifiableList(Arrays.asList(new String[] { "_o", "_sn", "_sc", "_si" }));
    Object localObject3 = k().w(paramString2, paramBundle, (List)localObject2, paramBoolean3);
    j.i(localObject3);
    if ((p().v(false) != null) && ("_ae".equals(paramString2)))
    {
      paramBundle = ro;
      ((z)d.zzb()).getClass();
      long l1 = SystemClock.elapsedRealtime();
      long l2 = l1 - b;
      b = l1;
      if (l2 > 0L) {
        k().C((Bundle)localObject3, l2);
      }
    }
    if ((!"auto".equals(paramString1)) && ("_ssr".equals(paramString2)))
    {
      localObject4 = k();
      localObject2 = ((BaseBundle)localObject3).getString("_ffr");
      if (g.b((String)localObject2))
      {
        paramBundle = null;
      }
      else
      {
        paramBundle = (Bundle)localObject2;
        if (localObject2 != null) {
          paramBundle = ((String)localObject2).trim();
        }
      }
      if (Objects.equals(paramBundle, jF.a()))
      {
        zzjv.b("Not logging duplicate session_start_with_rollout event");
        k = 0;
      }
      else
      {
        jF.b(paramBundle);
        k = 1;
      }
      if (k != 0) {}
    }
    else if ("_ae".equals(paramString2))
    {
      paramBundle = kjF.a();
      if (!TextUtils.isEmpty(paramBundle)) {
        ((BaseBundle)localObject3).putString("_ffr", paramBundle);
      }
    }
    Object localObject4 = new ArrayList();
    ((ArrayList)localObject4).add(localObject3);
    if (h().x(null, h0.W0))
    {
      paramBundle = r();
      paramBundle.l();
      paramBoolean1 = e;
    }
    else
    {
      paramBoolean1 = jC.b();
    }
    if ((jz.a() > 0L) && (j().r(paramLong)) && (paramBoolean1))
    {
      zzjw.b("Current session is expired, remove the session number, ID, and engagement time");
      ((z)zzb()).getClass();
      F("auto", "_sid", null, System.currentTimeMillis());
      ((z)zzb()).getClass();
      F("auto", "_sno", null, System.currentTimeMillis());
      ((z)zzb()).getClass();
      F("auto", "_se", null, System.currentTimeMillis());
      jA.b(0L);
    }
    if (((BaseBundle)localObject3).getLong("extend_session", 0L) == 1L)
    {
      zzjw.b("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
      paramBundle = (j2)b;
      j2.b(s);
      s.f.b(paramLong, true);
    }
    localObject2 = new ArrayList(((BaseBundle)localObject3).keySet());
    Collections.sort((List)localObject2);
    j = ((ArrayList)localObject2).size();
    int k = 0;
    Object localObject5;
    Object localObject6;
    while (k < j)
    {
      paramBundle = ((ArrayList)localObject2).get(k);
      i = k + 1;
      localObject5 = (String)paramBundle;
      k = i;
      if (localObject5 != null)
      {
        k();
        localObject6 = ((BaseBundle)localObject3).get((String)localObject5);
        if ((localObject6 instanceof Bundle))
        {
          paramBundle = new Bundle[1];
          paramBundle[0] = ((Bundle)localObject6);
        }
        else
        {
          if ((localObject6 instanceof Parcelable[]))
          {
            paramBundle = (Parcelable[])localObject6;
            paramBundle = Arrays.copyOf(paramBundle, paramBundle.length, Bundle[].class);
          }
          else
          {
            if (!(localObject6 instanceof ArrayList)) {
              break label1530;
            }
            paramBundle = (ArrayList)localObject6;
            paramBundle = paramBundle.toArray(new Bundle[paramBundle.size()]);
          }
          paramBundle = (Bundle[])paramBundle;
          break label1533;
          label1530:
          paramBundle = null;
        }
        label1533:
        k = i;
        if (paramBundle != null)
        {
          ((Bundle)localObject3).putParcelableArray((String)localObject5, paramBundle);
          k = i;
        }
      }
    }
    for (k = 0; k < ((ArrayList)localObject4).size(); k++)
    {
      localObject3 = (Bundle)((ArrayList)localObject4).get(k);
      if (k != 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        localObject2 = "_ep";
      } else {
        localObject2 = paramString2;
      }
      ((BaseBundle)localObject3).putString("_o", paramString1);
      paramBundle = (Bundle)localObject3;
      if (paramBoolean2) {
        paramBundle = k().v((Bundle)localObject3);
      }
      localObject6 = new f0((String)localObject2, new a0(paramBundle), paramString1, paramLong);
      localObject2 = q();
      localObject2.getClass();
      ((o0)localObject2).l();
      ((j0)localObject2).t();
      w0 localw0 = ((o0)localObject2).n();
      localw0.getClass();
      localObject5 = Parcel.obtain();
      ((f0)localObject6).writeToParcel((Parcel)localObject5, 0);
      localObject3 = ((Parcel)localObject5).marshall();
      ((Parcel)localObject5).recycle();
      if (localObject3.length > 131072)
      {
        zzjp.b("Event is too long for local database. Sending event directly to service");
        paramBoolean1 = false;
      }
      else
      {
        paramBoolean1 = localw0.w((byte[])localObject3, 0);
      }
      ((w4)localObject2).x(new e5((w4)localObject2, ((w4)localObject2).I(true), paramBoolean1, (f0)localObject6, paramString3));
      if (!bool1)
      {
        localObject2 = f.iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((j3)((Iterator)localObject2).next()).a(paramString1, paramString2, new Bundle(paramBundle), paramLong);
        }
      }
    }
    if ((p().v(false) != null) && ("_ae".equals(paramString2)))
    {
      paramString1 = r();
      ((z)zzb()).getClass();
      paramLong = SystemClock.elapsedRealtime();
      o.a(paramLong, true, true);
    }
  }
  
  public final void D(String paramString1, String paramString2, Bundle paramBundle, long paramLong)
  {
    l();
    boolean bool;
    if ((e != null) && (!r6.r0(paramString2))) {
      bool = false;
    } else {
      bool = true;
    }
    C(paramString1, paramString2, paramLong, paramBundle, true, bool, true, null);
  }
  
  public final void E(String paramString1, String paramString2, Bundle paramBundle, boolean paramBoolean1, boolean paramBoolean2, long paramLong)
  {
    if (paramString1 == null) {
      paramString1 = "app";
    }
    if (paramBundle == null) {
      paramBundle = new Bundle();
    }
    Object localObject2;
    if (Objects.equals(paramString2, "screen_view"))
    {
      s4 locals4 = p();
      synchronized (u)
      {
        if (!t) {
          paramString2 = zzjt;
        }
        for (paramString1 = "Cannot log screen view event when the app is in the background.";; paramString1 = "Ignoring call to log screen view event with duplicate parameters.")
        {
          paramString2.b(paramString1);
          break;
          localObject2 = paramBundle.getString("screen_name");
          if ((localObject2 != null) && ((((String)localObject2).length() <= 0) || (((String)localObject2).length() > locals4.h().n(null, false))))
          {
            paramString1 = zzjt;
            paramBundle = "Invalid screen name length for screen view. Length";
            paramString2 = Integer.valueOf(((String)localObject2).length());
          }
          for (;;)
          {
            paramString1.c(paramBundle, paramString2);
            break label324;
            paramString1 = paramBundle.getString("screen_class");
            if ((paramString1 == null) || ((paramString1.length() > 0) && (paramString1.length() <= locals4.h().n(null, false)))) {
              break;
            }
            localObject3 = zzjt;
            paramBundle = "Invalid screen class length for screen view. Length";
            paramString2 = Integer.valueOf(paramString1.length());
            paramString1 = (String)localObject3;
          }
          if (paramString1 == null)
          {
            paramString1 = p;
            if (paramString1 != null) {
              paramString1 = locals4.b(zzb, "Activity");
            } else {
              paramString1 = "Activity";
            }
          }
          paramString2 = d;
          if ((!q) || (paramString2 == null)) {
            break label330;
          }
          q = false;
          paramBoolean2 = Objects.equals(b, paramString1);
          paramBoolean1 = Objects.equals(a, localObject2);
          if ((!paramBoolean2) || (!paramBoolean1)) {
            break label330;
          }
          paramString2 = zzjt;
        }
        label324:
        break label486;
        label330:
        ??? = zzjw;
        if (localObject2 == null) {
          paramString2 = "null";
        } else {
          paramString2 = (String)localObject2;
        }
        if (paramString1 == null) {
          localObject3 = "null";
        } else {
          localObject3 = paramString1;
        }
        ((b1)???).d("Logging screen view with name, class", paramString2, localObject3);
        if (d == null) {
          paramString2 = e;
        } else {
          paramString2 = d;
        }
        paramString1 = new q4((String)localObject2, paramString1, locals4.k().y0(), true, paramLong);
        d = paramString1;
        e = paramString2;
        r = paramString1;
        ((z)locals4.zzb()).getClass();
        paramLong = SystemClock.elapsedRealtime();
        locals4.zzl().u(new r4(locals4, paramBundle, paramString1, paramString2, paramLong));
        label486:
        return;
      }
    }
    boolean bool;
    if ((paramBoolean2) && (e != null) && (!r6.r0(paramString2))) {
      bool = false;
    } else {
      bool = true;
    }
    paramBundle = new Bundle(paramBundle);
    Object localObject3 = paramBundle.keySet().iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (String)((Iterator)localObject3).next();
      ??? = paramBundle.get((String)localObject2);
      if ((??? instanceof Bundle))
      {
        paramBundle.putBundle((String)localObject2, new Bundle((Bundle)???));
      }
      else
      {
        int i;
        if ((??? instanceof Parcelable[]))
        {
          localObject2 = (Parcelable[])???;
          for (i = 0; i < localObject2.length; i++) {
            if ((localObject2[i] instanceof Bundle)) {
              localObject2[i] = new Bundle((Bundle)localObject2[i]);
            }
          }
        }
        else if ((??? instanceof List))
        {
          localObject2 = (List)???;
          for (i = 0; i < ((List)localObject2).size(); i++)
          {
            ??? = ((List)localObject2).get(i);
            if ((??? instanceof Bundle)) {
              ((List)localObject2).set(i, new Bundle((Bundle)???));
            }
          }
        }
      }
    }
    zzl().u(new b4(this, paramString1, paramString2, paramLong, paramBundle, paramBoolean2, bool, paramBoolean1));
  }
  
  public final void F(String paramString1, String paramString2, Object paramObject, long paramLong)
  {
    j.e(paramString1);
    j.e(paramString2);
    l();
    t();
    Object localObject1 = paramString2;
    Object localObject2 = paramObject;
    if ("allow_personalized_ads".equals(paramString2))
    {
      if ((paramObject instanceof String))
      {
        localObject2 = (String)paramObject;
        if (!TextUtils.isEmpty((CharSequence)localObject2))
        {
          paramObject = ((String)localObject2).toLowerCase(Locale.ENGLISH);
          paramString2 = "false";
          long l;
          if ("false".equals(paramObject)) {
            l = 1L;
          } else {
            l = 0L;
          }
          paramObject = Long.valueOf(l);
          localObject2 = jw;
          if (((Long)paramObject).longValue() == 1L) {
            paramString2 = "true";
          }
          ((r1)localObject2).b(paramString2);
          break label142;
        }
      }
      localObject2 = paramObject;
      if (paramObject == null)
      {
        jw.b("unset");
        label142:
        paramString2 = "_npa";
        localObject2 = paramObject;
      }
      zzjw.d("Setting user property(FE)", "non_personalized_ads(_npa)", localObject2);
      localObject1 = paramString2;
    }
    if (!((j2)b).d())
    {
      zzjw.b("User property not set since app measurement is disabled");
      return;
    }
    if (!((j2)b).e()) {
      return;
    }
    localObject1 = new q6((String)localObject1, paramString1, paramLong, localObject2);
    paramObject = q();
    ((o0)paramObject).l();
    ((j0)paramObject).t();
    localObject2 = ((o0)paramObject).n();
    localObject2.getClass();
    paramString1 = Parcel.obtain();
    boolean bool = false;
    ((q6)localObject1).writeToParcel(paramString1, 0);
    paramString2 = paramString1.marshall();
    paramString1.recycle();
    if (paramString2.length > 131072) {
      zzjp.b("User property too long for local database. Sending directly to service");
    } else {
      bool = ((w0)localObject2).w(paramString2, 1);
    }
    ((w4)paramObject).x(new b5((w4)paramObject, ((w4)paramObject).I(true), bool, (q6)localObject1));
  }
  
  public final void G(String paramString1, String paramString2, Object paramObject, boolean paramBoolean, long paramLong)
  {
    String str = paramString1;
    if (paramString1 == null) {
      str = "app";
    }
    int i = 6;
    int j = 0;
    int k = 0;
    if (paramBoolean) {
      i = k().e0(paramString2);
    }
    for (;;)
    {
      break;
      paramString1 = k();
      if (paramString1.n0("user property", paramString2))
      {
        if (!paramString1.Z("user property", m0.a, null, paramString2)) {
          i = 15;
        } else {
          if (!paramString1.Q(24, "user property", paramString2)) {
            break;
          }
        }
      }
      else {
        i = 0;
      }
    }
    if (i != 0)
    {
      k();
      paramString1 = r6.A(paramString2, 24, true);
      j = k;
      if (paramString2 != null) {
        j = paramString2.length();
      }
      ((j2)b).m();
      r6.M(F, null, i, "_ev", paramString1, j);
      return;
    }
    if (paramObject != null)
    {
      k = k().p(paramObject, paramString2);
      if (k != 0)
      {
        k();
        paramString1 = r6.A(paramString2, 24, true);
        if (!(paramObject instanceof String))
        {
          i = j;
          if (!(paramObject instanceof CharSequence)) {}
        }
        else
        {
          i = String.valueOf(paramObject).length();
        }
        ((j2)b).m();
        r6.M(F, null, k, "_ev", paramString1, i);
        return;
      }
      paramString1 = k().l0(paramObject, paramString2);
      if (paramString1 != null) {
        zzl().u(new c4(this, str, paramString2, paramString1, paramLong));
      }
      return;
    }
    zzl().u(new c4(this, str, paramString2, null, paramLong));
  }
  
  public final void H(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    ((z)zzb()).getClass();
    G(paramString1, paramString2, paramString3, paramBoolean, System.currentTimeMillis());
  }
  
  public final PriorityQueue<w5> I()
  {
    if (v == null) {
      v = new PriorityQueue(Comparator.comparing(new l3(), new g6.e(1)));
    }
    return v;
  }
  
  public final void J()
  {
    l();
    t();
    if (!((j2)b).e()) {
      return;
    }
    Object localObject1 = h().v("google_analytics_deferred_deep_link_enabled");
    int i;
    if ((localObject1 != null) && (((Boolean)localObject1).booleanValue())) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      zzjv.b("Deferred Deep Link feature enabled.");
      zzl().u(new r3(this, 0));
    }
    localObject1 = q();
    ((o0)localObject1).l();
    ((j0)localObject1).t();
    Object localObject2 = ((w4)localObject1).I(true);
    ((o0)localObject1).n().w(new byte[0], 3);
    ((w4)localObject1).x(new s2(3, localObject1, localObject2));
    B = false;
    Object localObject3 = j();
    ((q)localObject3).l();
    localObject1 = ((l1)localObject3).v().getString("previous_os_version", null);
    ((j2)b).g().m();
    localObject2 = Build.VERSION.RELEASE;
    if ((!TextUtils.isEmpty((CharSequence)localObject2)) && (!((String)localObject2).equals(localObject1)))
    {
      localObject3 = ((l1)localObject3).v().edit();
      ((SharedPreferences.Editor)localObject3).putString("previous_os_version", (String)localObject2);
      ((SharedPreferences.Editor)localObject3).apply();
    }
    if (!TextUtils.isEmpty((CharSequence)localObject1))
    {
      ((j2)b).g().m();
      if (!((String)localObject1).equals(localObject2))
      {
        localObject2 = new Bundle();
        ((BaseBundle)localObject2).putString("_po", (String)localObject1);
        Q("auto", "_ou", (Bundle)localObject2);
      }
    }
  }
  
  public final void K()
  {
    if (((zza().getApplicationContext() instanceof Application)) && (d != null)) {
      ((Application)zza().getApplicationContext()).unregisterActivityLifecycleCallbacks(d);
    }
  }
  
  public final void L()
  {
    if ((zzoy.zza()) && (h().x(null, h0.R0)))
    {
      Object localObject;
      String str;
      if (zzl().w())
      {
        localObject = zzjo;
        str = "Cannot get trigger URIs from analytics worker thread";
      }
      for (;;)
      {
        ((b1)localObject).b(str);
        return;
        if (g0.d())
        {
          localObject = zzjo;
          str = "Cannot get trigger URIs from main thread";
        }
        else
        {
          t();
          zzjw.b("Getting trigger URIs (FE)");
          localObject = new AtomicReference();
          zzl().q((AtomicReference)localObject, 10000L, "get trigger URIs", new m3(this, (AtomicReference)localObject, 0));
          localObject = (List)((AtomicReference)localObject).get();
          if (localObject != null) {
            break;
          }
          localObject = zzjo;
          str = "Timed out waiting for get trigger URIs";
        }
      }
      zzl().u(new s2(this, (List)localObject));
    }
  }
  
  public final void M()
  {
    l();
    zzjv.b("Handle tcf update.");
    Object localObject1 = j().u();
    Object localObject2 = new HashMap();
    String str2;
    try
    {
      String str1 = ((SharedPreferences)localObject1).getString("IABTCF_VendorConsents", "\000");
    }
    catch (ClassCastException localClassCastException1)
    {
      str2 = "\000";
    }
    if ((!"\000".equals(str2)) && (str2.length() > 754)) {
      ((HashMap)localObject2).put("GoogleConsent", String.valueOf(str2.charAt(754)));
    }
    i = -1;
    try
    {
      j = ((SharedPreferences)localObject1).getInt("IABTCF_gdprApplies", -1);
    }
    catch (ClassCastException localClassCastException2)
    {
      j = -1;
    }
    if (j != -1) {
      ((HashMap)localObject2).put("gdprApplies", String.valueOf(j));
    }
    try
    {
      j = ((SharedPreferences)localObject1).getInt("IABTCF_EnableAdvertiserConsentMode", -1);
    }
    catch (ClassCastException localClassCastException3)
    {
      j = -1;
    }
    if (j != -1) {
      ((HashMap)localObject2).put("EnableAdvertiserConsentMode", String.valueOf(j));
    }
    try
    {
      j = ((SharedPreferences)localObject1).getInt("IABTCF_PolicyVersion", -1);
    }
    catch (ClassCastException localClassCastException4)
    {
      j = -1;
    }
    if (j != -1) {
      ((HashMap)localObject2).put("PolicyVersion", String.valueOf(j));
    }
    String str4;
    try
    {
      String str3 = ((SharedPreferences)localObject1).getString("IABTCF_PurposeConsents", "\000");
    }
    catch (ClassCastException localClassCastException5)
    {
      str4 = "\000";
    }
    if (!"\000".equals(str4)) {
      ((HashMap)localObject2).put("PurposeConsents", str4);
    }
    try
    {
      j = ((SharedPreferences)localObject1).getInt("IABTCF_CmpSdkID", -1);
    }
    catch (ClassCastException localClassCastException6)
    {
      j = -1;
    }
    if (j != -1) {
      ((HashMap)localObject2).put("CmpSdkID", String.valueOf(j));
    }
    u5 localu5 = new u5((HashMap)localObject2);
    zzjw.c("Tcf preferences read", localu5);
    localObject1 = j();
    ((q)localObject1).l();
    localObject2 = ((l1)localObject1).v().getString("stored_tcf_param", "");
    Object localObject3 = localu5.a();
    boolean bool = ((String)localObject3).equals(localObject2);
    int k = 1;
    if (!bool)
    {
      localObject2 = ((l1)localObject1).v().edit();
      ((SharedPreferences.Editor)localObject2).putString("stored_tcf_param", (String)localObject3);
      ((SharedPreferences.Editor)localObject2).apply();
      j = 1;
    }
    else
    {
      j = 0;
    }
    if (j != 0)
    {
      if (("1".equals(a.get("GoogleConsent"))) && ("1".equals(a.get("gdprApplies"))) && ("1".equals(a.get("EnableAdvertiserConsentMode")))) {
        j = k;
      } else {
        j = 0;
      }
      k = 2;
      if (j == 0) {}
    }
    try
    {
      localObject3 = (String)a.get("PolicyVersion");
      j = i;
      if (!TextUtils.isEmpty((CharSequence)localObject3)) {
        j = Integer.parseInt((String)localObject3);
      }
    }
    catch (NumberFormatException localNumberFormatException3)
    {
      for (;;)
      {
        String str5;
        j = i;
      }
    }
    if (j >= 0)
    {
      str5 = (String)a.get("PurposeConsents");
      if (!TextUtils.isEmpty(str5)) {}
    }
    else
    {
      localObject3 = Bundle.EMPTY;
      break label716;
    }
    localObject2 = new Bundle();
    i = str5.length();
    localObject1 = "granted";
    if (i > 0)
    {
      if (str5.charAt(0) == '1') {
        localObject3 = "granted";
      } else {
        localObject3 = "denied";
      }
      ((BaseBundle)localObject2).putString("ad_storage", (String)localObject3);
    }
    if (str5.length() > 3)
    {
      if ((str5.charAt(2) == '1') && (str5.charAt(3) == '1')) {
        localObject3 = "granted";
      } else {
        localObject3 = "denied";
      }
      ((BaseBundle)localObject2).putString("ad_personalization", (String)localObject3);
    }
    if ((str5.length() > 6) && (j >= 4))
    {
      if ((str5.charAt(0) == '1') && (str5.charAt(6) == '1')) {
        localObject3 = localObject1;
      } else {
        localObject3 = "denied";
      }
      ((BaseBundle)localObject2).putString("ad_user_data", (String)localObject3);
    }
    localObject3 = localObject2;
    label716:
    zzjw.c("Consent generated from Tcf", localObject3);
    if (localObject3 != Bundle.EMPTY)
    {
      ((z)zzb()).getClass();
      v((Bundle)localObject3, -30, System.currentTimeMillis());
    }
    localObject2 = new Bundle();
    localObject3 = f.l("1");
    try
    {
      localObject1 = (String)a.get("CmpSdkID");
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        j = Integer.parseInt((String)localObject1);
      }
    }
    catch (NumberFormatException localNumberFormatException1)
    {
      for (;;) {}
    }
    j = -1;
    if ((j >= 0) && (j <= 4095))
    {
      ((StringBuilder)localObject3).append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(j >> 6 & 0x3F));
      ((StringBuilder)localObject3).append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(j & 0x3F));
    }
    else
    {
      ((StringBuilder)localObject3).append("00");
    }
    try
    {
      localObject1 = (String)a.get("PolicyVersion");
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        j = Integer.parseInt((String)localObject1);
      }
    }
    catch (NumberFormatException localNumberFormatException2)
    {
      for (;;) {}
    }
    j = -1;
    if ((j >= 0) && (j <= 63)) {
      ((StringBuilder)localObject3).append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(j));
    } else {
      ((StringBuilder)localObject3).append("0");
    }
    if ("1".equals(a.get("gdprApplies"))) {
      j = k;
    } else {
      j = 0;
    }
    i = j | 0x4;
    j = i;
    if ("1".equals(a.get("EnableAdvertiserConsentMode"))) {
      j = i | 0x8;
    }
    ((StringBuilder)localObject3).append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(j));
    ((BaseBundle)localObject2).putString("_tcfd", ((StringBuilder)localObject3).toString());
    Q("auto", "_tcf", (Bundle)localObject2);
  }
  
  public final void N()
  {
    l();
    w = false;
    if ((!I().isEmpty()) && (!r))
    {
      w5 localw5 = (w5)I().poll();
      if (localw5 == null) {
        return;
      }
      Object localObject = k().z0();
      if (localObject == null) {
        return;
      }
      r = true;
      zzjw.c("Registering trigger URI", a);
      s7.e locale = ((a)localObject).b(Uri.parse(a));
      if (locale == null)
      {
        r = false;
        I().add(localw5);
        return;
      }
      localObject = new w3(this);
      locale.f(new d.a(locale, new c(this, localw5, 2)), (Executor)localObject);
    }
  }
  
  public final void O()
  {
    l();
    Object localObject = jw.a();
    if (localObject != null)
    {
      if ("unset".equals(localObject))
      {
        localObject = null;
        ((z)zzb()).getClass();
      }
      for (;;)
      {
        F("app", "_npa", localObject, System.currentTimeMillis());
        break;
        long l;
        if ("true".equals(localObject)) {
          l = 1L;
        } else {
          l = 0L;
        }
        localObject = Long.valueOf(l);
        ((z)zzb()).getClass();
      }
    }
    if ((((j2)b).d()) && (B))
    {
      zzjv.b("Recording app launch after enabling measurement for the first time (FE)");
      J();
      rf.a();
      zzl().u(new a4(this, 0));
      return;
    }
    zzjv.b("Updating Scion state (FE)");
    localObject = q();
    ((o0)localObject).l();
    ((j0)localObject).t();
    ((w4)localObject).x(new d5((w4)localObject, ((w4)localObject).I(true), 1));
  }
  
  public final void P(String paramString)
  {
    p.set(paramString);
  }
  
  public final void Q(String paramString1, String paramString2, Bundle paramBundle)
  {
    l();
    ((z)zzb()).getClass();
    D(paramString1, paramString2, paramBundle, System.currentTimeMillis());
  }
  
  public final void a(String paramString1, String paramString2, Bundle paramBundle)
  {
    ((z)zzb()).getClass();
    long l = System.currentTimeMillis();
    j.e(paramString1);
    Bundle localBundle = new Bundle();
    localBundle.putString("name", paramString1);
    localBundle.putLong("creation_timestamp", l);
    if (paramString2 != null)
    {
      localBundle.putString("expired_event_name", paramString2);
      localBundle.putBundle("expired_event_params", paramBundle);
    }
    zzl().u(new t(1, this, localBundle));
  }
  
  public final boolean s()
  {
    return false;
  }
  
  public final void v(Bundle paramBundle, int paramInt, long paramLong)
  {
    t();
    Object localObject1 = e3.c;
    e3.a[] arrayOfa = ba;
    int i = arrayOfa.length;
    for (int j = 0;; j++)
    {
      localObject1 = null;
      Object localObject2 = null;
      if (j >= i) {
        break;
      }
      localObject1 = arrayOfa[j];
      if (paramBundle.containsKey(a))
      {
        String str = paramBundle.getString(a);
        if (str != null)
        {
          if (str.equals("granted"))
          {
            localObject1 = Boolean.TRUE;
          }
          else
          {
            localObject1 = localObject2;
            if (str.equals("denied")) {
              localObject1 = Boolean.FALSE;
            }
          }
          if (localObject1 == null)
          {
            localObject1 = str;
            break;
          }
        }
      }
    }
    if (localObject1 != null)
    {
      zzjt.c("Ignoring invalid consent setting", localObject1);
      zzjt.b("Valid consent values are 'granted', 'denied'");
    }
    boolean bool = zzl().w();
    localObject1 = e3.b(paramInt, paramBundle);
    if (((e3)localObject1).q()) {
      z((e3)localObject1, bool);
    }
    localObject1 = x.a(paramInt, paramBundle);
    if (((x)localObject1).e()) {
      x((x)localObject1, bool);
    }
    localObject1 = x.c(paramBundle);
    if (localObject1 != null)
    {
      if (paramInt == -30) {
        paramBundle = "tcf";
      } else {
        paramBundle = "app";
      }
      localObject1 = ((Boolean)localObject1).toString();
      if (bool)
      {
        F(paramBundle, "allow_personalized_ads", localObject1, paramLong);
        return;
      }
      G(paramBundle, "allow_personalized_ads", localObject1, false, paramLong);
    }
  }
  
  public final void w(Bundle paramBundle, long paramLong)
  {
    j.i(paramBundle);
    Bundle localBundle = new Bundle(paramBundle);
    if (!TextUtils.isEmpty(localBundle.getString("app_id"))) {
      zzjr.b("Package name should be null when calling setConditionalUserProperty");
    }
    localBundle.remove("app_id");
    m0.i0(localBundle, "app_id", String.class, null);
    m0.i0(localBundle, "origin", String.class, null);
    m0.i0(localBundle, "name", String.class, null);
    m0.i0(localBundle, "value", Object.class, null);
    m0.i0(localBundle, "trigger_event_name", String.class, null);
    m0.i0(localBundle, "trigger_timeout", Long.class, Long.valueOf(0L));
    m0.i0(localBundle, "timed_out_event_name", String.class, null);
    m0.i0(localBundle, "timed_out_event_params", Bundle.class, null);
    m0.i0(localBundle, "triggered_event_name", String.class, null);
    m0.i0(localBundle, "triggered_event_params", Bundle.class, null);
    m0.i0(localBundle, "time_to_live", Long.class, Long.valueOf(0L));
    m0.i0(localBundle, "expired_event_name", String.class, null);
    m0.i0(localBundle, "expired_event_params", Bundle.class, null);
    j.e(localBundle.getString("name"));
    j.e(localBundle.getString("origin"));
    j.i(localBundle.get("value"));
    localBundle.putLong("creation_timestamp", paramLong);
    String str = localBundle.getString("name");
    Object localObject = localBundle.get("value");
    if (k().e0(str) != 0)
    {
      zzjo.c("Invalid conditional user property name", i().g(str));
      return;
    }
    if (k().p(localObject, str) != 0)
    {
      zzjo.d("Invalid conditional user property value", i().g(str), localObject);
      return;
    }
    paramBundle = k().l0(localObject, str);
    if (paramBundle == null)
    {
      zzjo.d("Unable to normalize conditional user property value", i().g(str), localObject);
      return;
    }
    m0.j0(localBundle, paramBundle);
    paramLong = localBundle.getLong("trigger_timeout");
    if ((!TextUtils.isEmpty(localBundle.getString("trigger_event_name"))) && ((paramLong > 15552000000L) || (paramLong < 1L)))
    {
      zzjo.d("Invalid conditional user property timeout", i().g(str), Long.valueOf(paramLong));
      return;
    }
    paramLong = localBundle.getLong("time_to_live");
    if ((paramLong <= 15552000000L) && (paramLong >= 1L))
    {
      zzl().u(new o3(this, localBundle, 1));
      return;
    }
    zzjo.d("Invalid conditional user property time to live", i().g(str), Long.valueOf(paramLong));
  }
  
  public final void x(x paramx, boolean paramBoolean)
  {
    paramx = new t(2, this, paramx);
    if (paramBoolean)
    {
      l();
      paramx.run();
      return;
    }
    zzl().u(paramx);
  }
  
  public final void y(e3 parame3)
  {
    l();
    boolean bool;
    if (((parame3.p()) && (parame3.o())) || (q().D())) {
      bool = true;
    } else {
      bool = false;
    }
    parame3 = (j2)b;
    parame3.zzl().l();
    if (bool != M)
    {
      parame3 = (j2)b;
      parame3.zzl().l();
      M = bool;
      parame3 = j();
      parame3.l();
      if (parame3.v().contains("measurement_enabled_from_api")) {
        parame3 = Boolean.valueOf(parame3.v().getBoolean("measurement_enabled_from_api", true));
      } else {
        parame3 = null;
      }
      if ((!bool) || (parame3 == null) || (parame3.booleanValue())) {
        B(Boolean.valueOf(bool), false);
      }
    }
  }
  
  public final void z(e3 parame3, boolean paramBoolean)
  {
    ??? = g3.b;
    t();
    int i = b;
    g3 localg31;
    Object localObject2;
    if (i != -10)
    {
      localg31 = (g3)a.get(e3.a.b);
      localObject2 = localg31;
      if (localg31 == null) {
        localObject2 = ???;
      }
      if (localObject2 == ???)
      {
        localg31 = (g3)a.get(e3.a.c);
        localObject2 = localg31;
        if (localg31 == null) {
          localObject2 = ???;
        }
        if (localObject2 == ???)
        {
          zzjt.b("Ignoring empty consent settings");
          return;
        }
      }
    }
    synchronized (q)
    {
      boolean bool1 = e3.i(i, x.b);
      int j = 0;
      boolean bool2 = false;
      label245:
      boolean bool3;
      if (bool1)
      {
        localObject2 = x;
        for (Object localObject3 : (e3.a[])a.keySet().toArray(new e3.a[0]))
        {
          localg31 = (g3)a.get(localObject3);
          g3 localg32 = (g3)a.get(localObject3);
          localObject3 = g3.d;
          if ((localg31 == localObject3) && (localg32 != localObject3))
          {
            bool1 = true;
            break label245;
          }
        }
        bool1 = false;
        bool3 = bool2;
        if (parame3.p())
        {
          bool3 = bool2;
          if (!x.p()) {
            bool3 = true;
          }
        }
        parame3 = parame3.k(x);
        x = parame3;
        j = 1;
      }
      else
      {
        bool1 = false;
        bool3 = bool1;
      }
      if (j == 0)
      {
        zzju.c("Ignoring lower-priority consent settings, proposed settings", parame3);
        return;
      }
      long l = y.getAndIncrement();
      if (bool1)
      {
        P(null);
        parame3 = new h4(this, parame3, l, bool3);
        if (paramBoolean)
        {
          l();
          parame3.run();
          return;
        }
        zzl().v(parame3);
        return;
      }
      parame3 = new g4(this, parame3, l, bool3);
      if (paramBoolean)
      {
        l();
        parame3.run();
        return;
      }
      if ((i != 30) && (i != -10))
      {
        zzl().u(parame3);
        return;
      }
      zzl().v(parame3);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     e7.k3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */