package w;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build.VERSION;
import androidx.annotation.NonNull;

public abstract class c
{
  public static int a(Context paramContext, int paramInt, String paramString1, String paramString2)
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      AppOpsManager localAppOpsManager = b.c(paramContext);
      int i = b.a(localAppOpsManager, paramString1, Binder.getCallingUid(), paramString2);
      if (i != 0) {
        return i;
      }
      return b.a(localAppOpsManager, paramString1, paramInt, b.b(paramContext));
    }
    return b(paramContext, paramString1, paramString2);
  }
  
  public static int b(Context paramContext, String paramString1, String paramString2)
  {
    return a.c((AppOpsManager)a.a(paramContext, AppOpsManager.class), paramString1, paramString2);
  }
  
  public static String c(String paramString)
  {
    return a.d(paramString);
  }
  
  public static abstract class a
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
  
  public static abstract class b
  {
    public static int a(AppOpsManager paramAppOpsManager, @NonNull String paramString1, int paramInt, @NonNull String paramString2)
    {
      if (paramAppOpsManager == null) {
        return 1;
      }
      return paramAppOpsManager.checkOpNoThrow(paramString1, paramInt, paramString2);
    }
    
    @NonNull
    public static String b(@NonNull Context paramContext)
    {
      return paramContext.getOpPackageName();
    }
    
    public static AppOpsManager c(@NonNull Context paramContext)
    {
      return (AppOpsManager)paramContext.getSystemService(AppOpsManager.class);
    }
  }
}

/* Location:
 * Qualified Name:     w.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */