package M4;

import B6.c;
import B6.c.a;
import F4.a;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;

public abstract class o
{
  public static Boolean a;
  
  public static void a(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(paramString);
  }
  
  public static boolean b(Context paramContext)
  {
    Object localObject = a;
    if (localObject != null) {
      return ((Boolean)localObject).booleanValue();
    }
    try
    {
      paramContext = Boolean.valueOf(getPackageManagergetApplicationInfogetPackageName128metaData.getBoolean("firebase_performance_logcat_enabled", false));
      a = paramContext;
      boolean bool = paramContext.booleanValue();
      return bool;
    }
    catch (NullPointerException paramContext) {}catch (PackageManager.NameNotFoundException paramContext) {}
    a locala = a.e();
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("No perf logcat meta data found ");
    ((StringBuilder)localObject).append(paramContext.getMessage());
    locala.a(((StringBuilder)localObject).toString());
    return false;
  }
  
  public static int c(long paramLong)
  {
    if (paramLong > 2147483647L) {
      return Integer.MAX_VALUE;
    }
    if (paramLong < -2147483648L) {
      return Integer.MIN_VALUE;
    }
    return (int)paramLong;
  }
  
  public static String d(String paramString)
  {
    c localc = c.n(paramString);
    if (localc != null) {
      paramString = localc.m().r("").j("").n(null).e(null).toString();
    }
    return paramString;
  }
  
  public static String e(String paramString, int paramInt)
  {
    if (paramString.length() <= paramInt) {
      return paramString;
    }
    if (paramString.charAt(paramInt) == '/') {
      return paramString.substring(0, paramInt);
    }
    c localc = c.n(paramString);
    if (localc == null) {
      return paramString.substring(0, paramInt);
    }
    if (localc.g().lastIndexOf('/') >= 0)
    {
      int i = paramString.lastIndexOf('/', paramInt - 1);
      if (i >= 0) {
        return paramString.substring(0, i);
      }
    }
    return paramString.substring(0, paramInt);
  }
}

/* Location:
 * Qualified Name:     M4.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */