package androidx.core.app;

import android.app.Service;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ServiceCompat
{
  public static final int START_STICKY = 1;
  public static final int STOP_FOREGROUND_DETACH = 2;
  public static final int STOP_FOREGROUND_REMOVE = 1;
  
  public static void stopForeground(@NonNull Service paramService, int paramInt)
  {
    Api24Impl.stopForeground(paramService, paramInt);
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static void stopForeground(Service paramService, int paramInt)
    {
      paramService.stopForeground(paramInt);
    }
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface StopForegroundFlags {}
}

/* Location:
 * Qualified Name:     androidx.core.app.ServiceCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */