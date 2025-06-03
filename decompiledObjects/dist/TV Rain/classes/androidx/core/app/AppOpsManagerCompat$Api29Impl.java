package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import e;

@RequiresApi(29)
class AppOpsManagerCompat$Api29Impl
{
  @DoNotInline
  public static int checkOpNoThrow(@Nullable AppOpsManager paramAppOpsManager, @NonNull String paramString1, int paramInt, @NonNull String paramString2)
  {
    if (paramAppOpsManager == null) {
      return 1;
    }
    return paramAppOpsManager.checkOpNoThrow(paramString1, paramInt, paramString2);
  }
  
  @DoNotInline
  @NonNull
  public static String getOpPackageName(@NonNull Context paramContext)
  {
    return e.i(paramContext);
  }
  
  @DoNotInline
  @Nullable
  public static AppOpsManager getSystemService(@NonNull Context paramContext)
  {
    return (AppOpsManager)paramContext.getSystemService(AppOpsManager.class);
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.AppOpsManagerCompat.Api29Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */