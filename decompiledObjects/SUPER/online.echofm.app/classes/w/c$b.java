package w;

import android.app.AppOpsManager;
import android.content.Context;
import androidx.annotation.NonNull;

public abstract class c$b
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

/* Location:
 * Qualified Name:     w.c.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */