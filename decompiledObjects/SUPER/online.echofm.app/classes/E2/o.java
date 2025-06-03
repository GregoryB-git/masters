package E2;

import G2.c;
import G2.d;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;

public abstract class o
{
  public static boolean a(Context paramContext, int paramInt)
  {
    if (!b(paramContext, paramInt, "com.google.android.gms")) {
      return false;
    }
    Object localObject = paramContext.getPackageManager();
    try
    {
      localObject = ((PackageManager)localObject).getPackageInfo("com.google.android.gms", 64);
      return x2.o.a(paramContext).b((PackageInfo)localObject);
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      if (Log.isLoggable("UidVerifier", 3)) {
        Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
      }
    }
    return false;
  }
  
  public static boolean b(Context paramContext, int paramInt, String paramString)
  {
    return d.a(paramContext).g(paramInt, paramString);
  }
}

/* Location:
 * Qualified Name:     E2.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */