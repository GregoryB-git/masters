package u;

import aa.w;
import android.app.AppOpsManager;
import android.content.Context;

public final class i
{
  public static int a(AppOpsManager paramAppOpsManager, String paramString1, int paramInt, String paramString2)
  {
    if (paramAppOpsManager == null) {
      return 1;
    }
    return paramAppOpsManager.checkOpNoThrow(paramString1, paramInt, paramString2);
  }
  
  public static String b(Context paramContext)
  {
    return w.g(paramContext);
  }
  
  public static AppOpsManager c(Context paramContext)
  {
    return (AppOpsManager)paramContext.getSystemService(AppOpsManager.class);
  }
}

/* Location:
 * Qualified Name:     u.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */