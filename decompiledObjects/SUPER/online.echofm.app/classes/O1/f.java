package O1;

import T1.a;
import W5.g;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import x1.B;

public final class f
{
  public static final f a = new f();
  public static final String[] b = { "com.android.chrome", "com.chrome.beta", "com.chrome.dev" };
  
  public static final String a()
  {
    if (a.d(f.class)) {
      return null;
    }
    try
    {
      Object localObject1 = B.l();
      Object localObject2 = new android/content/Intent;
      ((Intent)localObject2).<init>("android.support.customtabs.action.CustomTabsService");
      localObject2 = ((Context)localObject1).getPackageManager().queryIntentServices((Intent)localObject2, 0);
      Intrinsics.checkNotNullExpressionValue(localObject2, "context.packageManager.queryIntentServices(serviceIntent, 0)");
      localObject1 = g.t(b);
      Iterator localIterator = ((List)localObject2).iterator();
      while (localIterator.hasNext())
      {
        localObject2 = nextserviceInfo;
        if ((localObject2 != null) && (((Set)localObject1).contains(packageName)))
        {
          localObject1 = packageName;
          return (String)localObject1;
        }
      }
    }
    finally
    {
      break label106;
      return null;
      label106:
      a.b(localThrowable, f.class);
    }
    return null;
  }
  
  public static final String b()
  {
    if (a.d(f.class)) {
      return null;
    }
    try
    {
      String str = Intrinsics.i("fbconnect://cct.", B.l().getPackageName());
      return str;
    }
    finally
    {
      a.b(localThrowable, f.class);
    }
    return null;
  }
  
  public static final String c(String paramString)
  {
    if (a.d(f.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "developerDefinedRedirectURI");
      Q localQ = Q.a;
      if (Q.d(B.l(), paramString)) {
        return paramString;
      }
      if (Q.d(B.l(), b())) {
        return b();
      }
    }
    finally
    {
      break label55;
      return "";
      label55:
      a.b(paramString, f.class);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     O1.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */