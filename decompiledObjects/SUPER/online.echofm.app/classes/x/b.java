package x;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;

public abstract class b
{
  public static int a(Context paramContext, String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    if (paramContext.checkPermission(paramString1, paramInt1, paramInt2) == -1) {
      return -1;
    }
    String str = w.c.c(paramString1);
    int i = 0;
    if (str == null) {
      return 0;
    }
    paramString1 = paramString2;
    if (paramString2 == null)
    {
      paramString1 = paramContext.getPackageManager().getPackagesForUid(paramInt2);
      if ((paramString1 != null) && (paramString1.length > 0)) {
        paramString1 = paramString1[0];
      } else {
        return -1;
      }
    }
    paramInt1 = Process.myUid();
    paramString2 = paramContext.getPackageName();
    if ((paramInt1 == paramInt2) && (H.c.a(paramString2, paramString1))) {
      paramInt1 = w.c.a(paramContext, paramInt2, str, paramString1);
    } else {
      paramInt1 = w.c.b(paramContext, str, paramString1);
    }
    if (paramInt1 == 0) {
      paramInt1 = i;
    } else {
      paramInt1 = -2;
    }
    return paramInt1;
  }
  
  public static int b(Context paramContext, String paramString)
  {
    return a(paramContext, paramString, Process.myPid(), Process.myUid(), paramContext.getPackageName());
  }
}

/* Location:
 * Qualified Name:     x.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */