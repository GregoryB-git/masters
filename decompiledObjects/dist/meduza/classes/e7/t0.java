package e7;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.BaseBundle;
import android.text.TextUtils;
import b.z;
import d2.q;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m6.j;
import x6.b;

public final class t0
  extends j0
{
  public String d;
  public String e;
  public int f;
  public String o;
  public String p;
  public long q;
  public long r;
  public List<String> s;
  public String t;
  public int u;
  public String v;
  public String w;
  public String x;
  public long y = 0L;
  public String z = null;
  
  public t0(j2 paramj2, long paramLong)
  {
    super(paramj2);
    r = paramLong;
  }
  
  public final boolean s()
  {
    return true;
  }
  
  public final String v()
  {
    t();
    j.i(d);
    return d;
  }
  
  public final String w()
  {
    l();
    t();
    j.i(v);
    return v;
  }
  
  public final void x()
  {
    l();
    Object localObject;
    if (!j().y().j(e3.a.c))
    {
      zzjv.b("Analytics Storage consent is not granted");
      localObject = null;
    }
    else
    {
      localObject = new byte[16];
      k().C0().nextBytes((byte[])localObject);
      localObject = String.format(Locale.US, "%032x", new Object[] { new BigInteger(1, (byte[])localObject) });
    }
    b1 localb1 = zzjv;
    String str;
    if (localObject == null) {
      str = "null";
    } else {
      str = "not null";
    }
    localb1.b(String.format("Resetting session stitching token to %s", new Object[] { str }));
    x = ((String)localObject);
    ((z)zzb()).getClass();
    y = System.currentTimeMillis();
  }
  
  public final void y()
  {
    String str1 = zza().getPackageName();
    PackageManager localPackageManager = zza().getPackageManager();
    Object localObject1 = "Unknown";
    String str2 = "";
    Object localObject2 = "unknown";
    int i = Integer.MIN_VALUE;
    if (localPackageManager == null)
    {
      zzjo.c("PackageManager is null, app identity information might be inaccurate. appId", a1.p(str1));
    }
    else
    {
      try
      {
        String str3 = localPackageManager.getInstallerPackageName(str1);
        localObject2 = str3;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        zzjo.c("Error retrieving app installer package name. appId", a1.p(str1));
      }
      if (localObject2 == null)
      {
        localObject4 = "manual_install";
      }
      else
      {
        localObject4 = localObject2;
        if ("com.android.vending".equals(localObject2)) {
          localObject4 = "";
        }
      }
    }
    Object localObject7;
    try
    {
      PackageInfo localPackageInfo = localPackageManager.getPackageInfo(zza().getPackageName(), 0);
      localObject2 = localObject4;
      if (localPackageInfo != null)
      {
        localObject2 = localPackageManager.getApplicationLabel(applicationInfo);
        if (!TextUtils.isEmpty((CharSequence)localObject2)) {
          localObject2 = localObject2.toString();
        } else {
          localObject2 = "Unknown";
        }
        try
        {
          String str4 = versionName;
          localObject1 = str4;
          j = versionCode;
          localObject1 = str4;
        }
        catch (PackageManager.NameNotFoundException localNameNotFoundException2)
        {
          localObject7 = localObject1;
          localObject1 = localObject2;
          localObject2 = localObject7;
          break label235;
        }
      }
      else
      {
        localObject7 = "Unknown";
        localObject4 = localObject2;
        j = i;
        localObject2 = localObject7;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException1)
    {
      localObject3 = "Unknown";
      label235:
      zzjo.d("Error retrieving package info. appId, appName", a1.p(str1), localObject1);
      localObject7 = localObject1;
      localObject1 = localObject3;
      localObject3 = localObject7;
      j = i;
    }
    d = str1;
    o = ((String)localObject4);
    e = ((String)localObject1);
    f = j;
    p = ((String)localObject3);
    q = 0L;
    boolean bool = TextUtils.isEmpty(b).b);
    int k = 1;
    if ((!bool) && ("am".equals(b).c))) {
      j = 1;
    } else {
      j = 0;
    }
    i = ((j2)b).f();
    Object localObject4 = zzj();
    switch (i)
    {
    default: 
      break;
    case 8: 
      localObject4 = u;
      localObject3 = "App measurement disabled due to denied storage consent";
      break;
    case 7: 
      localObject4 = u;
      localObject3 = "App measurement disabled via the global data collection setting";
      break;
    case 6: 
      localObject4 = t;
      localObject3 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics";
      break;
    case 5: 
      localObject4 = w;
      localObject3 = "App measurement disabled via the init parameters";
      break;
    case 4: 
      localObject4 = u;
      localObject3 = "App measurement disabled via the manifest";
      break;
    case 3: 
      localObject4 = u;
      localObject3 = "App measurement disabled by setAnalyticsCollectionEnabled(false)";
      break;
    case 2: 
      localObject4 = w;
      localObject3 = "App measurement deactivated via the init parameters";
      break;
    case 1: 
      localObject4 = u;
      localObject3 = "App measurement deactivated via the manifest";
      break;
    case 0: 
      localObject4 = w;
      localObject3 = "App measurement collection enabled";
      break;
    }
    u.b("App measurement disabled");
    localObject4 = zzjp;
    Object localObject3 = "Invalid scion state in identity";
    ((b1)localObject4).b((String)localObject3);
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    }
    v = "";
    w = "";
    if (j != 0) {
      w = b).b;
    }
    localObject1 = null;
    for (;;)
    {
      try
      {
        localObject7 = zza();
        localObject4 = b).A;
        j.i(localObject7);
        localObject3 = ((Context)localObject7).getResources();
        if (TextUtils.isEmpty((CharSequence)localObject4)) {
          localObject4 = f2.a((Context)localObject7);
        }
        j = ((Resources)localObject3).getIdentifier("google_app_id", "string", (String)localObject4);
        if (j != 0) {}
      }
      catch (IllegalStateException localIllegalStateException)
      {
        zzjo.d("Fetching Google App Id failed with exception. appId", a1.p(str1), localIllegalStateException);
      }
      try
      {
        localObject4 = ((Resources)localObject3).getString(j);
      }
      catch (Resources.NotFoundException localNotFoundException2)
      {
        Object localObject5;
        Object localObject6;
      }
    }
    localObject4 = null;
    if (TextUtils.isEmpty((CharSequence)localObject4)) {
      localObject3 = str2;
    } else {
      localObject3 = localObject4;
    }
    v = ((String)localObject3);
    if (!TextUtils.isEmpty((CharSequence)localObject4))
    {
      localObject7 = zza();
      localObject4 = b).A;
      j.i(localObject7);
      localObject3 = ((Context)localObject7).getResources();
      if (TextUtils.isEmpty((CharSequence)localObject4)) {
        localObject4 = f2.a((Context)localObject7);
      }
      j = ((Resources)localObject3).getIdentifier("admob_app_id", "string", (String)localObject4);
      if (j == 0) {}
    }
    try
    {
      localObject4 = ((Resources)localObject3).getString(j);
    }
    catch (Resources.NotFoundException localNotFoundException3)
    {
      for (;;) {}
    }
    localObject4 = null;
    w = ((String)localObject4);
    if (i != 0)
    {
      localObject7 = zzjw;
      localObject3 = d;
      if (TextUtils.isEmpty(v)) {
        localObject4 = w;
      } else {
        localObject4 = v;
      }
      ((b1)localObject7).d("App measurement enabled for app package, google app id", localObject3, localObject4);
    }
    s = null;
    localObject3 = h();
    localObject3.getClass();
    j.e("analytics.safelisted_events");
    localObject5 = ((h)localObject3).p();
    if (localObject5 == null) {
      zzjo.b("Failed to load metadata: Metadata bundle is null");
    } else {
      if (((BaseBundle)localObject5).containsKey("analytics.safelisted_events")) {
        break label998;
      }
    }
    localObject5 = null;
    break label1011;
    label998:
    localObject5 = Integer.valueOf(((BaseBundle)localObject5).getInt("analytics.safelisted_events"));
    label1011:
    if (localObject5 == null) {
      localObject5 = localObject1;
    } else {
      try
      {
        localObject5 = ((q)localObject3).zza().getResources().getStringArray(((Integer)localObject5).intValue());
        if (localObject5 == null) {
          localObject5 = localObject1;
        } else {
          localObject5 = Arrays.asList((Object[])localObject5);
        }
      }
      catch (Resources.NotFoundException localNotFoundException1)
      {
        zzjo.c("Failed to load string array from metadata: resource not found", localNotFoundException1);
        localObject6 = localObject1;
      }
    }
    int j = k;
    if (localObject6 != null)
    {
      if (((List)localObject6).isEmpty())
      {
        zzjt.b("Safelisted event list is empty. Ignoring");
      }
      else
      {
        localObject1 = ((List)localObject6).iterator();
        do
        {
          j = k;
          if (!((Iterator)localObject1).hasNext()) {
            break;
          }
          localObject3 = (String)((Iterator)localObject1).next();
        } while (k().j0("safelisted event", (String)localObject3));
      }
      j = 0;
    }
    if (j != 0) {
      s = ((List)localObject6);
    }
    if (localPackageManager != null)
    {
      u = b.d0(zza());
      return;
    }
    u = 0;
  }
}

/* Location:
 * Qualified Name:     e7.t0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */