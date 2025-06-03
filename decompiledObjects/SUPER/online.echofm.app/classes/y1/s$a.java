package y1;

import G1.f;
import I1.c;
import O1.C.a;
import O1.n.b;
import O1.v;
import O1.y;
import O1.y.a;
import V5.t;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import x1.N;
import x1.o;

public final class s$a
{
  public static final void n(Context paramContext, s params)
  {
    Intrinsics.checkNotNullParameter(paramContext, "$context");
    Intrinsics.checkNotNullParameter(params, "$logger");
    Bundle localBundle = new Bundle();
    int i = 0;
    int j = i;
    for (;;)
    {
      int k = i + 1;
      String str1 = new String[] { "com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService" }[i];
      String str2 = new String[] { "core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included" }[i];
      try
      {
        Class.forName(str1);
        localBundle.putInt(str2, 1);
        j |= 1 << i;
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        for (;;) {}
      }
      if (k > 10)
      {
        paramContext = paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
        if (paramContext.getInt("kitsBitmask", 0) != j)
        {
          paramContext.edit().putInt("kitsBitmask", j).apply();
          params.r("fb_sdk_initialize", null, localBundle);
        }
        return;
      }
      i = k;
    }
  }
  
  public static final void p()
  {
    Object localObject = new HashSet();
    Iterator localIterator = n.p().iterator();
    while (localIterator.hasNext()) {
      ((Set)localObject).add(((a)localIterator.next()).b());
    }
    localObject = ((Set)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      v.q((String)((Iterator)localObject).next(), true);
    }
  }
  
  public final void f(Application paramApplication, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramApplication, "application");
    if (B.F())
    {
      d.e();
      L.i();
      String str = paramString;
      if (paramString == null) {
        str = B.m();
      }
      B.K(paramApplication, str);
      f.x(paramApplication, str);
      return;
    }
    throw new o("The Facebook sdk must be initialized before calling activateApp");
  }
  
  public final void g()
  {
    if (j() != p.b.p)
    {
      n localn = n.a;
      n.l(C.t);
    }
  }
  
  public final Executor h()
  {
    if (s.b() == null) {
      o();
    }
    ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = s.b();
    if (localScheduledThreadPoolExecutor != null) {
      return localScheduledThreadPoolExecutor;
    }
    throw new IllegalStateException("Required value was null.".toString());
  }
  
  public final String i(Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    if (s.a() == null)
    {
      synchronized (s.e())
      {
        if (s.a() == null)
        {
          s.h(paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null));
          if (s.a() == null)
          {
            UUID localUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(localUUID, "randomUUID()");
            s.h(Intrinsics.i("XZ", localUUID));
            paramContext.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", s.a()).apply();
          }
        }
      }
      paramContext = t.a;
      break label119;
      throw paramContext;
    }
    label119:
    paramContext = s.a();
    if (paramContext != null) {
      return paramContext;
    }
    throw new IllegalStateException("Required value was null.".toString());
  }
  
  public final p.b j()
  {
    synchronized ()
    {
      p.b localb = s.c();
      return localb;
    }
  }
  
  public final String k()
  {
    y localy = y.a;
    y.d(new a());
    return B.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
  }
  
  public final String l()
  {
    synchronized ()
    {
      String str = s.d();
      return str;
    }
  }
  
  public final void m(Context paramContext, String paramString)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    if (!B.p()) {
      return;
    }
    paramString = new s(paramContext, paramString, null);
    ScheduledThreadPoolExecutor localScheduledThreadPoolExecutor = s.b();
    if (localScheduledThreadPoolExecutor != null)
    {
      localScheduledThreadPoolExecutor.execute(new r(paramContext, paramString));
      return;
    }
    throw new IllegalStateException("Required value was null.".toString());
  }
  
  public final void o()
  {
    synchronized ()
    {
      Object localObject2 = s.b();
      if (localObject2 != null) {
        return;
      }
      localObject2 = new java/util/concurrent/ScheduledThreadPoolExecutor;
      ((ScheduledThreadPoolExecutor)localObject2).<init>(1);
      s.i((ScheduledThreadPoolExecutor)localObject2);
      localObject2 = t.a;
      localObject2 = new q();
      ??? = s.b();
      if (??? != null)
      {
        ((ScheduledThreadPoolExecutor)???).scheduleAtFixedRate((Runnable)localObject2, 0L, 86400L, TimeUnit.SECONDS);
        return;
      }
      throw new IllegalStateException("Required value was null.".toString());
    }
  }
  
  public final void q(e parame, a parama)
  {
    n.g(parama, parame);
    O1.n localn = O1.n.a;
    if ((O1.n.g(n.b.F)) && (c.d())) {
      c.e(parama.b(), parame);
    }
    if ((!parame.c()) && (!s.f())) {
      if (Intrinsics.a(parame.f(), "fb_mobile_activate_app")) {
        s.g(true);
      } else {
        O1.C.e.b(N.s, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
      }
    }
  }
  
  public final void r(String paramString)
  {
    O1.C.e.b(N.t, "AppEvents", paramString);
  }
  
  public final void s() {}
  
  public final void t(String paramString)
  {
    SharedPreferences localSharedPreferences = B.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
    if (paramString != null) {
      localSharedPreferences.edit().putString("install_referrer", paramString).apply();
    }
  }
  
  public static final class a
    implements y.a
  {
    public void a(String paramString)
    {
      s.c.t(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     y1.s.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */