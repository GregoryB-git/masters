package u;

import android.app.AppOpsManager;
import android.content.Context;

public final class h
{
  public static <T> T a(Context paramContext, Class<T> paramClass)
  {
    return (T)paramContext.getSystemService(paramClass);
  }
  
  public static int b(AppOpsManager paramAppOpsManager, String paramString1, String paramString2)
  {
    return paramAppOpsManager.noteProxyOp(paramString1, paramString2);
  }
  
  public static int c(AppOpsManager paramAppOpsManager, String paramString1, String paramString2)
  {
    return paramAppOpsManager.noteProxyOpNoThrow(paramString1, paramString2);
  }
  
  public static String d(String paramString)
  {
    return AppOpsManager.permissionToOp(paramString);
  }
}

/* Location:
 * Qualified Name:     u.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */