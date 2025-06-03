package R2;

import A2.n;
import E2.m;
import G2.c;
import G2.d;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.N6;
import com.google.android.gms.internal.measurement.S6;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public final class g
  extends m3
{
  public Boolean b;
  public i c = j.a;
  public Boolean d;
  
  public g(N2 paramN2)
  {
    super(paramN2);
  }
  
  public static long G()
  {
    return ((Long)K.f.a(null)).longValue();
  }
  
  public static long M()
  {
    return ((Long)K.F.a(null)).longValue();
  }
  
  private final String c(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = (String)Class.forName("android.os.SystemProperties").getMethod("get", new Class[] { String.class, String.class }).invoke(null, new Object[] { paramString1, paramString2 });
      n.i(paramString1);
      return paramString1;
    }
    catch (InvocationTargetException localInvocationTargetException) {}catch (IllegalAccessException localIllegalAccessException)
    {
      break label89;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label104;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    paramString1 = j().G();
    String str = "SystemProperties.get() threw an exception";
    for (;;)
    {
      paramString1.b(str, localClassNotFoundException);
      break;
      label89:
      paramString1 = j().G();
      str = "Could not access SystemProperties.get()";
      continue;
      label104:
      paramString1 = j().G();
      str = "Could not find SystemProperties.get() method";
      continue;
      paramString1 = j().G();
      str = "Could not find SystemProperties class";
    }
    return paramString2;
  }
  
  public final int A(String paramString)
  {
    return u(paramString, K.q);
  }
  
  public final boolean B(String paramString, P1 paramP1)
  {
    return D(paramString, paramP1);
  }
  
  public final long C(String paramString)
  {
    return x(paramString, K.c);
  }
  
  public final boolean D(String paramString, P1 paramP1)
  {
    if (paramString == null) {}
    for (paramString = paramP1.a(null);; paramString = paramP1.a(Boolean.valueOf("1".equals(paramString))))
    {
      return ((Boolean)paramString).booleanValue();
      paramString = c.c(paramString, paramP1.b());
      if (TextUtils.isEmpty(paramString)) {
        break;
      }
    }
  }
  
  public final int E()
  {
    if (k().b0(201500000, true)) {
      return 100;
    }
    return 25;
  }
  
  public final Boolean F(String paramString)
  {
    n.e(paramString);
    Bundle localBundle = U();
    if (localBundle == null)
    {
      j().G().a("Failed to load metadata: Metadata bundle is null");
      return null;
    }
    if (!localBundle.containsKey(paramString)) {
      return null;
    }
    return Boolean.valueOf(localBundle.getBoolean(paramString));
  }
  
  public final String H(String paramString)
  {
    return z(paramString, K.N);
  }
  
  public final List I(String paramString)
  {
    n.e(paramString);
    Bundle localBundle = U();
    if (localBundle == null) {
      j().G().a("Failed to load metadata: Metadata bundle is null");
    }
    while (!localBundle.containsKey(paramString))
    {
      paramString = null;
      break;
    }
    paramString = Integer.valueOf(localBundle.getInt(paramString));
    if (paramString == null) {
      return null;
    }
    try
    {
      paramString = a().getResources().getStringArray(paramString.intValue());
      if (paramString == null) {
        return null;
      }
      paramString = Arrays.asList(paramString);
      return paramString;
    }
    catch (Resources.NotFoundException paramString)
    {
      j().G().b("Failed to load string array from metadata: resource not found", paramString);
    }
    return null;
  }
  
  public final boolean J(String paramString)
  {
    return D(paramString, K.M);
  }
  
  public final boolean K(String paramString)
  {
    return "1".equals(c.c(paramString, "gaia_collection_enabled"));
  }
  
  public final boolean L(String paramString)
  {
    return "1".equals(c.c(paramString, "measurement.event_sampling_enabled"));
  }
  
  public final String N()
  {
    return c("debug.firebase.analytics.app", "");
  }
  
  public final String O()
  {
    return c("debug.deferred.deeplink", "");
  }
  
  public final boolean P()
  {
    Boolean localBoolean = F("google_analytics_adid_collection_enabled");
    return (localBoolean == null) || (localBoolean.booleanValue());
  }
  
  public final boolean Q()
  {
    Boolean localBoolean = F("google_analytics_automatic_screen_reporting_enabled");
    return (localBoolean == null) || (localBoolean.booleanValue());
  }
  
  public final boolean R()
  {
    Boolean localBoolean = F("firebase_analytics_collection_deactivated");
    return (localBoolean != null) && (localBoolean.booleanValue());
  }
  
  public final boolean S()
  {
    if (b == null)
    {
      Boolean localBoolean = F("app_measurement_lite");
      b = localBoolean;
      if (localBoolean == null) {
        b = Boolean.FALSE;
      }
    }
    return (b.booleanValue()) || (!a.t());
  }
  
  public final boolean T()
  {
    if (d == null)
    {
      try
      {
        if (d != null) {
          break label95;
        }
        Object localObject1 = a().getApplicationInfo();
        String str = m.a();
        if (localObject1 == null) {
          break label68;
        }
        localObject1 = processName;
        if ((localObject1 != null) && (((String)localObject1).equals(str))) {
          bool = true;
        }
      }
      finally
      {
        break label100;
      }
      boolean bool = false;
      d = Boolean.valueOf(bool);
      label68:
      if (d == null)
      {
        d = Boolean.TRUE;
        j().G().a("My process not in the list of running processes");
      }
      label95:
      break label104;
      label100:
      throw ((Throwable)localObject2);
    }
    label104:
    return d.booleanValue();
  }
  
  public final Bundle U()
  {
    try
    {
      if (a().getPackageManager() == null)
      {
        j().G().a("Failed to load metadata: PackageManager is null");
        return null;
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      break label76;
      Object localObject = d.a(a()).c(a().getPackageName(), 128);
      if (localObject == null)
      {
        j().G().a("Failed to load metadata: ApplicationInfo is null");
        return null;
      }
      localObject = metaData;
      return (Bundle)localObject;
      label76:
      j().G().b("Failed to load metadata: Package name not found", localObject);
    }
    return null;
  }
  
  public final double o(String paramString, P1 paramP1)
  {
    if (paramString == null) {}
    for (;;)
    {
      return ((Double)paramP1.a(null)).doubleValue();
      paramString = c.c(paramString, paramP1.b());
      if (!TextUtils.isEmpty(paramString)) {
        try
        {
          double d1 = ((Double)paramP1.a(Double.valueOf(Double.parseDouble(paramString)))).doubleValue();
          return d1;
        }
        catch (NumberFormatException paramString) {}
      }
    }
  }
  
  public final int p(String paramString)
  {
    return q(paramString, K.J, 500, 2000);
  }
  
  public final int q(String paramString, P1 paramP1, int paramInt1, int paramInt2)
  {
    return Math.max(Math.min(u(paramString, paramP1), paramInt2), paramInt1);
  }
  
  public final void r(i parami)
  {
    c = parami;
  }
  
  public final boolean s(P1 paramP1)
  {
    return D(null, paramP1);
  }
  
  public final int t(String paramString)
  {
    if ((N6.a()) && (f().D(null, K.b1))) {
      return 500;
    }
    return 100;
  }
  
  public final int u(String paramString, P1 paramP1)
  {
    if (paramString == null) {}
    for (;;)
    {
      return ((Integer)paramP1.a(null)).intValue();
      paramString = c.c(paramString, paramP1.b());
      if (!TextUtils.isEmpty(paramString)) {
        try
        {
          int i = ((Integer)paramP1.a(Integer.valueOf(Integer.parseInt(paramString)))).intValue();
          return i;
        }
        catch (NumberFormatException paramString) {}
      }
    }
  }
  
  public final int v()
  {
    if ((S6.a()) && (f().D(null, K.I0)) && (k().b0(231100000, true))) {
      return 35;
    }
    return 0;
  }
  
  public final int w(String paramString)
  {
    return Math.max(t(paramString), 256);
  }
  
  public final long x(String paramString, P1 paramP1)
  {
    if (paramString == null) {}
    for (;;)
    {
      return ((Long)paramP1.a(null)).longValue();
      paramString = c.c(paramString, paramP1.b());
      if (!TextUtils.isEmpty(paramString)) {
        try
        {
          long l = ((Long)paramP1.a(Long.valueOf(Long.parseLong(paramString)))).longValue();
          return l;
        }
        catch (NumberFormatException paramString) {}
      }
    }
  }
  
  public final int y(String paramString)
  {
    return q(paramString, K.K, 25, 100);
  }
  
  public final String z(String paramString, P1 paramP1)
  {
    if (paramString == null) {}
    for (paramString = null;; paramString = c.c(paramString, paramP1.b())) {
      return (String)paramP1.a(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     R2.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */