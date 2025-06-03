package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build.VERSION;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import e;

public final class AppOpsManagerCompat
{
  public static final int MODE_ALLOWED = 0;
  public static final int MODE_DEFAULT = 3;
  public static final int MODE_ERRORED = 2;
  public static final int MODE_IGNORED = 1;
  
  public static int checkOrNoteProxyOp(@NonNull Context paramContext, int paramInt, @NonNull String paramString1, @NonNull String paramString2)
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      AppOpsManager localAppOpsManager = Api29Impl.getSystemService(paramContext);
      int i = Api29Impl.checkOpNoThrow(localAppOpsManager, paramString1, Binder.getCallingUid(), paramString2);
      if (i != 0) {
        return i;
      }
      return Api29Impl.checkOpNoThrow(localAppOpsManager, paramString1, paramInt, Api29Impl.getOpPackageName(paramContext));
    }
    return noteProxyOpNoThrow(paramContext, paramString1, paramString2);
  }
  
  public static int noteOp(@NonNull Context paramContext, @NonNull String paramString1, int paramInt, @NonNull String paramString2)
  {
    return Api19Impl.noteOp((AppOpsManager)paramContext.getSystemService("appops"), paramString1, paramInt, paramString2);
  }
  
  public static int noteOpNoThrow(@NonNull Context paramContext, @NonNull String paramString1, int paramInt, @NonNull String paramString2)
  {
    return Api19Impl.noteOpNoThrow((AppOpsManager)paramContext.getSystemService("appops"), paramString1, paramInt, paramString2);
  }
  
  public static int noteProxyOp(@NonNull Context paramContext, @NonNull String paramString1, @NonNull String paramString2)
  {
    return Api23Impl.noteProxyOp((AppOpsManager)Api23Impl.getSystemService(paramContext, AppOpsManager.class), paramString1, paramString2);
  }
  
  public static int noteProxyOpNoThrow(@NonNull Context paramContext, @NonNull String paramString1, @NonNull String paramString2)
  {
    return Api23Impl.noteProxyOpNoThrow((AppOpsManager)Api23Impl.getSystemService(paramContext, AppOpsManager.class), paramString1, paramString2);
  }
  
  @Nullable
  public static String permissionToOp(@NonNull String paramString)
  {
    return Api23Impl.permissionToOp(paramString);
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    @DoNotInline
    public static int noteOp(AppOpsManager paramAppOpsManager, String paramString1, int paramInt, String paramString2)
    {
      return paramAppOpsManager.noteOp(paramString1, paramInt, paramString2);
    }
    
    @DoNotInline
    public static int noteOpNoThrow(AppOpsManager paramAppOpsManager, String paramString1, int paramInt, String paramString2)
    {
      return paramAppOpsManager.noteOpNoThrow(paramString1, paramInt, paramString2);
    }
  }
  
  @RequiresApi(23)
  public static class Api23Impl
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
  
  @RequiresApi(29)
  public static class Api29Impl
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
}

/* Location:
 * Qualified Name:     androidx.core.app.AppOpsManagerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */