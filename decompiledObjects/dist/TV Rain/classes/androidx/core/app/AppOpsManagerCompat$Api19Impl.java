package androidx.core.app;

import android.app.AppOpsManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class AppOpsManagerCompat$Api19Impl
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

/* Location:
 * Qualified Name:     androidx.core.app.AppOpsManagerCompat.Api19Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */