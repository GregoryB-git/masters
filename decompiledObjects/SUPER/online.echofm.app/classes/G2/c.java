package G2;

import E2.l;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;

public class c
{
  public final Context a;
  
  public c(Context paramContext)
  {
    a = paramContext;
  }
  
  public int a(String paramString)
  {
    return a.checkCallingOrSelfPermission(paramString);
  }
  
  public int b(String paramString1, String paramString2)
  {
    return a.getPackageManager().checkPermission(paramString1, paramString2);
  }
  
  public ApplicationInfo c(String paramString, int paramInt)
  {
    return a.getPackageManager().getApplicationInfo(paramString, paramInt);
  }
  
  public CharSequence d(String paramString)
  {
    return a.getPackageManager().getApplicationLabel(a.getPackageManager().getApplicationInfo(paramString, 0));
  }
  
  public PackageInfo e(String paramString, int paramInt)
  {
    return a.getPackageManager().getPackageInfo(paramString, paramInt);
  }
  
  public boolean f()
  {
    if (Binder.getCallingUid() == Process.myUid()) {
      return a.a(a);
    }
    if (l.h())
    {
      String str = a.getPackageManager().getNameForUid(Binder.getCallingUid());
      if (str != null) {
        return b.a(a.getPackageManager(), str);
      }
    }
    return false;
  }
  
  public final boolean g(int paramInt, String paramString)
  {
    if (l.d()) {
      try
      {
        localObject = (AppOpsManager)a.getSystemService("appops");
        if (localObject != null)
        {
          ((AppOpsManager)localObject).checkPackage(paramInt, paramString);
          return true;
        }
        paramString = new java/lang/NullPointerException;
        paramString.<init>("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        throw paramString;
      }
      catch (SecurityException paramString)
      {
        return false;
      }
    }
    Object localObject = a.getPackageManager().getPackagesForUid(paramInt);
    if ((paramString != null) && (localObject != null)) {
      for (paramInt = 0; paramInt < localObject.length; paramInt++) {
        if (paramString.equals(localObject[paramInt])) {
          return true;
        }
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     G2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */