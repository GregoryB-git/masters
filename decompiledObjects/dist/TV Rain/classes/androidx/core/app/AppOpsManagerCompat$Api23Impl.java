package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(23)
class AppOpsManagerCompat$Api23Impl
{
  @DoNotInline
  public static <T> T getSystemService(Context paramContext, Class<T> paramClass)
  {
    return (T)paramContext.getSystemService(paramClass);
  }
  
  @DoNotInline
  public static int noteProxyOp(AppOpsManager paramAppOpsManager, String paramString1, String paramString2)
  {
    return paramAppOpsManager.noteProxyOp(paramString1, paramString2);
  }
  
  @DoNotInline
  public static int noteProxyOpNoThrow(AppOpsManager paramAppOpsManager, String paramString1, String paramString2)
  {
    return paramAppOpsManager.noteProxyOpNoThrow(paramString1, paramString2);
  }
  
  @DoNotInline
  public static String permissionToOp(String paramString)
  {
    return AppOpsManager.permissionToOp(paramString);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.AppOpsManagerCompat.Api23Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */