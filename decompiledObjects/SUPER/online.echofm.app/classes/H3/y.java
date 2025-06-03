package H3;

import E3.f;
import V2.j;
import V2.k;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import java.util.concurrent.Executor;
import s3.e;

public class y
{
  public final SharedPreferences a;
  public final e b;
  public final Object c;
  public k d;
  public boolean e;
  public boolean f;
  public Boolean g;
  public final k h;
  
  public y(e parame)
  {
    Object localObject = new Object();
    c = localObject;
    d = new k();
    e = false;
    f = false;
    h = new k();
    Context localContext = parame.m();
    b = parame;
    a = i.r(localContext);
    Boolean localBoolean = b();
    parame = localBoolean;
    if (localBoolean == null) {
      parame = a(localContext);
    }
    g = parame;
    try
    {
      if (d())
      {
        d.e(null);
        e = true;
      }
    }
    finally
    {
      break label125;
    }
    return;
    label125:
    throw parame;
  }
  
  public static Boolean g(Context paramContext)
  {
    try
    {
      Object localObject = paramContext.getPackageManager();
      if (localObject != null)
      {
        paramContext = ((PackageManager)localObject).getApplicationInfo(paramContext.getPackageName(), 128);
        if (paramContext != null)
        {
          localObject = metaData;
          if ((localObject != null) && (((BaseBundle)localObject).containsKey("firebase_crashlytics_collection_enabled")))
          {
            boolean bool = metaData.getBoolean("firebase_crashlytics_collection_enabled");
            return Boolean.valueOf(bool);
          }
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      f.f().e("Could not read data collection permission from manifest", paramContext);
    }
    return null;
  }
  
  public static void i(SharedPreferences paramSharedPreferences, Boolean paramBoolean)
  {
    paramSharedPreferences = paramSharedPreferences.edit();
    if (paramBoolean != null) {
      paramSharedPreferences.putBoolean("firebase_crashlytics_collection_enabled", paramBoolean.booleanValue());
    } else {
      paramSharedPreferences.remove("firebase_crashlytics_collection_enabled");
    }
    paramSharedPreferences.apply();
  }
  
  public final Boolean a(Context paramContext)
  {
    paramContext = g(paramContext);
    if (paramContext == null)
    {
      f = false;
      return null;
    }
    f = true;
    return Boolean.valueOf(Boolean.TRUE.equals(paramContext));
  }
  
  public final Boolean b()
  {
    if (a.contains("firebase_crashlytics_collection_enabled"))
    {
      f = false;
      return Boolean.valueOf(a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }
    return null;
  }
  
  public void c(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      h.e(null);
      return;
    }
    throw new IllegalStateException("An invalid data collection token was used.");
  }
  
  public boolean d()
  {
    try
    {
      Boolean localBoolean = g;
      if (localBoolean != null) {
        bool = localBoolean.booleanValue();
      }
    }
    finally
    {
      break label37;
    }
    boolean bool = e();
    f(bool);
    return bool;
    label37:
    throw ((Throwable)localObject);
  }
  
  public final boolean e()
  {
    try
    {
      boolean bool = b.x();
      return bool;
    }
    catch (IllegalStateException localIllegalStateException) {}
    return false;
  }
  
  public final void f(boolean paramBoolean)
  {
    String str1;
    if (paramBoolean) {
      str1 = "ENABLED";
    } else {
      str1 = "DISABLED";
    }
    String str2;
    if (g == null) {
      str2 = "global Firebase setting";
    } else if (f) {
      str2 = "firebase_crashlytics_collection_enabled manifest flag";
    } else {
      str2 = "API";
    }
    f.f().b(String.format("Crashlytics automatic data collection %s by %s.", new Object[] { str1, str2 }));
  }
  
  public void h(Boolean arg1)
  {
    if (??? != null) {
      try
      {
        f = false;
      }
      finally
      {
        break label128;
      }
    }
    Boolean localBoolean;
    if (??? != null) {
      localBoolean = ???;
    } else {
      localBoolean = a(b.m());
    }
    g = localBoolean;
    i(a, ???);
    synchronized (c)
    {
      if (d())
      {
        if (e) {
          break label119;
        }
        d.e(null);
        e = true;
      }
    }
    k localk;
    if (e)
    {
      localk = new V2/k;
      localk.<init>();
      d = localk;
      e = false;
    }
    label119:
    return;
    throw localk;
    label128:
    throw ???;
  }
  
  public j j()
  {
    synchronized (c)
    {
      j localj = d.a();
      return localj;
    }
  }
  
  public j k(Executor paramExecutor)
  {
    return c0.o(paramExecutor, h.a(), j());
  }
}

/* Location:
 * Qualified Name:     H3.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */