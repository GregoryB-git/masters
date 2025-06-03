package y1;

import F1.b;
import G1.f;
import G1.i;
import O1.C.a;
import O1.P;
import O1.Q;
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
import android.util.Log;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import x1.B;
import x1.N;
import x1.a.c;
import x1.o;

public final class s
{
  public static final a c = new a(null);
  public static final String d;
  public static ScheduledThreadPoolExecutor e;
  public static p.b f = p.b.o;
  public static final Object g = new Object();
  public static String h;
  public static boolean i;
  public static String j;
  public final String a;
  public a b;
  
  static
  {
    String str1 = s.class.getCanonicalName();
    String str2 = str1;
    if (str1 == null) {
      str2 = "com.facebook.appevents.AppEventsLoggerImpl";
    }
    d = str2;
  }
  
  public s(Context paramContext, String paramString, x1.a parama)
  {
    this(P.t(paramContext), paramString, parama);
  }
  
  public s(String paramString1, String paramString2, x1.a parama)
  {
    Q.l();
    a = paramString1;
    paramString1 = parama;
    if (parama == null) {
      paramString1 = x1.a.z.e();
    }
    if ((paramString1 != null) && (!paramString1.n()) && ((paramString2 == null) || (Intrinsics.a(paramString2, paramString1.c())))) {}
    for (paramString1 = new a(paramString1);; paramString1 = new a(null, paramString1))
    {
      b = paramString1;
      break;
      paramString1 = paramString2;
      if (paramString2 == null)
      {
        paramString1 = P.a;
        paramString1 = P.J(B.l());
      }
      if (paramString1 == null) {
        break label115;
      }
    }
    a.c(c);
    return;
    label115:
    throw new IllegalStateException("Required value was null.".toString());
  }
  
  public final void j()
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      n localn = n.a;
      n.l(C.o);
      return;
    }
    finally
    {
      T1.a.b(localThrowable, this);
    }
  }
  
  public final String k()
  {
    if (T1.a.d(this)) {
      return null;
    }
    try
    {
      String str = b.b();
      return str;
    }
    finally
    {
      T1.a.b(localThrowable, this);
    }
    return null;
  }
  
  public final void l(String paramString)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      o(paramString, null);
      return;
    }
    finally
    {
      T1.a.b(paramString, this);
    }
  }
  
  public final void m(String paramString, double paramDouble)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      n(paramString, paramDouble, null);
      return;
    }
    finally
    {
      T1.a.b(paramString, this);
    }
  }
  
  public final void n(String paramString, double paramDouble, Bundle paramBundle)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      p(paramString, Double.valueOf(paramDouble), paramBundle, false, f.m());
      return;
    }
    finally
    {
      T1.a.b(paramString, this);
    }
  }
  
  public final void o(String paramString, Bundle paramBundle)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      p(paramString, null, paramBundle, false, f.m());
      return;
    }
    finally
    {
      T1.a.b(paramString, this);
    }
  }
  
  public final void p(String paramString, Double paramDouble, Bundle paramBundle, boolean paramBoolean, UUID paramUUID)
  {
    if (T1.a.d(this)) {
      return;
    }
    if (paramString != null) {
      try
      {
        if (paramString.length() != 0)
        {
          localObject = O1.q.a;
          boolean bool = O1.q.d("app_events_killswitch", B.m(), false);
          if (bool)
          {
            O1.C.e.c(N.s, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", new Object[] { paramString });
            return;
          }
        }
      }
      finally
      {
        Object localObject;
        break label181;
        try
        {
          b.h(paramBundle, paramString);
          F1.c.e(paramBundle);
          localObject = new y1/e;
          ((e)localObject).<init>(a, paramString, paramDouble, paramBundle, paramBoolean, f.o(), paramUUID);
          a.d(c, (e)localObject, b);
        }
        catch (o paramString) {}catch (JSONException paramString)
        {
          break label155;
        }
        O1.C.e.c(N.s, "AppEvents", "Invalid app event: %s", new Object[] { paramString.toString() });
        break label180;
        label155:
        O1.C.e.c(N.s, "AppEvents", "JSON encoding for app event failed: '%s'", new Object[] { paramString.toString() });
        label180:
        return;
        label181:
        T1.a.b(paramString, this);
      }
    }
  }
  
  public final void q(String paramString1, String paramString2)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("_is_suggested_event", "1");
      localBundle.putString("_button_text", paramString2);
      o(paramString1, localBundle);
      return;
    }
    finally
    {
      T1.a.b(paramString1, this);
    }
  }
  
  public final void r(String paramString, Double paramDouble, Bundle paramBundle)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      p(paramString, paramDouble, paramBundle, true, f.m());
      return;
    }
    finally
    {
      T1.a.b(paramString, this);
    }
  }
  
  public final void s(String paramString, BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    if (T1.a.d(this)) {
      return;
    }
    if ((paramBigDecimal != null) && (paramCurrency != null))
    {
      Bundle localBundle = paramBundle;
      if (paramBundle == null) {}
      try
      {
        localBundle = new android/os/Bundle;
        localBundle.<init>();
      }
      finally
      {
        break label90;
      }
      localBundle.putString("fb_currency", paramCurrency.getCurrencyCode());
      p(paramString, Double.valueOf(paramBigDecimal.doubleValue()), localBundle, true, f.m());
      return;
    }
    paramString = P.a;
    P.j0(d, "purchaseAmount and currency cannot be null");
    return;
    label90:
    T1.a.b(paramString, this);
  }
  
  public final void t(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      if (i.c()) {
        Log.w(d, "You are logging purchase events while auto-logging of in-app purchase is enabled in the SDK. Make sure you don't log duplicate events");
      }
    }
    finally
    {
      break label40;
    }
    u(paramBigDecimal, paramCurrency, paramBundle, false);
    return;
    label40:
    T1.a.b(paramBigDecimal, this);
  }
  
  public final void u(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle, boolean paramBoolean)
  {
    if (T1.a.d(this)) {
      return;
    }
    if (paramBigDecimal == null) {
      try
      {
        a.e(c, "purchaseAmount cannot be null");
        return;
      }
      finally
      {
        break label97;
      }
    }
    if (paramCurrency == null)
    {
      a.e(c, "currency cannot be null");
      return;
    }
    Bundle localBundle = paramBundle;
    if (paramBundle == null)
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>();
    }
    localBundle.putString("fb_currency", paramCurrency.getCurrencyCode());
    p("fb_mobile_purchase", Double.valueOf(paramBigDecimal.doubleValue()), localBundle, paramBoolean, f.m());
    c.g();
    return;
    label97:
    T1.a.b(paramBigDecimal, this);
  }
  
  public final void v(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      u(paramBigDecimal, paramCurrency, paramBundle, true);
      return;
    }
    finally
    {
      T1.a.b(paramBigDecimal, this);
    }
  }
  
  /* Error */
  public final void w(Bundle paramBundle, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 139	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: aload_1
    //   9: ldc_w 328
    //   12: invokestatic 73	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc_w 330
    //   19: invokevirtual 334	android/os/BaseBundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   22: astore_1
    //   23: aload_1
    //   24: invokestatic 338	O1/P:c0	(Ljava/lang/String;)Z
    //   27: ifeq +4 -> 31
    //   30: return
    //   31: new 340	org/json/JSONObject
    //   34: astore_3
    //   35: aload_3
    //   36: aload_1
    //   37: invokespecial 341	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   40: aload_3
    //   41: ldc_w 343
    //   44: invokevirtual 344	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   47: astore_1
    //   48: goto +10 -> 58
    //   51: astore_1
    //   52: goto +63 -> 115
    //   55: astore_1
    //   56: aconst_null
    //   57: astore_1
    //   58: aload_1
    //   59: ifnonnull +19 -> 78
    //   62: getstatic 221	O1/C:e	LO1/C$a;
    //   65: getstatic 346	x1/N:t	Lx1/N;
    //   68: getstatic 43	y1/s:d	Ljava/lang/String;
    //   71: ldc_w 348
    //   74: invokevirtual 351	O1/C$a:b	(Lx1/N;Ljava/lang/String;Ljava/lang/String;)V
    //   77: return
    //   78: new 264	android/os/Bundle
    //   81: astore_3
    //   82: aload_3
    //   83: invokespecial 265	android/os/Bundle:<init>	()V
    //   86: aload_3
    //   87: ldc_w 353
    //   90: aload_1
    //   91: invokevirtual 274	android/os/BaseBundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   94: aload_2
    //   95: ifnull +11 -> 106
    //   98: aload_3
    //   99: ldc_w 355
    //   102: aload_2
    //   103: invokevirtual 274	android/os/BaseBundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   106: aload_0
    //   107: ldc_w 357
    //   110: aload_3
    //   111: invokevirtual 174	y1/s:o	(Ljava/lang/String;Landroid/os/Bundle;)V
    //   114: return
    //   115: aload_1
    //   116: aload_0
    //   117: invokestatic 144	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   120: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	this	s
    //   0	121	1	paramBundle	Bundle
    //   0	121	2	paramString	String
    //   34	77	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	15	51	finally
    //   15	30	51	finally
    //   31	48	51	finally
    //   62	77	51	finally
    //   78	94	51	finally
    //   98	106	51	finally
    //   106	114	51	finally
    //   15	30	55	org/json/JSONException
    //   31	48	55	org/json/JSONException
  }
  
  public static final class a
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
      if ((O1.n.g(n.b.F)) && (I1.c.d())) {
        I1.c.e(parama.b(), parame);
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
}

/* Location:
 * Qualified Name:     y1.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */