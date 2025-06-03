package v6;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import j6.j;
import j6.k;
import x6.c;
import x6.d;

public final class h
{
  public static boolean a(Context paramContext, int paramInt)
  {
    boolean bool1 = b(paramContext, "com.google.android.gms", paramInt);
    boolean bool2 = false;
    if (bool1)
    {
      Object localObject = paramContext.getPackageManager();
      try
      {
        localObject = ((PackageManager)localObject).getPackageInfo("com.google.android.gms", 64);
        paramContext = k.a(paramContext);
        paramContext.getClass();
        if (localObject == null)
        {
          bool1 = bool2;
        }
        else
        {
          if (k.d((PackageInfo)localObject, false)) {}
          do
          {
            bool1 = true;
            break;
            bool1 = bool2;
            if (!k.d((PackageInfo)localObject, true)) {
              break;
            }
          } while (j.b(a));
          Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
          bool1 = bool2;
        }
        return bool1;
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        if (Log.isLoggable("UidVerifier", 3)) {
          Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
        }
      }
    }
    return false;
  }
  
  public static boolean b(Context paramContext, String paramString, int paramInt)
  {
    paramContext = d.a(paramContext);
    paramContext.getClass();
    boolean bool;
    try
    {
      paramContext = (AppOpsManager)a.getSystemService("appops");
      if (paramContext != null)
      {
        paramContext.checkPackage(paramInt, paramString);
        bool = true;
      }
      else
      {
        paramContext = new java/lang/NullPointerException;
        paramContext.<init>("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        throw paramContext;
      }
    }
    catch (SecurityException paramContext)
    {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     v6.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */