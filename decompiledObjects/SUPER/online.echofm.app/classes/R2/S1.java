package R2;

import A2.n;
import E2.e;
import G2.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.F7;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.s7;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class S1
  extends f1
{
  public String c;
  public String d;
  public int e;
  public String f;
  public String g;
  public long h;
  public long i;
  public List j;
  public String k;
  public int l;
  public String m;
  public String n;
  public String o;
  public long p = 0L;
  public String q = null;
  
  public S1(N2 paramN2, long paramLong)
  {
    super(paramN2);
    i = paramLong;
  }
  
  private final String J()
  {
    Object localObject1;
    Object localObject2;
    if ((F7.a()) && (f().s(K.n0)))
    {
      localObject1 = j().K();
      localObject2 = "Disabled IID for tests.";
    }
    for (;;)
    {
      ((a2)localObject1).a((String)localObject2);
      return null;
      try
      {
        localObject2 = a().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
        if (localObject2 == null) {
          return null;
        }
        try
        {
          localObject1 = ((Class)localObject2).getDeclaredMethod("getInstance", new Class[] { Context.class }).invoke(null, new Object[] { a() });
          if (localObject1 == null) {
            return null;
          }
          try
          {
            localObject1 = (String)((Class)localObject2).getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(localObject1, new Object[0]);
            return (String)localObject1;
          }
          catch (Exception localException1)
          {
            a2 locala21 = j().M();
            localObject2 = "Failed to retrieve Firebase Instance Id";
          }
        }
        catch (Exception localException2)
        {
          a2 locala22 = j().N();
          localObject2 = "Failed to obtain Firebase Analytics instance";
        }
      }
      catch (ClassNotFoundException localClassNotFoundException) {}
    }
    return null;
  }
  
  public final boolean A()
  {
    return true;
  }
  
  public final W5 B(String paramString)
  {
    n();
    Object localObject1 = i().J();
    String str1;
    if ((n6.a()) && (f().s(K.S0))) {
      str1 = i().I().i();
    }
    for (int i1 = ((q3)localObject1).b();; i1 = 100)
    {
      break;
      str1 = "";
    }
    String str2 = F();
    String str3 = G();
    v();
    String str4 = d;
    long l1 = D();
    v();
    n.i(f);
    String str5 = f;
    v();
    n();
    if (h == 0L) {
      h = a.L().A(a(), a().getPackageName());
    }
    long l2 = h;
    boolean bool1 = a.p();
    boolean bool2 = ir;
    n();
    String str6;
    if (!a.p()) {
      str6 = null;
    } else {
      str6 = J();
    }
    Object localObject2 = a;
    long l3 = Fe.a();
    if (l3 == 0L) {}
    for (l3 = H;; l3 = Math.min(H, l3)) {
      break;
    }
    int i2 = C();
    boolean bool3 = f().P();
    localObject2 = i();
    ((m3)localObject2).n();
    boolean bool4 = ((l2)localObject2).F().getBoolean("deferred_analytics_collection", false);
    String str7 = E();
    localObject2 = f().F("google_analytics_default_allow_ad_personalization_signals");
    if (localObject2 == null) {
      localObject2 = null;
    } else {
      localObject2 = Boolean.valueOf(((Boolean)localObject2).booleanValue() ^ true);
    }
    long l4 = i;
    List localList = j;
    String str8 = ((q3)localObject1).v();
    if (k == null) {
      k = k().S0();
    }
    String str9 = k;
    long l6;
    if ((s7.a()) && (f().s(K.x0)))
    {
      n();
      if (p != 0L)
      {
        l5 = b().a();
        l6 = p;
        if ((o != null) && (l5 - l6 > 86400000L) && (q == null)) {
          I();
        }
      }
      if (o == null) {
        I();
      }
      localObject1 = o;
    }
    else
    {
      localObject1 = null;
    }
    Boolean localBoolean = f().F("google_analytics_sgtm_upload_enabled");
    boolean bool5;
    if (localBoolean == null) {
      bool5 = false;
    } else {
      bool5 = localBoolean.booleanValue();
    }
    long l5 = k().z0(F());
    int i3;
    if ((g7.a()) && (f().s(K.M0)))
    {
      k();
      i3 = S5.y0();
    }
    else
    {
      i3 = 0;
    }
    if ((g7.a()) && (f().s(K.M0))) {
      l6 = k().I0();
    } else {
      l6 = 0L;
    }
    return new W5(str2, str3, str4, l1, str5, 82001L, l2, paramString, bool1, bool2 ^ true, str6, 0L, l3, i2, bool3, bool4, str7, (Boolean)localObject2, l4, localList, null, str8, str9, (String)localObject1, bool5, l5, i1, str1, i3, l6);
  }
  
  public final int C()
  {
    v();
    return l;
  }
  
  public final int D()
  {
    v();
    return e;
  }
  
  public final String E()
  {
    v();
    return n;
  }
  
  public final String F()
  {
    v();
    n.i(c);
    return c;
  }
  
  public final String G()
  {
    n();
    v();
    n.i(m);
    return m;
  }
  
  public final List H()
  {
    return j;
  }
  
  public final void I()
  {
    n();
    Object localObject;
    if (!i().J().l(q3.a.q))
    {
      j().F().a("Analytics Storage consent is not granted");
      localObject = null;
    }
    else
    {
      localObject = new byte[16];
      k().U0().nextBytes((byte[])localObject);
      localObject = String.format(Locale.US, "%032x", new Object[] { new BigInteger(1, (byte[])localObject) });
    }
    a2 locala2 = j().F();
    String str;
    if (localObject == null) {
      str = "null";
    } else {
      str = "not null";
    }
    locala2.a(String.format("Resetting session stitching token to %s", new Object[] { str }));
    o = ((String)localObject);
    p = b().a();
  }
  
  public final boolean K(String paramString)
  {
    String str = q;
    boolean bool;
    if ((str != null) && (!str.equals(paramString))) {
      bool = true;
    } else {
      bool = false;
    }
    q = paramString;
    return bool;
  }
  
  public final void y()
  {
    String str1 = a().getPackageName();
    PackageManager localPackageManager = a().getPackageManager();
    String str2 = "";
    Object localObject1 = "unknown";
    Object localObject3 = "Unknown";
    int i1 = Integer.MIN_VALUE;
    if (localPackageManager == null) {
      j().G().b("PackageManager is null, app identity information might be inaccurate. appId", Y1.v(str1));
    }
    for (;;)
    {
      String str3 = "Unknown";
      Object localObject5 = localObject1;
      i2 = i1;
      localObject1 = str3;
      break label281;
      try
      {
        localObject5 = localPackageManager.getInstallerPackageName(str1);
        localObject1 = localObject5;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        j().G().b("Error retrieving app installer package name. appId", Y1.v(str1));
      }
      if (localObject1 == null)
      {
        localObject6 = "manual_install";
      }
      else
      {
        localObject6 = localObject1;
        if ("com.android.vending".equals(localObject1)) {
          localObject6 = "";
        }
      }
      try
      {
        PackageInfo localPackageInfo = localPackageManager.getPackageInfo(a().getPackageName(), 0);
        localObject1 = localObject6;
        if (localPackageInfo != null)
        {
          localObject1 = localPackageManager.getApplicationLabel(applicationInfo);
          if (!TextUtils.isEmpty((CharSequence)localObject1)) {
            localObject1 = localObject1.toString();
          } else {
            localObject1 = "Unknown";
          }
          try
          {
            str3 = versionName;
            localObject3 = str3;
            i2 = versionCode;
            localObject3 = str3;
          }
          catch (PackageManager.NameNotFoundException localNameNotFoundException2)
          {
            localObject4 = localObject3;
            localObject3 = localObject1;
            localObject1 = localObject4;
          }
          j().G().c("Error retrieving package info. appId, appName", Y1.v(str1), localObject3);
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException1)
      {
        localObject2 = "Unknown";
      }
    }
    Object localObject4 = localObject2;
    Object localObject2 = localObject3;
    int i2 = i1;
    localObject3 = localObject4;
    label281:
    c = str1;
    f = ((String)localObject6);
    d = ((String)localObject3);
    e = i2;
    g = ((String)localObject2);
    h = 0L;
    boolean bool = TextUtils.isEmpty(a.M());
    i1 = 1;
    if ((!bool) && ("am".equals(a.N()))) {
      i2 = 1;
    } else {
      i2 = 0;
    }
    int i3 = a.x();
    Object localObject6 = j();
    switch (i3)
    {
    default: 
      ((Y1)localObject6).J().a("App measurement disabled");
      localObject6 = j().I();
      localObject2 = "Invalid scion state in identity";
    }
    for (;;)
    {
      ((a2)localObject6).a((String)localObject2);
      break;
      localObject6 = ((Y1)localObject6).J();
      localObject2 = "App measurement disabled due to denied storage consent";
      continue;
      localObject6 = ((Y1)localObject6).J();
      localObject2 = "App measurement disabled via the global data collection setting";
      continue;
      localObject6 = ((Y1)localObject6).M();
      localObject2 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics";
      continue;
      localObject6 = ((Y1)localObject6).K();
      localObject2 = "App measurement disabled via the init parameters";
      continue;
      localObject6 = ((Y1)localObject6).J();
      localObject2 = "App measurement disabled via the manifest";
      continue;
      localObject6 = ((Y1)localObject6).J();
      localObject2 = "App measurement disabled by setAnalyticsCollectionEnabled(false)";
      continue;
      localObject6 = ((Y1)localObject6).K();
      localObject2 = "App measurement deactivated via the init parameters";
      continue;
      localObject6 = ((Y1)localObject6).J();
      localObject2 = "App measurement deactivated via the manifest";
      continue;
      localObject6 = ((Y1)localObject6).K();
      localObject2 = "App measurement collection enabled";
    }
    if (i3 != 0) {
      i1 = 0;
    }
    m = "";
    n = "";
    if (i2 != 0) {
      n = a.M();
    }
    try
    {
      localObject2 = a();
      localObject3 = a.P();
      localObject6 = new R2/H2;
      ((H2)localObject6).<init>((Context)localObject2, (String)localObject3);
      localObject2 = ((H2)localObject6).b("google_app_id");
      if (TextUtils.isEmpty((CharSequence)localObject2)) {
        localObject6 = str2;
      } else {
        localObject6 = localObject2;
      }
      m = ((String)localObject6);
      if (!TextUtils.isEmpty((CharSequence)localObject2))
      {
        localObject6 = new R2/H2;
        ((H2)localObject6).<init>(a(), a.P());
        n = ((H2)localObject6).b("admob_app_id");
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      break label809;
    }
    if (i1 != 0)
    {
      localObject3 = j().K();
      localObject2 = c;
      if (TextUtils.isEmpty(m)) {
        localObject7 = n;
      } else {
        localObject7 = m;
      }
      ((a2)localObject3).c("App measurement enabled for app package, google app id", localObject2, localObject7);
      break label828;
      label809:
      j().G().c("Fetching Google App Id failed with exception. appId", Y1.v(str1), localObject7);
    }
    label828:
    j = null;
    Object localObject7 = f().I("analytics.safelisted_events");
    if (localObject7 != null)
    {
      if (((List)localObject7).isEmpty())
      {
        j().M().a("Safelisted event list is empty. Ignoring");
      }
      else
      {
        localObject3 = ((List)localObject7).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = (String)((Iterator)localObject3).next();
          if (!k().w0("safelisted event", (String)localObject2)) {
            break label931;
          }
        }
      }
    }
    else {
      j = ((List)localObject7);
    }
    label931:
    if (localPackageManager != null)
    {
      l = a.a(a());
      return;
    }
    l = 0;
  }
}

/* Location:
 * Qualified Name:     R2.S1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */