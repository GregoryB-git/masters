package l6;

import android.app.job.JobParameters;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import b8.f0;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IAccountAccessor.Stub;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.android.gms.internal.measurement.zzgf.zzo.zza;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import e7.a1;
import e7.b1;
import e7.c3;
import e7.d3;
import e7.e2;
import e7.e3;
import e7.e3.a;
import e7.g3;
import e7.h0;
import e7.i3;
import e7.i5;
import e7.j0;
import e7.j2;
import e7.k3;
import e7.k6;
import e7.l1;
import e7.m0;
import e7.m5;
import e7.n0;
import e7.n1;
import e7.o0;
import e7.o1;
import e7.o4;
import e7.o5;
import e7.q1;
import e7.q5;
import e7.r1;
import e7.r6;
import e7.t0;
import e7.u3;
import e7.u6;
import e7.v;
import e7.v3;
import e7.v5;
import e7.w0;
import e7.w4;
import e7.w6;
import e7.x;
import e7.x2;
import e7.y3;
import e7.z;
import j6.b;
import java.util.EnumMap;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k6.a.f;
import x6.c;
import x6.d;

public final class q0
  implements Runnable
{
  public final void run()
  {
    int i = a;
    Object localObject1 = null;
    boolean bool1 = false;
    Object localObject7;
    boolean bool2;
    Object localObject3;
    Object localObject8;
    Object localObject9;
    label980:
    label1414:
    label1622:
    label1767:
    Object localObject6;
    switch (i)
    {
    default: 
      break;
    case 6: 
      ??? = c).a.m();
      localObject1 = (zzdq)b;
      localObject7 = c).a;
      bool2 = bool1;
      if (J != null)
      {
        bool2 = bool1;
        if (J.booleanValue()) {
          bool2 = true;
        }
      }
      ((r6)???).I((zzdq)localObject1, bool2);
      return;
    case 5: 
      localObject1 = (m5)b;
      ??? = (JobParameters)c;
      Log.v("FA", "AppMeasurementJobService processed last Scion upload request.");
      ((o5)a).b((JobParameters)???);
      return;
    case 4: 
      synchronized ((i5)c)
      {
        c).a = false;
        if (!c).c.C())
        {
          c).c.zzj().v.b("Connected to remote service");
          localObject7 = c).c;
          localObject1 = (n0)b;
          ((o0)localObject7).l();
          m6.j.i(localObject1);
          e = ((n0)localObject1);
          ((w4)localObject7).H();
          ((w4)localObject7).G();
        }
        return;
      }
    case 3: 
      ??? = (w4)c;
      localObject3 = e;
      if (localObject3 == null)
      {
        zzjo.b("Failed to reset data on the service: not connected to service");
      }
      else
      {
        try
        {
          m6.j.i((k6)b);
          ((n0)localObject3).M2((k6)b);
        }
        catch (RemoteException localRemoteException)
        {
          c).zzj().o.c("Failed to reset data on the service: remote exception", localRemoteException);
        }
        ((w4)c).H();
      }
      return;
    case 2: 
      ((k3)c).B((Boolean)b, true);
      return;
    case 1: 
      Object localObject5 = (j2)c;
      localObject3 = (i3)b;
      ((j2)localObject5).zzl().l();
      localObject7 = new z((j2)localObject5);
      ((d3)localObject7).n();
      D = ((z)localObject7);
      localObject3 = new t0((j2)localObject5, f);
      ((j0)localObject3).u();
      E = ((t0)localObject3);
      localObject7 = new w0((j2)localObject5);
      ((j0)localObject7).u();
      B = ((w0)localObject7);
      localObject7 = new w4((j2)localObject5);
      ((j0)localObject7).u();
      C = ((w4)localObject7);
      localObject7 = t;
      if (!c)
      {
        ((r6)localObject7).d0();
        b).P.incrementAndGet();
        c = true;
        localObject7 = p;
        if (!c)
        {
          ((l1)localObject7).s();
          b).P.incrementAndGet();
          c = true;
          localObject7 = E;
          if (!c)
          {
            ((t0)localObject7).y();
            b).P.incrementAndGet();
            c = true;
            localObject7 = new o4((j2)localObject5);
            ((j0)localObject7).u();
            F = ((o4)localObject7);
            if (!c)
            {
              ((o4)localObject7).x();
              b).P.incrementAndGet();
              c = true;
              zzju.c("App measurement initialized, version", Long.valueOf(114010L));
              zzju.b("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
              localObject3 = ((t0)localObject3).v();
              if (TextUtils.isEmpty(b)) {
                if (((j2)localObject5).m().p0((String)localObject3, o.d))
                {
                  zzju.b("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                }
                else
                {
                  localObject8 = zzju;
                  localObject7 = new StringBuilder("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                  ((StringBuilder)localObject7).append((String)localObject3);
                  ((b1)localObject8).b(((StringBuilder)localObject7).toString());
                }
              }
              zzjv.b("Debug-level message logging enabled");
              if (N != P.get()) {
                zzjo.d("Not all components initialized", Integer.valueOf(N), Integer.valueOf(P.get()));
              }
              G = true;
              localObject7 = (j2)c;
              localObject9 = b).g;
              localObject8 = e3.a.c;
              ((j2)localObject7).zzl().l();
              localObject3 = o;
              localObject5 = h0.M0;
              if (((e7.h)localObject3).x(null, (m0)localObject5))
              {
                localObject3 = F;
                if (localObject3 != null)
                {
                  if (((o4)localObject3).w() == zzgf.zzo.zza.zzb)
                  {
                    i = 1;
                    break label980;
                  }
                }
                else {
                  throw new IllegalStateException("Component not created");
                }
              }
              i = 0;
              if (((zzoy.zza()) && (o.x(null, h0.R0)) && (((j2)localObject7).m().D0())) || (i != 0))
              {
                localObject10 = ((j2)localObject7).m();
                ((d2.q)localObject10).l();
                localObject3 = new IntentFilter();
                ((IntentFilter)localObject3).addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                if (((d2.q)localObject10).h().x(null, (m0)localObject5)) {
                  ((IntentFilter)localObject3).addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                }
                localObject5 = new u6((j2)b);
                v.a.registerReceiver(((d2.q)localObject10).zza(), (BroadcastReceiver)localObject5, (IntentFilter)localObject3, 2);
                zzjv.b("Registered app receiver");
              }
              if (i != 0)
              {
                localObject5 = F;
                if (localObject5 != null) {
                  ((o4)localObject5).v(((Long)h0.y.a(null)).longValue());
                } else {
                  throw new IllegalStateException("Component not created");
                }
              }
              localObject3 = ((j2)localObject7).j().y();
              i = b;
              g3 localg3 = o.t("google_analytics_default_allow_ad_storage", false);
              localObject5 = o.t("google_analytics_default_allow_analytics_storage", false);
              Object localObject10 = g3.b;
              if (((localg3 != localObject10) || (localObject5 != localObject10)) && (((j2)localObject7).j().q(-10)))
              {
                EnumMap localEnumMap = new EnumMap(e3.a.class);
                localEnumMap.put(e3.a.b, localg3);
                localEnumMap.put((Enum)localObject8, localObject5);
                localObject5 = new e3(localEnumMap, -10);
              }
              else
              {
                if ((!TextUtils.isEmpty(((j2)localObject7).h().w())) && ((i == 0) || (i == 30) || (i == 10) || (i == 30) || (i == 30) || (i == 40)))
                {
                  ((j2)localObject7).k().z(new e3(-10), false);
                }
                else if ((TextUtils.isEmpty(((j2)localObject7).h().w())) && (localObject9 != null) && (zzg != null) && (((j2)localObject7).j().q(30)))
                {
                  localObject5 = e3.b(30, zzg);
                  if (((e3)localObject5).q()) {
                    break label1414;
                  }
                }
                localObject5 = null;
              }
              if (localObject5 != null)
              {
                ((j2)localObject7).k().z((e3)localObject5, true);
                localObject3 = localObject5;
              }
              ((j2)localObject7).k().y((e3)localObject3);
              i = jxa;
              localObject5 = o.t("google_analytics_default_allow_ad_personalization_signals", true);
              if (localObject5 != localObject10) {
                zzjw.c("Default ad personalization consent from Manifest", localObject5);
              }
              localObject5 = o.t("google_analytics_default_allow_ad_user_data", true);
              if ((localObject5 != localObject10) && (e3.i(-10, i)))
              {
                localObject3 = ((j2)localObject7).k();
                localObject9 = new EnumMap(e3.a.class);
                ((EnumMap)localObject9).put(e3.a.d, localObject5);
                localObject5 = new x((EnumMap)localObject9, -10, null, null);
              }
              else
              {
                if ((TextUtils.isEmpty(((j2)localObject7).h().w())) || ((i != 0) && (i != 30))) {
                  break label1622;
                }
                localObject3 = ((j2)localObject7).k();
                localObject5 = new x(null, -10, null, null);
              }
              ((k3)localObject3).x((x)localObject5, true);
              break label1767;
              if ((TextUtils.isEmpty(((j2)localObject7).h().w())) && (localObject9 != null) && (zzg != null) && (e3.i(30, i)))
              {
                localObject5 = x.a(30, zzg);
                if (((x)localObject5).e()) {
                  ((j2)localObject7).k().x((x)localObject5, true);
                }
              }
              if ((TextUtils.isEmpty(((j2)localObject7).h().w())) && (localObject9 != null) && (zzg != null) && (jw.a() == null))
              {
                localObject5 = x.c(zzg);
                if (localObject5 != null) {
                  ((j2)localObject7).k().H(zze, "allow_personalized_ads", ((Boolean)localObject5).toString(), false);
                }
              }
              localObject5 = o.v("google_analytics_tcf_data_enabled");
              if (localObject5 == null) {
                bool2 = true;
              } else {
                bool2 = ((Boolean)localObject5).booleanValue();
              }
              if (bool2)
              {
                zzjv.b("TCF client enabled.");
                localObject5 = ((j2)localObject7).k();
                ((o0)localObject5).l();
                zzjv.b("Register tcfPrefChangeListener.");
                if (D == null)
                {
                  E = new y3((c3)localObject5, (j2)b, 1);
                  D = new u3((k3)localObject5);
                }
                ((d2.q)localObject5).j().u().registerOnSharedPreferenceChangeListener(D);
                ((j2)localObject7).k().M();
              }
              if (jp.a() == 0L)
              {
                zzjw.c("Persisting first open", Long.valueOf(Q));
                jp.b(Q);
              }
              localObject5 = kA;
              if ((((w6)localObject5).b()) && (((w6)localObject5).c())) {
                a.j().G.b(null);
              }
              if (!((j2)localObject7).e())
              {
                if (((j2)localObject7).d())
                {
                  if (!((j2)localObject7).m().q0("android.permission.INTERNET")) {
                    zzjo.b("App is missing INTERNET permission");
                  }
                  if (!((j2)localObject7).m().q0("android.permission.ACCESS_NETWORK_STATE")) {
                    zzjo.b("App is missing ACCESS_NETWORK_STATE permission");
                  }
                  if ((!d.a(a).c()) && (!o.C()))
                  {
                    if (!r6.R(a)) {
                      zzjo.b("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!r6.c0(a)) {
                      zzjo.b("AppMeasurementService not registered/enabled");
                    }
                  }
                  zzjo.b("Uploading is not possible. App measurement disabled");
                }
              }
              else
              {
                if (TextUtils.isEmpty(((j2)localObject7).h().w()))
                {
                  localObject5 = ((j2)localObject7).h();
                  ((j0)localObject5).t();
                  if (TextUtils.isEmpty(w)) {}
                }
                else
                {
                  ((j2)localObject7).m();
                  localObject5 = ((j2)localObject7).h().w();
                  localObject3 = ((j2)localObject7).j();
                  ((d2.q)localObject3).l();
                  localObject3 = ((l1)localObject3).v().getString("gmp_app_id", null);
                  localObject9 = ((j2)localObject7).h();
                  ((j0)localObject9).t();
                  localObject10 = w;
                  localObject9 = ((j2)localObject7).j();
                  ((d2.q)localObject9).l();
                  if (r6.X((String)localObject5, (String)localObject3, (String)localObject10, ((l1)localObject9).v().getString("admob_app_id", null)))
                  {
                    zzju.b("Rechecking which service to use due to a GMP App Id change");
                    localObject5 = ((j2)localObject7).j();
                    ((d2.q)localObject5).l();
                    localObject9 = ((l1)localObject5).z();
                    localObject3 = ((l1)localObject5).v().edit();
                    ((SharedPreferences.Editor)localObject3).clear();
                    ((SharedPreferences.Editor)localObject3).apply();
                    if (localObject9 != null) {
                      ((l1)localObject5).p((Boolean)localObject9);
                    }
                    j2.b(B);
                    B.x();
                    C.B();
                    C.A();
                    jp.b(Q);
                    jq.b(null);
                  }
                  localObject3 = ((j2)localObject7).j();
                  localObject5 = ((j2)localObject7).h().w();
                  ((d2.q)localObject3).l();
                  localObject3 = ((l1)localObject3).v().edit();
                  ((SharedPreferences.Editor)localObject3).putString("gmp_app_id", (String)localObject5);
                  ((SharedPreferences.Editor)localObject3).apply();
                  localObject5 = ((j2)localObject7).j();
                  localObject3 = ((j2)localObject7).h();
                  ((j0)localObject3).t();
                  localObject3 = w;
                  ((d2.q)localObject5).l();
                  localObject5 = ((l1)localObject5).v().edit();
                  ((SharedPreferences.Editor)localObject5).putString("admob_app_id", (String)localObject3);
                  ((SharedPreferences.Editor)localObject5).apply();
                }
                if (!((j2)localObject7).j().y().j((e3.a)localObject8)) {
                  jq.b(null);
                }
                ((j2)localObject7).k().P(jq.a());
                localObject5 = ((j2)localObject7).m();
                localObject5.getClass();
                try
                {
                  ((d2.q)localObject5).zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                  i = 1;
                }
                catch (ClassNotFoundException localClassNotFoundException)
                {
                  i = 0;
                }
                if ((i == 0) && (!TextUtils.isEmpty(jF.a())))
                {
                  zzjr.b("Remote config removed with active feature rollouts");
                  jF.b(null);
                }
                if (TextUtils.isEmpty(((j2)localObject7).h().w()))
                {
                  localObject6 = ((j2)localObject7).h();
                  ((j0)localObject6).t();
                  if (TextUtils.isEmpty(w)) {}
                }
                else
                {
                  bool1 = ((j2)localObject7).d();
                  localObject6 = jd;
                  if (localObject6 == null) {
                    bool2 = false;
                  } else {
                    bool2 = ((SharedPreferences)localObject6).contains("deferred_analytics_collection");
                  }
                  if ((!bool2) && (!o.B())) {
                    ((j2)localObject7).j().t(bool1 ^ true);
                  }
                  if (bool1) {
                    ((j2)localObject7).k().J();
                  }
                  j2.b(s);
                  s.f.a();
                  ((j2)localObject7).l().y(new AtomicReference());
                  localObject6 = ((j2)localObject7).l();
                  localObject3 = jI.a();
                  ((o0)localObject6).l();
                  ((j0)localObject6).t();
                  ((w4)localObject6).x(new x2((w4)localObject6, ((w4)localObject6).I(false), (Bundle)localObject3));
                }
              }
              if ((zzoy.zza()) && (o.x(null, h0.R0)) && (((j2)localObject7).m().D0()))
              {
                localObject6 = h0.s0;
                if (((Integer)((m0)localObject6).a(null)).intValue() > 0)
                {
                  long l1 = ((Integer)((m0)localObject6).a(null)).intValue();
                  long l2 = new Random().nextInt(5000);
                  v.getClass();
                  l1 = Math.max(500L, l1 * 1000L + l2 - SystemClock.elapsedRealtime());
                  if (l1 > 500L) {
                    zzjw.c("Waiting to fetch trigger URIs until some time after boot. Delay in millis", Long.valueOf(l1));
                  }
                  localObject6 = ((j2)localObject7).k();
                  ((o0)localObject6).l();
                  if (u == null) {
                    u = new v3((k3)localObject6, (j2)b);
                  }
                  u.b(l1);
                }
                else
                {
                  localObject6 = ((j2)localObject7).k();
                  Objects.requireNonNull(localObject6);
                  new Thread(new i6.q(localObject6, 3)).start();
                }
              }
              jy.a(true);
              return;
            }
            throw new IllegalStateException("Can't initialize twice");
          }
          throw new IllegalStateException("Can't initialize twice");
        }
        throw new IllegalStateException("Can't initialize twice");
      }
      throw new IllegalStateException("Can't initialize twice");
    case 0: 
      localObject8 = (zact)c;
      localObject9 = (h7.j)b;
      localObject6 = zact.v;
      localObject7 = b;
      localObject6 = localObject7;
      if (((b)localObject7).D())
      {
        localObject9 = c;
        m6.j.i(localObject9);
        localObject6 = c;
        if (!((b)localObject6).D())
        {
          localObject7 = String.valueOf(localObject6);
          localObject3 = new Exception();
          Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat((String)localObject7), (Throwable)localObject3);
        }
        else
        {
          localObject7 = u;
          localObject6 = b;
          if (localObject6 == null) {
            localObject6 = localObject3;
          } else {
            localObject6 = IAccountAccessor.Stub.asInterface((IBinder)localObject6);
          }
          localObject3 = d;
          localObject7 = (g0)localObject7;
          localObject7.getClass();
          if ((localObject6 != null) && (localObject3 != null))
          {
            c = ((IAccountAccessor)localObject6);
            d = ((Set)localObject3);
            if (!e) {
              break label3406;
            }
            a.getRemoteService((IAccountAccessor)localObject6, (Set)localObject3);
            break label3406;
          }
          Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
          ((g0)localObject7).b(new b(4));
          break label3406;
        }
      }
      ((g0)u).b((b)localObject6);
      label3406:
      ((com.google.android.gms.common.internal.a)f).disconnect();
      return;
    }
    ((f0)b).onVerificationFailed((u7.h)c);
  }
}

/* Location:
 * Qualified Name:     l6.q0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */