package e7;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import d2.q;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import x6.c;
import x6.d;

public final class h
  extends q
{
  public Boolean c;
  public String d;
  public j e = new p2.m0();
  public Boolean f;
  
  public h(j2 paramj2)
  {
    super(paramj2);
  }
  
  public static long z()
  {
    return ((Long)h0.N.a(null)).longValue();
  }
  
  public final boolean A()
  {
    Boolean localBoolean = v("google_analytics_automatic_screen_reporting_enabled");
    return (localBoolean == null) || (localBoolean.booleanValue());
  }
  
  public final boolean B()
  {
    Boolean localBoolean = v("firebase_analytics_collection_deactivated");
    return (localBoolean != null) && (localBoolean.booleanValue());
  }
  
  public final boolean C()
  {
    if (c == null)
    {
      Boolean localBoolean = v("app_measurement_lite");
      c = localBoolean;
      if (localBoolean == null) {
        c = Boolean.FALSE;
      }
    }
    return (c.booleanValue()) || (!b).e);
  }
  
  public final String b(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = (String)Class.forName("android.os.SystemProperties").getMethod("get", new Class[] { String.class, String.class }).invoke(null, new Object[] { paramString1, "" });
      m6.j.i(paramString1);
      return paramString1;
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      paramString1 = zzjo;
      paramString2 = "SystemProperties.get() threw an exception";
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      paramString1 = zzjo;
      paramString2 = "Could not access SystemProperties.get()";
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      paramString1 = zzjo;
      paramString2 = "Could not find SystemProperties.get() method";
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      paramString1 = zzjo;
      paramString2 = "Could not find SystemProperties class";
    }
    paramString1.c(paramString2, localClassNotFoundException);
    return "";
  }
  
  public final int m(String paramString, m0<Integer> paramm0, int paramInt1, int paramInt2)
  {
    return Math.max(Math.min(q(paramString, paramm0), paramInt2), paramInt1);
  }
  
  public final int n(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return m(paramString, h0.c0, 100, 500);
    }
    return 500;
  }
  
  public final boolean o(m0<Boolean> paramm0)
  {
    return x(null, paramm0);
  }
  
  public final Bundle p()
  {
    try
    {
      if (zza().getPackageManager() == null)
      {
        zzjo.b("Failed to load metadata: PackageManager is null");
        return null;
      }
      Object localObject = d.a(zza()).a(128, zza().getPackageName());
      if (localObject == null)
      {
        zzjo.b("Failed to load metadata: ApplicationInfo is null");
        return null;
      }
      localObject = metaData;
      return (Bundle)localObject;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      zzjo.c("Failed to load metadata: Package name not found", localNameNotFoundException);
    }
    return null;
  }
  
  public final int q(String paramString, m0<Integer> paramm0)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return ((Integer)paramm0.a(null)).intValue();
      paramString = e.b(paramString, a);
      if (!TextUtils.isEmpty(paramString)) {
        try
        {
          int i = ((Integer)paramm0.a(Integer.valueOf(Integer.parseInt(paramString)))).intValue();
          return i;
        }
        catch (NumberFormatException paramString) {}
      }
    }
  }
  
  public final int r(String paramString, boolean paramBoolean)
  {
    return Math.max(n(paramString, paramBoolean), 256);
  }
  
  public final long s(String paramString, m0<Long> paramm0)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return ((Long)paramm0.a(null)).longValue();
      paramString = e.b(paramString, a);
      if (!TextUtils.isEmpty(paramString)) {
        try
        {
          long l = ((Long)paramm0.a(Long.valueOf(Long.parseLong(paramString)))).longValue();
          return l;
        }
        catch (NumberFormatException paramString) {}
      }
    }
  }
  
  public final g3 t(String paramString, boolean paramBoolean)
  {
    g3 localg3 = g3.b;
    m6.j.e(paramString);
    Object localObject = p();
    if (localObject == null)
    {
      zzjo.b("Failed to load metadata: Metadata bundle is null");
      localObject = null;
    }
    else
    {
      localObject = ((BaseBundle)localObject).get(paramString);
    }
    if (localObject == null) {
      return localg3;
    }
    if (Boolean.TRUE.equals(localObject)) {
      return g3.e;
    }
    if (Boolean.FALSE.equals(localObject)) {
      return g3.d;
    }
    if ((paramBoolean) && ("eu_consent_policy".equals(localObject))) {
      return g3.c;
    }
    zzjr.c("Invalid manifest metadata for", paramString);
    return localg3;
  }
  
  public final String u(String paramString, m0<String> paramm0)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (paramString = null;; paramString = e.b(paramString, a)) {
      return (String)paramm0.a(paramString);
    }
  }
  
  public final Boolean v(String paramString)
  {
    m6.j.e(paramString);
    Bundle localBundle = p();
    if (localBundle == null)
    {
      zzjo.b("Failed to load metadata: Metadata bundle is null");
      return null;
    }
    if (!localBundle.containsKey(paramString)) {
      return null;
    }
    return Boolean.valueOf(localBundle.getBoolean(paramString));
  }
  
  public final boolean w(String paramString, m0<Boolean> paramm0)
  {
    return x(paramString, paramm0);
  }
  
  public final boolean x(String paramString, m0<Boolean> paramm0)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (paramString = paramm0.a(null);; paramString = paramm0.a(Boolean.valueOf("1".equals(paramString))))
    {
      return ((Boolean)paramString).booleanValue();
      paramString = e.b(paramString, a);
      if (TextUtils.isEmpty(paramString)) {
        break;
      }
    }
  }
  
  public final boolean y(String paramString)
  {
    return "1".equals(e.b(paramString, "measurement.event_sampling_enabled"));
  }
}

/* Location:
 * Qualified Name:     e7.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */