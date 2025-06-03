package x1;

import O1.P;
import O1.a.a;
import O1.r;
import O1.v;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class X
{
  public static final X a = new X();
  public static final String b = X.class.getName();
  public static final AtomicBoolean c = new AtomicBoolean(false);
  public static final AtomicBoolean d = new AtomicBoolean(false);
  public static final a e = new a(true, "com.facebook.sdk.AutoInitEnabled");
  public static final a f = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
  public static final a g = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
  public static final a h = new a(false, "auto_event_setup_enabled");
  public static final a i = new a(true, "com.facebook.sdk.MonitorEnabled");
  public static SharedPreferences j;
  
  public static final boolean d()
  {
    if (T1.a.d(X.class)) {
      return false;
    }
    try
    {
      a.j();
      boolean bool = g.e();
      return bool;
    }
    finally
    {
      T1.a.b(localThrowable, X.class);
    }
    return false;
  }
  
  public static final boolean e()
  {
    if (T1.a.d(X.class)) {
      return false;
    }
    try
    {
      a.j();
      boolean bool = e.e();
      return bool;
    }
    finally
    {
      T1.a.b(localThrowable, X.class);
    }
    return false;
  }
  
  public static final boolean f()
  {
    if (T1.a.d(X.class)) {
      return false;
    }
    try
    {
      X localX = a;
      localX.j();
      boolean bool = localX.b();
      return bool;
    }
    finally
    {
      T1.a.b(localThrowable, X.class);
    }
    return false;
  }
  
  public static final boolean g()
  {
    if (T1.a.d(X.class)) {
      return false;
    }
    try
    {
      a.j();
      boolean bool = h.e();
      return bool;
    }
    finally
    {
      T1.a.b(localThrowable, X.class);
    }
    return false;
  }
  
  public static final void i(long paramLong)
  {
    if (T1.a.d(X.class)) {
      return;
    }
    try
    {
      if (!g.e()) {
        break label163;
      }
      Object localObject1 = v.a;
      localObject1 = v.q(B.m(), false);
      if ((localObject1 == null) || (!((r)localObject1).b())) {
        break label163;
      }
      localObject1 = B.l();
      localObject1 = O1.a.f.e((Context)localObject1);
      if ((localObject1 != null) && (((O1.a)localObject1).h() != null)) {
        localObject1 = ((O1.a)localObject1).h();
      }
    }
    finally
    {
      break label171;
    }
    Object localObject3 = null;
    if (localObject3 != null)
    {
      Object localObject4 = new android/os/Bundle;
      ((Bundle)localObject4).<init>();
      ((BaseBundle)localObject4).putString("advertiser_id", (String)localObject3);
      ((BaseBundle)localObject4).putString("fields", "auto_event_setup_enabled");
      localObject3 = F.n.x(null, "app", null);
      ((F)localObject3).G((Bundle)localObject4);
      localObject3 = ((F)localObject3).k().c();
      if (localObject3 != null)
      {
        localObject4 = h;
        ((a)localObject4).g(Boolean.valueOf(((JSONObject)localObject3).optBoolean("auto_event_setup_enabled", false)));
        ((a)localObject4).f(paramLong);
        a.u((a)localObject4);
      }
    }
    label163:
    d.set(false);
    return;
    label171:
    T1.a.b((Throwable)localObject3, X.class);
  }
  
  public static final void n()
  {
    if (T1.a.d(X.class)) {
      return;
    }
    try
    {
      Object localObject2;
      try
      {
        Object localObject1 = B.l();
        localObject2 = ((Context)localObject1).getPackageManager().getApplicationInfo(((Context)localObject1).getPackageName(), 128);
        Intrinsics.checkNotNullExpressionValue(localObject2, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
        localObject2 = metaData;
        if ((localObject2 == null) || (!((BaseBundle)localObject2).getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false))) {
          break label116;
        }
        localObject2 = new y1/F;
        ((y1.F)localObject2).<init>((Context)localObject1);
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
        if (!P.U())
        {
          ((BaseBundle)localObject1).putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
          Log.w(b, "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
        }
      }
      finally
      {
        break label110;
      }
      ((y1.F)localObject2).d("fb_auto_applink", localBundle);
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      label110:
      label116:
      for (;;) {}
    }
    T1.a.b(localBundle, X.class);
  }
  
  public static final Boolean q()
  {
    Object localObject1 = "";
    if (T1.a.d(X.class)) {
      return null;
    }
    try
    {
      a.t();
      Object localObject3;
      label88:
      label96:
      label107:
      label109:
      return null;
    }
    finally
    {
      try
      {
        localObject3 = j;
        if (localObject3 == null) {
          break label88;
        }
        localObject3 = ((SharedPreferences)localObject3).getString(f.b(), "");
        if (localObject3 != null) {
          localObject1 = localObject3;
        }
        if (((CharSequence)localObject1).length() <= 0) {
          break label107;
        }
        localObject3 = new org/json/JSONObject;
        ((JSONObject)localObject3).<init>((String)localObject1);
        return Boolean.valueOf(((JSONObject)localObject3).getBoolean("value"));
      }
      catch (JSONException localJSONException)
      {
        break label96;
        Intrinsics.n("userSettingPref");
        throw null;
        localObject3 = P.a;
        P.i0(b, localJSONException);
      }
      localObject2 = finally;
      break label109;
      return null;
      T1.a.b(localJSONException, X.class);
    }
  }
  
  public static final void s(boolean paramBoolean)
  {
    if (T1.a.d(X.class)) {
      return;
    }
    try
    {
      a locala = f;
      locala.g(Boolean.valueOf(paramBoolean));
      locala.f(System.currentTimeMillis());
      if (c.get()) {
        a.u(locala);
      }
    }
    finally
    {
      break label58;
    }
    a.j();
    return;
    label58:
    T1.a.b(localThrowable, X.class);
  }
  
  public final boolean b()
  {
    if (T1.a.d(this)) {
      return false;
    }
    try
    {
      Object localObject = v.g();
      if ((localObject != null) && (!((Map)localObject).isEmpty()))
      {
        localBoolean = (Boolean)((Map)localObject).get("auto_log_app_events_enabled");
        localObject = (Boolean)((Map)localObject).get("auto_log_app_events_default");
        if (localBoolean == null)
        {
          localBoolean = c();
          if (localBoolean == null)
          {
            if (localObject == null) {
              return true;
            }
            return ((Boolean)localObject).booleanValue();
          }
        }
      }
    }
    finally
    {
      Boolean localBoolean;
      break label102;
      return localBoolean.booleanValue();
      return localBoolean.booleanValue();
      boolean bool = f.e();
      return bool;
      label102:
      T1.a.b(localThrowable, this);
    }
    return false;
  }
  
  public final Boolean c()
  {
    if (T1.a.d(this)) {
      return null;
    }
    try
    {
      Boolean localBoolean1 = q();
      if (localBoolean1 == null)
      {
        localBoolean1 = l();
        if (localBoolean1 == null) {
          return null;
        }
        return localBoolean1;
      }
    }
    finally
    {
      break label36;
      return localBoolean2;
      label36:
      T1.a.b(localBoolean2, this);
    }
    return null;
  }
  
  public final void h()
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      a locala = h;
      r(locala);
      l = System.currentTimeMillis();
      if ((locala.d() != null) && (l - locala.c() < 604800000L)) {
        return;
      }
    }
    finally
    {
      long l;
      break label92;
      ((a)localObject).g(null);
      ((a)localObject).f(0L);
      if (!d.compareAndSet(false, true)) {
        return;
      }
      Executor localExecutor = B.t();
      W localW = new x1/W;
      localW.<init>(l);
      localExecutor.execute(localW);
      return;
      label92:
      T1.a.b(localExecutor, this);
    }
  }
  
  public final void j()
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      if (!B.F()) {
        return;
      }
      if (!c.compareAndSet(false, true)) {
        return;
      }
      SharedPreferences localSharedPreferences = B.l().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
      Intrinsics.checkNotNullExpressionValue(localSharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(USER_SETTINGS, Context.MODE_PRIVATE)");
      j = localSharedPreferences;
      k(new a[] { f, g, e });
      h();
      p();
      o();
      return;
    }
    finally
    {
      T1.a.b(localThrowable, this);
    }
  }
  
  public final void k(a... paramVarArgs)
  {
    if (T1.a.d(this)) {
      return;
    }
    for (;;)
    {
      try
      {
        k = paramVarArgs.length;
        m = 0;
      }
      finally
      {
        int k;
        a locala;
        int n;
        continue;
        if (locala.d() != null) {
          continue;
        }
        r(locala);
        int m = n;
        if (locala.d() != null) {
          continue;
        }
        m(locala);
        m = n;
        continue;
        u(locala);
        m = n;
        continue;
        return;
        T1.a.b(paramVarArgs, this);
      }
      if (m >= k) {
        continue;
      }
      locala = paramVarArgs[m];
      n = m + 1;
      if (locala != h) {
        continue;
      }
      h();
      m = n;
    }
  }
  
  public final Boolean l()
  {
    if (T1.a.d(this)) {
      return null;
    }
    try
    {
      t();
      Object localObject1;
      Object localObject3;
      a locala;
      boolean bool;
      label97:
      label99:
      return null;
    }
    finally
    {
      try
      {
        localObject1 = B.l();
        localObject3 = ((Context)localObject1).getPackageManager().getApplicationInfo(((Context)localObject1).getPackageName(), 128);
        Intrinsics.checkNotNullExpressionValue(localObject3, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
        localObject1 = metaData;
        if (localObject1 == null) {
          break label97;
        }
        locala = f;
        if (!((BaseBundle)localObject1).containsKey(locala.b())) {
          break label97;
        }
        bool = metaData.getBoolean(locala.b());
        return Boolean.valueOf(bool);
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        localObject3 = P.a;
        P.i0(b, localNameNotFoundException);
      }
      localObject2 = finally;
      break label99;
      return null;
      T1.a.b(localNameNotFoundException, this);
    }
  }
  
  public final void m(a parama)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      t();
      Object localObject;
      ApplicationInfo localApplicationInfo;
      return;
    }
    finally
    {
      try
      {
        localObject = B.l();
        localApplicationInfo = ((Context)localObject).getPackageManager().getApplicationInfo(((Context)localObject).getPackageName(), 128);
        Intrinsics.checkNotNullExpressionValue(localApplicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
        localObject = metaData;
        if ((localObject == null) || (!((BaseBundle)localObject).containsKey(parama.b()))) {
          break label98;
        }
        parama.g(Boolean.valueOf(metaData.getBoolean(parama.b(), parama.a())));
      }
      catch (PackageManager.NameNotFoundException parama)
      {
        localObject = P.a;
        P.i0(b, parama);
      }
      parama = finally;
    }
    label98:
    T1.a.b(parama, this);
  }
  
  public final void o()
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      if (!c.get()) {
        return;
      }
      if (!B.F()) {
        return;
      }
      Context localContext1 = B.l();
      int k = e.e();
      int m = 0;
      int n = 0;
      boolean bool1 = false;
      int i1 = k | f.e() << true | g.e() << true | i.e() << true;
      Object localObject = j;
      int i2;
      if (localObject != null)
      {
        i2 = ((SharedPreferences)localObject).getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
        if (i2 != i1)
        {
          localObject = j;
          if (localObject != null) {
            ((SharedPreferences)localObject).edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i1).apply();
          }
        }
      }
      ApplicationInfo localApplicationInfo;
      int i3;
      int i4;
      boolean bool2;
      label337:
      y1.F localF;
      Bundle localBundle;
      label417:
      return;
    }
    finally
    {
      for (;;)
      {
        try
        {
          localApplicationInfo = localContext1.getPackageManager().getApplicationInfo(localContext1.getPackageName(), 128);
          Intrinsics.checkNotNullExpressionValue(localApplicationInfo, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
          if (metaData != null)
          {
            localObject = new String[4];
            localObject[0] = "com.facebook.sdk.AutoInitEnabled";
            localObject[1] = "com.facebook.sdk.AutoLogAppEventsEnabled";
            localObject[2] = "com.facebook.sdk.AdvertiserIDCollectionEnabled";
            localObject[3] = "com.facebook.sdk.MonitorEnabled";
            m = 0;
            n = m;
            i3 = bool1 + true;
            i4 = m;
            try
            {
              m |= metaData.containsKey(localObject[bool1]) << bool1;
              i4 = m;
              bool2 = metaData.getBoolean(localObject[bool1], new boolean[] { 1, 1, 1, 1 }[bool1]);
              n |= bool2 << bool1;
              if (i3 > 3) {
                break;
              }
              bool1 = i3;
            }
            catch (PackageManager.NameNotFoundException localNameNotFoundException1)
            {
              m = n;
              break label337;
            }
            localContext2 = finally;
          }
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException2)
        {
          i4 = 0;
          break label337;
        }
        i4 = 0;
        m = n;
        n = i4;
        break;
        n = m;
        m = i4;
      }
      localF = new y1/F;
      localF.<init>(localContext2);
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putInt("usage", m);
      localBundle.putInt("initial", n);
      localBundle.putInt("previous", i2);
      localBundle.putInt("current", i1);
      localF.b(localBundle);
      break label417;
      Intrinsics.n("userSettingPref");
      throw null;
      return;
      Intrinsics.n("userSettingPref");
      throw null;
      T1.a.b(localBundle, this);
    }
  }
  
  public final void p()
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      try
      {
        Object localObject = B.l();
        localObject = ((Context)localObject).getPackageManager().getApplicationInfo(((Context)localObject).getPackageName(), 128);
        Intrinsics.checkNotNullExpressionValue(localObject, "ctx.packageManager.getApplicationInfo(ctx.packageName, PackageManager.GET_META_DATA)");
        localObject = metaData;
        if (localObject == null) {
          break label92;
        }
        if (!((BaseBundle)localObject).containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
          Log.w(b, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
        }
      }
      finally
      {
        break label87;
      }
      if (d()) {
        break label92;
      }
      Log.w(b, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      label87:
      label92:
      for (;;) {}
    }
    T1.a.b(localThrowable, this);
  }
  
  /* Error */
  public final void r(a parama)
  {
    // Byte code:
    //   0: ldc -5
    //   2: astore_2
    //   3: aload_0
    //   4: invokestatic 79	T1/a:d	(Ljava/lang/Object;)Z
    //   7: ifeq +4 -> 11
    //   10: return
    //   11: aload_0
    //   12: invokevirtual 254	x1/X:t	()V
    //   15: getstatic 256	x1/X:j	Landroid/content/SharedPreferences;
    //   18: astore_3
    //   19: aload_3
    //   20: ifnull +79 -> 99
    //   23: aload_3
    //   24: aload_1
    //   25: invokevirtual 258	x1/X$a:b	()Ljava/lang/String;
    //   28: ldc -5
    //   30: invokeinterface 264 3 0
    //   35: astore_3
    //   36: aload_3
    //   37: ifnonnull +6 -> 43
    //   40: goto +5 -> 45
    //   43: aload_3
    //   44: astore_2
    //   45: aload_2
    //   46: invokeinterface 270 1 0
    //   51: ifle +67 -> 118
    //   54: new 163	org/json/JSONObject
    //   57: astore_3
    //   58: aload_3
    //   59: aload_2
    //   60: invokespecial 273	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   63: aload_1
    //   64: aload_3
    //   65: ldc_w 275
    //   68: invokevirtual 278	org/json/JSONObject:getBoolean	(Ljava/lang/String;)Z
    //   71: invokestatic 173	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   74: invokevirtual 176	x1/X$a:g	(Ljava/lang/Boolean;)V
    //   77: aload_1
    //   78: aload_3
    //   79: ldc_w 422
    //   82: invokevirtual 426	org/json/JSONObject:getLong	(Ljava/lang/String;)J
    //   85: invokevirtual 178	x1/X$a:f	(J)V
    //   88: goto +30 -> 118
    //   91: astore_1
    //   92: goto +27 -> 119
    //   95: astore_1
    //   96: goto +11 -> 107
    //   99: ldc_w 280
    //   102: invokestatic 282	kotlin/jvm/internal/Intrinsics:n	(Ljava/lang/String;)V
    //   105: aconst_null
    //   106: athrow
    //   107: getstatic 285	O1/P:a	LO1/P;
    //   110: astore_2
    //   111: getstatic 36	x1/X:b	Ljava/lang/String;
    //   114: aload_1
    //   115: invokestatic 289	O1/P:i0	(Ljava/lang/String;Ljava/lang/Exception;)V
    //   118: return
    //   119: aload_1
    //   120: aload_0
    //   121: invokestatic 86	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   124: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	this	X
    //   0	125	1	parama	a
    //   2	109	2	localObject1	Object
    //   18	61	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   11	15	91	finally
    //   15	19	91	finally
    //   23	36	91	finally
    //   45	88	91	finally
    //   99	107	91	finally
    //   107	118	91	finally
    //   15	19	95	org/json/JSONException
    //   23	36	95	org/json/JSONException
    //   45	88	95	org/json/JSONException
    //   99	107	95	org/json/JSONException
  }
  
  public final void t()
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      if (c.get()) {
        return;
      }
      C localC = new x1/C;
      localC.<init>("The UserSettingManager has not been initialized successfully");
      throw localC;
    }
    finally
    {
      T1.a.b(localThrowable, this);
    }
  }
  
  public final void u(a parama)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      t();
      JSONObject localJSONObject;
      SharedPreferences localSharedPreferences;
      return;
    }
    finally
    {
      try
      {
        localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject.put("value", parama.d());
        localJSONObject.put("last_timestamp", parama.c());
        localSharedPreferences = j;
        if (localSharedPreferences == null) {
          break label91;
        }
        localSharedPreferences.edit().putString(parama.b(), localJSONObject.toString()).apply();
        o();
      }
      catch (Exception localException)
      {
        break label99;
        Intrinsics.n("userSettingPref");
        throw null;
        parama = P.a;
        P.i0(b, localException);
      }
      parama = finally;
    }
    label91:
    label99:
    T1.a.b(parama, this);
  }
  
  public static final class a
  {
    public boolean a;
    public String b;
    public Boolean c;
    public long d;
    
    public a(boolean paramBoolean, String paramString)
    {
      a = paramBoolean;
      b = paramString;
    }
    
    public final boolean a()
    {
      return a;
    }
    
    public final String b()
    {
      return b;
    }
    
    public final long c()
    {
      return d;
    }
    
    public final Boolean d()
    {
      return c;
    }
    
    public final boolean e()
    {
      Boolean localBoolean = c;
      boolean bool;
      if (localBoolean == null) {
        bool = a;
      } else {
        bool = localBoolean.booleanValue();
      }
      return bool;
    }
    
    public final void f(long paramLong)
    {
      d = paramLong;
    }
    
    public final void g(Boolean paramBoolean)
    {
      c = paramBoolean;
    }
  }
}

/* Location:
 * Qualified Name:     x1.X
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */